package com.nathancodes;

import java.util.Arrays;

public class Array {
    public static void main(String[] arg) {
        /* multi-dimensional arrays */
        int[][] matrix = {
               { 5, 4, 3 },
               { 6, 7, 8 }
        };

        for (int[] row: matrix) {
            Arrays.sort(row);
        }

        String sortedDimensionalArrayRes = Arrays.deepToString(matrix);

        // arrays
        int[] numbers = { 60, 10, 20, 80, 40, 50 };
        Arrays.sort(numbers);

        String sortedArrayResult = Arrays.toString(numbers);

        System.out.println("Sorted Dimensional Array: " + sortedDimensionalArrayRes);
        System.out.println("Sorted array: " + sortedArrayResult);
    }
}
