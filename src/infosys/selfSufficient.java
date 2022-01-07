import java.util.Scanner;

public class selfSufficient {
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int earn[] = new int[n];
      int bookCost=0,total=0;
      for(int i=0;i<n;i++){
earn[i] = sc.nextInt();
total+=earn[i];
      }
      int cost[]= new int[n];
      for(int i=0;i<n;i++){
cost[i]=sc.nextInt();
bookCost+=cost[i];
      }

      System.out.println(bookCost-total);
  }  
}
