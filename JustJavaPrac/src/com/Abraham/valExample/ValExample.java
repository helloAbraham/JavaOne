package com.Abraham.valExample;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

public class ValExample {

    public String ValExample() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public void ValExample2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        map.put(7, "seven");
        for(val entry: map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        val valExm = new ValExample();
        System.out.println(valExm.ValExample());
        System.out.println("------------------");
        valExm.ValExample2();
    }
}
