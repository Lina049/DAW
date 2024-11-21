package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

/*
Datos de entrada: El usuario tiene que introducir dos numeros enteros
Salida: Mostrar por pantalla <n> entre <m> da un cociente <c> y un resto <r>.
 */
public class ActividadR16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el diviendo (entero): ");
        int n = scanner.nextInt();
        System.out.println("Introduce el divisor (entero): ");
        int m = scanner.nextInt();
        int c = n / m;
        int r = n % m;
        System.out.println( n + " entre " + m + " da un cociente " + c + " y un resto " + r);
    }
}
