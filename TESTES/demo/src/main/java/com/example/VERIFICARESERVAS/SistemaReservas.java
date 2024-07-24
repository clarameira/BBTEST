package com.example.VERIFICARESERVAS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SistemaReservas {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ Sistema de Reservas de Voos ------");

        while (true) {
            String origem, destino, dataPartidaStr, dataRetornoStr;
            LocalDate dataPartida, dataRetorno;

            do {
                System.out.print("\nDigite o local de partida do voo: ");
                origem = sc.nextLine().trim();
            } while (origem.isEmpty());

            do {
                System.out.print("Digite o destino do voo: ");
                destino = sc.nextLine().trim();
            } while (destino.isEmpty());

            do {
                System.out.print("Digite a data de partida (DD/MM/AAAA): ");
                dataPartidaStr = sc.nextLine().trim();
                dataPartida = converterParaLocalDate(dataPartidaStr);
            } while (dataPartida == null);

            do {
                System.out.print("Digite a data de retorno (DD/MM/AAAA): ");
                dataRetornoStr = sc.nextLine().trim();
                dataRetorno = converterParaLocalDate(dataRetornoStr);
            } while (dataRetorno == null);

            long tempoDeViagem = ChronoUnit.DAYS.between(dataPartida, dataRetorno) - 1;

            System.out.println("\n----- Reserva -----");
            System.out.println("Origem: " + origem);
            System.out.println("Destino: " + destino);
            System.out.println("Data de Partida: " + dataPartida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println("Data de Retorno: " + dataRetorno.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println("Tempo Decorrido: " + tempoDeViagem + " dias");

            String confirmacao;
            do {
                System.out.print("\nDeseja confirmar a reserva? (S/N): ");
                confirmacao = sc.nextLine().trim().toUpperCase();
            } while (!confirmacao.equals("S") && !confirmacao.equals("N"));

            if (confirmacao.equals("S")) {
                System.out.println("Reserva confirmada.");
            } else {
                System.out.println("Reserva cancelada.");
            }

            String novaReserva;
            do {
                System.out.print("\nDeseja realizar outra reserva? (S/N): ");
                novaReserva = sc.nextLine().trim().toUpperCase();
            } while (!novaReserva.equals("S") && !novaReserva.equals("N"));

            if (!novaReserva.equals("S")) {
                System.out.println("Encerrando o sistema.");
                sc.close();
                return;
            }
        }
    }

    private static LocalDate converterParaLocalDate(String dataStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(dataStr, formatter);
        } catch (Exception e) {
            System.out.println("Formato de data inválido. Digite novamente.");
            return null;
        }
    }
}

