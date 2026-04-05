package com.csc483.assignment2;

import java.util.Random;
import java.util.Arrays;

public class MainApplication {

    public static void main(String[] args) {

        int[] sizes = {1000, 5000, 10000};

        for (int n : sizes) {

            int[] original = new int[n];
            Random rand = new Random();

            // Generate random data
            for (int i = 0; i < n; i++) {
                original[i] = rand.nextInt(100000);
            }

            // Clone arrays for fair testing
            int[] arr1 = original.clone();
            int[] arr2 = original.clone();
            int[] arr3 = original.clone();

            System.out.println("\nDataset Size: " + n);

            // INSERTION SORT
            long s1 = System.nanoTime();
            SortService.insertionSort(arr1);
            long e1 = System.nanoTime();

            // MERGE SORT
            long s2 = System.nanoTime();
            SortService.mergeSort(arr2, 0, arr2.length - 1);
            long e2 = System.nanoTime();

            // QUICK SORT
            long s3 = System.nanoTime();
            SortService.quickSort(arr3, 0, arr3.length - 1);
            long e3 = System.nanoTime();

            // PRINT RESULTS
            System.out.println("Insertion Sort: " + (e1 - s1)/1e6 + " ms");
            System.out.println("Merge Sort: " + (e2 - s2)/1e6 + " ms");
            System.out.println("Quick Sort: " + (e3 - s3)/1e6 + " ms");
        }
    }
}
