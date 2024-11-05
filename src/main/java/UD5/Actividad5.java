package UD5;

import java.util.Scanner;

/*
Escribe un programa que lee un número y me dice si es positivo o negativo, consideraremos el
cero como positivo.

Datos de entrada: Numero(Positivo o Negativo)
Salida: Numero es Positivo o negativo
Consideraciones: 0 es positivo
 */
public class Actividad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();
        if (numero >= 0){
            System.out.println("El numero es positivo");
        }else if (numero < 0){
            System.out.println("El numero es negativo");
        }
    }
}
