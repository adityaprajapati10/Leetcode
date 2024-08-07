class Solution {
    static final Map<Integer , String> belowTen = Map.of(
        0, "", 1, "One", 2, "Two", 3, "Three", 4, "Four", 5, "Five", 6, "Six", 
        7, "Seven", 8, "Eight", 9, "Nine");
    
    static final Map<Integer, String> belowTwenty = Map.of(
        10, "Ten", 11, "Eleven", 12, "Twelve", 13, "Thirteen", 14, "Fourteen", 
        15, "Fifteen", 16, "Sixteen", 17, "Seventeen", 18, "Eighteen", 19, "Nineteen"
    );

    static final Map<Integer, String> belowHundred = Map.of(
        2, "Twenty", 3, "Thirty", 4, "Forty", 5, "Fifty", 
        6, "Sixty", 7, "Seventy", 8, "Eighty", 9, "Ninety"
    );
    public static String solve(long n){
        if(n < 10){
            return belowTen.get((int) n);
        }
        if(n < 20){
            return belowTwenty.get((int) n);
        }
        if(n < 100){
            return belowHundred.get((int) (n / 10)) + (n % 10 != 0 ? " "+ solve(n%10) : "");
        }
        if(n < 1000){
            return solve(n / 100) +" Hundred"+ (n % 100 != 0 ? " "+ solve(n % 100) : "");
        }
        if(n < 1000000){
            return solve(n / 1000) +" Thousand"+ (n % 1000 != 0 ? " "+ solve(n % 1000) : "");
        }
        if(n < 1000000000){
            return solve(n / 1000000) +" Million"+ (n % 1000000 != 0 ? " "+ solve(n % 1000000) : "");
        }
        return solve(n / 1000000000) + " Billion" + (n % 1000000000 != 0 ? " " + solve(n % 1000000000) : "");
    }
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        return solve(num);
    }
}