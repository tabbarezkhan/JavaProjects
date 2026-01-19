package org.example.javastreams;

import java.util.HashMap;

public class FindTheCountandStoreinHashMap {
    public static void main(String[] args) {
        int array[]= {1,2,1,1,3,4,4,2,5,5,5,2};
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

        for(Integer number:array)
        {
            frequencyMap.put(number,frequencyMap.getOrDefault(number,0)+1);
        }
        System.out.println(frequencyMap);
    }
}
