package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        List<int[]> outputList = new ArrayList<>();
        int[] currentInterval;

        int[][] intervalsSorted = Arrays.stream(intervals)
                .sorted(Comparator.comparingInt(o -> o[0]))
                .toList()
                .toArray(intervals);


        for (int[] ints : intervalsSorted) {

            currentInterval = outputList.isEmpty() ? null : outputList.get(outputList.size() - 1);
            if (currentInterval == null || ints[0] > currentInterval[1]) {
                outputList.add(ints);
                continue;
            }

            if (ints[0] >= currentInterval[0] && ints[1] <= currentInterval[1]) {
                continue;
            }

            if (ints[0] < currentInterval[0]) {
                currentInterval[0] = ints[0];
            }

            if (ints[1] > currentInterval[1]) {
                currentInterval[1] = ints[1];
            }
        }
        return outputList.toArray(new int[][]{});
    }
}