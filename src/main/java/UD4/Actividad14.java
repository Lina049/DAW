package UD4;

import java.text.MessageFormat;
import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int N = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= N; i++) {
        suma += i;
        }
        String texto = MessageFormat.format("La suma de los primeros desde 1 hasta {0} es {1}  ",N,suma);
        System.out.println(texto);
    }
}
