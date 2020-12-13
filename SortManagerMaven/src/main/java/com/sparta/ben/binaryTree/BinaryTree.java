package com.sparta.ben.binaryTree;

public class BinaryTree {
    private final Node rootNode;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    public void addElement(final int element){
        addNodeToTree(rootNode, element);
    }


    public int getNumberOfElements(){
        int nodeCounter = rootNode.getNodeCounter();
        return nodeCounter;
    }

    private void addNodeToTree(Node node, int element) {
        if (element == node.getNodeValue()) return;

        if (element < node.getNodeValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }

        } else if (element > node.getNodeValue()) {
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
        node.setNodeCounter(node.getNodeCounter()+1);
    }

    public Node findNode(int element){
        Node node = rootNode;
        while (node != null){
            if (element ==  node.getNodeValue()) {
                return  node;
            }
            if (element < node.getNodeValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }


    public void getSortedTreeAsc(){
        getSortedTreeAsc(rootNode);
    }
    public void getSortedTreeAsc(Node node){
        if (node == null){
            return;
        }

        getSortedTreeAsc(node.getLeftChild());
        System.out.printf(node.getNodeValue()+ ", ");
        getSortedTreeAsc(node.getRightChild());

    }

    public void getSortedTreeDesc(){
        getSortedTreeDesc(rootNode);
    }
    public void getSortedTreeDesc(Node node){
        if (node == null){
            return;
        }
        getSortedTreeDesc(node.getRightChild());
        System.out.printf(node.getNodeValue()+ ", ");
        getSortedTreeDesc(node.getLeftChild());

    }
}


