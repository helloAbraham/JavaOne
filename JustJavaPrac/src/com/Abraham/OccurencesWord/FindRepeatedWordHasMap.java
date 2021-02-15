package com.Abraham.OccurencesWord;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class FindRepeatedWordHasMap {
    public static void main(String[] args) {
        //This is the given array
        String[] myString = {"love","is","beautiful","love","is","wonderful","love","is","blind","human","is","kind"};
        Map<String, Integer> occurredWord = new HashMap<>();
        //Let's use the logic now
        for(String myWord: myString){
            if(occurredWord.containsKey(myWord)){
                occurredWord.put(myWord, occurredWord.get(myWord) + 1);
            }else{
                occurredWord.put(myWord, 1);
            }
            //We can printout and see all the elements using myWord iteration
           //  System.out.println("String " + myWord);
        }
        //Now we have to count how many duplicate word are there?
        //Set will help us to count the duplicate words in the array
        Set<String> Keys = occurredWord.keySet();
        for(String checkWord:Keys){
            if(occurredWord.get(checkWord)>1){
                System.out.println("String " +checkWord + " Repeats " + occurredWord.get(checkWord) + " Times");
            }
        }
    }
}
