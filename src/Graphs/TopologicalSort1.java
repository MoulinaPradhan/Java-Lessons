// dfs approach
// for topological sort need acyclic graph
import java.util.*;
import java.util.Stack;
public class TopologicalSort1 {
    public static void main(String[] args) {
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

// view topological sort
System.out.println(topoSort(adj));

    }
    // Topological Sort
    public static List topoSort(List<List<Integer>>adj){
        List<Integer> list = new ArrayList<>();
boolean visited [] = new boolean [adj.size()];
Stack<Integer> st = new Stack();
for(int i=0;i<adj.size();i++){
    if(!visited[i]){
        dfs(i,visited,adj, st);
    }
}

while(!st.isEmpty()){
list.add(st.pop());
}
return list;
    }
    public static void dfs(int node,boolean visited [],List<List<Integer>>adj,Stack<Integer> st){
        visited[node] = true;
        for(int it : adj.get(node)){
            if(!visited[it])
            dfs(it,visited,adj,st);
        }

st.push(node);
    }
}
