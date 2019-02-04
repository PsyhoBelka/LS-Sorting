package ua.rozhkov.sorting;

import java.time.Duration;
import java.time.LocalTime;

public class Multisort {
    LocalTime localTimeStart;
    LocalTime localTimeEnd;
    public long sortDuration;

    public int[] bubbleSort(int[] arrayToSort) {
        int tmp;
        int sorted = 0;

        localTimeStart = LocalTime.now();

        while (sorted < arrayToSort.length) {
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] < arrayToSort[i + 1]) {
                    break;
                } else {
                    sorted++;
                }
            }

            if (sorted == arrayToSort.length) {
                return arrayToSort;
            } else {
                for (int i = 0; i < arrayToSort.length - 1; i++) {
                    if (arrayToSort[i] < arrayToSort[i + 1]) {
                        tmp = arrayToSort[i];
                        arrayToSort[i] = arrayToSort[i + 1];
                        arrayToSort[i + 1] = tmp;
                    }
                }
            }
        }

        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return arrayToSort;
    }

    public int[] bubbleSortImpr(int[] arrayToSort) {
        localTimeStart = LocalTime.now();
        //todo: sorting phase
        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return null;
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
