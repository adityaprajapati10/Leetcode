class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        int count = 0;
        for (int num : map.keySet()) {
            int val = map.get(num);
            if (val > 1) {
                count += val * (val - 1) / 2;
            }
        }
        return count;
    }
}