package org.example;

import java.util.ArrayList;

public interface SortServiceLib {

    default Integer sort(ArrayList<Integer> arr) {
        return 0;
    }
}
