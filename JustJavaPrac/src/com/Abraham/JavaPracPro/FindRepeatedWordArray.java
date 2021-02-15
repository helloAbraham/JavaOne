package com.Abraham.JavaPracPro;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindRepeatedWordArray {

    public static void main(String[] args) {
        //This is the given array
        String [] myArray = {"love","is", "beautiful", "love", "is", "blind", "love", "is", "wonderful", "humans", "is", "kind"};

        Map<String, Integer> occurencesWord = new HashMap<>();

        //below the logic
        for(String word: myArray)
            if(occurencesWord.containsKey(word))
            {
                occurencesWord.put(word, occurencesWord.get(word)+1);
            }else{
                occurencesWord.put(word, 1);
            }

        Set<String> keys = occurencesWord.keySet();
            for(String word: keys){
                if(occurencesWord.get(word)>1){
                    System.out.println("String: " + word + " repeating " + occurencesWord.get(word) + " times");
                }
            }





    }
}
