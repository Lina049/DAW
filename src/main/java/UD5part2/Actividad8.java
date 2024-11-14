package UD5part2;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        int num;
        int contNeg = 0;
        int contPos = 0;
        while (true){
            System.out.print("Introduzca el numero " + cont + ": ");
            cont++;
            num = scanner.nextInt();
            if (num == 0){
                break;
            } else if (num < 0) {
                contNeg++;
            } else{
                contPos++;

            }
        }
        if (contNeg > 0){
            System.out.println("Se ha leido negativo");
        }
        System.out.println("Los numeros negativos: " + contNeg);
        System.out.println("Los numeros positvos: " + contPos);
    }
}
