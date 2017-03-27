package com.company;


class BubbleSort {

    void sort(int table[]) {
        int size = table.length;
        int j, temp;
        boolean swap = true;

        while (swap) {
            swap = false;

            for (j = 0; j < size - 1; j++) {
                if (table[j] > table[j + 1]) {
                    temp = table[j + 1];
                    table[j + 1] = table[j];
                    table[j] = temp;
                    swap = true;
                }
            }
        }
    }
}
