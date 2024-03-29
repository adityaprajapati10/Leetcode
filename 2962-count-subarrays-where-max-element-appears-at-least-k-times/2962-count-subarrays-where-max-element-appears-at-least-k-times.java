class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        long count = 0; 
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
        }
        for(int i = 0; i < n; i++){
            int maxCount = 0; 
            for(int j = i; j < n; j++){
                if(nums[j] == max) {
                    maxCount++;
                }

                if(maxCount >= k) {
                    count += n - j;
                    break; 
                }
            }
        }
        
        return count;
    }
}
