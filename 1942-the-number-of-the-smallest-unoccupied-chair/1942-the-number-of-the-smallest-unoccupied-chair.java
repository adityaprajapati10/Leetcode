class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int[] endTime = new int[n];
        Arrays.fill(endTime, -1);
        int targetFriendArrival = times[targetFriend][0];
        Arrays.sort(times, (a, b) -> a[0] - b[0]);
        for(int[] time : times){
            int arrival = time[0];
            int depart = time[1];
            for(int i = 0 ; i<n ; i++){
                if(endTime[i] <= arrival){
                    endTime[i] = depart;
                    if(arrival == targetFriendArrival)
                        return i;
                    break;
                }
            }
        }
        return -1;
    }
}