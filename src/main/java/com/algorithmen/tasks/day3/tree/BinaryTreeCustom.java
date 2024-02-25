package com.algorithmen.tasks.day3.tree;

import java.util.List;

public class BinaryTreeCustom<T extends Comparable<T>> {
    private Node root;

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> tempNode = root;
            Node<T> prev = null;
            while (tempNode != null) {
                prev = tempNode;
                if (data.compareTo(tempNode.getValue()) > 0) {
                    tempNode = tempNode.getRight();
                } else {
                    tempNode = tempNode.getLeft();
                }
            }
            if (data.compareTo(prev.getValue()) < 0) {
                prev.setLeft(newNode);
            } else {
                prev.setRight(newNode);
            }

        }
    }


    public void traverseInOrder(Node<T> root, List<T> storageList) {
        if (root != null) {
            traverseInOrder(root.getLeft(), storageList);
            storageList.add(root.getValue());
            traverseInOrder(root.getRight(), storageList);
        }
    }

    public void traversePreOrder(Node<T> root, List<T> storageList) {
        if (root != null) {
            storageList.add(root.getValue());
            traversePreOrder(root.getRight(), storageList);
            traversePreOrder(root.getLeft(), storageList);
        }
    }

    public void traversePostOrder(Node<T> root, List<T> storageList) {
        if (root != null) {
            traversePostOrder(root.getLeft(), storageList);
            traversePostOrder(root.getRight(), storageList);
            storageList.add(root.getValue());
        }
    }

    public void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public void setRoot(Node newNode) {
        this.root = newNode;
    }

    public Node getRoot() {
        return this.root;
    }

    public boolean isEmpty() {
        return (this.root == null);
    }
}
