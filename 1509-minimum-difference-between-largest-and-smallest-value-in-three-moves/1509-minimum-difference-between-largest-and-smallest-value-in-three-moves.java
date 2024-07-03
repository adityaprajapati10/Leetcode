class Solution {
    public int minDifference(int[] nums) {
        if(nums.length ==1 ){
            return nums[0];
        }
        Arrays.sort(nums);
        if(nums.length == 2 || nums.length == 3){
            nums[nums.length-1] = nums[0];
            return nums[0]-nums[nums.length-1];
        }
        int sub = 0;
        for(int i = nums.length-1 ; i>=nums.length-3 ; i--){
            nums[i] = nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length-1] - nums[0];
    }
}