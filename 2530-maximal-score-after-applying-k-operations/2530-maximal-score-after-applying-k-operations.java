class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.add(num);
        }
        long sum = 0;
        while(k>0){
            int value = pq.poll();
            sum += value;
            pq.add((int)Math.ceil(value/3.0));
            k--;
        }
        return sum;
    }
}