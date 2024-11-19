package UD5part2;

import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce cantidad de euros: ");
        int euros = scanner.nextInt();
        int contB500 = 0;
        int contB200 = 0;
        int contB100 = 0;
        int contB50 = 0;
        int contB20 = 0;
        int contB10 = 0;
        int contB5 = 0;
        //1250
        while (euros > 0) {
            if (euros >= 500) {
                contB500++;
                euros -= 500;
            } else if (euros >= 200) {
                contB200++;
                euros -= 200;
            } else if (euros >= 100) {
                contB100++;
                euros -= 100;
            } else if (euros >= 50) {
                contB50++;
                euros -= 50;
            } else if (euros >= 20) {
                contB20++;
                euros -= 20;
            } else if (euros >= 10) {
                contB10++;
                euros -= 10;
            } else if (euros >= 5) {
                contB5++;
                euros -= 5;
            }
        }
        System.out.println(MessageFormat.format("En {0} euros, tendre {1} billetes 500, {2} billetes 200, {3} billetes 100, {4} billetes 50, {5} billetes 20, {6} billetes 10 y {7} billetes 5", euros, contB500, contB200, contB100, contB50, contB20, contB10, contB5));
    }
}
