package com.company;

class QuickSort {

    void sort(int table[], int left, int right) {

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
            sort(table, left, j);
        if (i < right)
            sort(table, i, right);
    }
}
