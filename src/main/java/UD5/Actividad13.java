package UD5;

import java.util.Scanner;

/*
Datos de entrada: Preguntar al usuario la edad. Cliente(4 años entra gratis) y (tiene entre 4 y 17 el precio es 5€)
y (tiene 18 o mas pagara 10€)
Salida: Mostrar el precio de la entrada.
 */
public class Actividad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        if (edad == 4){
            System.out.println("Tienes la entrada gratis");
        } else if (edad > 4 && edad < 17) {
            System.out.println("El precio de la entrada es 5€");
        }else {
            System.out.println("El precio de la entrada es 10€");
        }
    }
}
