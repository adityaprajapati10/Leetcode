class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int max=0;
        for(int i : left){
             int val=i;
             max=Math.max(val,max);
        }
        for(int i:right){
            int val=n-i;
            max=Math.max(val,max);
        }
        return max;
    }
}