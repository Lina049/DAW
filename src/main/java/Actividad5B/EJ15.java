package Actividad5B;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora en formato (HH:MM:SS): ");
        String FormatoHora = sc.next();
        String hora = FormatoHora.charAt(0) + "" + FormatoHora.charAt(1);
        String min = FormatoHora.charAt(3) + "" + FormatoHora.charAt(4);
        String seg = FormatoHora.charAt(6) + "" + FormatoHora.charAt(7);
        while (true) {
            if (FormatoHora.length() == 8) {
                if (Integer.parseInt(hora) < 24 && Integer.parseInt(hora) >= 0) {
                    if (Integer.parseInt(min) < 60 && Integer.parseInt(min) >= 0) {
                        if (Integer.parseInt(seg) < 60 && Integer.parseInt(seg) >= 0) {
                            break;
                        }
                    }
                }
            }


            System.out.print("Incorrecto, vuelve a introducirlo: ");
           FormatoHora = sc.next();
            hora = FormatoHora.charAt(0) + "" + FormatoHora.charAt(1);
            min = FormatoHora.charAt(3) + "" + FormatoHora.charAt(4);
            seg = FormatoHora.charAt(6) + "" + FormatoHora.charAt(7);
        }


        while (true) {
            Thread.sleep(1000);
            if (Integer.parseInt(seg) == 59) {
                seg = "00";
                if (Integer.parseInt(min) == 59) {
                    min = "00";
                    if (Integer.parseInt(hora) == 23) {
                        hora = "00";
                    } else {
                        hora = String.valueOf(Integer.parseInt(hora) + 1);
                    }
                } else {
                    min = String.valueOf(Integer.parseInt(min) + 1);
                }
            } else {
                seg = String.valueOf(Integer.parseInt(seg) + 1);
            }
            if (seg.length() == 1) {
                if (min.length() == 1) {
                    if(hora.length() == 1) {
                        System.out.println("0"+hora + ":0"+min + ":0"+seg);
                    }  else{
                        System.out.println(hora + ":0"+min + ":0"+seg);
                    }
                }else{
                    System.out.println(hora + ":" +min + ":0"+seg);
                }
            } else {
                System.out.println(hora + ":" +min + ":"+seg);
            }

        }
    }
}

