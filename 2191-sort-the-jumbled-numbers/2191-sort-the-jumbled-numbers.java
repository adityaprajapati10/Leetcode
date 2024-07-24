class Solution {
    public int getNumber(int N , int[] mapping){
        String s = N+"";
        int i = 0;
        int ans = 0;
        while(i < s.length()){
            ans = ans*10 + mapping[s.charAt(i) - '0'];
            i++;
        }
        return ans ;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[][] mappedNums = new int[n][2];
        for (int i = 0; i < n; i++) {
            mappedNums[i][0] = nums[i];
            mappedNums[i][1] = getNumber(nums[i], mapping);
        }
        Arrays.sort(mappedNums, (a, b) -> Integer.compare(a[1], b[1]));
        for (int i = 0; i < n; i++) {
            nums[i] = mappedNums[i][0];
        }
        return nums;
    }
}