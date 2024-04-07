class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
       
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '(' ){
                st.push(i);
            }
            else if (c == '*'){
                st2.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!st2.isEmpty()) {
                    st2.pop();
                }
                else return false;
            }
        }

        while(!st.isEmpty() && !st2.isEmpty()){
            if(st.peek() > st2.peek()) return false;
            st.pop();
            st2.pop();
        }
        return st.isEmpty();
    }
}