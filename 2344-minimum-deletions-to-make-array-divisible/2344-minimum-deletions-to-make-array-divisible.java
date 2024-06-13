class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> uniqueNums = new ArrayList<>(map.keySet());
        Collections.sort(uniqueNums);
        
        int count = 0;
        for (int num : uniqueNums) {
            boolean canDivideAll = true;
            for (int div : numsDivide) {
                if (div % num != 0) {
                    canDivideAll = false;
                    break;
                }
            }
            if (canDivideAll) {
                return count;
            } else {
                count += map.get(num);
            }
        }
        
        return -1;
    }
}