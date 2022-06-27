import java.util.*;

public class CycleDetectionDFS {
    public static boolean isCycle (List<List<Integer>>adj){
boolean vis[] = new boolean[adj.size()];
for(int i=0;i<adj.size();i++){
    if(!vis[i]){
        if(checkforcycle(i,-1,vis,adj)) return true;
    }
   } return false;
    }
    public static boolean checkforcycle(int node, int parent,boolean vis[],List<List<Integer>>adj){
vis[node] = true;
for(Integer it: adj.get(node)){
    if(!vis[it]){
        if(checkforcycle(it,node,vis,adj))return true;
    }else if (parent != it) return true;
}
return false;
    }
    public static void main(String[] args) {
        int V = 5;

List < List < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList < > ());
        }
        // edge 0---1
        adj.get(0).add(1);
        adj.get(1).add(0);

        // edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // adge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // adge 3--4
        adj.get(3).add(4);
        adj.get(4).add(3);

        // adge 1--4
        adj.get(1).add(4);
        adj.get(4).add(1);

        System.out.println(isCycle(adj));
    }



}
