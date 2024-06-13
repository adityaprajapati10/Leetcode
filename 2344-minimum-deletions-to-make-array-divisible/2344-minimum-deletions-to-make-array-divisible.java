class Solution {
    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd = numsDivide[0];
        for (int i = 1; i < numsDivide.length; i++) {
            gcd = findGCD(gcd, numsDivide[i]);
        }
        Arrays.sort(nums);
        int count = 0;
        for (int num : nums) {
            if (gcd % num == 0) {
                return count;
            }
            count++;
        }

        return -1;
    }
}