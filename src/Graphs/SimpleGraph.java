package src.Graphs;

import java.util.*;



public class SimpleGraph {

    //Adjacent List

     static class Edge{
         int src;
         int nbr;
         int wt;
         Edge(int src,int nbr,int wt){
             src=this.src;
             nbr=this.nbr;
             wt=this.wt;
             }
     }
    public static void main(String[] args) throws Exception{
        int vcs=7;
        ArrayList<Edge>[]Graph = new ArrayList[7];
        for(int i=0;i<vcs;i++){
            Graph[i]=new ArrayList<Edge>();
         
        }
    
        Graph[0].add(new Edge(0,3,40));
        Graph[0].add(new Edge(0,1,10));
        Graph[1].add(new Edge(1,0,10));
        Graph[1].add(new Edge(1,2,10));
        Graph[2].add(new Edge(2,1,10));
        Graph[2].add(new Edge(2,3,10));
        Graph[3].add(new Edge(3,0,40));
        Graph[3].add(new Edge(3,4,2));
        Graph[3].add(new Edge(3,2,10));
        Graph[4].add(new Edge(4,3,2));
        Graph[4].add(new Edge(4,5,3));
        Graph[4].add(new Edge(4,6,8));
        Graph[5].add(new Edge(5,4,3));
        Graph[5].add(new Edge(5,6,3));
        Graph[6].add(new Edge(6,4,8));
        Graph[6].add(new Edge(6,5,3));

    }
    
}
