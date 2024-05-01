class Solution {
    public String reverse(String str){
        StringBuilder s = new StringBuilder(str);
        return s.reverse().toString();
    }
    public String reversePrefix(String word, char ch) {
        if(!word.contains(ch+""))
            return word;
        String str = "";
        int i ;
        for(i = 0 ; i<word.length() ; i++ ){
            char Ch = word.charAt(i);
            if(Ch == ch){
                str += Ch ;break;
            }
            else str += Ch;
        }
        
        String rev = reverse(str);
        for(i = i+1 ;i<word.length() ; i++ ){
            char Ch = word.charAt(i);
            rev += Ch;
        }
        return rev;
    }
}