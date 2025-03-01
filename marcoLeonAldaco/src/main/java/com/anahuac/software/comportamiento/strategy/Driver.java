package com.anahuac.software.comportamiento.strategy;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        n.add(29);
        n.add(43);
        n.add(9);
        n.add(15);
        n.add(7);

        OrdenarNumeros quickSort = new OrdenarNumeros(new ArrayList<>(n), new QuickSort());
        quickSort.ejecutarSort();

        OrdenarNumeros bubbleSort = new OrdenarNumeros(new ArrayList<>(n), new BubbleSort());
        bubbleSort.ejecutarSort();

        OrdenarNumeros mergeSort = new OrdenarNumeros(new ArrayList<>(n), new MergeSort());
        mergeSort.ejecutarSort();

        OrdenarNumeros insertionSort = new OrdenarNumeros(new ArrayList<>(n), new InsertionSort());
        insertionSort.ejecutarSort();
    }
}
