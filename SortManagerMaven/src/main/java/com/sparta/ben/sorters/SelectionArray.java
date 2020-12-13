package com.sparta.ben.sorters;

import com.sparta.ben.arrayMethods.Swap;

public class SelectionArray {
    public static int[] selectionArray(int[] array, int arrayLength){
        arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++){
            int minimumNum = i;
            for (int j = i + 1; j < arrayLength; j++){
                if (array[j] < array[minimumNum]){
                    minimumNum = j;
                    int[] swappedArray = Swap.swapNumbers(array[i],array[minimumNum]);
                    array[i] = swappedArray[0];
                    array[minimumNum] = swappedArray[1];
                }
            }
        }
        return array;
    }






}



