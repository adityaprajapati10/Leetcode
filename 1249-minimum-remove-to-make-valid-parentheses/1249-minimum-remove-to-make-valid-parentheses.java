class Solution {
    public String minRemoveToMakeValid(String s) {

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(i);
            }
            else if(c == ')'){
                if(st.isEmpty()){
                    list.add(i);
                }else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            list.add(st.pop());
        }

        String result = "";
        for(int i = 0 ; i<s.length() ; i++){
            if(!list.contains(i))
                result += s.charAt(i)+"";
        }
        return result;
    }
}