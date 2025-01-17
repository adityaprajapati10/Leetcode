class Solution {
    public int[] productExceptSelf(int[] arr) {
       int mul = 1;
        boolean checkZero = false;
        for(int i : arr){
            if(i == 0 && !checkZero){
                checkZero = true;
            }
            else if(i == 0 && checkZero){
                mul = 0;
                checkZero = false;
                break;
            }else{
                mul *= i;
            }
        }
        int[] ans = new int[arr.length];
        int idx = 0;
        for(int i : arr){
            if(i == 0 && checkZero){
                ans[idx++] = mul;
            }else if(checkZero){
                ans[idx++] = 0;
            }else if(i == 0){
                ans[idx++] = 0;
            }else{
                ans[idx++] = mul/i;
            }
        }
        return ans; 
    }
}