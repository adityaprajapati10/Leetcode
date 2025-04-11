class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count= 0;
        for(int start = low; start <= high; start++){
            
            String num = start+"";
            int len = num.length();
            if(len % 2 != 0){
                continue;
            }
            int firstHalf = 0;
            for(int i = 0; i< len/2; i++){
                firstHalf += num.charAt(i) - '0';
            }
            int secondHalf = 0;
            for(int i = len/2; i<len ; i++){
                secondHalf += num.charAt(i) - '0';
            }
        
            if(firstHalf == secondHalf){
                count++;
            }
        }
        return count;
    }
}