package UD5;

import java.util.Scanner;
/*
Escribe un programa que lee dos números y los visualiza en orden descendente
Datos de entrada: dos numeros
Salida: Dos numeros en orden descendente
 */
public class Actividad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();
        System.out.println("Introduce un segundo numero: ");
        int num1 = scanner.nextInt();
        if (num < num1){
            System.out.println(num1 + " > "+ num);
        }else {
            System.out.println(num + " > " + num1);
        }
    }
}
