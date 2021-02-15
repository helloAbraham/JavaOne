package com.Abraham.OccurenceArrayExampleUnpaired;

import java.util.Set;
import java.util.HashSet;
public class SetExampleTwo {
    public String solutionString(String[] str){
        int n = str.length;
        String unpairedStr;

        Set<String> mySet = new HashSet<>();

        for(int i = 0; i<n; i++){
            if (mySet.contains(str[i])) {
                mySet.remove(str[i]);
            } else {
                mySet.add(str[i]);
            }


        }
        String pmySet = mySet.iterator().next();
        return pmySet;
    }
}
