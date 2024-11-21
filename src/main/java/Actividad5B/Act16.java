package Actividad5B;
import java.text.MessageFormat;
import java.util.Scanner;
public class Act16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce primer día: ");
        String semanaDia = leer.nextLine();
        String primerDia = "";
        int Dia = 0;
        boolean salir = false;
        while (!salir) {
            if (semanaDia.equals("1") || semanaDia.equalsIgnoreCase("Lunes")) {
                primerDia = "Lunes";
                Dia = 1;
                salir = true;
            } else if (semanaDia.equals("2") || semanaDia.equalsIgnoreCase("Martes")) {
                primerDia = "Martes";
                Dia = 2;
                salir = true;
            } else if (semanaDia.equals("3") || semanaDia.equalsIgnoreCase("Miercoles")) {
                primerDia = "Miercoles";
                Dia = 3;
                salir = true;
            } else if (semanaDia.equals("4") || semanaDia.equalsIgnoreCase("Jueves")) {
                primerDia = "Jueves";
                Dia = 4;
                salir = true;
            } else if (semanaDia.equals("5") || semanaDia.equalsIgnoreCase("Viernes")) {
                primerDia = "Viernes";
                Dia = 5;
                salir = true;
            } else if (semanaDia.equals("6") || semanaDia.equalsIgnoreCase("Sábado") || semanaDia.equalsIgnoreCase("Sabado")) {
                primerDia = "Sábado";
                Dia = 6;
                salir = true;
            } else if (semanaDia.equals("7") || semanaDia.equalsIgnoreCase("Domingo")) {
                primerDia = "Domingo";
                salir = true;
            } else {
                System.out.print("Introduce un día valido: ");
                semanaDia = leer.next();
            }
        }
        System.out.print("Introduce la hora del " + primerDia + ": ");
        int horaDia1 = leer.nextInt();
        while (true) {
            if (horaDia1 < 0 || horaDia1 > 23) {
                System.out.print("Introduce un hora valida para el " + primerDia + ": ");
                horaDia1 = leer.nextInt();
            } else {
                break;
            }
        }
        String segundoDia = "";
        int numDia2 = 0;
        while (true) {
            System.out.print("Introduce el segundo día: ");
            semanaDia = leer.next();
            if (semanaDia.equals("1") || semanaDia.equalsIgnoreCase("Lunes")) {
                segundoDia = "Lunes";
                numDia2 = 1;
                if (numDia2 < Dia) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (semanaDia.equals("2") || semanaDia.equalsIgnoreCase("Martes")) {
                segundoDia = "Martes";
                numDia2 = 2;
                if (numDia2 < Dia) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (semanaDia.equals("3") || semanaDia.equalsIgnoreCase("Miercoles")) {
                segundoDia = "Miercoles";
                numDia2 = 3;
                if (numDia2 < Dia) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (semanaDia.equals("4") || semanaDia.equalsIgnoreCase("Jueves")) {
                segundoDia = "Jueves";
                numDia2 = 4;
                if (numDia2 < Dia) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (semanaDia.equals("5") || semanaDia.equalsIgnoreCase("Viernes")) {
                segundoDia = "Viernes";
                numDia2 = 5;
                if (numDia2 < Dia) {
                    System.out.println(MessageFormat.format("Error, el {0} es anterior al {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else if (semanaDia.equals("6") || semanaDia.equalsIgnoreCase("Sabado") || semanaDia.equalsIgnoreCase("Sábado")) {
                segundoDia = "Sabado";
                numDia2 = 6;
                break;
            } else if (semanaDia.equals("7") || semanaDia.equalsIgnoreCase("Domingo")) {
                segundoDia = "Domingo";
                if (numDia2 < Dia) {
                    System.out.println(MessageFormat.format("El {0} va antes que el {1}", segundoDia, primerDia));
                } else {
                    break;
                }
            } else {
                System.out.println("Introduce un día válido");
            }
        }
        System.out.print("Introduce la hora del " + segundoDia + ": ");
        int horaDia2 = leer.nextInt();
        while (true) {
            if (horaDia2 < 0 || horaDia2 > 23) {
                System.out.print("Introduce un hora valida para el " + primerDia + ": ");
                horaDia2 = leer.nextInt();
            } else {
                break;
            }
        }
        int horasRestantes;
        if (numDia2 != Dia) {
            int horasRestdia1 = 24 - horaDia1;
            if (numDia2 == 0) {
                numDia2 = 7;
            }
            int diasRestantes = numDia2 - Dia;
            horasRestantes = horasRestdia1 + (24 * (diasRestantes - 1)) + horaDia2;
        } else {
            horasRestantes = horaDia2 - horaDia1;
        }
        System.out.println(MessageFormat.format("Entre las {0}:00h del {1} y las {2}:00h del {3} hay un total de {4} horas/s", horaDia1, primerDia, horaDia2, segundoDia, horasRestantes));
    }
}