package com.anahuac.software.comportamiento.strategy;

import java.util.ArrayList;
import java.util.List;

public class OrdenarNumeros {

    private List<Integer> numeros;
    private Sortable sortType;

    public OrdenarNumeros(List<Integer> nums, Sortable s) {
        this.numeros = nums;
        this.sortType = s;
    }

    public void ejecutarSort() {
        sortType.sort(numeros);
    }

    public void setsortType(Sortable s) {
        this.sortType = s;
    }

}
