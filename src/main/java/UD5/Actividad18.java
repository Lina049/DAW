package UD5;

import java.util.Scanner;

/*
Datos de entrada:Preguntar al usuario si quiere pizza vegetariano o no.
Salida:Mostrar por pantalla si la pizza eligida es vegetariano o no y
todos los ingredientes que lleva.
 */
public class Actividad18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la pizzeria BELLA NAPOLI");
        System.out.println("Tipo de pizza: \n1- Vegetariana \n2- No vegetariana \n Introduce el número correspondiente al tipo de pizza que quieres: ");
        int pizzaT = scanner.nextInt();
        if (pizzaT == 1) {
            System.out.println("Ingredientes de pizzas vegetarianas: \n1-Queso \n2-Champiñon \n3-Pimiento rojo \n- Introduce el ingrediente que deseas: ");
            int pizzaV = scanner.nextInt();
            if (pizzaV == 1) {
                System.out.println("Has elegido la pizza vegetariana de queso, tomate y oregano");
            } else if (pizzaV == 2) {
                System.out.println("Has elegido la pizza vegetariana de champiñon, tomate y calabacin ");
            } else {
                System.out.println("Has elegido la pizza vegetariana de pimiento rojo, tomate, queso y espinacas");
            }
        }
        if (pizzaT == 2) {
            System.out.println("Ingredientes de pizzas no vegetarianas: \n1- Peperoni \n2- Jamón \n3- Salmón \n Introduce el ingrendiente que deseas:  ");
            int pizzaNoV = scanner.nextInt();
            if (pizzaNoV == 1) {
                System.out.println("Has elegido la pizza no vegetariana peperoni, cebella dulce y pimiento verde");
            } else if (pizzaNoV == 2) {
                System.out.println("Has elegido la pizza no vegetariana jamon, queso y tomate");
            } else {
                System.out.println("Has elegido la pizza no vegetariana con tomate, mozzarella y salmon");
            }
        }
    }
}
