package com.Abraham.PalindromeSimple;

public class SimplePalindromeExm {

    public boolean findPalindrome(int number ) {
        int temp = number;
        int result = 0;
        while(temp > 0){
            result = (result * 10 ) + temp % 10;
            temp /= 10;
        }
        if( result == number){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        SimplePalindromeExm sm = new SimplePalindromeExm();
        System.out.println(sm.findPalindrome(1231));

    }
}
