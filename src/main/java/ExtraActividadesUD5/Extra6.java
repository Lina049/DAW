package DAW.src.main.java.ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Que el usuario introduzca un número entero puede ser
positivo o negativo. Solo tiene que permitir hasta 5 digitos.
Salida: Que muestre el numero entero positivo o negativo.
 */
public class Extra6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numE = scanner.nextInt();
        if (String.valueOf(numE).length()<= 5){
            System.out.println("El numero de caracteres que contiene es: " + numE);
        }else {
            System.out.println("Ha superado de los 5 digitos");
        }

    }
}
