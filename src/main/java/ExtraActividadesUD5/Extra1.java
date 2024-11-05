package DAW.src.main.java.ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Pedir al usuario un dia de la semana.
Salida: Que diga que asignatura toca a primera hora ese dia.
 */
public class Extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dia de la semana: ");
        String diaS = scanner.next();

        if (diaS.equals("Lunes")) {
            System.out.print("La asignatura que te toca es Sistemas informaticos");
        } else if (diaS.equals("Martes")) {
            System.out.print("La asignatura que te toca es Lenguajes de marcas");
        } else if (diaS.equals("Miercoles")) {
            System.out.print("La asignatura que te toca es Entornos de desarollos");
        } else if (diaS.equals("Jueves")) {
            System.out.println("La asignatura que te toca es Ingles");
        } else if (diaS.equals("Viernes")) {
            System.out.println("La asignatura que te toca es Programacion ");
        }
    }
}

