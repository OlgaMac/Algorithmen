package com.algorithmen.tasks.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Container {

    class Node {
        private int num;
        private List<Consumer<Container>> functions;

        public Node(int num) {
            this.num = num;
            this.functions = new ArrayList<>();
        }


        @Override
        public String toString() {
            return "Node{" +
                    "num=" + num +
                    ", functions=" + functions +
                    '}';
        }
    }

    private List<Node> nods = new ArrayList<>();

    //Добавляет элемент в контейнер
    public void push(int item) {
        Node node = new Node(item);
        node.functions.add(container -> container.push(item));
        nods.add(node);
    }

    // Добавляет ко всем элементам контейнера значение value
    public void add(int value) {
        for (Node node : nods) {
            node.num = node.num + value;
            node.functions.add(container -> container.add(value));
        }
    }

    // Умножает все элементы
    public void mult(int value) {
        for (Node node : nods) {
            node.num = node.num * value;
            node.functions.add(container -> container.mult(value));
        }
    }

    public Node at(int index) {
        Node node = nods.get(index);
        node.functions.add(container -> container.at(index));
        return node;

    }


    public static void main(String[] args) {
        Container container = new Container();
        container.push(1);
        container.push(2);
        container.add(3);
        container.mult(2);
        container.push(1);
        System.out.println(container.nods.toString());
        System.out.println(container.at(0));
    }
}
