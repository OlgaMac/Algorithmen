package com.algorithmen.tasks.day6;

/**
 * Граф - Найти все компоненты связности в графе;
 */
public class TaskDaySix2 {

        public static void main(String[] args) {
            Graph graph = new Graph(7);

            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(2, 4);
            graph.addEdge(5, 6);

            System.out.println("Compnent  graph:" + graph.findAllConnectedComponents());

    }
}
