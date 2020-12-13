package com.sparta.ben.sorters;


import com.sparta.ben.arrayMethods.Swap;

public class BubbleSort {

//    int firstTermSort = 0;
//    int secondTermSort = 1;

    public static int[] bubbleSortArray(int[] array, int arrayLength) {
        arrayLength = array.length;
         int firstTermSort = 0;
         int secondTermSort = 1;

        for(int iterator = 1; iterator < arrayLength; iterator++) {

            if (array[firstTermSort] > array[secondTermSort]) {
                int[] swappedArray = Swap.swapNumbers(array[firstTermSort], array[secondTermSort]);

                array[firstTermSort] = swappedArray[0];
                array[secondTermSort] = swappedArray[1];
            }
            firstTermSort += 1;
            secondTermSort += 1;
        }
        return array;
    }

//    public static boolean isArraySorted() {
//
//        return false;
//    }


    //compare first 2 values
    //if n1 < n2 swap them
    // iterations to compare all
    //parallelSort(byte[] a, int fromIndex, int toIndex)
}
