
class Solution {
    public double binaryExp(double x, long n){
        double result = 0 , finalResult = 0 , mid = 0 ;
        if (n == 0 || x == 1) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if(n == 1){
            return x ;
        }
        else{
            mid = n/2 ;
            result = binaryExp( x, (long)mid);
            finalResult = result*result ;
            if(n % 2 == 0){
                return finalResult ;
            }
            else{
                return x*finalResult ;
            }
        }
    }
    public double myPow(double x, int n){
        return binaryExp(x , (long)n);
    }
}
