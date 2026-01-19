package org.example.javastreams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String args[])
    {
        List<List<Integer>>list =Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        System.out.println(list.stream().flatMap(List::stream).collect(Collectors.toList()));

    }
}
