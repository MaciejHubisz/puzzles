package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {
    @Test
    public void test1() {
        int[][] inputIntervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] output = new Main().merge(inputIntervals);
        int[][] expectedIntervals = {{1, 6}, {8, 10}, {15, 18}};
        assertEquals(expectedIntervals.length, output.length);
        for (int i = 0; i < expectedIntervals.length; i++) {
            assertEquals(expectedIntervals[i][0], output[i][0]);
            assertEquals(expectedIntervals[i][1], output[i][1]);
        }
    }


    @Test
    public void test2() {
        int[][] inputIntervals = {{1, 4}, {4, 5}};
        int[][] output = new Main().merge(inputIntervals);
        int[][] expectedIntervals = {{1, 5}};
        assertEquals(expectedIntervals.length, output.length);
        for (int i = 0; i < expectedIntervals.length; i++) {
            assertEquals(expectedIntervals[i][0], output[i][0]);
            assertEquals(expectedIntervals[i][1], output[i][1]);
        }
    }

    @Test
    public void test3() {
        int[][] inputIntervals = {{1, 4}, {0, 4}};
        int[][] output = new Main().merge(inputIntervals);
        int[][] expectedIntervals = {{0, 4}};
        assertEquals(expectedIntervals.length, output.length);
        for (int i = 0; i < expectedIntervals.length; i++) {
            assertEquals(expectedIntervals[i][0], output[i][0]);
            assertEquals(expectedIntervals[i][1], output[i][1]);
        }
    }

    @Test
    public void test4() {
        int[][] inputIntervals = {{1, 4}, {2, 3}};
        int[][] output = new Main().merge(inputIntervals);
        int[][] expectedIntervals = {{1, 4}};
        assertEquals(expectedIntervals.length, output.length);
        for (int i = 0; i < expectedIntervals.length; i++) {
            assertEquals(expectedIntervals[i][0], output[i][0]);
            assertEquals(expectedIntervals[i][1], output[i][1]);
        }
    }

    @Test
    public void test5() {
        int[][] inputIntervals = {{1, 4}, {0, 2}, {3,5}};
        int[][] output = new Main().merge(inputIntervals);
        int[][] expectedIntervals = {{0,5}};
        assertEquals(expectedIntervals.length, output.length);
        for (int i = 0; i < expectedIntervals.length; i++) {
            assertEquals(expectedIntervals[i][0], output[i][0]);
            assertEquals(expectedIntervals[i][1], output[i][1]);
        }
    }
}