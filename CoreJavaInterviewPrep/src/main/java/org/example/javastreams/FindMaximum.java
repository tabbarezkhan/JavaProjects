package org.example.javastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,2,2,4,5,6,7,6,6,6);
        System.out.println(numbers.stream().max(Integer::compareTo).get());

        List<String> strList= Arrays.asList("Tabbarez","Tabbarez","John","Tabbarez","Mohan","Mohan","Sadaf","Zara");
        System.out.println(strList.stream().max(Comparator.comparingInt(String::length)).orElse(""));
        System.out.println(strList.stream().max(String::compareTo).orElse(""));
    }
}
