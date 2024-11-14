package Entornosdesarollos.Practica;

import java.util.Scanner;

public class Main {
    public static String PedirHora;
    public static String PedirMinutos;
    public static String PedirSegundos;
    public static void main(String[] args) {
        if (PedirSegundos.equals("59")) {
            PedirSegundos = "00";
            if (PedirMinutos.equals("59")) {
                PedirMinutos = "00";
                if (PedirHora.equals("23")) {
                    PedirHora = "00";
                }else {
                    PedirHora = String.valueOf(Integer.parseInt(PedirHora)+1);
                }

            }else {
                PedirMinutos = String.valueOf(Integer.parseInt(PedirMinutos)+1);
            }
        }else {
            PedirSegundos = String.valueOf(Integer.parseInt(PedirSegundos)+1);
        }
        System.out.println(PedirSegundos + ":" + PedirMinutos+ ":" + PedirSegundos);
    }
    public static String PedirHora(String hora) {
        return hora.substring(0, 1);
    }
    public static String PedirMinutos(String minutos) {
        return minutos.substring(3, 4);
    }
    public static String PedirSeg(String seg) {
        return seg.charAt(6) + "" + seg.charAt(7);
    }
}