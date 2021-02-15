package com.Abraham.JavaPracPro;

import java.util.HashMap;
import java.util.*;

public class FindRepeatedWordHasMap {

    public static void main(String[] args) {
        //This is the given array
        String [] myArray= {"love","is","beautiful","love","is","wonderful","love","is","blind","human","is","kind"};

        Map<String, Integer> occurencesWord = new HashMap<>();

        //lets use the logic now

        for(String myword: myArray){
           if (occurencesWord.containsKey(myword))
           {
               occurencesWord.put(myword, occurencesWord.get(myword) +1 );
           }else{
               occurencesWord.put(myword, 1);
           }
            //System.out.println("String " + myword);
        }

        Set<String> Keys = occurencesWord.keySet();
        for(String checkword: Keys){
            if(occurencesWord.get(checkword) > 1){
                System.out.println("String " + checkword + " repeating " + occurencesWord.get(checkword) + " times");
            }
        }

    }
}
