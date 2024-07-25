class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = nums.length-1;

        mergeSort(nums , l , r);
        return nums;
    }
    public static void mergeSort(int[] nums , int l , int r){
        if( l < r){
            int mid = l + (r - l)/2;
            mergeSort(nums , l , mid );
            mergeSort(nums , mid+1 , r);
            combineArr(nums , l , mid , r);
        }
    }

    public static void combineArr(int[] arr , int l , int mid , int r){
        int i,j,k;
        int n1 = mid - l + 1;
        int n2 = r - mid ;

        int[] lSubArray = new int[n1];
        int[] rSubArray = new int[n2];
        for(i = 0 ; i < n1 ; i++){
            lSubArray[i] = arr[l+i];
        }
        for(j = 0 ; j < n2 ; j++){
            rSubArray[j] = arr[mid+1+j];
        }

        i = 0 ; j = 0 ; k = l ;

        while(i < n1 && j < n2){
            if(lSubArray[i] <= rSubArray[j]){
                arr[k] = lSubArray[i];
                i++;
            }
            else{
                arr[k] = rSubArray[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = lSubArray[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = rSubArray[j];
            j++;
            k++;
        }
    }
}