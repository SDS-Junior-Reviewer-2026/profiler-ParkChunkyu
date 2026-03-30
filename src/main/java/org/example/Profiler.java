package org.example;

import java.util.ArrayList;

public class Profiler {
    // TODO : Profiler 구현
    private ArrayList<Integer> _data;
    private String _sortType = "bubbleSort";
    private SortServiceLib _sortLib = new BubbleSort();
    private Integer _swap_count = 0;

    public void setData(ArrayList<Integer> data) {
        this._data = data;
    }

    public void setLib(String type) {
        this._sortType = type;
        switch (type) {
            case "bubbleSort":
                this._sortLib = new BubbleSort();
                break;
            case "selectionSort":
                this._sortLib = new SelectionSort();
                break;
            default:
                this._sortLib = null;
                break;
        }
    }

    public void runLib() {
        this._swap_count = this._sortLib.sort(this._data);
    }

    public void showResult() {
        System.out.println(this._sortType + " 테스트");
        System.out.println("정렬결과: " + this._data.toString());
        System.out.println("swap횟수: " + this._swap_count);
    }
}
