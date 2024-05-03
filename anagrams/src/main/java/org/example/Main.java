package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> stringsLentghMap =
                Arrays.stream(strs)
                        .collect(Collectors.groupingBy(String::length));
        List<List<String>> output = new ArrayList<>();

        stringsLentghMap.forEach((integer, strings) -> createStringList(output, strings));

        return output;
    }

    private void createStringList(List<List<String>> outputList, List<String> strings) {
        Map<String, List<String>> specificAnagramMap = strings.stream()
                .collect(Collectors.groupingBy(this::getStringLettersSorted));

        specificAnagramMap.forEach((s, strings1) -> outputList.add(strings1));
    }

    private String getStringLettersSorted(String string) {
        List<String> letterList = Arrays.stream(string.split("(?!^)")).sorted().toList();

        StringBuilder letters = new StringBuilder();
        for (String letter : letterList) {
            letters.append(letter);
        }

        return letters.toString();
    }
}