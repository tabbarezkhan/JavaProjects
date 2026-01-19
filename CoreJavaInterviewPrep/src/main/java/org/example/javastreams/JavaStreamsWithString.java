package org.example.javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamsWithString {

    public static void main(String args[]) {
        /****String => number of unique characters in a String ********/
        String name = new String("Tabbarez");
        Set<Character> unique = new HashSet<>();
        for (char c : name.toCharArray()) {
            unique.add(c);
        }
        System.out.println(unique); // here output can be in any order like = [a, b, r, T, e, z]

        //use LinkedHashset and you will get order
        Set<Character> unique2 = new LinkedHashSet<>();
        for (char c : name.toCharArray()) {
            unique2.add(c);
        }
        System.out.println(unique2); //[T, a, b, r, e, z]


        //take the same String and add it to a Arraylist and see if order is maintained
        ArrayList<Character> charArrayList = new ArrayList<>();
        for (char c : name.toCharArray()) {
            charArrayList.add(c);
        }
        System.out.println(charArrayList); //take duplicate --> [T, a, b, b, a, r, e, z]
        //Convert the String to upper case
        System.out.println("Upper Case::" + name.toUpperCase());
        //using Stream
        System.out.println("Character upper case::" + charArrayList.stream().map(Character::toUpperCase).collect(Collectors.toList()));

        //using this trying to find unique characters using Stream
        List<Character> uniqueList = charArrayList.stream().distinct().collect(Collectors.toList());
        System.out.println("I used Stream::" + uniqueList);

        LinkedList<Character> characterLinkedList = new LinkedList<>();
        for (char c : name.toCharArray()) {
            characterLinkedList.add(c);
        }
        System.out.println(characterLinkedList);



    }
}
