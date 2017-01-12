package com.company;


class BubbleSort {

    void sort(int table[]) {
        int size = table.length;
        int i, j, temp;
        for (i = 0; i < size; i++)
            for (j = 0; j < size - 1; j++) {
                if (table[j] > table[j + 1]) {
                    temp = table[j + 1];
                    table[j + 1] = table[j];
                    table[j] = temp;
                }
            }
    }
}
