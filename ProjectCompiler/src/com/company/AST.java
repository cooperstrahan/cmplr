package com.company;

public class AST {
    Node root;

    public AST() {}

    public void setRoot(Node n){
        this.root = n;
    }

    public Node getRoot(){
        return root;
    }

    public void addLeftChild(Node l, int count){
        root = addLeftChild(root, l, count, 0);
    }

    private Node addLeftChild(Node parent, Node l, int count, int c){
        while(parent.rightChild != null){
            if(parent.name == ":=")
                c++;
            parent = parent.rightChild;
        }
        if (parent.rightChild == null)
            if (parent.name == ":=" && count == c)
                return l;
        if (parent.rightChild != null)
            if(parent.rightChild.name == ":=")
                c++;
            parent.leftChild = addLeftChild(parent.rightChild, l, count, c);
        return parent;
    }

    public void addCenterChild(Node l){
        root = addCenterChild(root, l);
    }

    private Node addCenterChild(Node parent, Node l){
        Node iterator = parent;

        if (parent.rightChild == null)
            return l;
        if (parent.rightChild != null)
            parent.centerChild = addCenterChild(parent.rightChild, l);
        return parent;
    }

    public void addRightChild(Node l){
        root.rightChild = addRightChild(root, l);
    }

    private Node addRightChild(Node parent, Node l){
        if (parent.rightChild == null)
            return l;
        if (parent.rightChild != null)
            parent.rightChild = addRightChild(parent.rightChild, l);
        return parent;
    }

    public boolean hasChildren(Node current){
        if(current.leftChild != null || current.centerChild != null || current.rightChild != null)
            return true;
        return false;
    }


    public void prettyPrint() {
        Node current = getRoot();
        System.out.println(root.name);
        while (hasChildren(current)) {
            try {
                System.out.println(current.leftChild.name + " " + current.centerChild.name + " " + current.rightChild.name);
                current = current.rightChild;
            } catch (NullPointerException np) {
                try {
                    System.out.println(current.leftChild.name + " " + current.centerChild.name);
                    current = current.centerChild;
                } catch (NullPointerException np2) {
                    try {
                        System.out.println(current.centerChild.name + " " + current.rightChild.name);
                        current = current.leftChild;
                    } catch (NullPointerException np3) {
                        break;
                    }
                }
            }


        }
    }
}
