

public class DisjointSet {
    public static int parent[] =new int[100000];
    public static int rank[] = new int[100000];

    void makeSet(){
for(int i=1;i<=100000;i++){
    parent[i] =i;
    rank[i] =0;
}
    }
// we are doing compression path
//7->6->4->3
int findPar(int node){
    if(node == parent[node]) return node;
    return parent[node] = findPar(parent[node]);
}
// if we are attaching two similar trees the level of treee increases
void union(int u, int v){
    u=findPar(u);
    v= findPar(v);
    if(rank[u] < rank[v]){
        parent[u] =v;
    }else if(rank[v] < rank[u]) parent[v] =u;
    else{
        parent[v] =u;
        rank[u]++;
    }
}
    
   public static void main(String[] args) {
    
   } 
}
