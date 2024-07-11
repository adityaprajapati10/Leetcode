class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int i = 0;
        char[] arr = s.toCharArray();
        while(i < arr.length){
            if(arr[i] != ')'){
                st.push(arr[i]);
            }
            else{
                while (st.peek() != '(') {
                    str.append(st.pop());
                }
                st.pop();
                for (char ch : str.toString().toCharArray()){
                    st.push(ch);
                }
                str.setLength(0);
            }
            i++;
        }
        while (!st.isEmpty()) {
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}