class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));
        int count = 1 ;
        int[] prev = points[0];
        for(int i = 1 ; i<points.length ; i++){
            int currentStart = points[i][0];
            int currentEnd = points[i][1];
            int prevStart = prev[0];
            int prevEnd = prev[1];

            if(prevEnd < currentStart){
                count++;
                prev = points[i];
            }else{
                prev[0] = Math.max(currentStart , prevStart);
                prev[1] = Math.min(currentEnd , prevEnd);
            }
        }
        return count;
    }
}