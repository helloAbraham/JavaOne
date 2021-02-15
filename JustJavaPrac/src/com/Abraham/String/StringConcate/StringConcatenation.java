package com.Abraham.String.StringConcate;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "Abraham";
        String lastName = "Parker";
        //Regular if just couple string you want to concatenation
        String name = firstName + " " + lastName;
        System.out.println(name);

        String fullName = (firstName.concat(" ")).concat(lastName);
        System.out.println(fullName);

        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.append("ghi");
        stringBuilder.append("jkl");
        stringBuilder.append("mno");
        stringBuilder.append("pqr");
        System.out.println(stringBuilder);
        stringBuilder.insert(4, "Abraham");
        System.out.println(stringBuilder);
        stringBuilder.delete(1, 3);

        String sB = stringBuilder.toString();
        System.out.println(sB);


    }

}
