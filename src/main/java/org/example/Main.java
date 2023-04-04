package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] massive = {1, 2, 3, 56, 78, 92, 44, 24, 33};
        System.out.println(Arrays.toString(massiveSort(massive)));
    }
    public static int[] massiveSort(int[] massive) {
        int[] massiveTwo = new int[5];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                massive[i] += 1;
            }
            if (i > 2 && i < 8) {
                massiveTwo[i - 3] = massive[i];
            }
        }
        return massiveTwo;
    }
}