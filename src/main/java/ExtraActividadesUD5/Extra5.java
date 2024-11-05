package DAW.src.main.java.ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Pedir al usuario que diga cual es la primera cifra de
un numero entero. Se permite hasta 5 cifras.
Salida: Mostrar por pantalla el resultado
 */
public class Extra5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
       String numE = scanner.next();

        if ( numE.length() <= 5 ){
            System.out.println("La primera cifra es: " + numE.charAt(0));
        }else {
            System.out.println("El numero tiene más de 5 cifras");
        }
    }
}
