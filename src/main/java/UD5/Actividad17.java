package UD5;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        String horaI = scanner.next();
        //15:47:56
        String hora = String.valueOf(horaI.charAt(0) + "" + horaI.charAt(1));
        String minutos = String.valueOf(horaI.charAt(3) + "" + horaI.charAt(4));
        String seg = String.valueOf(horaI.charAt(6) + "" + horaI.charAt(7));
        if (seg.equals("59")) {
            seg = "00";
            if (minutos.equals("59")) {
                minutos = "00";
                if (hora.equals("23")) {
                    hora = "00";
                }else {
                hora = String.valueOf(Integer.parseInt(hora)+1);
                }

            }else {
            minutos = String.valueOf(Integer.parseInt(minutos)+1);
            }
        }else {
            seg = String.valueOf(Integer.parseInt(seg)+1);
        }
        System.out.println(hora + ":" + minutos + ":" + seg);
    }
}
