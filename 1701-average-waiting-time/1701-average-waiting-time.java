class Solution {
    public double averageWaitingTime(int[][] customers) {
        int comp =  0;
        double totalWait = 0;
        for(int i = 0 ; i < customers.length ; i++){
            if(customers[i][0]  <= comp){
                comp += customers[i][1];
            }
            else{
                comp =  customers[i][0]+ customers[i][1];
            }
            totalWait += comp - customers[i][0];
        }
        return totalWait/customers.length;
    }
}