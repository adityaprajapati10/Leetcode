class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int lcount = 0;
        for(int i = 0 ; i<nums.length-1 ; i++){
            if(nums[i] > nums[i+1]){
                lcount++;
            }
        }
        int gcount = mergeSort(nums , 0 , nums.length-1);
        
        return gcount == lcount;
    }
    public int mergeSort(int[] arr , int l , int r){
        int count = 0;
        if(l<r){
            int mid = l+(r-l)/2;
            count += mergeSort(arr , l , mid);
            count += mergeSort(arr, mid+1 , r);
            count += mergeProcedure(arr , l , mid , r);
        }
        return count;
    }
    public static int mergeProcedure(int[] arr , int l , int mid , int h){
        int swap = 0;
        int[] lSub = Arrays.copyOfRange(arr , l , mid+1);
        int[] rSub = Arrays.copyOfRange(arr , mid+1 , h+1);

        int i = 0 , j = 0 , k = l;
        while(i<lSub.length && j<rSub.length){
            if(lSub[i] <= rSub[j]){
                arr[k++] = lSub[i++];
            }else{
                arr[k++] = rSub[j++];
                swap += (mid+1) - i;
            }
        }
        while(i<lSub.length){
            arr[k++] = lSub[i++];
        }
        while(i<rSub.length){
            arr[k++] = lSub[j++];
        }
        return swap;
    }
}