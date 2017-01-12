package com.company;

class SelectionSort {

    void sort(int[] table) {

        for (int i = 0; i < table.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < table.length; j++) {
                if (table[j] < table[index]) {
                    index = j;
                }
            }
            int smallerNumber = table[index];
            table[index] = table[i];
            table[i] = smallerNumber;
        }
    }
}
