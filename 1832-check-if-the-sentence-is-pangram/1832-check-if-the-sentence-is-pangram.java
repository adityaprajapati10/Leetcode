class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i=0;i<sentence.length();i++)
        {
            char ch = sentence.charAt(i);
            if(ch==' ') continue;
            else
            {
                set.add(ch); 
                count++;
            }
        }
        if(set.size()==26) return true;
     return false;   
    }
}