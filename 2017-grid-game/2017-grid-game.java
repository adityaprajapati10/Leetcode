class Solution {
    public long gridGame(int[][] grid) {
        long firstRowRemainSum = 0;
        for(int num : grid[0]){
            firstRowRemainSum += num;
        }
        long secondRowRemainSum = 0;
        long minimizedRobot2Sum = Long.MAX_VALUE;

        for(int robot1Col = 0; robot1Col<grid[0].length; robot1Col++)
        {
            firstRowRemainSum -= grid[0][robot1Col];

            long bestOfRobot2 = Math.max(firstRowRemainSum, secondRowRemainSum);
            minimizedRobot2Sum = Math.min(minimizedRobot2Sum, bestOfRobot2);
            secondRowRemainSum += grid[1][robot1Col];
        }
        return minimizedRobot2Sum;
    }
}