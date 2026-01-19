package org.example.javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class CompareStringsPractise {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Tabbarez", "Sadaf","Affankhan", "Zara");
        Collections.sort(strList, String::compareTo);
        System.out.println(strList);

        //use Stream
        System.out.println("Longest::"+strList.stream().max(String::compareTo));
        //above gives you Lexicographical max. Z comes in the end so Zara. This is not the way to find the longest string

        System.out.println(strList.stream().max(Comparator.comparingInt(String::length)).orElse(""));

        List <Integer> numbers = Arrays.asList(1,2,4,2,5,7,3,10,34);
        System.out.println(numbers.stream().sorted(Integer::compareTo).collect(Collectors.toList()));
        HashSet<Integer> set = new HashSet<>();

        for(int num: numbers)
        {
            set.add(num);
        }
        System.out.println(set);

        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();

        for(int num: numbers)
        {
            linkedSet.add(num);
        }
        System.out.println(linkedSet);
    }
}
