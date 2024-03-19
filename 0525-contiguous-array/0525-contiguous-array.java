class Solution {
    public int findMaxLength(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxLen = 0 ;
        int presum = 0 ;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) nums[i] = -1;
        }
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0 ; i < nums.length ; i++){
            presum += nums[i];
            if(map.containsKey(presum)){
                int index = map.get(presum);
                int currentLen = i - index;
                maxLen = Math.max(maxLen , currentLen);
            }
            else{
                map.put(presum, i);
            }
        }
        return maxLen;

    }
}