class Solution {
    public int differenceOfSums(int n, int m) {
        int total = (n*(n+1))/2;
        int range = n/m;
        int num2 = 0;
        for(int i = 1; i<=range; i++){
            num2 += (m*i);
        }
        return total - 2*num2;
    }
}