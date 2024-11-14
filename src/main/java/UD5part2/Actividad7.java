package UD5part2;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg = 0;
        int pos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingresa el número "+i+":");
            int num = sc.nextInt();
            if (num < 0){
                neg++;
            }else {
                pos++;
            }
        }
        System.out.println("Los numeros negativos que se han leido: " + neg);
        System.out.println("Los numeros positivos que se han leido: " + pos);
    }
}
