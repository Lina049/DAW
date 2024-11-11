package ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Saber si un número introducido por teclado es par
y/o divisible entre 5
Salida: Mostrar por pantalla si es par o impar entre 5
 */
public class Extra12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("El " + num + " es par");
            if (num % 5 == 0){
                System.out.println("Es divisible entre 5");
            }else {
                System.out.println("No es divisible entre 5");
            }
        }else{
            System.out.println("El " + num + " es impar ");
            if (num % 5 == 0){
                System.out.println("Es divisible entre 5");
            }else {
                System.out.println("No es divisible entre 5");
            }
        }
    }
}
