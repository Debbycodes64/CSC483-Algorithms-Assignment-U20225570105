package com.csc483.sorting;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int[] myNumbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Before sorting: " + Arrays.toString(myNumbers));

        // Run your custom insertion sort
        SortService.insertionSort(myNumbers);

        System.out.println("After sorting: " + Arrays.toString(myNumbers));
    }
}