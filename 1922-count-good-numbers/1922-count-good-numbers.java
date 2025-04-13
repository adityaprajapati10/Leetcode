class Solution {
    static final int M = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;

        long totalEven = findPow(5, even)%M;
        long totalOdd = findPow(4, odd)%M;

        long result = (totalEven*totalOdd)%M;
        return (int)result;
    }
    public long findPow(long a, long b){
        
        if(b == 0){
            return 1;
        }else{
            long halfResult = findPow(a,b/2);
            long finalResult = (halfResult*halfResult)%M;

            if(b%2 == 1){
                finalResult = (a*finalResult)%M;
            }
            return finalResult;
        }
    }
}