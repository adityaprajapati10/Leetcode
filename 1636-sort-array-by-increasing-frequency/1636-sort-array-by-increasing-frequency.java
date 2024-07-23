class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for(int i : map.keySet()){
            if(st.isEmpty()){
                st.push(i);
                continue;
            }
            while (!st.isEmpty() && (map.get(st.peek()) < map.get(i))) {
                temp.push(st.pop());
            }
            while(!st.isEmpty() && (map.get(st.peek())==map.get(i) && st.peek()> i))
            {
                temp.push(st.pop());
            }
            st.push(i);
            while (!temp.isEmpty()) {
                st.push(temp.pop());
            }
            
        }
        int[] arr = new int[st.size()];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = st.pop();
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = map.get(arr[i]);
            while (j > 0) {
                nums[index++] = arr[i];
                j--;
            }
        }
        return nums;
    }
}