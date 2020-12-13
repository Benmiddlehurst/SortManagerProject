package com.sparta.ben.arrayMethods;

public class IsArraySorted {
    public static boolean isArraySorted(int[] mergedArray) {

        boolean isArraySorted = false;
        int firstTermArray = 0;
        int secondTermArray = 1;

            for(int iterator = 1; iterator < mergedArray.length; iterator++) {
                if (mergedArray[firstTermArray] > mergedArray[secondTermArray]) {
                    isArraySorted = false;
                    break;
                } else{ isArraySorted = true;}
                firstTermArray += 1;
                secondTermArray += 1;
            }
        return isArraySorted;
    }
}




