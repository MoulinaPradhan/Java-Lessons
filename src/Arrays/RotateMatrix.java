import java.util.*;

public class RotateMatrix {
   public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
ArrayList<Integer> list = new ArrayList<>();
// row 1
list.add(1);
list.add(2);
list.add(3);
mat.add(new ArrayList<>(list));
list.clear();
// row 2
list.add(4);
list.add(5);
list.add(6);
mat.add(new ArrayList<>(list));
list.clear();
// row 3
list.add(7);
list.add(8);
list.add(9);
mat.add(new ArrayList<>(list));

System.out.println(mat);
rotateMatrix(mat, 3, 3);
System.out.println(mat);
   }
   public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          
            Collections.swap(mat.get(i),j,(j+1)%m);

        }
           }
                }
    }

