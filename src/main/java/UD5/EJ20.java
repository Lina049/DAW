package UD5;

import java.util.Scanner;

/*
Datos de entrada: Nombre, horas trabajadas, tarifa por hora
Salida: Horas trabajadas, nombre, bruto, neto y tasas de impuestos.
 */
public class EJ20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //El usuario introduce su nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.next();
        //El usuario introduce las horas trabajadas
        System.out.print("Introduce las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        //El usuario introduce la tarifa por hora
        System.out.println("Introduce tu tarifa por hora: ");
        int tarifa = scanner.nextInt();
        double tarifaExtra = 1.5 * tarifa;
        double bruto;
        double impuestos = 0;
        double neto = 0;
        //Comprueba si las horas trabajadas son menor o igual a 35. Con la formula bruto, se saca el salario bruto
        if (horasTrabajadas <= 35) {
            bruto = horasTrabajadas * tarifa;
        } else {
            //Se calcula las horas a tarifa normal + horas extras a tarifa extra
            bruto = (horasTrabajadas - 35) * tarifaExtra + (35 * tarifa);
        }
        //Se comprueba que si bruta es menor a 500€ no se aplica impuestos
        if (bruto <= 500){
        } else if (bruto <= 900) {
            //Se calcula los impuestos de los siguientes 400€ al 25%
            impuestos = (bruto - 500) * 0.25;
        }else {
            //Se calcula el bruto del salario restante quitandole los primeros 800€ (500 libres + (400 - 25%))
            impuestos = (bruto - 800) * 0.45;
        }
        //Se calcula el salario neto.
        neto = (bruto - impuestos);
        System.out.println(" Por las " + horasTrabajadas + " horas trabajadas, a " +  nombre + " le corresponde un salario bruto de \n " +
                + bruto + " y un neto de " +  neto + " tras aplicar " + impuestos + " euros de impuestos");
    }
}