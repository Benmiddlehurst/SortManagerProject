package com.sparta.ben.mainStarterPrinter;
import com.sparta.ben.arrayMethods.ArrayGenerator;
import com.sparta.ben.arrayMethods.IsArraySorted;
import com.sparta.ben.sorters.*;

import java.util.Scanner;

import java.util.Arrays;

public class Starter {

    public static void start() {
        int arrayLength;

        Printer.printMessage("Please enter desired array length: ");

        Scanner scanner = new Scanner(System.in);

        arrayLength = scanner.nextInt();

        int[] unsortedArray = new int[arrayLength];
        unsortedArray = ArrayGenerator.randomArray(arrayLength);

        boolean sortCheck;
        sortCheck = IsArraySorted.isArraySorted(unsortedArray);

        Printer.printMessage("Generating an array of length: " + arrayLength);
        Printer.printMessage("Array is: " + Arrays.toString(unsortedArray));

        Printer.printMessage("Choose a sorting method: ");
        Printer.printMessage("BubbleSort");
        Printer.printMessage("MergeSort");
        Printer.printMessage("QuickSort");
        Printer.printMessage("InsertionSort");
        Printer.printMessage("SelectionSort");

        String sortingMethod = scanner.next();

        long start = System.nanoTime();

        Sortable sortArray = Sorter.sortArray(sortingMethod);

        while (sortCheck == false) {
            sortArray.sortArray(unsortedArray);
            sortCheck = IsArraySorted.isArraySorted(unsortedArray);
        }

        Printer.printMessage("Array has been sorted using: "+sortingMethod);
        Printer.printMessage(Arrays.toString(unsortedArray));

        long finish = System.nanoTime();
        Printer.printMessage("Time taken to sort: " + (finish - start) / 1000000 + " milliseconds");

    }
        }