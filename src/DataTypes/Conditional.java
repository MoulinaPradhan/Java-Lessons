package src.DataTypes;

public class Conditional {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int maxOfNum = 0;
        maxOfNum = a > b ? a : b;
        System.out.println("maximum of them is" + " " + maxOfNum);
    }
}