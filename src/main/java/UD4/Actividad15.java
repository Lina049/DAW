package UD4;

import java.util.Scanner;

public class Actividad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tus horas de trabajo: ");
        int horas = scanner.nextInt();
        System.out.println("Introduce la tarifa por hora: ");
        int tarifaH = scanner.nextInt();
        int bruto =  horas * tarifaH;
        int porcentaje = bruto * 15 / 100;
        int neto = bruto - porcentaje;
        System.out.println("Tu paga en bruto es de " + (bruto) + "y en neto " + (neto));
    }
}
