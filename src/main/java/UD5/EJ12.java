package UD5;

import java.util.Scanner;

/*
Datos de entrada: Preguntar el usuario su nombre y género. Grupo A: Mujeres (Nombre anterior o igual a la M)
y hombres (nombre igual o posterior a N). Grupo B: Los que este el grupo A
Salida:Mostrar por pantalla el grupo que corresponde.
 */
public class EJ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cómo te llamas?: ");
        String nombre = scanner.next();
        System.out.print("¿Cuál es tu género (H o M)?: ");
        String genero = scanner.next();
        if (nombre.charAt(0) <= 'M' && genero.charAt(0) == 'M' || nombre.charAt(0) >= 'N' && genero.charAt(0) == 'H'){
            System.out.println("Tu grupo es A");
        } else{
            System.out.println("Tu grupo es B");
        }
    }
}
