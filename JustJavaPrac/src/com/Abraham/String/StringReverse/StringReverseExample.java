package com.Abraham.String.StringReverse;



public class StringReverseExample {

    public static void main(String[] args) {
        String reverseIt= "CBA";
        //getByte() method to convert String into byte[]

        byte[] byteString = reverseIt.getBytes();
        byte[] result = new byte[byteString.length];

        // Store result in reverse order into the
        // result byte[]
        //now time to print
        for (int i = 0; i < byteString.length; i++)
            result[i] = byteString[byteString.length - i - 1];

        System.out.println(new String(result));

    }
}
