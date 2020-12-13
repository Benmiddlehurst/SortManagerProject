package com.sparta.ben.arrayMethods;


import java.util.Random;

public class ArrayGenerator {

    public static int[] randomArray(int arrayLength){
        int[] randomArray = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++){
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }
}
