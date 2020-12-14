package com.sparta.ben.sorters;


import com.sparta.ben.arrayMethods.Swap;
import com.sparta.ben.mainStarterPrinter.Printer;

import java.util.Arrays;

public class BubbleSort implements Sortable {

    @Override
    public int[] sortArray(int[] array) {
        int arrayLength = array.length;
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



}
