package org.example.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElementsGreaterThanTen {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,2,3,5,4,48);
        System.out.println(numbers.stream().map(n->n>10).collect(Collectors.toList()));
        System.out.println(numbers.stream().filter(n->n>10).collect(Collectors.toList()));
        System.out.println(numbers.stream().filter(n->n>10).collect(Collectors.toList()).size());
        System.out.println(numbers.stream().filter(n->n>10).count());
    }
}
