class Solution {
    public String makeGood(String s) {
      StringBuilder result = new StringBuilder();
      for(int i = 0 ; i<s.length() ; i++){
        if(result.length() > 0 && ((s.charAt(i)-32 == result.charAt(result.length() - 1)) || (s.charAt(i)+32 == result.charAt(result.length() - 1)) )){
            result.deleteCharAt(result.length()-1);
        }
        else{
            result.append(s.charAt(i));
        }
      }  
      return result.toString();
    }
}