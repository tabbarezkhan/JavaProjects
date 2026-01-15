package org.example.javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class PractiseJavaStreams {

    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> randomNumbers = Arrays.asList(12,10,8,6,5,2);

        //increase each number by 1
        List resultNumber = numbers.stream().map(n->n+1).collect(Collectors.toList());
        System.out.println(resultNumber);

        //find the number bigger than 2
        List numberBigthantwo=numbers.stream().filter(n-> n>2).collect(Collectors.toList());
        System.out.println(numberBigthantwo);

        //get maximum number from the list
        int i= numbers.stream().max(Integer::compareTo).get();
        System.out.println(i);

        //reverse the order
        List<Integer> sortedNumbers = randomNumbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);

        /****String => number of unique characters in a String ********/

        String name =  new String("Tabbarez");
        Set<Character> unique = new HashSet<>();

        for (char c: name.toCharArray())
        {
            unique.add(c);
        }

        System.out.println(unique); // here output can be in any order like = [a, b, r, T, e, z]

        //use LinkedHashset and you will get order
        Set<Character> unique2 = new LinkedHashSet<>();
        for (char c: name.toCharArray())
        {
            unique2.add(c);
        }
        System.out.println(unique2); //[T, a, b, r, e, z]

        //take the same String and add it to a Arraylist and see if order is mantained
        ArrayList<Character> charArrayList = new ArrayList<>();
        for (char c: name.toCharArray())
        {
            charArrayList.add(c);
        }
        System.out.println(charArrayList); //take duplicate --> [T, a, b, b, a, r, e, z]

        LinkedList<Character> characterLinkedList = new LinkedList<>();
        for (char c: name.toCharArray())
        {
            characterLinkedList.add(c);
        }
        System.out.println(characterLinkedList);

    }
}
