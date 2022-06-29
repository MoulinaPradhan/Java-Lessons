import java.util.*;
import java.util.Stack;
public class KosarajuAlgo {
	public static void kosaRaju(  ArrayList<ArrayList<Integer> > adj){
boolean vis[] = new boolean[adj.size()];
Stack<Integer>st = new Stack<>();
for(int i=0;i<adj.size();i++){
	if(!vis[i]){
		dfs(i, st, adj, vis);
	}
}
ArrayList<ArrayList<Integer> > transpose = new ArrayList<>();
for(int i=0;i<adj.size();i++){
	transpose.add(new ArrayList<>());
}

for(int i=0;i<adj.size();i++){
	vis[i] = false;
	for(Integer it :adj.get(i)){
		transpose.get(it).add(i);
	}
}

while(!st.isEmpty()){
	int node = st.pop();
if(!vis[node]){
	System.out.print("SCC :");
revDfs(node,transpose,vis);
System.out.println();
}
}

	}
	public static void dfs(int node, Stack<Integer> st,  ArrayList<ArrayList<Integer> > adj,boolean vis[] ){
vis[node] = true;
for(int it: adj.get(node)){
	if(!vis[it])
	dfs(it, st, adj, vis);
}
st.push(node);
	}

	public static void revDfs( int node, ArrayList<ArrayList<Integer> >transpose, boolean vis[]){
		vis[node] =true;
		System.out.print(node+" ");
		for(Integer it :transpose.get(node)){
			if(!vis[it])
			revDfs(it, transpose, vis);
	
		}
	}
    public static void main(String[] args) {
        int n = 7;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
		
		for (int i = 0; i < n; i++) 
			adj.add(new ArrayList<Integer>());
			
		adj.get(1).add(3);
		adj.get(2).add(1);
		adj.get(3).add(2);
		adj.get(3).add(5);
		adj.get(4).add(6);
		adj.get(5).add(4);
		adj.get(6).add(5);


			kosaRaju(adj);
    }
}
