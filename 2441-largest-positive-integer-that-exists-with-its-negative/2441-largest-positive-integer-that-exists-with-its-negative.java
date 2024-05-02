class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int ans = -1;
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
            int k = num*(-1);
            if(map.containsKey(k)){
                ans = Math.max(ans,Math.abs(num));
            }
        }
        return ans;
    }
}