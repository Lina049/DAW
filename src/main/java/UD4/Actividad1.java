package UD4;

public class Actividad1 {
    public static void main(String[] args) {
        final int dias = 365;
        final int horas = 24;
        final int minutos = 60;
        final int segundos = 60;
        System.out.println("Un año tiene: " + (horas * dias) + " horas, " + ((horas * dias) * minutos) + " minutos, " + (((horas * dias)* minutos)* segundos)+" segundos");
    }
}
