class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = nums[0];

        for (int i = 0; i < nums.length; ++i) {
            if (maxIdx >= nums.length - 1) return true;

            if (nums[i] == 0 && maxIdx == i) return false;

            if (i + nums[i] > maxIdx) 
                maxIdx = i + nums[i];
        }

        return true;
    }
}