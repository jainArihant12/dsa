

package Graph;
import java.util.*;
public class Prism {
    static class Edge{
        
        int dist;
        int weight;
        Edge(int d ,int w){
            this.dist =d;
            this.weight=w;
        }
    }

    static class Pair{
        int node;
        int cost;
        Pair(int n , int c){
            this.node = n;
            this.cost = c;
        }
    }

    public static void prisms(ArrayList<ArrayList<Edge>> graph ,  int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
        boolean vis[] = new boolean[V];
        pq.add(new Pair(0,0));

        int mstCost=0;
        //O((V+E)logE)

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                mstCost+=curr.cost;

                for(int i=0 ;i<graph.get(curr.node).size();i++){
                    Edge e = graph.get(curr.node).get(i);
                    if(!vis[e.dist]){
                        pq.add(new Pair(e.dist , e.weight));
                    }
                }
            }
   
        }

        System.err.println(mstCost);
    }

    public static void main(String[] args) {
         int V = 5;

        // 2D ArrayList (each item = int[]{dest, weight})
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // DIRECT edge adding (NO addEdge method)
        adj.get(0).add(new Edge(1, 2));
        adj.get(1).add(new Edge(0, 2));

        adj.get(0).add(new Edge(3, 6));
        adj.get(3).add(new Edge(0, 6));

        adj.get(1).add(new Edge(2, 3));
        adj.get(2).add(new Edge(1, 3));

        adj.get(1).add(new Edge(3, 8));
        adj.get(3).add(new Edge(1, 8));

        adj.get(1).add(new Edge(4, 5));
        adj.get(4).add(new Edge(1, 5));

        adj.get(2).add(new Edge(4, 7));
        adj.get(4).add(new Edge(2, 7));

        adj.get(3).add(new Edge(4, 9));
        adj.get(4).add(new Edge(3, 9));
        prisms(adj ,V);

    }
}
