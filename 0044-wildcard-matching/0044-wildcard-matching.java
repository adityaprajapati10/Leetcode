class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0 , j = 0 , m = 0 , st = -1;
        while(i < s.length()){
            if(j<p.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')){
                i++;
                j++;
            }
            else if(j<p.length() && p.charAt(j)== '*'){
                st = j;
                m = st;
                j++;
            }
            else if(st != -1){
                j = st+1;
                m++;
                i = m;
            }
            else{
                return false;
            }
        }
        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }
        return j == p.length();
    }
}