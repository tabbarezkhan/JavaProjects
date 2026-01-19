package org.example.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringStartingWithA {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Tabbarez", "Sadaf","Affankhan", "Zara");
        System.out.println(strList.stream().filter(s->s.startsWith("A")).collect(Collectors.toList()));
    }
}
