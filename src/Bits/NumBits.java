package src.Bits;

public class NumBits {
    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
       
    }
    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
}
