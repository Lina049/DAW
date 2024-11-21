package Actividad5B;

import java.text.MessageFormat;
import java.util.Scanner;
/*
El programa pide dos dias de la semana y sus horas.
Tiene que ser dias validos (numero de dia de la semana o por dias escrito).
No se tendran en cuenta los minutos ni los segundos.
 */

public class EJ16B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia = "";
        String segDia = " ";
        int numDia = 0;
        int numDia2 = 0;
        String nomDia1 = "";
        String nomDia2 = "";
        int hora = 0;
        int horaDos = 0;
        boolean salir = false;
        while (!salir) {
            System.out.print("Introduce primer dia: ");
            dia = scanner.next();
            switch (dia) {
                case "1", "Lunes", "lunes":
                    System.out.print("Introduce la hora del lunes: ");
                    hora = scanner.nextInt();
                    salir = hora >= 0 && hora < 24;
                    numDia = 1;
                    nomDia1 = "Lunes";
                    break;
                case "2", "Martes", "martes":
                    System.out.print("Intrdouce la hora del martes: ");
                    hora = scanner.nextInt();
                    salir = hora >= 0 && hora < 24;
                    numDia = 2;
                    nomDia1 = "Martes";
                    break;
                case "3", "Miercoles", "miercoles":
                    System.out.println("Introduce la hora del miercoles: ");
                    hora = scanner.nextInt();
                    salir = hora >= 0 && hora < 24;
                    numDia = 3;
                    nomDia1 = "Miercoles";
                    break;
                case "4", "Jueves", "jueves":
                    System.out.print("Introduce la hora del jueves: ");
                    hora = scanner.nextInt();
                    salir = hora >= 0 && hora < 24;
                    numDia = 4;
                    nomDia1 = "Jueves";
                    break;
                case "5", "Viernes", "viernes":
                    System.out.print("Introduce la hora del viernes: ");
                    hora = scanner.nextInt();
                    salir = hora >= 0 && hora < 24;
                    numDia = 5;
                    nomDia1 = "Viernes";
                    break;
                case "6", "Sabado", "sabado":
                    System.out.print("Introduce la hora del sabado: ");
                    hora = scanner.nextInt();
                    salir = hora >= 0 && hora < 24;
                    numDia = 6;
                    nomDia1 = "Sabado";
                    break;
                case "7", "Domingo", "domingo":
                    System.out.print("Introduce la hora del Domingo: ");
                    hora = scanner.nextInt();
                    salir = hora >= 0 && hora < 24;
                    numDia = 7;
                    nomDia1 = "Domingo";
                    break;
                default:
                    break;
            }
            if (!salir) {
            System.out.println("Introduce un día valido y hora valida");
            }
        }
        salir = false;
        while (!salir) {
            System.out.print("Introduce el segundo dia: ");
            segDia = scanner.next();
            switch (segDia) {
                case "1", "Lunes", "lunes":
                    numDia2 = 1;
                    nomDia2 = "Lunes";
                    if (numDia <= numDia2) {
                        System.out.print("Introduce la hora del lunes: ");
                        horaDos = scanner.nextInt();
                        salir = horaDos >= 0 && horaDos< 24;
                    }else {
                        System.out.println(MessageFormat.format("¡Error!, {0} es anterior al {1}", nomDia2, nomDia1));
                    }
                    break;
                case "2", "Martes", "martes":
                    numDia2 = 2;
                    nomDia2 = "Martes";
                    if (numDia <= numDia2) {
                        System.out.print("Intrdouce la hora del martes: ");
                        horaDos = scanner.nextInt();
                        salir = horaDos >= 0 && horaDos< 24;
                    }else {
                        System.out.println(MessageFormat.format("¡Error!, {0} es anterior al {1}", nomDia2, nomDia1));
                    }
                    break;
                case "3", "Miercoles", "miercoles":
                    numDia2 = 3;
                    nomDia2 = "Miercoles";
                    if (numDia <= numDia2) {
                        System.out.print("Intrdouce la hora del miercoles: ");
                        horaDos = scanner.nextInt();
                        salir = horaDos >= 0 && horaDos< 24;
                    }else {
                        System.out.println(MessageFormat.format("¡Error!, {0} es anterior al {1}", nomDia2, nomDia1));
                    }
                    break;
                case "4", "Jueves", "jueves":
                    numDia2 = 4;
                    nomDia2 = "Jueves";
                    if (numDia <= numDia2) {
                        System.out.print("Intrdouce la hora del jueves: ");
                        horaDos = scanner.nextInt();
                        salir = horaDos >= 0 && horaDos< 24;
                    }else {
                        System.out.println(MessageFormat.format("¡Error!, {0} es anterior al {1}", nomDia2, nomDia1));
                    }
                    break;
                case "5", "Viernes", "viernes":
                    numDia2 = 5;
                    nomDia2 = "Viernes";
                    if (numDia <= numDia2) {
                        System.out.print("Intrdouce la hora del viernes ");
                        horaDos = scanner.nextInt();
                        salir = horaDos >= 0 && horaDos< 24;
                    }else {
                        System.out.println(MessageFormat.format("¡Error!, {0} es anterior al {1}", nomDia2, nomDia1));
                    }
                    break;
                case "6", "Sabado", "sabado":
                    numDia2 = 6;
                    nomDia2 = "Sabado";
                    if (numDia <= numDia2) {
                        System.out.print("Intrdouce la hora del sabado: ");
                        horaDos = scanner.nextInt();
                        salir = horaDos >= 0 && horaDos< 24;
                    }else {
                        System.out.println(MessageFormat.format("¡Error!, {0} es anterior al {1}", nomDia2, nomDia1));
                    }
                    break;
                case "7", "Domingo", "domingo":
                    numDia2 = 7;
                    nomDia2 = "Domingo";
                    if (numDia <= numDia2) {
                        System.out.print("Intrdouce la hora del domingo: ");
                        horaDos = scanner.nextInt();
                        salir = horaDos >= 0 && horaDos< 24;
                    }else {
                        System.out.println(MessageFormat.format("¡Error!, {0} es anterior al {1}", nomDia2, nomDia1));
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Introduce un día valido y hora valida");
        }
        int totalHoras = (24 - hora) + horaDos + (24*(numDia2-numDia));
        System.out.println(MessageFormat.format("Entre las {0} del {1} y las {2} del {3} hay {4} hora/s", hora, dia, horaDos, segDia, totalHoras));
    }
}
