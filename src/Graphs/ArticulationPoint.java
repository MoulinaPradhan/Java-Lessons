import java.util.*;

public class ArticulationPoint {

public static void printBridges( ArrayList<ArrayList<Integer> > adj){
    boolean vis[] = new boolean[adj.size()];
    int tin[] = new int[adj.size()];
    int low[] = new int[adj.size()];

    int isArticulate[] = new int[adj.size()];
    int timer=0;
    for(int i=0;i<adj.size();i++){
    if(!vis[i]) 
    dfs(i,-1,vis,tin,low,adj,timer,isArticulate);
    }

    for(int i=0;i<adj.size();i++){
        if(isArticulate[i] ==1)System.out.println(i);
    }
}
public static void dfs(int node, int parent, boolean vis[], int tin[],int low[],  ArrayList<ArrayList<Integer> > adj,int timer,int isArticulate[])
{
    vis[node] =true;
    tin[node] = low[node] = timer++;
int child =0;
for(Integer it : adj.get(node)){
    if(it == parent) continue;
    if(!vis[it] ){
        dfs(it, node, vis, tin, low,adj,timer,isArticulate);
        low[node] = Math.min(low[node], low[it]);
        if(low[it] >= tin[node] && parent !=-1){
            isArticulate[node]=1;
        }
        child++;
    }else{
        low[node] = Math.min(low[node], tin[it]);
    }

}
if(parent ==-1 && child > 1) isArticulate[node]=1;
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
