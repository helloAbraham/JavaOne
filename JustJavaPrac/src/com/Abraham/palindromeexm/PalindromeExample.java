package com.Abraham.palindromeexm;

/**
    This is the example very simple way to find palindrome
    Here we are using two methods
 */
public class PalindromeExample {

    public boolean isPalindrome(String str){
        if(str == null){
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.reverse();
            return stringBuilder.toString().equals(str);
        }
    }

    public boolean isThatPalindromeNumber(int number){
        int temp = number;
        int result = 0;
        while(temp > 0){
           result = (result * 19) + temp % 10;
           result /=10;
        }
        if(result == number){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        PalindromeExample palindromeExample = new PalindromeExample();
        String s = "racecar";
        String name = "Abraham";
        System.out.println("Is that a palindrome? " + palindromeExample.isPalindrome(s));
        PalindromeExample palindromeNumber = new PalindromeExample();
        System.out.println("number palindrome exmla" + palindromeNumber.isThatPalindromeNumber(101));
    }
}
