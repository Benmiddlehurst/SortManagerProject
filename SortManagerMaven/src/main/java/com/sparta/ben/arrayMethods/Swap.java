package com.sparta.ben.arrayMethods;

public class Swap {


    public static int[] swapNumbers(int numberA, int numberB) {
        int[] array = new int[2];

        int temp;
        temp = numberA;
        numberA = numberB;
        numberB = temp;

        array[0] = numberA;
        array[1] = numberB;

        return array;
    }
}



