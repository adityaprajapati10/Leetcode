class Solution {
    public List<String> stringMatching(String[] words) {
       List<String> list = new ArrayList<>();
       for(String word : words){
        for(String check : words){
            if(word.length() != check.length() && check.contains(word) && !list.contains(word)){
                list.add(word);
            }
        }
       } 
       return list;
    }
}