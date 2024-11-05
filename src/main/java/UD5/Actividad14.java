package UD5;

import java.util.Scanner;

/*
Datos de entrada: Preguntar el usuario la renta anual(Mayor a 0)
Salida: El tipo de impositivo que corresponde
 */
public class Actividad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu renta anual: ");
        int renta = scanner.nextInt();
        if (renta < 10000){
            System.out.println("E tipo de impositivo es de 5%");
        } else if (renta < 20000) {
            System.out.println("El tipo de impositivo es de 15% ");
        } else if (renta < 35000) {
            System.out.println("El tipo de impositivo es de 20%");
        } else if (renta < 601000) {
            System.out.println("El tipo de impositivo es de 30%");
        } else {
            System.out.println("El tipo de impositivo es de 45%");
        }
    }
}
