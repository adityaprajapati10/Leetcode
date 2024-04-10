class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Queue<Integer> que = new LinkedList<>();
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            que.add(i);
        }
        Arrays.sort(deck);
        
        for (int i = 0; i < n; i++) {
            int idx = que.poll();
            result[idx] = deck[i];
            
            if (!que.isEmpty()) {
                que.add(que.poll());
            }
        }
        
        return result;
    }
}