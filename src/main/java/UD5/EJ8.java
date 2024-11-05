package UD5;

import java.util.Scanner;
/*
Datos de entrada: Dos numeros diferentes.
Salida: Si no son diferentes finaliza, si son diferentes visualiza por pantalla SOLO los son enteros.
Si ningun es entero, se muestra por mensaje, si alguno de los dos o los dos lo son, lo muestre por pantalla.
 */
public class EJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce N1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce N2: ");
        double num2 = scanner.nextDouble();
        if (num1 != num2){
            if (num1 % 1 == 0 && num2 % 1 == 0){
                System.out.println("Ambos son enteros");
            }else if (num1 % 1 == 0){
                System.out.println("Numeros enteros: " + (int)num1);
            } else if (num2 % 1 == 0) {
                System.out.println("Numeros enteros: " + (int)num2);
            } else {
                System.out.println("Ninguno es entero");
            }
        }else {
            System.exit(0);
        }
    }
}
