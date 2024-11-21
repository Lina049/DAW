package Actividad5B;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();
        System.out.println("Introduce el carácter de relleno: ");
        String relleno = scanner.next();
        for (int i= altura, j= 1; i>0; i--, j++ ) {
            for (int espacios = 0; espacios < i-1; espacios++) {
                System.out.print(" ");
            }if(i == altura){
                System.out.print(relleno);
            }else {
                if (i % 2 == 0) {
                    j++;
                    for (int caracter = 0; caracter < j; caracter++) {
                        System.out.print(relleno);
                    }
                } else {
                    j += 2;
                    for (int caracter = 0; caracter < j; caracter++) {
                        System.out.print(relleno);
                    }
                }
            }
            System.out.println();
        }
    }
}
