import java.util.*;

public class AdjacencyList {
    public static void main(String[] args) {
        int n=3;
        int m=3; // no. of edges

        List<List<Integer>>adj =  new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        // edge 1 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // edge 2 3
        adj.get(2).add(3);
    
           adj.get(2).add(4); adj.get(3).add(2);


        //print
        for(int i=1;i<n;i++){
            for(int j =0;j < adj.get(i).size();j++){
                System.out.println(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(adj);
    }
}
