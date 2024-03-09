package com.algorithmen.tasks.day6;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ShortestPathInLabirint {
    public static int shortestPath(int[][] labirint, Point start, Point end) {
        int rows = labirint.length;
        int cols = labirint[0].length;

        int[][] distance = new int[rows][cols];
        for (int[] row : distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int[] dx = {-1, 0, 1, 0}; // Direction arrays for moving in 4 directions
        int[] dy = {0, 1, 0, -1};

        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        distance[start.x][start.y] = 0;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (isValid(newX, newY, rows, cols) && labirint[newX][newY] == 1 && distance[newX][newY] == Integer.MAX_VALUE) {
                    queue.add(new Point(newX, newY));
                    distance[newX][newY] = distance[current.x][current.y] + 1;

                    if (newX == end.x && newY == end.y) {
                        return distance[newX][newY];
                    }
                }
            }
        }
        return -1;
    }

    private static boolean isValid(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    public static void main(String[] args) {
        int[][] labirint = {
                {1, 1, -1, -1, 1, 1, -1, -1, -1, -1},
                {1, 1, -1, -1, 1, 1, -1, -1, -1, -1},
                {1, 1, -1, -1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, -1},
                {1, 1, -1, 1, 1, 1, 1, -1, 1, -1},
                {1, 1, -1, 1, 1, 1, 1, -1, 1, -1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        Point start = new Point(0, 0);
        Point end = new Point(6, 8);

        int shortestPathLength = shortestPath(labirint, start, end);

        if (shortestPathLength != -1) {
            System.out.println("Shortest Path Length: " + shortestPathLength);
        } else {
            System.out.println("No path found!");
        }
    }
}
