package UD5part2;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Piensa un numero: ");
        int numUser = scanner.nextInt();
        int min = 1;
        int max = 100;
        int random;
        while (true) {
                random = (int) (min + (Math.random() * (max - min)));
                System.out.println("El numero que has pensado es: " + random +
                        "\n1- Si \n2- No \nIntroduce tu respuesta: ");
                int opcion = scanner.nextInt();
                if (opcion == 1) {
                    System.out.println("Tu numero es: " + numUser);
                    break;
                }else if (opcion == 2) {
                    System.out.println("El numero que has pensado es: " +
                                       "\n1- Más Alto \n2- Mas Bajo \nIntroduce tu respuesta: " );
                    opcion = scanner.nextInt();
                    if (opcion == 1) {
                        min = numUser;
                    }else if (opcion == 2) {
                        max = numUser;
                    }else {
                        System.out.println("La opcion es invalida");
                        System.exit(0);
                    }
                }else {
                    System.out.println("La opcion es invalida");
                    System.exit(0);
                }
        }
        }
    }
