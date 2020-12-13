package com.sparta.ben.binaryTree;

public class Starter {
    public static void main(String[] args) {
        BinaryTree binaryTree =  new BinaryTree(5);
        binaryTree.addElement(6);
        binaryTree.addElement(5);
        binaryTree.addElement(11);
        binaryTree.addElement(12);
        binaryTree.addElement(4);
        binaryTree.addElement(2);
        binaryTree.addElement(7);

        System.out.println(binaryTree.getNumberOfElements());

        System.out.println("Printing Binary Tree in ascending order: ");
        binaryTree.getSortedTreeAsc();
        System.out.println(" ");


        System.out.println("Printing Binary Tree in descending order: ");
        binaryTree.getSortedTreeDesc();

    }
}
