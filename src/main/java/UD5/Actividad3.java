package UD5;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();
        System.out.println("Introduce otro numero: ");
        int num1 = scanner.nextInt();
        if (num > num1){
            System.out.println(num + " Es mayor que " + num1);
        } else if (num == num1) {
            System.out.println(num + " Es igual que " + num1);
        }
    }
}
