package org.example;

import java.util.ArrayList;

public class Profiler {
    private ArrayList<Integer> _data;
    private SortType _sortType = SortType.BUBBLE_SORT;
    private SortServiceLib _sortLib = new BubbleSort();
    private Integer _swap_count = 0;

    public void setData(ArrayList<Integer> data) {
        _data = data;
    }

    public void setLib(SortType type) {
        _sortType = type;
        switch (type) {
            case BUBBLE_SORT:
                _sortLib = new BubbleSort();
                break;
            case INSERTION_SORT:
                _sortLib = new InsertionSort();
                break;
            case SELECTION_SORT:
                _sortLib = new SelectionSort();
                break;
        }
    }

    public void runLib() {
        _swap_count = _sortLib.sort(_data);
    }

    public void showResult() {
        System.out.println(_sortType + " 테스트");
        System.out.println("정렬결과: " + _data.toString());
        System.out.println("swap횟수: " + _swap_count);
    }
}
