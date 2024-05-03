package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void test1() {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> output = new Main().groupAnagrams(strings);
        List<List<String>> expectedStrings = List.of(
                List.of("bat"),
                List.of("nat","tan"),
                List.of("ate","eat","tea"));

        assertEquals(expectedStrings.size(), output.size());
        assertTrue(expectedStrings.containsAll(output));
        assertTrue(output.containsAll(expectedStrings));
    }

    @Test
    public void test2() {
        String[] strings = {""};
        List<List<String>> output = new Main().groupAnagrams(strings);
        List<List<String>> expectedStrings = List.of(
                List.of(""));

        assertEquals(expectedStrings, output);
    }

    @Test
    public void test3() {
        String[] strings = {"a"};
        List<List<String>> output = new Main().groupAnagrams(strings);
        List<List<String>> expectedStrings = List.of(
                List.of("a"));

        assertEquals(expectedStrings, output);
    }
}