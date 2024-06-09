class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        int result = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int remainder = sum % k;
            
            if (remainder < 0) {
                remainder += k;
            }
            
            if (map.containsKey(remainder)) {
                result += map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        
        return result;
    }
}
