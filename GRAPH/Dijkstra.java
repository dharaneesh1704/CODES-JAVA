import java.util.*;

class Pair {
    int vertex, weight;

    Pair(int v, int w) {
        vertex = v;
        weight = w;
    }
}

public class Dijkstra {
    public static void main(String[] args) {
        int V = 5;
        int source = 0;

        List<List<Pair>> graph = new ArrayList<>();

        // Step 1: Initialize the adjacency list
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Step 2: Add edges directly (undirected)
        int[][] edges = {
            {0, 1, 6},
            {0, 2, 1},
            {1, 2, 5},
            {1, 4, 3},
            {2, 3, 5},
            {3, 4, 2},
            {2, 4, 4}
        };

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(u, w));
        }

        // Step 3: Dijkstra's algorithm
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Pair(source, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.vertex;

            for (Pair neighbor : graph.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        // Step 4: Print distances
        System.out.println("Shortest distances from node " + source + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("To node " + i + " = " + dist[i]);
        }
    }
}
