package UD5part2;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int N = scanner.nextInt();
        int cont = N - 1;
        int n = N;
        while (N >= 0) {
            if (cont > 0){
                n = n * cont;
                cont--;
            }else {
                System.out.println(n);
                break;
            }
        }
    }
}
