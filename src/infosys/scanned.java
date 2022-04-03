import java.util.Scanner;

public class scanned {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String parse = sc.nextLine();
        String arr[] = parse.split(" ");
        for(String s:arr){
            System.out.println(s);
        }
    }
}
