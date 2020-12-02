package src.Loop;

public class MultiplicationTAble {
    public static void main(String[] args) {
        System.out.println("here is the multiplication table");
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(j + "*" + i + "=" + j * i + " ");
            }
            System.out.println();
        }
    }
}
