package ua.rozhkov.sorting;

public class BinarySearch {
    public int search(int[] arrayWhereToSearch, int numberToSearch) {
        if ((arrayWhereToSearch == null) || (numberToSearch <= 0))
            throw new IllegalArgumentException();

        if ((numberToSearch < arrayWhereToSearch[0]) ||
                (numberToSearch > arrayWhereToSearch[arrayWhereToSearch.length - 1]))
            return -1;

        if (numberToSearch == arrayWhereToSearch[0])
            return 0;

        if (numberToSearch == arrayWhereToSearch[arrayWhereToSearch.length - 1])
            return arrayWhereToSearch.length - 1;

        return search2(arrayWhereToSearch, numberToSearch, 0, arrayWhereToSearch.length - 1);
    }

    private int search2(int[] arr, int elem, int left, int right) {
        int split = (right + left) / 2;
        if (right <= left) return -1;
        if (elem < arr[split])
            return search2(arr, elem, left, split);
        else if (elem > arr[split])
            return search2(arr, elem, split + 1, right);
        else return split;
    }
}
