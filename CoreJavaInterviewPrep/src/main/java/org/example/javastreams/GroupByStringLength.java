package org.example.javastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByStringLength {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Tabbarez", "Sadaf","Affankhan", "Zara","Abcdabcd");
        System.out.println(strList.stream().
                collect(Collectors.groupingBy(String::length)));
    }
}
