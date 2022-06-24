import java.util.*;
 class Nodees implements Comparator<Nodees>{
    int v;
    int w;
    Nodees(int v1, int w1){
    v=v1;
    w=w1;
    }
    Nodees(){}
    int getW(){return w;}
    int getV(){return v;}
    @Override
    public int compare (Nodees n1, Nodees n2){
        if(n1.w< n2.w) return -1;
        if(n2.w<n1.w) return 1;
        return 0;
    }
}


public class DijkstraAlgo {
    public static void dijikstra(int src,ArrayList<ArrayList<Nodees>> adj){
        int dist[] = new int[adj.size()];
        Arrays.fill(dist, 100000000);
        dist[src] =0;
PriorityQueue<Nodees> pq = new PriorityQueue<Nodees>(adj.size(),new Nodees());
pq.add(new Nodees(src, 0));

while(!pq.isEmpty()){
    Nodees node = pq.poll();

    for(Nodees it: adj.get(node.getV())){
if(dist[node.getV()] + it.getW()< dist[it.getV()]){
    dist[it.getV()] = dist[node.getV()]+it.getW();
    pq.add(new Nodees(it.getV(), dist[it.getV()]));
}
    }

}
System.out.println("The distance from the source "+src+" are ");
for(int i=0;i<adj.size();i++){
    System.out.print(dist[i]+" ");
}
    }
    public static void main(String[] args) {
    int n = 5;
        ArrayList<ArrayList<Nodees> > adj = new ArrayList<ArrayList<Nodees> >();
		
		for (int i = 0; i < n; i++) 
			adj.add(new ArrayList<Nodees>());
			
		adj.get(0).add(new Nodees(1, 2));
		adj.get(1).add(new Nodees(0, 2));
		
		adj.get(1).add(new Nodees(2, 4));
		adj.get(2).add(new Nodees(1, 4));
		
		adj.get(0).add(new Nodees(3, 1));
		adj.get(3).add(new Nodees(0, 1));
		
		adj.get(3).add(new Nodees(2, 3));
		adj.get(2).add(new Nodees(3, 3));
		
		adj.get(1).add(new Nodees(4, 5));
		adj.get(4).add(new Nodees(1, 5));
		
		adj.get(2).add(new Nodees(4, 1));
		adj.get(4).add(new Nodees(2, 1));
  
dijikstra(0, adj);
  
    }
}
