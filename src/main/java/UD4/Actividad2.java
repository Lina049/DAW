package UD4;

import java.text.MessageFormat;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = scanner.nextInt();
        String texto = MessageFormat.format("Tabla del numero {0}\n\t{0} * 1 = {1}\n\t{0} * 2 = {2}\n\t{0} * 3 = {3}\n\t{0} * 4 = {4}\n\t{0} * 5 = {5}\n\t{0} * 6 = {6}\n\t{0} * 7 = {7}\n\t{0} * 8 = {8}\n\t{0} * 9 = {9}\n\t{0} * 10 = {10}",num,(num * 1),(num * 2),(num * 3),(num * 4),(num * 5),(num * 6),(num * 7),(num * 8),(num * 9),(num * 10));
        System.out.println(texto);

    }
}
