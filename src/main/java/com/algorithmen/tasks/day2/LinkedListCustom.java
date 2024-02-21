package com.algorithmen.tasks.day2;

/**
 * Дан односвязный список. Требуется выполнить переворот списка;
 */
public class LinkedListCustom<E> {
    protected Node<E> head;

    public LinkedListCustom() {
        head = null;
    }

    public LinkedListCustom(E[] list) {
        this();
        addAll(list);
    }

    public void addAll(E[] list) {
        for (int i = 0; i < list.length; i++)
            add(list[i]);
    }

    public void add(E e) {
        if (head == null)
            head = new Node<E>(e);
        else {
            Node<E> temp = head;

            while (temp.next != null)
                temp = temp.next;

            temp.next = new Node<E>(e);
        }
    }

    public void reverseList() {
        Node<E> curr = head;
        Node<E> pre = null;
        Node<E> incoming = null;

        while (curr != null) {
            incoming = curr.next;

            curr.next = pre;
            pre = curr;

            curr = incoming;
        }

        head = pre;
    }

    public void printList() {
        Node<E> temp = head;

        System.out.print("List: ");
        while(temp != null) {
            System.out.print(temp + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static class Node<E> {
        protected E e;
        protected Node<E> next;

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}

