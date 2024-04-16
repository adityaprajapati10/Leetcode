class Solution {
    public long countBadPairs(int[] nums) {
        long count  = 0;
        for(int i = 0 ; i<nums.length ; i++){
            nums[i] = nums[i] - i;
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            count = (long)(count + map.getOrDefault(nums[i] , 0));
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length;
        long total = ((long)(n)*(long)(n-1))/(long)2;
        return total - count;
    }
}