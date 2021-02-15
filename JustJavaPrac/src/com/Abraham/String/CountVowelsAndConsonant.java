package com.Abraham.String;

import java.util.Locale;

public class CountVowelsAndConsonant {
    public static void main(String[] args) {
        int vowelCount = 0, consonantCount = 0;

        String myString = "The quick brown fox jumps over the lazy dog";
        //First convert to lower Case
        myString = myString.toLowerCase();
        for(int i =0; i <myString.length(); i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'e' ||
                    myString.charAt(i) == 'i' || myString.charAt(i) == 'o' || myString.charAt(i) == 'u') {
                vowelCount++;
            }else if(myString.charAt(i) >= 'a' && myString.charAt(i) <='z'){
                consonantCount++;
            }
        }
        System.out.println("The sentence has vowel " + vowelCount);
        System.out.println("The Sentence has consonant " + consonantCount);
    }

}


















