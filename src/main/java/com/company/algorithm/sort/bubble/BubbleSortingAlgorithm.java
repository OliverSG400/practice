package com.company.algorithm.sort.bubble;

import com.company.algorithm.sort.SortingDirection;
import com.company.algorithm.sort.SortingAlgorithm;

import java.util.Comparator;

public class BubbleSortingAlgorithm implements SortingAlgorithm {

    @Override
    public <T> void sort(T[] target, Comparator<T> comparator, SortingDirection direction) {
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if (comparator.compare(target[i], target[j]) > 0) {
                    swap(target, i, j);
                }
            }
        }
    }

    private static <T> void swap(T[] target, int index1, int index2) {
        T temp = target[index2];
        target[index2] = target[index1];
        target[index1] = temp;
    }

}
