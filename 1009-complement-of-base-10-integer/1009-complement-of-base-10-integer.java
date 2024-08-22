class Solution {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        String ans = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                ans += '1';
            }
            else{
                ans += '0';
            }
        }
        return Integer.parseInt(ans,2);
    }
}