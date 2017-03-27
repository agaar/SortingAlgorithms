package com.company;

class InsertionSort {

    static void insertionSort(int[] table) {
        int i, j, newValue;
        for (i = 1; i < table.length; i++) {
            newValue = table[i];
            j = i;

            while (j > 0 && table[j - 1] > newValue) {
                table[j] = table[j - 1];
                j--;
            }
            table[j] = newValue;
        }
    }
}
