import java.util.ArrayList;
import java.util.Arrays;

class Noda{
    int u;
    int v;
    int w;
    Noda(int _u,int _v,int _w){
u= _u;
v=_v;
w=_w;
    }
    int getU(){return u;}
int getV(){return v;}
int getW(){return w;}
}
public class FloydWarshall {
    public static int floyedWarshall(int n,ArrayList<Noda> adj,int src, int dest){
    int d[][]= new int[n+1][n+1];
    //if i==j then d[i][j] =0
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==j){
d[i][j] =0;
            }else{
                d[i][j] =(int) 1e9;
            }
        }
    }

for(int i=0;i<n;i++){
    int u1= adj.get(i).getU();
    int v1 = adj.get(i).getV();
    int w1 = adj.get(i).getW();
    d[u1][v1] = w1;
}

for (int k = 1; k <= n; k++) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (d[i][k] != (int)1e9 && d[k][j] != (int)1e9) {
                d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
            }
        }
    }
}
//all the distance
for(int i[]:d){
    System.out.println(Arrays.toString(i));
}
// Return dist between src and dest.
return d[src][dest];


    }
    public static void main(String[] args) {
        int n=4;
        ArrayList<Noda> adj = new ArrayList<>();
        adj.add(new Noda(1, 2, 4));
        adj.add(new Noda(1,3,3));
        adj.add(new Noda(2,4,7));
        adj.add(new Noda(3,4,-2));

System.out.println(  floyedWarshall(n, adj, 1,4));
      

    }
}
