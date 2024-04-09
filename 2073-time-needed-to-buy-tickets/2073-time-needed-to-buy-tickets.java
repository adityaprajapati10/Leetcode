class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            que.add(i);
        }

        int time = 0;
        while (!que.isEmpty()) {
            time++;
            int front = que.poll();
            tickets[front]--;
            
            if (k == front && tickets[front] == 0) {
                return time;
            }
            if (tickets[front] != 0) {
                que.add(front);
            }
        }

        return time; 
    }
}