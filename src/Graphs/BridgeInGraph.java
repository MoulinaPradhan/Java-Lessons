import java.util.*;

public class BridgeInGraph {



public  static void printBridges(ArrayList<ArrayList<Integer> > adj){
boolean vis[] = new boolean[adj.size()];
int tin[] = new int[adj.size()];
int low[] = new int[adj.size()];

int timmer =0;
for(int i=0;i<adj.size();i++){
if(!vis[i]) 
dfs(i,-1,vis,timmer,tin,low,adj);
}

}

public  static void dfs(int node,int parent, boolean vis[], int timmer,int []tin, int low[], ArrayList<ArrayList<Integer> > adj){
    vis[node] = true;
    tin[node] = low[node]= timmer++;
    for(Integer it: adj.get(node)){
        if(it==parent) continue;
if(!vis[it]){
dfs(it,node,vis,timmer,tin,low,adj);
low[node] = Math.min(low[it], low[node]);
if(low[it] > tin[node]){
    System.out.println(it+" "+node);
}
}else{
    low[node] = Math.min(low[node], tin[it]);
}
    }

} 

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
		
		for (int i = 0; i < n; i++) 
			adj.add(new ArrayList<Integer>());
			
		adj.get(0).add(1);
		adj.get(1).add(0);

		adj.get(0).add(2);
		adj.get(2).add(0);

		adj.get(1).add(2);
		adj.get(2).add(1);

		adj.get(1).add(3);
		adj.get(3).add(1);

		adj.get(3).add(4);
		adj.get(4).add(3);

        printBridges(adj);
    }
}
