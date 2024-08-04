class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i<nums.length ; i++){
            int sum = 0;
            for(int j = i ; j < nums.length; j++){
                sum += nums[j];
                arr.add(sum);
            }
        }
        Collections.sort(arr);
        int ans = 0;
        for(int i = left-1 ; i <right ; i++){
            ans += arr.get(i);
        }
        return ans%1000000007;
    }
}