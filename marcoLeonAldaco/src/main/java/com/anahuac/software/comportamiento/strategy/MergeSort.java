package com.anahuac.software.comportamiento.strategy;

import java.util.Collections;
import java.util.List;

public class MergeSort implements Sortable {

    @Override
    public void sort(List<Integer> num) {

        System.out.println("Ordenando usando MergeSort");
        Collections.sort(num);

        for (int i = 0; i < num.size(); i++) {

            System.out.println(num.get(i));
        }
    }

}
