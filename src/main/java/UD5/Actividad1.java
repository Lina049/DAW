package UD5;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
    }
}
