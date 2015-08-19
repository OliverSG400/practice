package com.company.algorithm.sort;

import java.util.Comparator;

@FunctionalInterface
public interface SortingAlgorithm {

    <T> void sort(T[] target, Comparator<T> comparator, SortingDirection direction);

}
