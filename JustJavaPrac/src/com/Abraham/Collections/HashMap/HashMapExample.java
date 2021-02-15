package com.Abraham.Collections.HashMap;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;

/**
    This is the simple program example of HashMap how store value Key, Value
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook =  new HashMap<>();
        //Now let's add some elements one phoneBook
        phoneBook.put("Abraham", 4504150);
        phoneBook.put("Parker", 4514501);
        phoneBook.put("Daisy", 5674232);
        phoneBook.put("Jenifer", 8153347);
        phoneBook.put("Aiden", 5400045);
        System.out.println(phoneBook);

        //HashMap does not allowed DUPLICATE keys
        //If we do that, it will just over written
        phoneBook.put("Parker", 5142222);
        System.out.println( phoneBook);

        //Another features is that HashMap also allowed null, 000
        phoneBook.put(null, 0000);

        System.out.println(phoneBook);

        //let's say I want to remove Daisy from my phoneBook then????, now worries here it is
        if(phoneBook.containsKey("Daisy")){
            phoneBook.remove("Daisy");
        }

        System.out.println(phoneBook);

        //If we want to delete all elements in the phoneBook, we could do that too using .clear()

        phoneBook.clear();
        System.out.println(phoneBook);
    }
}
