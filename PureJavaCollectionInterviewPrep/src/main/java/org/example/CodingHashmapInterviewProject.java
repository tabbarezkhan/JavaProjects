package org.example;

import java.util.HashMap;

public class CodingHashmapInterviewProject {
    public static void main(String args[])
    {
        int array[]= {1,2,1,1,3,4,4,2,5,5,5,2};

        HashMap<Integer, Integer> frequencyMap = new HashMap();
        for (int num:array){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
        }

        System.out.println(frequencyMap);
        frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
