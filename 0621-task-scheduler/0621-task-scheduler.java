class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character , Integer > map = new HashMap<>();
        for(char c : tasks){
            map.put(c , map.getOrDefault(c , 0)+1);
        }
        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        Q.addAll(map.values());
        int ans = 0;
        while(!Q.isEmpty()){
            int time = 0;
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0 ; i<n+1 ; i++){
                if(!Q.isEmpty()){
                    temp.add(Q.remove() - 1);
                    time++;
                }
            }

            for(int i : temp){
                if(i > 0)
                    Q.add(i);
            }

            if(!Q.isEmpty()){
                ans += n+1;
            }else{
                ans += time;
            }
        }
        return ans;
    }
}