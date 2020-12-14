package com.sparta.ben.sorters;
public class Sorter {
    public static Sortable sortArray(String sortMethod){
        switch (sortMethod) {
            case "BubbleSort":
                    return new BubbleSort();

            case "MergeSort":
                   return new MergeSorter();

            case "QuickSort":
                    return new QuickSorter();

            case "InsertionSort":
                    return new InsertionSort();

            case "SelectionSort":
                    return new SelectionArray();
                    }
                    return null;
    }
}
