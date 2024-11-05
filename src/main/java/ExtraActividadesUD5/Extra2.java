package DAW.src.main.java.ExtraActividadesUD5;

import java.util.Scanner;
/*
Datos de entrada: Pedir hora por teclado. Solo tiene en cuentas las horas.
Salida: Mostrar buenos dias, buenas tardes o buenas noches según la hora.
 */
public class Extra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        int hora = scanner.nextInt();
        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }
}
