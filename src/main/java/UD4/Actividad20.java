package UD4;

import java.text.DecimalFormat;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Scanner;

public class Actividad20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inversion = 0;
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.print("Introduce la inversión inicial: ");
        inversion = scanner.nextDouble();
        inversion = inversion + (inversion * 0.04);
        System.out.println("Balance año 1: "+formato.format(inversion));
        inversion = inversion + (inversion * 0.04);
        System.out.println("Balance año 2: "+formato.format(inversion));
        inversion = inversion + (inversion * 0.04);
        System.out.println("Balance año 3 y final: "+formato.format(inversion));
    }
}
