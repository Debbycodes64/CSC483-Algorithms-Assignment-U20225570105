/*package com.csc483.assignment1;

import java.util.Random;
import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {

        int n = 100000;
        Product[] products = new Product[n];
        Random rand = new Random();

        // Generate products
        for (int i = 0; i < n; i++) {
            products[i] = new Product(
                    rand.nextInt(200000),
                    "Product" + i,
                    "Category",
                    rand.nextDouble() * 1000,
                    rand.nextInt(100)
            );
        }

        // Sort for binary search
        Arrays.sort(products, (a, b) -> a.productId - b.productId);

        int bestCaseId = products[0].productId;
        int averageCaseId = products[n / 2].productId;
        int worstCaseId = -1;

        // SEQUENTIAL SEARCH
        long s1 = System.nanoTime();
        SearchService.sequentialSearchById(products, bestCaseId);
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        SearchService.sequentialSearchById(products, averageCaseId);
        long e2 = System.nanoTime();

        long s3 = System.nanoTime();
        SearchService.sequentialSearchById(products, worstCaseId);
        long e3 = System.nanoTime();

        // BINARY SEARCH
        long b1 = System.nanoTime();
        SearchService.binarySearchById(products, bestCaseId);
        long b1e = System.nanoTime();

        long b2 = System.nanoTime();
        SearchService.binarySearchById(products, averageCaseId);
        long b2e = System.nanoTime();

        long b3 = System.nanoTime();
        SearchService.binarySearchById(products, worstCaseId);
        long b3e = System.nanoTime();

        // OUTPUT
        System.out.println("====================================================");
        System.out.println("TECHMART SEARCH PERFORMANCE ANALYSIS (n = 100,000)");
        System.out.println("====================================================\n");

        System.out.println("SEQUENTIAL SEARCH:");
        System.out.println("Best Case (ID at position 0): " + (e1 - s1)/1e6 + " ms");
        System.out.println("Average Case (random ID): " + (e2 - s2)/1e6 + " ms");
        System.out.println("Worst Case (ID not found): " + (e3 - s3)/1e6 + " ms\n");

        System.out.println("BINARY SEARCH:");
        System.out.println("Best Case (ID at middle): " + (b1e - b1)/1e6 + " ms");
        System.out.println("Average Case (random ID): " + (b2e - b2)/1e6 + " ms");
        System.out.println("Worst Case (ID not found): " + (b3e - b3)/1e6 + " ms\n");

// Performance comparison
        double seqAvg = (e2 - s2)/1e6;
        double binAvg = (b2e - b2)/1e6;
        double improvemssent = seqAvg / binAvg;

        System.out.println("PERFORMANCE IMPROVEMENT:");
        System.out.println("Binary search is approximately " + improvement + "x faster on average");
        System.out.println("====================================================");
    }
}*/

package com.csc483.assignment1;

import java.util.Random;
import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {

        int n = 100000;
        Product[] products = new Product[n];
        Random rand = new Random();

        // Generate products
        for (int i = 0; i < n; i++) {
            products[i] = new Product(
                    rand.nextInt(200000),
                    "Product" + i,
                    "Category",
                    rand.nextDouble() * 1000,
                    rand.nextInt(100)
            );
        }

        // Sort for binary search
        Arrays.sort(products, (a, b) -> a.productId - b.productId);

        int bestCaseId = products[0].productId;
        int averageCaseId = products[n / 2].productId;
        int worstCaseId = -1;

        // SEQUENTIAL SEARCH
        long s1 = System.nanoTime();
        SearchService.sequentialSearchById(products, bestCaseId);
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        SearchService.sequentialSearchById(products, averageCaseId);
        long e2 = System.nanoTime();

        long s3 = System.nanoTime();
        SearchService.sequentialSearchById(products, worstCaseId);
        long e3 = System.nanoTime();

        // BINARY SEARCH
        long b1 = System.nanoTime();
        SearchService.binarySearchById(products, bestCaseId);
        long b1e = System.nanoTime();

        long b2 = System.nanoTime();
        SearchService.binarySearchById(products, averageCaseId);
        long b2e = System.nanoTime();

        long b3 = System.nanoTime();
        SearchService.binarySearchById(products, worstCaseId);
        long b3e = System.nanoTime();

        // OUTPUT
        System.out.println("=== SEQUENTIAL SEARCH ===");
        System.out.println("Best Case: " + (e1 - s1)/1e6 + " ms");
        System.out.println("Average Case: " + (e2 - s2)/1e6 + " ms");
        System.out.println("Worst Case: " + (e3 - s3)/1e6 + " ms");

        System.out.println("\n=== BINARY SEARCH ===");
        System.out.println("Best Case: " + (b1e - b1)/1e6 + " ms");
        System.out.println("Average Case: " + (b2e - b2)/1e6 + " ms");
        System.out.println("Worst Case: " + (b3e - b3)/1e6 + " ms");
    }
}