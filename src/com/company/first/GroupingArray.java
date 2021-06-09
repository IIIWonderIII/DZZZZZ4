package com.company.first;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingArray {

    public void printGroupingArray() {
        List<String> words = List.of("first", "second", "two", "moscow", "two", "two", "first", "europe", "table", "shovel", "mouse");

        Map<String, Long> map = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

}
