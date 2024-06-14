class Solution {
    public int fix(HashSet<Integer> set, int i){
        int incr = 0;
        while (set.contains(i)) {
            i++;
            incr++;
        }
        set.add(i);
        return incr;
    }
    public int minIncrementForUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                count += fix(set, num);
            }
        }
        return count;
    }
}