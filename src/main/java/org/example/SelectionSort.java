package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort implements SortServiceLib {

    @Override
    public Integer sort(ArrayList<Integer> arr) {
        int swap_count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    swap_count++;
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return swap_count;
    }
}