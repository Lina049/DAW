package UD4;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el precio del articulo: ");
        double precio = scanner.nextDouble();
        System.out.print("Introduce el precio rebajado: ");
        double rebajado = scanner.nextDouble();
        System.out.print("El descuento del articulo es: "+ (100 *(precio - rebajado)/precio));
    }
}
