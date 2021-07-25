import java.util.*;

public class FindDuplicateInBinaryMatrix {
   public static void main(String[] args) {
       int mat[][] = {{1, 0}
                        ,{1, 0}};
System.out.println(repeatedRows(mat, 0, 0));
   } 
   public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
       ArrayList<Integer> list = new ArrayList<>();
       Set<int []> set = new HashSet<>();
       int i=0;
       for(int dir[] : matrix){
           if(set.contains(dir))
           {
                System.out.println(dir[i]);
               list.add(i);
           }
           set.add(dir);
        i++;
       }
  
       System.out.println(set);
       return list;
    }
}
