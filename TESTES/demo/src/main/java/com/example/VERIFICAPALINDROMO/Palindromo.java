package com.example.VERIFICAPALINDROMO;

public class Palindromo {

    public static boolean EhPalindromo(String word) {

        int n = word.length();
        
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

