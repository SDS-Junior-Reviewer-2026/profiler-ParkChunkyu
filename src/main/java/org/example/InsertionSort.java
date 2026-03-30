package org.example;

import java.util.ArrayList;

public class InsertionSort implements SortServiceLib {

    @Override
    public Integer sort(ArrayList<Integer> arr) {
        int swap_count = 0;
        for (int i = 1; i < arr.size(); i++) {
            int target = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > target) {
                arr.set(j + 1, arr.get(j));
                j--;
                swap_count++;
            }
            arr.set(j + 1, target);
        }
        return swap_count;
    }
}
