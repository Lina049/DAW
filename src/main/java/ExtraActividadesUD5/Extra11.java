package ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada:El usuario tiene que ordenar los numeros enteros.
Salida: Mostrar los numeros enteros por pantalla.
 */
public class Extra11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double numP = scanner.nextDouble();
        System.out.println("Introduce un segundo numero: ");
        double numS = scanner.nextDouble();
        System.out.println("Introduce un tercer numero: ");
        double numT = scanner.nextDouble();

        if (numP > numS && numP > numT){
            if(numS > numT){
                System.out.println("Los numeros ordenados son: " + numP + " > " + numS + " > " + numT);
            }else{
                System.out.println("Los numeros ordenados son: " + numP + " > " + numT + " > " + numS);
            }

        } else if (numS > numP && numS > numT) {
            if(numP > numT){
                System.out.println("Los numeros ordenados son: " + numS + " > " + numP + " > " + numT);
            }else {
                System.out.println("Los numeros ordenados son: " + numS + " > " + numT + " > " + numP);
            }
        } else if (numT > numP && numT > numS) {
            if (numT > numP){
                System.out.println("Los numeros ordenados son: " + numT+ " > " + numP + " > " + numS);
            }else {
                System.out.println("Los numeros ordenados son: " + numT+ " > " + numS + " > " + numP);
            }

        }
    }
}
