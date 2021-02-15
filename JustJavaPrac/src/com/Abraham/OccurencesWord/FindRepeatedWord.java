package com.Abraham.OccurencesWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindRepeatedWord {
    public static void main(String[] args) {
        String[] myString = {"love", "is", "beautiful", "love", "is", "wonderful",
                             "love", "is", "blind", "human", "is", "kind"};
        Map<String, Integer> occurrencesWord = new HashMap<>();
        for(String myWord:myString) {
            if (occurrencesWord.containsKey(myWord)) {
                occurrencesWord.put(myWord, occurrencesWord.get(myWord) + 1);
            } else {
                occurrencesWord.put(myWord, 1);
            }
        }
            //below line of code will print all the elements, I mean here words
            // System.out.println(occurrencesWord + " ");
           /*
            if(occurrencesWord.containsKey("is")){

            System.out.println("Testing.containsKey " + occurrencesWord.get("is"));
            }
            */

        Set<String> Keys = occurrencesWord.keySet();
        for(String checkWord:Keys){
            if(occurrencesWord.get(checkWord)>1){
                System.out.println("String " + checkWord + " repeats " + occurrencesWord.get(checkWord) +" times");
            }
        }

    }
}
