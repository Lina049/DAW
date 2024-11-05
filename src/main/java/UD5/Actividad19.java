package UD5;

import java.util.Scanner;

/*
Datos de entrada: Solicitar año por teclado
Salida: Si el año es bisiesto
 */
public class Actividad19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el año: ");
        double añoB = scanner.nextDouble();
        if ((añoB % 4 == 0.0 && añoB % 100 != 0.0) || (añoB % 100 == 0.0 && añoB % 400 == 0.0)){
            System.out.println("Si es bisiesto");
        } else{
            System.out.println("No es año bisiesto");
        }
    }
}
