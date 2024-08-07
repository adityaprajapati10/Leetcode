class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty  = numBottles;
        int drink = numBottles;

        while(empty >= numExchange){
            drink += empty/numExchange;
            int temp = empty ;
            empty = temp/numExchange + temp % numExchange;
        }
        return drink;
    }
}