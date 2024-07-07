class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums , 0 , nums.length-1, nums.length - k);
    }
    public static int quickSort(int[] arr , int l , int h ,int k){
        if(l<=h){
            int mid = partition(arr ,  l ,  h);
            if(mid == k){
                return arr[mid];
            }
            else if(mid < k){
                return quickSort(arr , mid+1 , h , k);
            }
            else{
                return quickSort(arr , l , mid-1 , k);
            }
        }
        return -1;
    }
    public static int partition(int[] arr , int l ,int h){
        int pivot = arr[l];
        int i = l;
        for(int j = i+1 ; j<= h ; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        return i;
    }
}