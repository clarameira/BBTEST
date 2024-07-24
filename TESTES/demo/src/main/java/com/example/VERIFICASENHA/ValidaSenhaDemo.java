package com.example.VERIFICASENHA;

import java.util.Scanner;

public class ValidaSenhaDemo {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.println("------ Validador de Senha ------");
    
            while (true) {
                System.out.print("\nDigite uma senha para verificar (pelo menos 8 caracteres, incluindo letras maiúsculas, minúsculas, dígitos e caracteres especiais): ");
                String senha = sc.nextLine().trim();
    
                if (senha.isEmpty()) {
                    System.out.println("Senha não pode ser vazia.");
                    continue;
                }
    
                boolean senhaValida = ValidaSenha.validarSenha(senha);
    
                if (senhaValida) {
                    System.out.println("Senha válida.");
                } else {
                    System.out.println("Senha inválida.");
                }
    
                System.out.print("\nDeseja verificar outra senha? (S/N): ");
                String continuar = sc.nextLine().trim().toUpperCase();
                if (!continuar.equals("S")) {
                    System.out.println("Validador de senha encerrado.");
                    break;
                }
            }
    
            sc.close();
        }
 }