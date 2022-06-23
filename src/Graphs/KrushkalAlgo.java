import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Nodes{
    int u;
    int v;
    int w;
    Nodes(int _u,int _v,int _w){
    u=_u;
    v=_v;
    w=_w;
    }
    int getU(){
        return u;
    }
    int getV(){
        return v;
    }
    int getW(){
        return w;
    }
}
    class SortComparator implements Comparator<Nodes>{
        @Override
        public int compare(Nodes n1, Nodes n2){
            if(n1.w< n2.w) return -1;
            if(n1.w>n2.w) return 1;
            return 0;
        }

    }

public class KrushkalAlgo {
    public static int findPar(int node, int parent[]){
        if(parent[node] == node) return node;
        return parent[node] = findPar(parent[node], parent);

    }
    public static void union(int u, int v, int parent[], int rank []){
        u=findPar(u, parent);
        v=findPar(v, parent);
        if(rank[u] < rank[v]){
            parent[u] = v;
        }
        else if(rank[v] < rank[u]){
            parent[v] =u;
        }else{
            parent[v] =u;
            rank[u]++;
        }

    }
    public static void kruskal(List<Nodes> adj){
        Collections.sort(adj,new SortComparator());
        int parent[] = new int[adj.size()];
        int rank[]= new int[adj.size()];

        for(int i=0;i<adj.size();i++){
            parent[i] =i;
            rank[i] =0;
        }
        int costMst=0;

        ArrayList<Nodes> mst = new ArrayList<>();
        for(Nodes it :adj){
            if(findPar(it.getU(), parent)!= findPar(it.getV(), parent)){
                costMst+=it.getW();
                mst.add(it);
                union(it.getU(), it.getV(), parent, rank);
            }
        }

        //Printing the min cost of MST
        System.out.println(costMst+" costMst");
        for(Nodes it : mst){
            System.out.println(it.getU()+" - "+it.getV());
        }


    }
    public static void main(String[] args) {
        int n =5;
        List<Nodes> adj = new ArrayList<>();
        adj.add(new Nodes(0, 1, 2));
		adj.add(new Nodes(0, 3, 6));
		adj.add(new Nodes(1, 3, 8));
		adj.add(new Nodes(1, 2, 3));
		adj.add(new Nodes(1, 4, 5));
		adj.add(new Nodes(2, 4, 7));

        // main program
        kruskal(adj);
       
    }
}
