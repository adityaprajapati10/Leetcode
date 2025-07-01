class Solution {
    public int possibleStringCount(String word) {
        int count = 1;
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }else if(i !=0 && set.contains(ch) && word.charAt(i-1) == ch){
                count++;
            }
            
        }
        return count;
    }
}