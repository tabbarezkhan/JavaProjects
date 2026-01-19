package org.example.javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {
    public static void main(String[] args) {
        String name = "Tabbarez is very successful";
        char c[]=name.toCharArray();
        List<Character> cList = new ArrayList();
        for(char ch:c)
        {
            cList.add(ch);
        };
        System.out.println(cList);
        String[] str = name.split(" ");
        List<String> strList = new ArrayList<>();
        System.out.println(str);
        for(String word:str)
        {
            strList.add(word);
        }
        cList.forEach(ch-> System.out.println("using Lambda::"+ch));

        List newList = cList.stream().map(Character::toUpperCase).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println(strList.stream().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println(name.toUpperCase());
    }

}
