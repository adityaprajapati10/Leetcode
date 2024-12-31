class Solution {
    private int[] t = new int[366];
    public int mincostTickets(int[] days, int[] costs) {
        Arrays.fill(t, -1);
        int n = days.length;
        return solve(days, costs, n, 0);
    }
    public int solve(int[] days, int[] costs, int n , int idx){
        if(idx >= n){
            return 0;
        }
        if(t[idx] != -1){
            return t[idx];
        }
        int cost1 =  costs[0] + solve(days, costs, n, idx+1);

        int i = idx;  
        while (i < n && days[i] < days[idx] + 7) {  
            i++;
        }
        int cost7 = costs[1] + solve(days, costs, n, i);  

        int j = idx;  
        while (j < n && days[j] < days[idx] + 30) {  
            j++; 
        }  
        int cost30 = costs[2] + solve(days, costs, n, j);  
  
        t[idx] = Math.min(cost1, Math.min(cost7, cost30));  
        return t[idx];  

    }
}