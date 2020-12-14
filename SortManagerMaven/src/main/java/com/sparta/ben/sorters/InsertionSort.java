package com.sparta.ben.sorters;

import com.sparta.ben.arrayMethods.Swap;

public class InsertionSort implements Sortable {

    @Override
    public int[] sortArray(int[] array){
        int arrayLength = array.length;
        for(int i = 1; i < arrayLength; i++){
            int j = i;
            while (j > 0  && array[j-1] > array[j]){

                int[] swappedArray = Swap.swapNumbers(array[j],array[j-1]);
                array[j] = swappedArray[0];
                array[j-1] = swappedArray[1];
                j = j-1;
            }
        }
        return array;
    }


}
