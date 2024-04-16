class Solution {
    public int rev(int n){
        int res = 0;
        while(n > 0){
            res = res * 10 + n % 10 ;
            n = n / 10;
        }
        return res;
    }
    public int countNicePairs(int[] nums) {
        int count  = 0;
        int m = 1000000007;
        for(int i = 0 ; i<nums.length ; i++){
            nums[i] = nums[i] - rev(nums[i]);
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            count = (int)((count + map.getOrDefault(nums[i] , 0)) % m);
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}