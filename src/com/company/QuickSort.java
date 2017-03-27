package com.company;

class QuickSort {

    static void quickSort(int table[], int left, int right) {

        int i, j, v, temp;
        i = left;
        j = right;
        v = table[(left + right) / 2];
        do {
            while (table[i] < v)
                i++;
            while (table[j] > v)
                j--;
            if (i <= j) {
                temp = table[i];
                table[i] = table[j];
                table[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (j > left)
            quickSort(table, left, j);
        if (i < right)
            quickSort(table, i, right);
    }
}
