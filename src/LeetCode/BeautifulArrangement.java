package src.LeetCode;

public class BeautifulArrangement {
    public static void main(String[] args) {
     System.out.println(countArrangement(1));   
    }
   static int countArrangement(int n) {
       if(n==0) return 1;
    return n *countArrangement(n-1);
    }
}
