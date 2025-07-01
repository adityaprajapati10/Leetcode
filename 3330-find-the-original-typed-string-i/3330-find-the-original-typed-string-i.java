class Solution {
    public int possibleStringCount(String word) {
        int count = 1;
        HashSet<Character> set = new HashSet<>();
        for(char ch : word.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                count++;
            }
        }
        return count;
    }
}