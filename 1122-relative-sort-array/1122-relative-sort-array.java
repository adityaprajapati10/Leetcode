class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr1){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        int[] result = new int[arr1.length];
        int idx = 0;
        for(int i : arr2){
            if(map.containsKey(i)){
                int v = map.get(i) ;
                while(v > 0){
                    result[idx++] = i;
                    v--;
                }
                map.remove(i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            int count = map.get(key);
            while (count > 0) {
                list.add(key);
                count--;
            }
        }
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            result[idx++] = list.get(i);
        }
        return result;
    }
}