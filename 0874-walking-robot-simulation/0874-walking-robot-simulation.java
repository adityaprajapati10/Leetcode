class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0 , y = 0 , d = 0 , maxdis = 0;
        Set<String> check = new HashSet<>();
        for(int[] obs : obstacles){
            check.add(obs[0]+","+obs[1]);
        }
        for(int cmd : commands){
            if(cmd == -1){
                d = (d+1)%4;
            }
            else if(cmd == -2){
                d = (d+3)%4;
            }
            else{
                for(int i = 0 ; i<cmd ; i++){
                    int tx = x , ty = y;
                    if (d == 0)
                        ty++;
                    else if (d == 1)
                        tx++;
                    else if (d == 2)
                        ty--;
                    else 
                        tx--;
                    if(check.contains(tx+","+ty)){
                        break;
                    }
                    x = tx; y = ty;
                    maxdis = Math.max(maxdis , x*x + y*y);
                }
            }
        }
        return maxdis;
    }
}