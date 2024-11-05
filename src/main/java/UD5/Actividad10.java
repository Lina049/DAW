package UD5;

import java.util.Scanner;

/*
Datos de entrada: Para tributar impuestos tiene que ser mayor de 16 años y  tener  ingresos o superiores
a 1000 mensuales. Preguntar al usuario su edad y sus ingresos mensuales.
Salida: Mostrar por pantalla si el usuario tiene que tributar o no
 */
public class Actividad10 {
    public static void main(String[] args) {
        final int mensual = 1000;
        final int edadMa = 16;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Introduce tus ingresos: ");
        int ingresos = scanner.nextInt();
        if (edad >= edadMa && ingresos >= mensual){
            System.out.println("Tienes que tributar");
        }else{
            System.out.println("No tienes que tributar");
        }
    }
}
