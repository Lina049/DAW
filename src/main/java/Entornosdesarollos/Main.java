package Entornosdesarollos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int num = 0;
    public static int num1 = 0;
    public static int opciones = 0;
    public static void main(String[] args) {
        PedirNum.funPedirNum();
        PedirNum1.funPedirNum1();
        PedirOpcion.funPedirOpcion();
        if (opciones == 1) {
            System.out.println("La suma es: " + (fucSuma(num,num1)));
        } else if (opciones == 2) {
            System.out.println("La resta es: " + (fucResta(num,num1)));
        } else if (opciones == 3) {
            System.out.println("La multiplicacion es: " + (fucMult(num,num1)));
        } else if (opciones == 4) {
            System.out.println("La division es: " + (fucDiv(num,num1)));
        }
    }

    public static int fucSuma(int num, int num1) {
        return num + num1;
    }
    public static int fucResta(int num, int num1) {
        return num - num1;
    }
    public static int fucMult(int num, int num1) {
        return num * num1;
    }
    public static int fucDiv(int num, int num1) {
        return num / num1;
    }

}