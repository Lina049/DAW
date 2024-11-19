package Actividad5B;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿En que año naciste? ");
        int nacimiento = sc.nextInt();
        for (int i = nacimiento; i < 2024; i++) {
            System.out.println("Has cumplido " + (i - (nacimiento-1)) + "años");
        }
    }
}
