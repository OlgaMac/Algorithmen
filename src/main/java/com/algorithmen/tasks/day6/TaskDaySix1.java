package com.algorithmen.tasks.day6;

/**
 * Граф - Реализовать обход в глубину или ширину;
 */
public class TaskDaySix1 {

        public static void main(String[] args) {
            Graph graph = new Graph(6);

            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(2, 4);
            graph.addEdge(2, 5);

            System.out.println("Depth-First Traversal:");
            graph.depthFirstTraversal(0);

            System.out.println("\n\nBreadth-First Traversal:");
            graph.breadthFirstTraversal(0);
    }
}
