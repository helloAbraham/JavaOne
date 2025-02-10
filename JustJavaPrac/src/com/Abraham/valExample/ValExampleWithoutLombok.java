package com.Abraham.valExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValExampleWithoutLombok {
    public String example() {
        final ArrayList<String> example = new ArrayList<>();
        example.add("Hello, World!");
        final String foo = example.get(0);
        return foo.toLowerCase();
    }

    public void example2() {
        final HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (final Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        ValExampleWithoutLombok ex1 = new ValExampleWithoutLombok();
        System.out.println(ex1.example());
        System.out.println("--------------");
        ex1.example2();
    }
}
