package ua.rozhkov.sorting;

import java.time.Duration;
import java.time.LocalTime;

public class MultiSort {
    private LocalTime localTimeStart;
    private LocalTime localTimeEnd;
    public long sortDuration;

    public int[] bubbleSort(int[] arrayToSort) {

        int tmp;

        if (arrayToSort == null) throw new IllegalArgumentException();
        if (arrayToSort.length == 0) throw new IllegalArgumentException();
        if (arrayToSort.length == 1) return arrayToSort;

        int i = 0;
        localTimeStart = LocalTime.now();
        while (i < arrayToSort.length - 1) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                tmp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i + 1];
                arrayToSort[i + 1] = tmp;
                i = 0;
            } else {
                i++;
            }

        }

        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return arrayToSort;
    }

    public int[] bubbleSortImpr(int[] arrayToSort) {

        int tmp;
        int sorted = 0;
        int i = 0, j = 0;

        if (arrayToSort == null) throw new IllegalArgumentException();
        if (arrayToSort.length == 0) throw new IllegalArgumentException();
        if (arrayToSort.length == 1) return arrayToSort;
        j = arrayToSort.length - 1;

        localTimeStart = LocalTime.now();
        while (i < j) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                tmp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i + 1];
                arrayToSort[i + 1] = tmp;
            }
            i++;
            if (i == j) {
                j--;
                i = 0;
            }
            if (j == 1) break;
        }

        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return arrayToSort;
    }

    public int[] selectionSort(int[] arrayToSort) {
        localTimeStart = LocalTime.now();
        //todo: sorting phase
        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return null;
    }

    public int[] insertionSort(int[] arrayToSort) {
        localTimeStart = LocalTime.now();
        //todo: sorting phase
        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return null;
    }

    public int[] mergeSort(int[] arrayToSort) {
        localTimeStart = LocalTime.now();
        //todo: sorting phase
        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return null;
    }

    public int[] quickSort(int[] arrayToSort) {
        localTimeStart = LocalTime.now();
        //todo: sorting phase
        localTimeEnd = LocalTime.now();
        return null;
    }
}
