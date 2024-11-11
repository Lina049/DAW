package ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Un numero que diga si el número positivo introducido por teclado
es capicúa.
Salida: Mostrar  los números hasta 5 cifras.
 */
public class Extra13 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        String numero = scanner.next();
        if (numero.length() <= 5){
               if (numero.length() == 1){
                   System.out.println("El numero tiene un cifras");
               }else if (numero.length() == 2){
                   System.out.println("El numero tiene dos cifras");
               } else if (numero.length() == 3) {
                   System.out.println("El numero tiene tres cifras");
               } else if (numero.length() == 4) {
                   System.out.println("El numero tiene cuatro cifras");
               }else {
                   System.out.println("El numero es capicúa");
               }

        }else{
            System.out.println("No se permite mas de 5 cifras.");
        }

    }
}
