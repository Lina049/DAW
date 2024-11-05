package UD5;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce un segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Introduce un tercer numero: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num2 > num3){
            System.out.println(num1 + " es mayor que " + num2 + " y mayor que " + num3);
        }else if (num2 > num1 && num1 > num3){
            System.out.println(num2 + " es mayor que "  + num1 + " y mayor que " + num3);
        }else{
            System.out.println(num3 + " es mayor que " + num1 + " y mayor que " + num2);
        }
    }
}
