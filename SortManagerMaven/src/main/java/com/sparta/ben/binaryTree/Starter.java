package com.sparta.ben.binaryTree;

import com.sparta.ben.arrayMethods.ArrayGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {

        System.out.println("Binary Tree. Enter Root Node: ");
        Scanner scanner = new Scanner(System.in);
        int rootNode = scanner.nextInt();
        BinaryTree binaryTree =  new BinaryTree(rootNode);

        System.out.println("Do you wish to enter elements manually?: (Y/N) ");

        String manualOrRandom = scanner.next();

        System.out.println("Enter desired array length: ");

        int arrayLength = scanner.nextInt();

        if (manualOrRandom.equalsIgnoreCase("N")) {
            int[] array = new int[arrayLength];
            array = ArrayGenerator.randomArray(arrayLength);
            System.out.println("Array: "+ Arrays.toString(array));
            binaryTree.addElements(array);
        } else {
            for (int i = 1; i <= arrayLength; i++){
                System.out.println("Enter element #"+i+": ");
                int element = scanner.nextInt();
                binaryTree.addElement(element);
            }
        }
        System.out.println("Root Node: "+binaryTree.getRootNode());

        System.out.println("Printing Tree: ");
        binaryTree.printTree();

        System.out.println("Number of elements in Binary Tree: "+binaryTree.getNumberOfElements());

        System.out.println("Printing Binary Tree in ascending order: ");
        binaryTree.getSortedTreeAsc();
        System.out.println(" ");


        System.out.println("Printing Binary Tree in descending order: ");
        binaryTree.getSortedTreeDesc();

    }
}
