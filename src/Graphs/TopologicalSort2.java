//BFS approach
//to check if the geraph is cyclic or not
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort2 {
  public static void main(String[] args) 
  {
    List<List<Integer> > adj = new ArrayList<>();
    int n =6;
    for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
    }
    
    //    2 <- 5 -> 0
    adj.get(5).add(0);
    adj.get(5).add(2);
    
    // 0 <- 4 -> 1
    adj.get(4).add(1);
    adj.get(4).add(0);
    
    // 2->3
    adj.get(2).add(3);
    
    // 3 -> 1
    adj.get(3).add(1);
    
    // view topological sort && to check if its cyclic or not
    System.out.println(isCyclic(adj));
    
  }
  public static boolean isCyclic(List<List<Integer>>adj){
int indgree[] = new int[adj.size()];
List<Integer> list = new ArrayList<>();

// finding indegree
for(int i=0;i<adj.size();i++){
    for(Integer it : adj.get(i))indgree[it]++;
}


  //Adding the node with indgree 0 to the queue
  Queue<Integer> q = new LinkedList<>();
for(int i=0;i<indgree.length;i++){
    if(indgree[i] ==0) q.add(i);
}

int cnt =0;
while(!q.isEmpty()){
    Integer node = q.poll();
    list.add(node);
    cnt++;
    // checking the neighbour nodes
    for(Integer it : adj.get(node)){
        indgree[it]--;
        if(indgree[it] ==0 ){
            q.offer(it);
        }
    }
}

System.out.println(list);
if(cnt == adj.size()) return false;
return true;

}
}