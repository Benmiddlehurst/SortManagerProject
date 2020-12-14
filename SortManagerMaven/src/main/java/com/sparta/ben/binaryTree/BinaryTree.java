package com.sparta.ben.binaryTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private final Node rootNode;

    public int getRootNode(){
        return rootNode.getNodeValue();
    }

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    public void addElement(final int element){
        addNodeToTree(rootNode, element);
    }

    public void addElements(int[] elements) {addNodesToTree(rootNode, elements);}

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

    private void addNodesToTree(Node node, int[] elements) {
        for(int element:elements) {

            if (element == node.getNodeValue()) return;

            if (element < node.getNodeValue()) {
                if (node.isLeftChildEmpty()) {
                    node.setLeftChild(new Node(element));
                } else {
                    addNodeToTree(node.getLeftChild(), element);
                }

            } else if (element > node.getNodeValue()) {
                if (node.isRightChildEmpty()) {
                    node.setRightChild(new Node(element));
                } else {
                    addNodeToTree(node.getRightChild(), element);
                }
            }
            node.setNodeCounter(node.getNodeCounter() + 1);
        }
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

    public void printTree(){
        printTree(rootNode);
    }


    public void printTree(Node rootNode) {

        Queue<Node> currentLevel = new LinkedList<Node>();
        Queue<Node> nextLevel = new LinkedList<Node>();

        currentLevel.add(rootNode);

        while (!currentLevel.isEmpty()) {
            Iterator<Node> i = currentLevel.iterator();
            while (i.hasNext()) {
                Node currentNode = i.next();
                if (currentNode.getLeftChild() != null) {
                    nextLevel.add(currentNode.getLeftChild());
                }
                if (currentNode.getRightChild() != null) {
                    nextLevel.add(currentNode.getRightChild());
                }
                System.out.print(currentNode.getNodeValue() + " ");
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new LinkedList<Node>();

        }
    }
}


