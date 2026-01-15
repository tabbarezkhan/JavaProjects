package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String name = "Tabbarez";
        List<Character> cList = new ArrayList<>();
        for(char c: name.toCharArray())
        {
            cList.add(c);
        }
        HashSet<Character> set = new HashSet<>(cList);
        System.out.println("using Stream::"+cList.stream().collect(Collectors.toSet()));
        System.out.println("using Stream LinkedHashset::"+cList.stream().
                collect(Collectors.toCollection(LinkedHashSet::new)));
        System.out.println(cList.stream().
                map(Character::toUpperCase).collect(Collectors.toList()));
        System.out.println("Hello, World!"+set);
        System.out.println("Nice");
    }
}