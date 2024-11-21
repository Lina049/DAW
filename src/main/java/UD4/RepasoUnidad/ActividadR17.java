package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

/*
Datos de entrada: Numero de empanadillas (112g) y napolitanas (75g) y
calcular el peso total del paquete que sera enviado en Kg.
Salida: Mostrar el peso total del paquete.
 */
public class ActividadR17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double empanadilla = 112;
        final  double napolitanas = 75;
        System.out.println("Introduce el número de empanadillas a enviar: ");
        int empanadillaNum = scanner.nextInt();
        System.out.println("Introduce el número de napolitanas a enviar: ");
        int napolitanasNum = scanner.nextInt();

        double totalEmpanadilla = empanadilla * empanadillaNum / 1000;
        double totalNapolitana = napolitanas * napolitanasNum / 1000;

        System.out.println("El peso total del paquete es: " + (totalEmpanadilla + totalNapolitana));
    }
}
