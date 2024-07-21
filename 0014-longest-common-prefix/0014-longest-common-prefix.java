class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        StringBuilder ans = new StringBuilder(strs[0]);
        
        for (int i = 1; i < strs.length; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < strs[i].length() && j < ans.length(); j++) {
                if (strs[i].charAt(j) == ans.charAt(j)) {
                    temp.append(strs[i].charAt(j));
                } else {
                    break;
                }
            }
            ans = temp;
        }
        
        return ans.toString();
    }
}
