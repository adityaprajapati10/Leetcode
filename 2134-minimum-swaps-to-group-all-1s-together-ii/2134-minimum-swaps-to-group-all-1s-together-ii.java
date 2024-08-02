class Solution {
    public int minSwaps(int[] nums) {
        int totalOnes = 0;
        for(int i : nums){
            if(i == 1){
                totalOnes++;
            }
        }
        if(totalOnes == 0){
            return 0;
        }
        int n = nums.length;
        int[] arr = new int[n * 2];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        int i = 0;
        int j = 0;
        int Count = 0;
        int maxCount = 0;
        while (j < arr.length) {
            if (arr[j] == 1) {
                Count++;
            }
            if (j - i + 1 > totalOnes) {
                Count -= arr[i];
                i++;
            }
            maxCount = Math.max(maxCount, Count);
            j++;
        }
        return totalOnes - maxCount;
    }
}