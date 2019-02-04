package ua.rozhkov.sorting;

import java.util.Arrays;
import java.util.Random;

public class LS_Sorting {

    static int[] arrayForSort = new int[20];

    public static void main(String[] args) {
        init_array();
        System.out.println("Array to sort:");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("-------------------------");

        Multisort multisort = new Multisort();

        System.out.println("---Bubble sort---");
        System.out.println(Arrays.toString(multisort.bubbleSort(arrayForSort)));
        System.out.println("Time for sorting: " + multisort.sortDuration);
        System.out.println("-----------------");

        System.out.println("---Improvement bubble sort---");
        multisort.bubbleSortImpr(arrayForSort);
        System.out.println("Time for sorting: " + multisort.sortDuration);
        System.out.println("-----------------------------");

        System.out.println("---Selection sort---");
        multisort.selectionSort(arrayForSort);
        System.out.println("Time for sorting: " + multisort.sortDuration);
        System.out.println("--------------------");

        System.out.println("---Insertion sort---");
        multisort.insertionSort(arrayForSort);
        System.out.println("Time for sorting: " + multisort.sortDuration);
        System.out.println("--------------------");

        System.out.println("---Merge sort---");
        multisort.mergeSort(arrayForSort);
        System.out.println("Time for sorting: " + multisort.sortDuration);
        System.out.println("----------------");

        System.out.println("---Quick sort---");
        multisort.quickSort(arrayForSort);
        System.out.println("Time for sorting: " + multisort.sortDuration);
        System.out.println("----------------");


//        System.out.println(LocalTime.now());
    }

    public static void init_array() {
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = new Random().nextInt(100);
        }
    }
}
