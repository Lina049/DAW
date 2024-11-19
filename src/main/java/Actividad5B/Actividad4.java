package Actividad5B;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número:");
        int num = scanner.nextInt();
        String caracter = " * ";
        String caracter2 = "#";
        int num2 = num;
        if (num < 0) {
            num2 = -1*num;
        }
        for (int i = 0; i < num2; i++) {
            if (num >= 0) {
                System.out.print(caracter);
            }else{
                System.out.print(caracter2);
            }
        }
        }
    }

