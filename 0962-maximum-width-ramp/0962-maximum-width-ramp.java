class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int ramp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (nums[i] <= nums[j]) {
                    ramp = Math.max(ramp, j - i);
                    break;
                }
            }
        }
        return ramp;
    }
}