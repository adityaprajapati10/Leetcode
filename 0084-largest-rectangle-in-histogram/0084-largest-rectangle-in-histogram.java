class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] prevSmaller = new int[heights.length];
        int[] nextSmaller = new int[heights.length];
        Stack<Integer> st = new Stack();
        for(int i = 0 ; i<heights.length ;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            } 
           if(st.isEmpty()){
               prevSmaller[i] = -1 ;
           }
           else{
               prevSmaller[i] = st.peek();
           }
           st.add(i);
        }
        st.clear();
        for(int i = heights.length-1 ; i>=0 ;i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            } 
           if(st.isEmpty()){
               nextSmaller[i] = heights.length;
           }
           else{
               nextSmaller[i] = st.peek();
           }
           st.add(i);
        }

        int[] area = new int[heights.length];
        int max = area[0];
        for(int i = 0 ; i<heights.length ; i++){
           area[i] = heights[i]*(nextSmaller[i] - prevSmaller[i]-1);
        max = Math.max(max, area[i]);
        }

        return max;
    }
}