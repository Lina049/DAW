package DAW.src.main.java.ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Introduce un numero del 1 al 7.
Salida: Escriba el nombre del dia de la semana
 */
public class Extra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7: ");
        int diaS = scanner.nextInt();
        switch (diaS){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No corresponde a ningun dia de la semana");
                break;
        }
    }
}
