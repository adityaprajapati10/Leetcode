class Solution {
    public int passThePillow(int n, int time) {
        int i = 1 ;
        boolean forward = true;
        while(time > 0){
             if (forward) {
                i++;
                if (i == n) { 
                    forward = false;
                }
            } 
            else {
                i--;
                if (i == 1) {
                    forward = true;
                }
            }
            time--;
        }
        return i;
    }
}