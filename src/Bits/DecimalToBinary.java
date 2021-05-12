import java.util.*;


public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(find(3));
    }
    public static int find(int decimal){
    if(decimal == 0) return 0;
    return (decimal %2 +10* find(decimal/2));
    }
}
