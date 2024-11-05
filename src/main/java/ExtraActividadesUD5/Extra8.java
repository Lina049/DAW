package ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Horoscopo a partir del dia y del mes
Salida: Mostrar por pantalla el horoscopo que pertence.
 */
public class Extra8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu dia: ");
        int diaH = scanner.nextInt();
        System.out.println("Introduce tu mes: ");
        String mesH = scanner.next();

        if (diaH >= 20 && mesH.equals("Enero") || diaH<= 18 && mesH.equals("Febrero")) {
            System.out.println("El horoscopo que pertences es Acuario");
        } else if (diaH >= 19 && mesH.equals("Febrero")|| diaH <= 20 && mesH.equals("Marzo")){
            System.out.println("El horoscopo que pertences es Piscis");
        } else if (diaH >= 21 && mesH.equals("Marzo") || diaH <= 19 && mesH.equals("Abril") ) {
            System.out.println("El horoscopo que pertences es Aries");
        } else if (diaH >= 20 && mesH.equals("Abril") || diaH <= 20 && mesH.equals("Mayo")) {
            System.out.println("El horoscopo que pertences es Tauro");
        } else if (diaH >= 21 && mesH.equals("Mayo") || diaH <= 20 && mesH.equals("Junio")) {
            System.out.println("El horoscopo que pertences es Gemenis");
        } else if (diaH >= 21 && mesH.equals("Junio") || diaH <= 22 && mesH.equals("Julio")) {
            System.out.println("El horoscopo que pertences es Cancer");
        } else if (diaH >= 23 && mesH.equals("Julio") || diaH <= 22 && mesH.equals("Agosto")) {
            System.out.println("El horoscopo que pertences es Leo");
        } else if (diaH >= 23 && mesH.equals("Agosto") || diaH <= 22 && mesH.equals("Septiembre")) {
            System.out.println("El horoscopo que pertences es Virgo");
        } else if (diaH >= 23 && mesH.equals("Septiembre") || diaH <= 22 && mesH.equals("Octubre")) {
            System.out.println("El horoscopo que pertences es Libra");
        } else if (diaH >= 23 && mesH.equals("Octubre") || diaH <= 21 && mesH.equals("Noviembre")) {
            System.out.println("El horoscopo que pertenes es Escorpio");
        } else if (diaH >= 22 && mesH.equals("Noviembre") || diaH <= 21 && mesH.equals("Diciembre")) {
            System.out.println("El horoscopo que pertences es Sagitario");
        }else if (diaH >= 22 && mesH.equals("Diciembre") || diaH <= 19 & mesH.equals("Enero")){
            System.out.println("El horoscopo que pertences es Capricornio");
        }
    }
}
        