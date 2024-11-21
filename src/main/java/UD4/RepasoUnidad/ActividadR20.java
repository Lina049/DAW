package UD4.RepasoUnidad;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

/*
Datos de entrada:Leer la cantidad de dinero despositada en la cuenta
de ahorros. La cuenta de ahorros te ofrece 4%. Redonear con dos decimales.
Salida: Debe calcular y mostrar por pantalla la cantidad de ahorros
tras el primer, segundo y tercer año.
 */
public class ActividadR20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Introduce la inversión inicial: ");
        double inversion = sc.nextDouble();
        inversion = inversion + (inversion * 0.04);
        System.out.println("Balance año 1: "+ decimalFormat.format(inversion));
        inversion = inversion + (inversion * 0.04);
        System.out.println("Balance año 2: "+ decimalFormat.format(inversion));
        inversion = inversion + (inversion * 0.04);
        System.out.println("Balance año 3 y final: "+ decimalFormat.format(inversion));

    }
    }

