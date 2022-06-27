import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Nood{
    int first;
    int second;
    Nood(int first, int second){
        this.first = first;
        this.second=second;
    }
}

public class CycleDetectionBFs {
public static boolean isCycle(  ArrayList<ArrayList<Integer>>adj ){
    boolean vis[] = new boolean[adj.size()];
    for(int i=0;i<adj.size();i++){
        if(!vis[i]) if(checkforcycle(adj, i, vis))return true;
    }
return false;
}
public static boolean checkforcycle(  ArrayList<ArrayList<Integer>>adj ,int s,boolean vis[]){
    Queue<Nood> q = new LinkedList<>();
    q.add(new Nood(s, -1));
    vis[s] = true;
    while(!q.isEmpty()){
        int node = q.peek().first;
        int par = q.peek().second;
        q.remove();
        for(Integer it :adj.get(node)){
            if(!vis[it]){
                q.add(new Nood(it, node));
                vis[it] = true;
            }
            else if (it !=par) return true;
        }

    }
return false;

}
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i = 0; i < V; i++)
            adj.add(i, new ArrayList<Integer>());
            adj.get(0).add(1);
            adj.get(0).add(2);
            adj.get(2).add(3);
            adj.get(1).add(3);
            adj.get(2).add(4); 
            System.out.println(isCycle(adj)); 
    }
}
