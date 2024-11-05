package UD5;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero con decimales: ");
        double num = scanner.nextDouble();
        if (num % 2 == 0){
            System.out.println("El numero " + (int)num + " es par");
        }else {
            System.out.println("El numero " + (int)num +  " es impar");
        }
    }
}
