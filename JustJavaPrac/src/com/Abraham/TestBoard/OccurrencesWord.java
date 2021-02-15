package com.Abraham.TestBoard;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class OccurrencesWord {
    public static void main(String[] args) {
        String[] myString = {"love", "is", "beautiful","love","is","wonderful",
                             "love","is", "blind", "human", "is", "kind"};
        Map<String, Integer> occurrencesWord = new HashMap<>();

        for(String myWord: myString){
            if(occurrencesWord.containsKey(myWord)){
                occurrencesWord.put(myWord, occurrencesWord.get(myWord)+1);
            }else{
                occurrencesWord.put(myWord, 1);
            }
        }

        Set<String> Keys = occurrencesWord.keySet();
        for(String checkWord: Keys){
          if(occurrencesWord.get(checkWord) > 1) {
              System.out.println("String " + checkWord + " repeats " + occurrencesWord.get(checkWord));

          }
        }
        //Note: Set does not allow DUPLICATE value, but it won't compiles errors or runtime errors
        // it works silently. example below
        Set<String> strSet = new HashSet<>();
        boolean first = strSet.add("Abraham");
        System.out.println(first); //it will say you true
        //Now let's say we want to add again same value
        boolean second = strSet.add("Abraham");
        System.out.println(second);
        //Also let's add few items and mistakenly add same item twice
        strSet.add("Parker");
        strSet.add("Farhad");
        strSet.add("Parker");
        strSet.add("Aiden");
        for(String addingWord: strSet){
            System.out.println(addingWord);
            //We can see even though we add repeated elements in the set
            //It wouldn't add just simply deni. Do not make runtime or compile times error
        }

    }
}
