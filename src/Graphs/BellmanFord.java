import java.util.*;

 class Nodes{
    int u;
    int v;
    int w;
    Nodes(int _u, int  _v, int _w){
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
    int getW(){return w;}

}
public class BellmanFord {

    public static void bellamanFord(  ArrayList<Nodes> adj,int N, int src){
    int dist[] = new int[N];
for(int i=0;i<N;i++) dist[i] =100000000;
dist[src] =0;

for(int i=1;i<=N-1;i++){
    for(Nodes n : adj){
        if(dist[n.getU()] + n.getW() < dist[n.getV()]){
            dist[n.getV()] = dist[n.getU()]+n.getW();
        }
    }
}
int fl=0;
for(Nodes n: adj){
    if(dist[n.getU()] + n.getW() < dist[n.getV()]){
        fl=1;
        System.out.println("Negative Cycle");
        break;
    }
}
if(fl==0) {
    for(int i=0;i<N;i++){
        System.out.print(dist[i]+" ");
    }
}

}
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Nodes> adj = new ArrayList<>();
		
			
		adj.add(new Nodes(3, 2, 6));
		adj.add(new Nodes(5, 3, 1));
		adj.add(new Nodes(0, 1, 5));
		adj.add(new Nodes(1, 5, -3));
		adj.add(new Nodes(1, 2, -2));
		adj.add(new Nodes(3, 4, -2));
		adj.add(new Nodes(2, 4, 3));
       

        // main programm
        bellamanFord(adj,n, 0);
    }
}