package ua.rozhkov.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LS_Sorting {

    static int[] arrayForSort = new int[10];

    public static void main(String[] args) {

        MultiSort multisort = new MultiSort();
        int input = 1;

        while (input != 0) {
            show_menu();
            System.out.print("You choice: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("---Bubble sort---");
                    init_array();
                    System.out.println(Arrays.toString(multisort.bubbleSort(arrayForSort)));
                    System.out.println("Time for sorting: " + multisort.sortDuration + "ms");
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("---Improvement bubble sort---");
                    init_array();
                    System.out.println(Arrays.toString(multisort.bubbleSortImpr(arrayForSort)));
                    System.out.println("Time for sorting: " + multisort.sortDuration + "ms");
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    System.out.println("---Selection sort---");
                    init_array();
                    System.out.println(Arrays.toString(multisort.selectionSort(arrayForSort)));
                    System.out.println("Time for sorting: " + multisort.sortDuration + "ms");
                    System.out.println("--------------------");
                    break;
                case 4:
                    System.out.println("---Insertion sort---");
                    multisort.insertionSort(arrayForSort);
                    System.out.println("Time for sorting: " + multisort.sortDuration + "ms");
                    System.out.println("--------------------");
                    break;
                case 5:
                    System.out.println("---Merge sort---");
                    multisort.mergeSort(arrayForSort);
                    System.out.println("Time for sorting: " + multisort.sortDuration + "ms");
                    System.out.println("----------------");

                    break;
                case 6:
                    System.out.println("---Quick sort---");
                    multisort.quickSort(arrayForSort);
                    System.out.println("Time for sorting: " + multisort.sortDuration + "ms");
                    System.out.println("----------------");
                    break;
            }
        }
    }

    public static void init_array() {
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = new Random().nextInt(100);
        }
        System.out.println("Array to sort:");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("...SORTING...");
    }

    private static void show_menu() {
        System.out.println();
        System.out.println("Select sorting algorithm: ");
        System.out.println("1. Bubble sort");
        System.out.println("2. Improvement bubble sort");
        System.out.println("3. Selection sort");
        System.out.println("4. Insertion sort");
        System.out.println("5. Merge sort");
        System.out.println("6. Quick sort");
        System.out.println("--------------------------");
        System.out.println("0. Exit");
    }
}
