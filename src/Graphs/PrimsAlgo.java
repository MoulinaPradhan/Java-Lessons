import java.util.*;

class Node implements Comparator < Node >{
   int v;
   int w; 
   Node(int _v, int _w){
    v = _v;
    w=_w;
}
    Node(){

    }
    int getV(){
        return v;
    }
    int getWeight(){
        return w;
    }
    @Override
    public int compare(Node node1, Node node2) {
        if (node1.w < node2.w)
            return -1;
        if (node1.w > node2.w)
            return 1;
        return 0;
    }
}
public class PrimsAlgo {

    public static void mstPrimAlgo(List<List<Node>>adj){
        int keys[] = new int [adj.size()];
        boolean mst[] = new boolean[adj.size()];
        int parents [] = new int [adj.size()];
        for(int i=0;i<adj.size();i++){
         keys[i] = 100000;
        }
        //find the minimum mst index
        PriorityQueue<Node> pq = new PriorityQueue<>(adj.size(),new Node());
        keys[0] =0;
        parents[0] =-1;
        pq.add(new Node(keys[0], 0));
        while(!pq.isEmpty()){
            int u= pq.poll().getV();
            mst[u] = true;
            for(Node it : adj.get(u)){
                if(mst[it.getV()]== false && it.getWeight() <keys[it.getV()] ){
                    parents[it.getV()] =u;
                    keys[it.getV()] = it.getWeight();
                    pq.add(new Node(it.getV(), keys[it.getV()]));
                }
            }
        }

// Now printing the nodes
for(int i=1;i<adj.size();i++){
    System.out.println(parents[i] +" - "+i);
}
        
    }

    public static void main(String[] args) {
        List<List<Node>> adj = new ArrayList<>();
        int n = 5;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Node>());
        }
        adj.get(0).add(new Node(1, 2));
        adj.get(1).add(new Node(0, 2));

        adj.get(1).add(new Node(2, 3));
        adj.get(2).add(new Node(1, 3));

        adj.get(0).add(new Node(3, 6));
        adj.get(3).add(new Node(0, 6));

        adj.get(1).add(new Node(3, 8));
        adj.get(3).add(new Node(1, 8));

        adj.get(1).add(new Node(4, 5));
        adj.get(4).add(new Node(1, 5));

        adj.get(2).add(new Node(4, 7));
        adj.get(4).add(new Node(2, 7));
     
System.out.println(adj);

        // the main program
        mstPrimAlgo(adj);
    }
}
