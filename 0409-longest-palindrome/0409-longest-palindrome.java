class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0)+1);
        }
        int result = 0;
        boolean isCentral = false;
        for(int i : map.values()){
            if(i % 2 == 0){
                result += i;
            }
            else{
                result += i - 1 ;
                isCentral = true;
            }
        }
        if(isCentral){
            result++;
        }
        return result;
    }
}