class Solution {
    public String removeKdigits(String num, int k) {
          Stack<Character> stack = new Stack<>();

        for (char c : num.toCharArray()) {

            while (!stack.isEmpty() && stack.peek() > c && k > 0) {
                stack.pop(); 
                k--;        
            }

            if(!stack.isEmpty() || c!='0'){
                stack.push(c);
            }    
        }   
        
        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        } 

        if (stack.isEmpty()) {
            return "0";
        }

        String str = "";
        for (char ch : stack) {
            str += ch; 
        }

        return str;
    }
}
  