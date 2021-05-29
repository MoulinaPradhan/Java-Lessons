import java.util.*;


public class AdjiancyMattrix {
public static void main(String[] args) {
    int n =3; // number of vertices
    int m; // no. of edges
// for undirected graph

    int adj[][] = new int [n+1][n+1];

    //edge 1 2
    adj[1][2] =1;
    adj[2][1] = 1;

    // edge 2 3
    adj[2][3] =1;
    adj[3][2] =1;

//print
for(int i=0;i<adj.length;i++){
    for(int j=0;j<adj[i].length;j++){
        System.out.print(adj[i][j]);
       
    }
    System.out.println();
    System.out.println("--");
}

}    
}
