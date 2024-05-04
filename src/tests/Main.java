package tests;

import models.Dia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dia hoje = new Dia();
        boolean on = true;
        while (on) {
            String menu = "(1) - Bater ponto ENTRADA\n" +
                    "(2) - Registrar SAÍDA\n" +
                    "(3) - TOTAL horas trabalhadas\n" +
                    "(4) - Cadastrar VALOR da hora\n" +
                    "(4) - Sair.";
            System.out.println(menu);
            Scanner scan = new Scanner(System.in);
            System.out.print(">");
            int opt = scan.nextInt();
            if (opt == 1) {
                hoje.baterPonto();
            } else if (opt == 2) {
                hoje.encerrarAtividades();
            } else if (opt == 3) {
                hoje.exibirHorasTrabalhadas();
            } else if (opt == 4) {
                hoje.registrarValorHora();
            } else if (opt == 5) {
                System.out.println("Até mais!");
                on = false;
            }

        }
    }
}
