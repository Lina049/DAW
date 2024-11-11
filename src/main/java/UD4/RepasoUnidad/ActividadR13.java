package UD4.RepasoUnidad;

import java.util.Scanner;

/*
Datos de entrada: Leer un valor a una distancia en millas marinas y
escriba la distancia en metros. Una milla marina equivalente a 1852
Salida: Mostrar en pantalla la distancia de millas marinas a metros.
 */
public class ActividadR13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce millas marinas: ");
        int milla = scanner.nextInt();
        double millaM = milla * 1.852;
        System.out.print("La distancia milla marinas a metros es: " + (millaM));
    }

}
