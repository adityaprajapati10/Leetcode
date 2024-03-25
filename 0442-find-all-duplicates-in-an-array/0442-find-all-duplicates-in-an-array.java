class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ansArr = new ArrayList<>();
        for(int i : nums){
            if(map.containsKey(i)){
               ansArr.add(i);
            }
            else{
                map.put(i,1);
            }
        }

        return ansArr;
    }
}