package UD5part2;

public class Actividad11 {
    public static void main(String[] args) {
        int acumPar = 0;
        int acumImp = 0;
        for (int i = 100; i <= 200 ; i++) {
            if (i % 2 == 0){
                acumPar += i;
            }else {
                acumImp += i;
            }
        }
        System.out.println("Pares: " + acumPar);
        System.out.println("Impares: " + acumImp);
        }
    }

