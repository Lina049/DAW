package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

/*
Datos de entrada: leer un número de segundos y los convierte a horas,
minutos y segundos.
Salida: Mostrar el resultado de horas, minutos y segundos.
 */
public class ActividadR22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tiempo en segundos: ");
        int tiempoSeg = scanner.nextInt();
        int minutos = tiempoSeg / 60;
        int hora = minutos / 60;
        System.out.println(hora + " hora");
        System.out.println(minutos + " minutos");
        System.out.println(tiempoSeg + " segundos");
    }
}
