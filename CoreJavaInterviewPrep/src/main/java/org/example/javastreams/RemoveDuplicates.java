package org.example.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> strList= Arrays.asList("Tabbarez","Tabbarez","John","Tabbarez","Mohan","Mohan","Sadaf");
        System.out.println(strList.stream().distinct().collect(Collectors.toList()));

        List<Integer> numbers = Arrays.asList(1,1,2,2,4,5,6,7,6,6,6);
        System.out.println(numbers.stream().distinct().collect(Collectors.toList()));

    }
}
