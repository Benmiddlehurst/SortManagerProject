package com.sparta.ben.sorters;

import java.util.Arrays;

public class MergeSorter {

    // divide array into single numbers
    // sort into 2 arrays
    //merge sorted arrays whilst sorting
        //

//    public static int[] leftArray(int[] leftArray){
//
//    }


    public static int[] mergeSorter(int[] array, int arrayLength){
        //get array length
        arrayLength = array.length;
        // if function to see if length is odd
        // length /2
        int arrayLengthFirstHalf;
        int arrayLengthSecondHalf;
        if (arrayLength % 2 == 0){
           arrayLengthFirstHalf =  arrayLength / 2;
           arrayLengthSecondHalf = arrayLengthFirstHalf;
        } else {
            arrayLengthFirstHalf = arrayLength / 2;
            arrayLengthSecondHalf = arrayLengthFirstHalf + 1;
        }

        int[] leftArray = new int[arrayLengthFirstHalf];
        int[] rightArray = new int[arrayLengthSecondHalf];

        for (int i = 0 ; i <= arrayLengthFirstHalf - 1 ; i++) {
            leftArray[i] = array[i];
        }
        int k = 0;
        for (int j = arrayLengthFirstHalf; j <= arrayLength - 1; j++) {

            rightArray[k] = array[j];
            k++;
        }


        Arrays.sort(leftArray, 0, arrayLengthFirstHalf);
        Arrays.sort(rightArray, 0, arrayLengthSecondHalf);

        int[] tempArray = new int[arrayLength];

        int leftStart = 0;
        int rightStart = 0;
        int index = 0;

        while(leftStart <= arrayLengthFirstHalf - 1 && rightStart <= arrayLengthSecondHalf-1) {
            if (leftArray[leftStart] <=  rightArray[rightStart]) {
                tempArray[index] = leftArray[leftStart];
                leftStart++;
            } else {
                tempArray[index] = rightArray[rightStart];
                rightStart++;
            }
            index++;
        }
        System.arraycopy(leftArray,leftStart ,tempArray,index , arrayLengthFirstHalf-leftStart);
        System.arraycopy(rightArray,rightStart ,tempArray,index , arrayLengthSecondHalf-rightStart);


        array = tempArray;

        return array;




    }



}
