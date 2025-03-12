class Solution {
    public static int searchIndex(int[] nums, int target) {
        int low = 0, high = nums.length; 
        while (low < high) {
            int mid = low + (high - low)/2; 
            if (nums[mid] < target) low = mid+1; 
            else high = mid; 
        }
        return low; 
    }
    public int maximumCount(int[] nums) {
         int neg = searchIndex(nums, 0);
         int pos = nums.length - searchIndex(nums, 1);
        return Math.max(neg, pos);
    }
}