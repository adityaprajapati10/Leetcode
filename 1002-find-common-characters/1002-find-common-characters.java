class Solution {
    public void countFrequency(String str , int count[]){
        for(char ch : str.toCharArray()){
            count[ch - 'a']++;
        }
    }
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        int[] count = new int[26];
        countFrequency(words[0] , count);
        for(int i = 1 ; i < words.length ; i++){
            int[] temp = new int[26];
            countFrequency(words[i],temp);
            for(int j = 0 ; j < 26 ; j++){
                count[j] = Math.min(count[j] , temp[j]);
            }
        }
        for(int i = 0 ; i<count.length ; i++){
            while(count[i] > 0){
                char c = (char)(i+'a');
                ans.add(c+"");
                count[i]--;
            }
        }
        return ans;
    }
}