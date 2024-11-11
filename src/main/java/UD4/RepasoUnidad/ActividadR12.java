package UD4.RepasoUnidad;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Datos de entrada: El precio original de un articulo(Sin rebajar) y el precio de venta real
(rebajado)
Salida: Mostrar por el porcentaje de descuento con dos decimales.
 */
public class ActividadR12 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.print("Introduce el precio original articulo: ");
        double precioOrig = scanner.nextDouble();
        System.out.print("Introduce el precio del articulo rebajado: ");
        double precioRebaj = scanner.nextDouble();
        double descuento = 100 * (precioOrig - precioRebaj ) / precioOrig;
        System.out.println("Descuento: " + (format.format(descuento)));
        String ola = scanner.next();
        char carac = ola.charAt(ola.length() - 1);
    }
}
