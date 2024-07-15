class Solution {
    public long smallestNumber(long num) {
        boolean flag = true;
        if(num < 0){
            flag = false;
            num = -1*num;
        }
        String s = Long.toString(num);
        long[] arr = new long[s.length()];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        if(flag == true){
            Arrays.sort(arr);
            if(arr[0] == 0){
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] != 0) {
                        arr[0] = arr[i];
                        arr[i] = 0;
                        break;
                    }
                }
            }
            long ans = 0;
            for(int i = 0 ; i<arr.length ; i++){
                ans = ans*10+arr[i];
            }
            return ans;
        }
        else{
            Arrays.sort(arr);
            long ans = 0;
            for(int i = arr.length-1 ; i>=0 ; i--){
                ans = ans*10+arr[i];
            }
            return -1*ans;
        }
    }
}