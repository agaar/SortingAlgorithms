package com.company;

class MergeSort {

    static void mergeSort(int table[], int start, int end) {

        if (start < end) {
            int middle = (start + end) / 2;
            // Below step sorts the left side of the array
            mergeSort(table, start, middle);
            // Below step sorts the right side of the array
            mergeSort(table, middle + 1, end);
            // Now merge both sides
            merge(table, start, middle, end);
        }
    }

    private static void merge(int[] table, int start, int middle, int end) {
        int[] tempMergArr = new int[end - start + 1];
        int i = start;
        int j = middle + 1;
        int k = 0;


        while (i <= middle && j <= end) {
            if (table[j] < table[i]) {
                tempMergArr[k] = table[j];
                j++;
            } else {
                tempMergArr[k] = table[i];
                i++;
            }
            k++;
        }
        if (i <= middle) {
            while (i <= middle) {
                tempMergArr[k] = table[i];
                i++;
                k++;
            }
        } else {
            while (j <= end) {
                tempMergArr[k] = table[j];
                j++;
                k++;
            }
        }

        for (i = 0; i <= end - start; i++) {
            table[start + i] = tempMergArr[i];
        }
    }
}
