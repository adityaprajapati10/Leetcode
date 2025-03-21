class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int[] freq = new int[26];
        int delete = 0;
        for(int i = 0; i<n ; i++){
            freq[s.charAt(i)-'a'] += 1;
            if(freq[s.charAt(i)-'a'] == 3){
                freq[s.charAt(i)-'a'] -= 2;
                delete += 2;
            }
        }
        return n - delete;
    }
}