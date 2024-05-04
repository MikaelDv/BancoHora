package models;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dia {
    private static int qtdDias;
    private LocalTime horaInicio;
    private LocalTime horaEncerramento;
    private float valorHora;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public Dia(){
        qtdDias++;
    }

    public void baterPonto(){
        this.horaInicio = LocalTime.now();
        System.out.println("Horário do início das atividades: " + this.horaInicio.format(formatter));
    }

    public void encerrarAtividades(){
        this.horaEncerramento = LocalTime.now();
        System.out.println("Horário do encerramento das atividades: " + this.horaEncerramento.format(formatter));
    }

    public void registrarValorHora(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor informe o valor da hora no estabelecimento onde trabalha:");
        System.out.print("R$");
        float valor = scanner.nextFloat();
        this.valorHora = valor;
        System.out.println("Valor R$" + valor + " registrado!");
    }

    public String horasTrabalhadas(){
        if (this.horaInicio != null || this.horaEncerramento != null) {
            return "" + Duration.between(this.horaInicio, this.horaEncerramento).toHours();
        } else {
            return "Você não possui horas registradas!";
        }
    }

    public void exibirHorasTrabalhadas(){
        System.out.println("Horas trabalhadas: " + horasTrabalhadas());
        System.out.println("Valor a receber: ");
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraEncerramento() {
        return horaEncerramento;
    }

    public void setHoraEncerramento(LocalTime horaEncerramento) {
        this.horaEncerramento = horaEncerramento;
    }

    public static int getQtdDias() {
        return qtdDias;
    }

    public static void setQtdDias(int qtdDias) {
        Dia.qtdDias = qtdDias;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
}
