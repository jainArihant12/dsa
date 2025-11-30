package Graph;

import java.util.*;



public class Bellmond {
    
    static class Edge {
        int src ;
        int des;
        int weight;
        Edge(int src ,int des ,int weight){
            this.src = src;
            this.des = des;
            this.weight = weight;
        }
    }
    public static void bellmanFord(ArrayList<ArrayList<Edge>> graph ,int V ,int src){
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;

        for(int i=0;i<V-1;i++){
            for(int j=0;j<V;j++){
                for(int k=0;k<graph.get(j).size();k++){
                    Edge e = graph.get(j).get(k);
                    int u = e.src;
                    int v = e.des;
                    int w = e.weight;

                    if(dist[u] != Integer.MAX_VALUE && dist[u]+ w < dist[v]){
                        dist[v] = dist[u] + w;
                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.println(i + "->" + dist[i]);
        }
        
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0, 1, 4));
        graph.get(0).add(new Edge(0, 2, 5));
        graph.get(1).add(new Edge(1, 3, -2));
        graph.get(2).add(new Edge(2, 3, 3));
        graph.get(3).add(new Edge(3, 4, 2));
        graph.get(1).add(new Edge(1, 4, 6));

        bellmanFord(graph , V, 0 );
    }
}
