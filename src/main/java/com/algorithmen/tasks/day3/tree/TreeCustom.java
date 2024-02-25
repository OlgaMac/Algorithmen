package com.algorithmen.tasks.day3.tree;

public class TreeCustom extends BinaryTreeCustom{
    public TreeCustom() {
        super();
    }

    public void insert(Comparable item) {
        if(this.getRoot() == null) {
            this.setRoot(new Node(item));
            return;
        }

        Node t = this.getRoot();
        while(t != null) {
            if(t.getLeft() == null) {
                t.setLeft(new Node(item));
                return;
            }
            else if(t.getRight() == null) {
                t.setRight(new Node(item));
                return;
            }
            else {
                int lCount = countChildren(t.getLeft());
                int rCount = countChildren(t.getRight());
                if(lCount == rCount)
                    t = t.getLeft();
                else if(lCount == 0 || lCount == 1)
                    t = t.getLeft();
                else
                    t = t.getRight();
            }
        }
    }

    public int countChildren(Node t) {
        int count = 0;
        if(t.getLeft() != null)
            count++;
        if(t.getRight() != null)
            count++;
        return count;
    }

    public Node find(Comparable key) {
        Node p = this.getRoot();
        while(p != null && key.compareTo(p.getValue()) != 0) {
            if(key.compareTo(p.getValue()) < 0)
                p = p.getLeft();
            else
                p = p.getRight();
        }
        return p;
    }

    public BinaryTreeCustom swapSubtrees() {
        doSwap(this.getRoot());
        return this;
    }

    private void doSwap(Node p) {
        if(p != null) {
            Node temp = p.getLeft();
            p.setLeft(p.getRight());
            p.setRight(temp);
            doSwap(p.getLeft());
            doSwap(p.getRight());
        }
    }

    public void inorder() {
        doInorderTraversal(this.getRoot());
    }

    private void doInorderTraversal(Node t) {
        if(t != null) {
            doInorderTraversal(t.getLeft());
            System.out.print(t.getValue() + " ");
            doInorderTraversal(t.getRight());
        }
    }
}
