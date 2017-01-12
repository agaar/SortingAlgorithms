package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] inputArr = {5, 3, 6, 2, 5, 1, 2, 23, -52, 121, 358, 0, -76, 49, 853, 342, 258, 64, 754, 19, 94, 63, 15, 25, 58, 36, 24, 85, 254, 314, 252, 108};
        long before, after;


        System.out.println("SORTOWANIE PRZEZ SCALANIE: ");
        int[] msArray = inputArr.clone();
        System.out.println("Przed sortowaniem: " + Arrays.toString(msArray));
        System.out.println("Tablica jest posortowana: " + isSorted(msArray));
        before = System.nanoTime();
        MergeSort ms = new MergeSort();
        ms.sort(msArray, 0, msArray.length - 1);
        after = System.nanoTime();
        System.out.println("Po sortowaniu: " + Arrays.toString(msArray));
        System.out.println("Czas w nanosekundach: " + (after - before));
        System.out.println("Tablica jest posortowana: " + isSorted(msArray));
        System.out.println();

        System.out.println("SORTOWANIE BĄBELKOWE: ");
        int[] bsArray = inputArr.clone();
        System.out.println("Przed sortowaniem: " + Arrays.toString(bsArray));
        System.out.println("Tablica jest posortowana: " + isSorted(bsArray));
        before = System.nanoTime();
        BubbleSort bs = new BubbleSort();
        bs.sort(bsArray);
        after = System.nanoTime();
        System.out.println("Po sortowaniu: " + Arrays.toString(bsArray));
        System.out.println("Czas w nanosekundach: " + (after - before));
        System.out.println("Tablica jest posortowana: " + isSorted(bsArray));
        System.out.println();

        System.out.println("SORTOWANIE SZYBKIE: ");
        int[] qsArray = inputArr.clone();
        System.out.println("Przed sortowaniem: " + Arrays.toString(qsArray));
        System.out.println("Tablica jest posortowana: " + isSorted(qsArray));
        before = System.nanoTime();
        QuickSort qs = new QuickSort();
        qs.sort(qsArray, 0, qsArray.length - 1);
        after = System.nanoTime();
        System.out.println("Po sortowaniu: " + Arrays.toString(qsArray));
        System.out.println("Czas w nanosekundach: " + (after - before));
        System.out.println("Tablica jest posortowana: " + isSorted(qsArray));
        System.out.println();

        System.out.println("SORTOWANIE PRZEZ WYBIERANIE: ");
        int[] ssArray = inputArr.clone();
        System.out.println("Przed sortowaniem: " + Arrays.toString(ssArray));
        System.out.println("Tablica jest posortowana: " + isSorted(ssArray));
        before = System.nanoTime();
        SelectionSort ss = new SelectionSort();
        ss.sort(ssArray);
        after = System.nanoTime();
        System.out.println("Po sortowaniu: " + Arrays.toString(ssArray));
        System.out.println("Czas w nanosekundach: " + (after - before));
        System.out.println("Tablica jest posortowana: " + isSorted(ssArray));
        System.out.println();

        System.out.println("SORTOWANIE PRZEZ WSTAWIANIE: ");
        int[] isArray = inputArr.clone();
        System.out.println("Przed sortowaniem: " + Arrays.toString(isArray));
        System.out.println("Tablica jest posortowana: " + isSorted(isArray));
        before = System.nanoTime();
        InsertionSort is = new InsertionSort();
        is.sort(isArray);
        after = System.nanoTime();
        System.out.println("Po sortowaniu: " + Arrays.toString(isArray));
        System.out.println("Czas w nanosekundach: " + (after - before));
        System.out.println("Tablica jest posortowana: " + isSorted(isArray));
        System.out.println();
    }

    private static boolean isSorted(int[] table) {
        int i;
        for (i = 1; i < table.length; i++) {
            if (table[i - 1] > table[i]) {
                return false;
            }
        }
        return true;
    }
}
