package src.queue;

import java.util.LinkedList;
import java.util.Queue;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    // Constructor to initialize the graph
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    // BFS traversal of the graph starting from the given vertex
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int vertex : adjacencyList[currentVertex]) {
                if (!visited[vertex]) {
                    visited[vertex] = true;
                    queue.offer(vertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("BFS traversal starting from vertex 0:");
        graph.bfs(0);  // Output: 0 1 2 3 4 5
    }
}