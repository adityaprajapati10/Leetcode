class Solution {
    public static boolean isOperator(String s){
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) return true;
        return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String str : tokens){
            
            if(isOperator(str)){
                int num1 = st.pop();
                int num2 = st.pop();

                switch(str){
                    case "+":
                        st.push(num2 + num1);
                        break;
                    case "-":
                        st.push(num2 - num1);
                        break;
                    case "*":
                        st.push(num2 * num1);
                        break;
                    case "/":
                        st.push(num2 / num1);
                        break;
                }
            }
            else{
                int n = Integer.parseInt(str);
                st.push(n);
            }
        }
        return st.pop();
    }
}