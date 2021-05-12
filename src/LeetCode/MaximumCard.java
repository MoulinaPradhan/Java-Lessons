import java.util.*;

public class MaximumCard {
   public static void main(String[] args) {
      int [] arr = {1,2,3,4,5,6,1};
      int k =3;
      System.out.println(maxScore(arr, k)); 
   } 
public  static int maxScore(int[] cardPoints, int k) {
 
    int left [] = new int [k+1];
    int right[] = new int [k+1];

    left[0] = 0;
    right[0] =0;
  

for(int i=1;i<=k;i++){
 left[i] = left[i-1] + cardPoints[i-1];

    }
    for(int i=1;i<=k;i++){
        right[i] =  cardPoints[cardPoints.length-i] +right[i-1] ;
    }

    int sum =0;
    for(int i=0;i<=k;i++){
       sum = Math.max(sum, left[i]+ right[k-i]);
    }

    return sum;
    
}
}
