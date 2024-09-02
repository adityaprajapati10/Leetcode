class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        while(k>0){
            for (int i = 0; i < chalk.length; i++) {
                if (k < chalk[i]) {
                    return i;
                }
                k -= chalk[i];
            }
        }
        return 0;
    }
}