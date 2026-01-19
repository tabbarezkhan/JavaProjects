package org.example.javastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsByLength {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Tabbarez", "Sadaf","Affankhan", "Zara");
        System.out.println(strList.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()));
    }
}
