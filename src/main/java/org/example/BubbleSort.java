package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort implements SortServiceLib {

    @Override
    public Integer sort(ArrayList<Integer> arr) {
        int swap_count = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    swap_count++;
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return swap_count;
    }
}