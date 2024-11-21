package UD4.RepasoUnidad;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

/*
Datos de entrada: Preguntar al usuario una cantidad a invertir, el
interés procentual anual y el número de meses que durara la inversión.
Salida: Mostrar por pantalla el capital obtenido en la inversión
con dos decimales.
 */
public class ActividadR19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Cantidad a invertir: ");
        double cantidad = sc.nextDouble();
        System.out.println("Interés porcentual anual: ");
        double interes = sc.nextDouble();
        System.out.println("Duración de la inversión en meses: ");
        double duracion = sc.nextInt();
        double año = duracion / 12;
        double rendimiento = cantidad * Math.pow((interes/ 100 + 1), año);
        System.out.println("Capital final: " + decimalFormat.format(rendimiento));
    }
}
