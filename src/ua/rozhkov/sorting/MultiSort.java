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
        if (arrayToSort.length <= 1) return arrayToSort;

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

        if (arrayToSort == null) throw new IllegalArgumentException();
        if (arrayToSort.length <= 1) return arrayToSort;

        int min;
        int minIndex;
        int i = 0;
        int tmp;

        localTimeStart = LocalTime.now();
        while (i < arrayToSort.length) {
            min = arrayToSort[i];
            minIndex = i;
            for (int k = i; k < arrayToSort.length; k++) {
                if (arrayToSort[k] < min) {
                    min = arrayToSort[k];
                    minIndex = k;
                }
            }
            tmp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[minIndex];
            arrayToSort[minIndex] = tmp;
            i++;
        }

        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return arrayToSort;
    }

    public int[] insertionSort(int[] arrayToSort) {
        localTimeStart = LocalTime.now();
        //todo: sorting phase
        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return null;
    }

    public int[] mergeSort(int[] arrayToSort) {
        if (arrayToSort == null) throw new IllegalArgumentException();
        if (arrayToSort.length <= 1) return arrayToSort;

        localTimeStart = LocalTime.now();
        mergeSort2(arrayToSort, 0, arrayToSort.length - 1);
        localTimeEnd = LocalTime.now();
        sortDuration = Duration.between(localTimeStart, localTimeEnd).toMillis();
        return arrayToSort;
    }

    private int[] mergeSort2(int[] arr, int left, int right) {
        int split = 0;

        if (left < right) {
            split = (left + right) / 2;
            mergeSort2(arr, left, split);
            mergeSort2(arr, split + 1, right);
            merge(arr, left, split, right);
        }
        return arr;
    }

    private void merge(int[] arr, int left, int split, int right) {

        int[] tmp = new int[right - left + 1];
        int pos1 = left;
        int pos2 = split + 1;
        int posTmp = 0;

        while (pos1 <= split && pos2 <= right) {
            if (arr[pos1] < arr[pos2])
                tmp[posTmp++] = arr[pos1++];
            else
                tmp[posTmp++] = arr[pos2++];
        }

        while (pos2 <= right)
            tmp[posTmp++] = arr[pos2++];
        while (pos1 <= split)
            tmp[posTmp++] = arr[pos1++];

        for (posTmp = 0; posTmp < right - left + 1; posTmp++)
            arr[left + posTmp] = tmp[posTmp];
    }

    public int[] quickSort(int[] arrayToSort) {
        if (arrayToSort == null) throw new IllegalArgumentException();
        if (arrayToSort.length <= 1) return arrayToSort;

        localTimeStart = LocalTime.now();

        quickSort2(arrayToSort, 0, arrayToSort.length - 1);

        localTimeEnd = LocalTime.now();
        return arrayToSort;
    }

    private int[] quickSort2(int[] arr, int leftP, int rightP) {
        int p = partition(arr, leftP, rightP);
        if (leftP < p - 1)
            quickSort2(arr, leftP, p - 1);
        if (p < rightP - 1)
            quickSort2(arr, p, rightP);
        return arr;
    }

    private int partition(int[] arr, int leftP, int rightP) {
        int pivot = arr[(leftP + rightP) / 2];

        while (leftP <= rightP) {
            while (arr[leftP] < pivot) {
                leftP++;
            }

            while (arr[rightP] > pivot) {
                rightP--;
            }

            if (leftP <= rightP) {
                if (leftP != rightP) {
                    swap(arr, leftP, rightP);
                }
                leftP++;
                rightP--;
            }

        }
        return leftP;
    }

    private void swap(int[] arr, int a, int b) {
        int tmp;
        tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
