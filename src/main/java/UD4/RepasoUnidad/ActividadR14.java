package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

/*
Datos de entrada:Leer un entero positivo N, por el usuario.
Salida: Mostrar por pantalla la suma de todos enteros 1 hasta N.
 */
public class ActividadR14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numP = scanner.nextInt();
        int suma = numP * (numP + 1)/2;
        System.out.println("La suma de los primeros numeros enteros desde 1 hasta 5 es: " + (suma));
    }
}
