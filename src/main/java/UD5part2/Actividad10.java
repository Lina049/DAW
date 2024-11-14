package UD5part2;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean diez = false;
        while (true){
            System.out.println("Introduce la nota: ");
            int nota = sc.nextInt();
            if (nota == -1){
                break;
            }else if (nota == 10){
                diez = true;
            }
        }
        if (diez){
            System.out.println("Ha habido un 10");
        }else {
            System.out.println("No ha habido un 10");
        }

    }
}
