package com.company;

public class AbstractSyntaxTree {
    public Node root =  null;

    public AbstractSyntaxTree() {}

    public AbstractSyntaxTree(Node root){
        this.root = root;
    }

    public void setRoot(Node root){
//        System.out.println("Setting root node");
        this.root = root;
    }


    public Node getRoot(){
        return root;
    }

    public void setLeftChild(Node leftChild){
        Node current = root;
        while(current.RightChild != null) {
            current = current.RightChild;

        }

        if(current.symbol.name == ":=" && current.LeftChild == null);
        current.LeftChild = leftChild;

    }

    public void setCenterChild(Node centerChild){
        Node current = root;
//        System.out.println(centerChild.symbol.intValue);
        while(current.RightChild != null){
            current = current.RightChild;
        }
//        System.out.println(current.symbol.name);
        current.CenterChild = centerChild;
    }

    public void setRightChild(Node rightChild){
        Node current = root;
        while(current.RightChild != null){
            current = current.RightChild;
        }
        current.RightChild = rightChild;
    }

    public void printTree(){
        System.out.println(root.symbol.name);
        while(root.RightChild != null || root.CenterChild != null || root.LeftChild != null ){
            try{
                if(root.CenterChild.symbol.name.equals("Literal")){
                    if(root.CenterChild.symbol.type.equals("INT"))
                        System.out.println("Left: " + root.LeftChild.symbol.name + " Center: " +
                                root.CenterChild.symbol.intValue + " Right: " + root.RightChild.symbol.name);
                    if(root.CenterChild.symbol.type.equals("FLOAT"))
                        System.out.println("Left: " + root.LeftChild.symbol.name + " Center: " +
                                root.CenterChild.symbol.floatValue + " Right: " + root.RightChild.symbol.name);
                } else {
                    System.out.println("Left: " + root.LeftChild.symbol.name + " Center: " +
                            root.CenterChild.symbol.name + " Right: " + root.RightChild.symbol.name);
                }
                root = root.RightChild;
            } catch (NullPointerException np) {
                try{
                    if(root.CenterChild.symbol.name.equals("Literal")) {
                        if (root.CenterChild.symbol.type.equals("INT"))
                            System.out.println(" Center: " +
                                    root.CenterChild.symbol.intValue + " Right: " + root.RightChild.symbol.name);
                        if (root.CenterChild.symbol.type.equals("FLOAT"))
                            System.out.println(" Center: " +
                                    root.CenterChild.symbol.floatValue + " Right: " + root.RightChild.symbol.name);
                    } else {
                        System.out.println("Center: " + root.CenterChild.symbol.name + " Right: " +
                                root.RightChild.symbol.name);
                    }
                    root = root.RightChild;
                } catch (NullPointerException np2) {

                }
            }

        }

    }
}
