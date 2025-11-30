package Graph;

import java.util.*;

public class Disjkastra {

    static class Edge {
        int node;
        int weight;
        
        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    static class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static void dijkstra(ArrayList<ArrayList<Edge>> graph, int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int node = cur.node;
            int curDist = cur.distance;
            for (int i = 0; i < graph.get(node).size(); i++) {
                Edge edge = graph.get(node).get(i);
                int nextNode = edge.node;
                int weight = edge.weight;

                if (curDist + weight < dist[nextNode]) {
                    dist[nextNode] = curDist + weight;
                    pq.add(new Pair(nextNode, dist[nextNode]));
                }
            }

        }
        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("To " + i + " = " + dist[i]);
        }

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Edge(1, 2)); // 0 → 1
        adj.get(0).add(new Edge(2, 1)); // 0 → 2

        adj.get(1).add(new Edge(3, 3)); // 1 → 3

        adj.get(2).add(new Edge(1, 4)); // 2 → 1
        adj.get(2).add(new Edge(3, 7)); // 2 → 3

        adj.get(3).add(new Edge(4, 2)); // 3 → 4
        dijkstra(adj, 0, V);
    }
}
