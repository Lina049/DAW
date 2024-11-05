package DAW.src.main.java.ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Hora y minutos, calcula los segundos que faltan
para llegar a media noche
Salida: Mostrar por pantalla el resultado
 */
public class Extra9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        int horaN = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce los minutos: ");
        int minutosN = Integer.parseInt(System.console().readLine());

        int segundosM = (horaN * 3600) + (minutosN * 60);
        int segundosHastaN = (24 * 3600) - segundosM;

        System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", horaN, minutosN, segundosHastaN);
        }
    }

