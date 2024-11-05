package UD4;

import java.text.MessageFormat;
import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el dividendo (entero): ");
        int n = scanner.nextInt();
        System.out.println("Introduce el divisor (entero): ");
        int m = scanner.nextInt();
        int c = n/m;
        int r = n%m;
        String texto = MessageFormat.format("{0} entre {1} da un cociente {2} y un resto {3}",n,m,c,r);
        System.out.println(texto);

    }
}
