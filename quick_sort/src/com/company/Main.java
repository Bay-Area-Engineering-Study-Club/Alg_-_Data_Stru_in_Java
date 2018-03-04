package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        QuickSort quicksort = new QuickSort();

        int[] array = null;
        array = quicksort.mergeSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[0];
        array = quicksort.mergeSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[] {1,2,3,4};
        array = quicksort.mergeSort(array);
        System.out.println(Arrays.toString(array));


    }
}
