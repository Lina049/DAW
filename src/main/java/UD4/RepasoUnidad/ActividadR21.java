package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

/*
Datos de entrada: Preguntar el año de nacimiento y utilizando el
año actual calculada.
Salida: Muestre tu edad.
 */
public class ActividadR21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu año nacimiento: ");
        int añoNacimiento = scanner.nextInt();
        System.out.println("Introduce el año actual: ");
        int añoActual = scanner.nextInt();
        int año =  añoActual - añoNacimiento;
        System.out.println("Los años que tienes son: " + año);
    }
}
