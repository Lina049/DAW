package UD4;

public class Actividad5 {
    public static void main(String[] args) {
        final int cont = 10;
        final int limite = 20;
        String ANSI_RED = "\u001B[31m";
        String ANSI_BLUE = "\u001B[30m";
        String ANSI_GREEN = "\u001B[32m";
        System.out.println("A");
        if (cont == 0 && limite < 20){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println("B");
        if (limite >= 20 || cont < 5){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println("C");
        if ((limite / (cont-10 + 1))> 7 || (limite < 20) ){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println("D");
        if (limite<=20 || ((limite/(cont - 10 ))> 7)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        System.out.println("E");
        if ((limite <= 20 || (limite/(cont-10))> 7)&&(limite < 0)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        System.out.println("F");
        if ((limite < 0) && ((limite/(cont-10)) > 7)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
