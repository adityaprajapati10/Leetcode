class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != ']') {
                st.push(s.charAt(i));
            } else {
                String temp = "";
                while (st.peek() != '[') {
                    temp = st.pop() + temp;
                }
                st.pop(); 
                
                int n = 0;
                int base = 1;
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    int x = (st.pop() - '0') ;
                    n = n*10 + x;
                }
                
                String newStr = "";
                while (n > 0) {
                    newStr += temp;
                    n--;
                }
                for (char c : newStr.toCharArray()) {
                    st.push(c);
                }
            }
            i++;
        }
        
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }
        
        return ans;
    }
}
