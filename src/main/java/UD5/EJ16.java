package UD5;

import java.util.Scanner;

/*
Datos de entrada:Leer una calificacion entre 0 y 10.
Salida: La calificación lo transforma en alfabética
 */
public class EJ16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu calificación: ");
        int nota = scanner.nextInt();
        if (nota <= 3){
            System.out.println("Muy deficiente");
        } else if (nota <= 5) {
            System.out.println("Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Bien");
        } else if (nota <= 9) {
            System.out.println("Notable");
        }else {
            System.out.println("Sobresaliente");
        }
    }
}
