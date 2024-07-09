class Solution {
    public double averageWaitingTime(int[][] customers) {
        int order = customers[0][0];
        int comp =  customers[0][0]+ customers[0][1];
        double totalWait = comp - order;
        for(int i = 1 ; i < customers.length ; i++){
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