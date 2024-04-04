class Solution {
    public int reverse(int x) {
        if(x<=9 && x>=0){
            return x ;
        }
        long y = 0 ;
       if(x<0){
           x = -1*x;
           while(x>0){
                int i = x%10 ;
                y = y*10;
                y += i;
                x = x/10;
            }
            y = -1*y;
       }
       else{
           while(x>0){
                int i = x%10 ;
                y = y*10;
                y += i;
                x = x/10;
            }
       }
    if(y<Math.pow(-2,31) || y>Math.pow(2,31)){
        return 0;
    }  
    return (int)y;
    }
}