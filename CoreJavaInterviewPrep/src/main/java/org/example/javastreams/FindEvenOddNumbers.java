package org.example.javastreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,12,1,14,15,16,17,18,11);
        List<Integer> even = numbers.stream().filter(n->n%2==0).toList();
        System.out.println(even);

        List<Integer> even1 = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even1);
        List odd= numbers.stream().filter(n->n%2!=0).toList();
        System.out.println(odd);
    }
}
