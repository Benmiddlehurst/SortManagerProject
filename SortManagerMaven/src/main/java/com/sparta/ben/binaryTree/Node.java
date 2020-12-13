package com.sparta.ben.binaryTree;

public class Node {

    private final int nodeValue;
    private Node leftChild;
    private Node rightChild;
    private int nodeCounter = 1;

    public int getNodeCounter() { return nodeCounter;}

    public void setNodeCounter(int nodeCounter) {this.nodeCounter = nodeCounter;}



    public Node(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeftChildEmpty() {
        return leftChild == null;
    }

    public boolean isRightChildEmpty() {
        return rightChild == null;
    }


}
