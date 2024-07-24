package com.example.VERIFICASENHA;

public class ValidaSenha {
    
    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }

        boolean temLetraMaiuscula = false;
        boolean temLetraMinuscula = false;
        boolean temDigito = false;
        boolean temCaractereEspecial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temLetraMaiuscula = true;
            } else if (Character.isLowerCase(c)) {
                temLetraMinuscula = true;
            } else if (Character.isDigit(c)) {
                temDigito = true;
            } else {
                if ("!@#$%^&*()-+".indexOf(c) != -1) { 
                    temCaractereEspecial = true;
                }
            }
        }
        return temLetraMaiuscula && temLetraMinuscula && temDigito && temCaractereEspecial;
    }
}
