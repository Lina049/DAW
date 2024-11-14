package Entornosdesarollos.Practica;

import java.util.Scanner;

public class PedirMinutos {
    public static  void PedirMinutos(String PedirMinutos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        String horaI = scanner.next();
        Main.PedirHora = String.valueOf(horaI.charAt(0) + "" + horaI.charAt(1));
        Main.PedirMinutos = String.valueOf(horaI.charAt(3) + "" + horaI.charAt(4));
        Main.PedirSegundos = String.valueOf(horaI.charAt(6) + "" + horaI.charAt(7));
    }
}
