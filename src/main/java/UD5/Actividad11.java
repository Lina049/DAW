package UD5;

import java.util.Scanner;

/*
Datos de entrada: Solicita el usuario una temperatura y convertirlo a lo que quiera.
Salida: Mostrar por pantalla el resultado. Ej -> X grados a Celsius son Y F
 */
public class Actividad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿A que lo quieres convertir? \n 1 Celsius a Fahrenheit \n 2 Fahrenheit a Celsius   \n 3 Celsius a Kelvin \n Introduce:"  );
        int opcion = scanner.nextInt();
        System.out.println("Introduce la temperatura: ");
        int temp = scanner.nextInt();
        if (opcion == 1){
            System.out.println("F = " + (temp * 9/5) + 32);
        }else if (opcion == 2){
            System.out.println("C = " + (temp - 32) * 5 / 9);
        }else if (opcion == 3){
            System.out.println("K = " + (temp + 273.15));
        }
    }
}
