package com.company.algorithm.sort;

import java.util.Comparator;

public class Sorter<T> {

    private SortingAlgorithm algorithm;
    private Comparator<T> comparator;

    public Sorter(SortingAlgorithm algorithm, Comparator<T> comparator) {
        this.algorithm = algorithm;
        this.comparator = comparator;
    }

    public void sort(T[] target) {
        sort(target, SortingDirection.DOWN);
    }

    public void sort(T[] target, SortingDirection direction) {
        algorithm.sort(target, comparator, direction);
    }

}
