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
        System.out.println("increase each number by 1"+resultNumber); // ==> [2, 3, 4, 5, 6, 7]

        //find the number bigger than 2
        List numberBigthantwo=numbers.stream().map(n-> n>2).collect(Collectors.toList());
        System.out.println("find the number bigger than 2"+numberBigthantwo); // ==>[false, false, true, true, true, true]
        // in above two examples I used to map. So map will take every element and it will transform it into something
        //else

        System.out.println("find the number bigger than 2"+numbers.stream().
                        filter(n-> n>2).collect(Collectors.toList())); //==>[3, 4, 5, 6]
        //Here I am using filter which will keep or discard the elements which are satisfying the condition

        //get maximum number from the list
        int i= numbers.stream().max(Integer::compareTo).get();
        System.out.println("Maximum number::"+ i);

        //get minimum number from the list
        int min= numbers.stream().min(Integer::compareTo).get();
        System.out.println("minimum number::"+ min);

        //Sorted
        List<Integer> sortedNumbers = randomNumbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);

        //once you sort, how can you reverse the order
        List<Integer> numbersToReverse =  sortedNumbers.reversed();
        System.out.println("ReversedOrder::"+numbersToReverse);

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



        //take the same String and add it to a Arraylist and see if order is maintained
        ArrayList<Character> charArrayList = new ArrayList<>();
        for (char c: name.toCharArray())
        {
            charArrayList.add(c);
        }
        System.out.println(charArrayList); //take duplicate --> [T, a, b, b, a, r, e, z]
        //Convert the String to upper case
        System.out.println("Upper Case::"+name.toUpperCase());
        //using Stream
        System.out.println("Character upper case::"+charArrayList.stream().map(Character::toUpperCase).collect(Collectors.toList()));

        //using this trying to find unique characters using Stream
        List<Character> uniqueList = charArrayList.stream().distinct().collect(Collectors.toList());
        System.out.println("I used Stream::"+uniqueList);

        LinkedList<Character> characterLinkedList = new LinkedList<>();
        for (char c: name.toCharArray())
        {
            characterLinkedList.add(c);
        }
        System.out.println(characterLinkedList);


    }
}
