package com.company;

import com.company.algorithm.sort.Sorter;
import com.company.algorithm.sort.bubble.BubbleSortingAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Sorter<Integer> sorter = new Sorter<>(new BubbleSortingAlgorithm(), (o1, o2) -> o2 - o1);
        Integer[] array = {5, 3, 8, 1, 7, 9, 2, 4, 6};
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
