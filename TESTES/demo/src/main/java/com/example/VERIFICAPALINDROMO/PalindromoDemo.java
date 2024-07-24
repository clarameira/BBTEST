package com.example.VERIFICAPALINDROMO;

import java.util.Scanner;

public class PalindromoDemo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String input;
        char escolha;

        do {
            System.out.print("Digite uma frase ou palavra para verificar se é um palíndromo: ");
            input = sc.nextLine();

            boolean resultado = Palindromo.EhPalindromo(input);

            if (resultado) {
                System.out.println("É um palíndromo.");
            } else {
                System.out.println("Não é um palíndromo.");
            }

            System.out.print("Deseja verificar outra palavra? (S/N): ");
            escolha = sc.nextLine().toUpperCase().charAt(0);

        } while (escolha == 'S');

        sc.close();
    }
}
