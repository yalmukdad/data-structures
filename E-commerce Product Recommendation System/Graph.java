package Youssef_AlMukdad;

import java.util.*;

public class Graph {

    // Adjacency list representation of the graph
    private Map<Integer, List<Integer>> adjList;

    // Constructor for Graph
    public Graph() {
        // Initialize the adjacency list to represent the graph.
        adjList = new HashMap<>();
    }

    // Method to add an edge between two nodes (products)
    public void addEdge(int node1, int node2) {
        // Add node2 to the adjacency list of node1.
        adjList.computeIfAbsent(node1, k -> new ArrayList<>()).add(node2);

        // Add node1 to the adjacency list of node2 (since the graph is undirected).
        adjList.computeIfAbsent(node2, k -> new ArrayList<>()).add(node1);
    }

    // Method to check if a node (product ID) exists in the graph
    public boolean hasNode(int node) {
        // Check if the node (product ID) exists in the adjacency list.
        // Return true if it exists, otherwise return false.
        return adjList.containsKey(node);
    }

    // BFS Traversal (returns a LinkedList of nodes in traversal order)
    public LinkedList<Integer> bfs(int startNode) {
        // Initialize a queue to explore nodes level by level.
        Queue<Integer> queue = new LinkedList<>();

        // Initialize a set to keep track of visited nodes.
        Set<Integer> visited = new HashSet<>();

        // Initialize a LinkedList to store the traversal order (bfsOrder).
        LinkedList<Integer> bfsOrder = new LinkedList<>();

        // Add the startNode to the queue and mark it as visited.
        queue.offer(startNode);
        visited.add(startNode);

        // While the queue is not empty:
        while (!queue.isEmpty()) {
            // a. Dequeue the first node.
            int node = queue.poll();

            // b. Add the node to bfsOrder.
            bfsOrder.add(node);

            // c. For each unvisited neighbor, mark it as visited and enqueue it.
            for (int neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        // Return bfsOrder containing the nodes in BFS traversal order.
        return bfsOrder;
    }

    // DFS Traversal (returns a LinkedList of nodes in traversal order)
    public LinkedList<Integer> dfs(int startNode) {
        // Initialize a set to keep track of visited nodes.
        Set<Integer> visited = new HashSet<>();

        // Initialize a LinkedList to store the traversal order (dfsOrder).
        LinkedList<Integer> dfsOrder = new LinkedList<>();

        // Call the recursive helper function to perform DFS.
        dfsRec(startNode, visited, dfsOrder);

        // Return dfsOrder containing the nodes in DFS traversal order.
        return dfsOrder;
    }

    // Helper method for DFS recursion
    private void dfsRec(int node, Set<Integer> visited, LinkedList<Integer> dfsOrder) {
        // Mark the current node as visited.
        visited.add(node);

        // Add the node to the dfsOrder list.
        dfsOrder.add(node);

        // For each unvisited neighbor of the current node, recursively call dfsRec.
        for (int neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfsRec(neighbor, visited, dfsOrder);
            }
        }
    }

    // Method to print the graph (for debugging purposes)
    public void printGraph() {
        // Print each node and its list of adjacent nodes from the adjacency list.
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println("Node " + entry.getKey() + " is connected to " + entry.getValue());
        }
    }
}
