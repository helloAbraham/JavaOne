package com.Abraham.JavaPracPro;



import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> wordToNum = new HashMap();


        // INsert key-and-value pairs into the HashMap
        wordToNum.put("ONE", 1);
        wordToNum.put("TWO", 2);
        wordToNum.put("THREE", 3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);


        System.out.println("Let's see the gap    then text");
        //Let's print the number 3 by the key THREE
        System.out.println(wordToNum.get("THREE"));


        //Let's get all the values in the HashMap we have
        System.out.println(wordToNum.values());

        System.out.println(wordToNum.keySet());

        //Let's remove one key from the HashMap and also show I mean print what the key remove
        System.out.println(wordToNum.remove("FOUR"));


        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());




        // Common Use of HashMaps: Which character is the most repeated?
        String s = "phonebook";
        HashMap<Character, Integer> hashMap = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (hashMap.containsKey(currentChar)) {
                // incrememt current value for this key in hashmap by 1
                hashMap.put(currentChar, hashMap.get(currentChar) + 1);
            } else {
                // If we haven't added it to the hashmap, then put it in with the value 1
                hashMap.put(currentChar, 1);
            }
        }

        Character mostRepeated = ' ';
        int max = 0;
        //modernized for each
        for (Character key : hashMap.keySet()) {
            int currentValue = hashMap.get(key);
            if (currentValue > max) {
                mostRepeated = key;
                max = currentValue;
            }
        }

        System.out.println("Most Repeated: " + mostRepeated + " | Times: " + max);


    }

}

