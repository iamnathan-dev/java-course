package com.nathancodes;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        /* multi-dimensional arrays */
//        int[2][3] matrix = {
//                { 3, 4, 5 },
//                { 6, 7, 8 }
//        };

        String name = "Nathan";
        // arrays
        int[] numbers = { 60, 10, 20, 80, 40, 50 };
        Arrays.sort(numbers);

        String sortedArrayResult = Arrays.toString(numbers);

        System.out.println("Sorted array: " + sortedArrayResult);
    }
}
