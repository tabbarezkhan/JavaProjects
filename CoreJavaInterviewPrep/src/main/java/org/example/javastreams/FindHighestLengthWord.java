package org.example.javastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindHighestLengthWord {
    public static void main(String[] args) {
        String statement = "I am in syndey and I have moved from South Africa. Immigration was not easyaerterger";
        String[] str=  statement.split(" ");
        List<String> list = Arrays.asList(str);
        int maxlength = 0;
        String maxLengthword = null;

        //way1
        for(String word:list)
        {
            if(word.length()>maxlength) {
                maxlength=word.length();
                maxLengthword = word;
            }
        }
        System.out.println(maxLengthword);

        //using stream
        String longest = list.stream().max(Comparator.comparing(String::length)).orElse("");
        System.out.println(longest);

        List lengthList = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengthList);


        List<String> strList = Arrays.asList("tabbarez","Aslam","Big Business","Zindagi");
       String longestNew = strList.stream().max(Comparator.comparingInt(String::length)).orElse("");

        List <Integer> numbers = Arrays.asList(1,2,4,2,5,7,3,10,34);
        int maxNumber =numbers.stream().max(Integer::compare).get();
        System.out.println(maxNumber);







    }
}
