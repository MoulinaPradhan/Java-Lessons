package src.LeetCode;

public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numBottles >= numExchange)
        {
            sum += (numBottles/numExchange);
            numBottles = (numBottles/numExchange) + (numBottles%numExchange);
        }
        return sum;
        }
    public static void main(String[] args) {
        int numBottles=2;
        int numExchange=3;
        System.err.println(numWaterBottles(numBottles, numExchange));
    }

}
