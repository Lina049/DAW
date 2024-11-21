package UD4.RepasoUnidad;

import java.util.Scanner;

/*
Datos de entrada: Pan 1,20.Pan que no es fresco tiene descuento de
50%. Solicita un número de barras frescas y no frescas, y calcula
el importe total ingresado.
Salida:Mostrar el total de las barras frescas y no frescas del importe
total ingresado.
 */
public class ActividadR18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pan = 1.20;
        final double panNofresco = 0.60;
        System.out.println("Introduce el número de barras frescas vendidas: ");
        int barrasPan = scanner.nextInt();
        System.out.println("Introduce el número el número de barras no son del dia: ");
        int barrasNoFrescas = scanner.nextInt();

        System.out.println("El total de ingresos del dia es: " + (pan * barrasPan + panNofresco * barrasNoFrescas));
    }
}
