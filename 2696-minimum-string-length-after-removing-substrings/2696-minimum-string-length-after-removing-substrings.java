class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<s.length()){
            if(st.empty()){
                st.push(s.charAt(i));
            }
            else if(!st.empty() && (st.peek() == 'A' && s.charAt(i) == 'B') || (st.peek() == 'C' && s.charAt(i) == 'D')){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        return st.size();
    }
}