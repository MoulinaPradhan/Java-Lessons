import java.util.*;

public class BFSAdjaciency {
  public static void main(String[] args) {
    int V=7;
 List<List<Integer>>adj =  new ArrayList<>();
for(int i=0;i<=V;i++){
        adj.add(new ArrayList<>());
    }
    
    // edge 1 2
    adj.get(1).add(2);
    adj.get(2).add(1);

    // edge 2 3
    adj.get(2).add(3);
    adj.get(3).add(2);

    // 3 5
    adj.get(3).add(5);
    adj.get(5).add(3);

    // 2 7
    adj.get(2).add(7);
    adj.get(7).add(2);

    //4 6
    adj.get(4).add(6);
    adj.get(6).add(4);
    
    //5 7
    adj.get(5).add(7);
    adj.get(7).add(5);

    System.out.println(adj);
     System.out.println(bfs(V, adj)); 
  }  

  public static List<Integer> bfs(int V,List<List<Integer>> adj)
{
List<Integer> bfs = new ArrayList<>();
boolean vis[] = new boolean[V+1];

for(int i=1;i<=V;i++){
    if(vis[i] == false){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = true;
        while(! q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            for(Integer it : adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
    }
}
return bfs;
}

}
