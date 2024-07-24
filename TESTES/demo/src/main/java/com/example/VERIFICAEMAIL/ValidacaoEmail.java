package com.example.VERIFICAEMAIL;

import java.util.regex.Pattern;

public class ValidacaoEmail {

    private static final Pattern EMAIL_PATTERN = Pattern.compile( 
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
    );

    public static boolean EmailEhValido(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

}
