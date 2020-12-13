package com.sparta.ben.mainStarterPrinter;
import com.sparta.ben.arrayMethods.ArrayGenerator;
import com.sparta.ben.arrayMethods.IsArraySorted;
import com.sparta.ben.mainStarterPrinter.Printer;
import com.sparta.ben.sorters.*;

import java.util.Scanner;

import java.util.Arrays;

public class Starter {

    public static void start(){
      int arrayLength;

      Printer.printMessage("Please enter desired array length: ");

      Scanner scanner = new Scanner(System.in);

        arrayLength = scanner.nextInt();

      int[] unsortedArray = new int[arrayLength];
      unsortedArray = ArrayGenerator.randomArray(arrayLength);

      boolean sortCheck;
      sortCheck = IsArraySorted.isArraySorted(unsortedArray);

      Printer.printMessage("Generating an array of length: "+arrayLength);
      Printer.printMessage("Array is: "+Arrays.toString(unsortedArray));

      Printer.printMessage("Choose a sorting method: ");
      Printer.printMessage("For Bubble sort enter: 1");
      Printer.printMessage("For Merge sort enter: 2");
      Printer.printMessage("For Quick sort enter: 3");
      Printer.printMessage("For Insertion sort enter: 4");
      Printer.printMessage("For Selection sort enter: 5");

      int sortingMethod = scanner.nextInt();

        long start = System.nanoTime();

        switch (sortingMethod) {
          case 1:
              while (sortCheck == false){
            BubbleSort.bubbleSortArray(unsortedArray, arrayLength);
            sortCheck = IsArraySorted.isArraySorted(unsortedArray);
        }
        Printer.printMessage("Array has been sorted using the Bubble sort method: " +Arrays.toString(unsortedArray));
              break;
          case 2:
              while (sortCheck == false) {
                  unsortedArray = MergeSorter.mergeSorter(unsortedArray, arrayLength);
                  sortCheck = IsArraySorted.isArraySorted(unsortedArray);
              }
              Printer.printMessage("Array has been sorted using the Merge Sort method: "  +Arrays.toString(unsortedArray));
              break;
          case 3:
              while (sortCheck == false) {
        unsortedArray = QuickSorter.quickSort(unsortedArray,0, arrayLength-1);
        sortCheck = IsArraySorted.isArraySorted(unsortedArray);
       }
        Printer.printMessage("Array has been sorted using the Quick sort method: "  +Arrays.toString(unsortedArray));
              break;
            case 4:
                while (sortCheck == false) {
                    unsortedArray = InsertionSort.insertoinSorter(unsortedArray, arrayLength);
                    sortCheck = IsArraySorted.isArraySorted(unsortedArray);
                }
                Printer.printMessage("Array has been sorted using the Insertion sort method: "  +Arrays.toString(unsortedArray));
                break;
            case 5:
                while(sortCheck == false){
                    unsortedArray = SelectionArray.selectionArray(unsortedArray, arrayLength);
                    sortCheck = IsArraySorted.isArraySorted(unsortedArray);
                }
                Printer.printMessage("Array has been sorted using the Selection sort method: "+Arrays.toString(unsortedArray));
                break;
      }
        long finish = System.nanoTime();
        System.out.println("Time taken to sort: "+(finish - start)/1000000 + " milliseconds");
    }
}
