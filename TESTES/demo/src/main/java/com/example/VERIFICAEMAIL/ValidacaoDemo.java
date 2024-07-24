package com.example.VERIFICAEMAIL;

import java.util.Scanner;

public class ValidacaoDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ Validador de E-mail ------");

        while (true) {
            System.out.print("Digite o email para verificar: ");
            String email = sc.nextLine().trim();

            boolean result = ValidacaoEmail.EmailEhValido(email);
            System.out.println("E-mail '" + email + "' é válido? " + result);

            System.out.print("\nDeseja verificar outro e-mail? (S/N): ");
            String continuar = sc.nextLine().trim();
            if (!continuar.equalsIgnoreCase("S")) {
                System.out.println("Verificador de e-mail encerrado.");
                break;
            }
        }
        sc.close();
    }
}

