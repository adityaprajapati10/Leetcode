class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0 ;
        int j = s.length()-1;
        while (i<j){
            while (i < j && !isVowel(chars[i])) {
                i++;
            }
            while (i < j && !isVowel(chars[j])) {
                j--;
            }
            if (i < j) {
                swap(chars, i, j);
                i++;
                j--;
            }
        }
        return new String(chars);
    }
    public static void swap(char[] word, int i, int j){
        char temp = word[i];
        word[i] = word[j];
        word[j] = temp;
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}