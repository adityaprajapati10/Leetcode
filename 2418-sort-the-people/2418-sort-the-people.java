class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0 ; i<heights.length ; i++){
            map.put(heights[i] , names[i]);
        }
        ArrayList<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());
        Collections.sort(sortedKeys);
        int i = names.length-1;
        for (int x : sortedKeys){
            names[i--] = map.get(x);
        }
        return names;
    }
}