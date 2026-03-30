package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Profiler profiler = new Profiler();
        profiler.setData(new ArrayList<>(Arrays.asList(5,2,1,1,7,3,1,4,2,8,6,9,1)));
        profiler.setLib("bubbleSort");
        profiler.runLib();
        profiler.showResult();

        System.out.println("--------------------");

        profiler.setData(new ArrayList<>(Arrays.asList(5,2,1,1,7,3,1,4,2,8,6,9,1)));
        profiler.setLib("selectionSort");
        profiler.runLib();
        profiler.showResult();
    }
}