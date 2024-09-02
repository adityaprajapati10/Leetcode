class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0;
        while(k>0){
            if(i < chalk.length && k >= chalk[i]){
                k -= chalk[i];
                i++;
            }
            else if(i < chalk.length && k < chalk[i]){
                return i;
            }
            else if(i >= chalk.length && k > 0){
                i = 0;
            }
        }
        return 0;
    }
}