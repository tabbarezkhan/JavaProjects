package org.example;

import java.util.*;
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

        String name1= "Millionair";
        List<Character> name1Char = new ArrayList<>();
        for(char c: name1.toCharArray())
        {
            name1Char.add(c);
        }
        System.out.println(name1.toUpperCase());
        System.out.println("New Name Char::"+name1Char);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> numBiggerThanOne = numbers.stream().filter(n->n>1).collect(Collectors.toList());
        System.out.println("Numbers bigger than 1::"+numBiggerThanOne);

        List<Integer> addTwoInEachDigitList = numbers.stream().map(n->n+2).collect(Collectors.toList());
        System.out.println("Plus Two::"+addTwoInEachDigitList);

        List<Integer> randomNumbers = Arrays.asList(10,10,9,5,4,6,2,3,5,5,5,5);
        //randomNumbers.stream().map().collect(Collectors.toSet());
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < randomNumbers.size(); i++) {
            numberSet.add(randomNumbers.get(i));
        }
        System.out.println("Using HashSet::"+numberSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < randomNumbers.size(); i++) {
            linkedHashSet.add(randomNumbers.get(i));
        }
        System.out.println("Using LinkedHashSet::"+linkedHashSet);
    }
}