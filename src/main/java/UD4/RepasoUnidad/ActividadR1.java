package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;
/*
Datos de entrada: Horas, minutos y segundos que tienen un año.
Salida: Mostrar por pantalla el resultado.
 */
public class ActividadR1 {
    public static void main(String[] args) {
        int horaA = 24 * 365;
        int minutos = horaA * 60;
        int segundos = minutos * 60;

        System.out.println("Las horas " + horaA + " " + minutos  + " minutos " + segundos + " segundos que tienen un año");
    }
}