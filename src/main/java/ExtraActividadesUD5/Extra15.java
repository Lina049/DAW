package ExtraActividadesUD5;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Datos de entrada: Calcula el precio final de un producto según su base,
el tipo de IVA aplicado y el codigo promocional.
Salida:Mostrar si tiene promocion o no.
 */
public class Extra15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            final  double generalIVA = 0.21;
            final  double reducidoIVA = 0.10;
            final  double superReducidoIVA = 0.04;

            System.out.println("Introduce la base imponible: ");
            int base = scanner.nextInt();
            System.out.println("Introduce el tipo de IVA (general, reducido o superReducido): ");
            String tipoIVA = scanner.next();
            System.out.println("Introduce el código promocional (nopromo, promo50pr, promo5eur o promo5por): ");
            String codigoPromo = scanner.next();
            System.out.println("Base imponible: " + decimalFormat.format(base));

            double ivaGeneral = base * (base - generalIVA);
            double ivaReducido = base * (base - reducidoIVA);
            double ivaSuperReducido = base * (base - superReducidoIVA);

            if (tipoIVA.equals(" general")){
            System.out.println("IVA(21%): " + decimalFormat.format(ivaGeneral));
            } else if (tipoIVA.equals("reducido")) {
            System.out.println("IVA(10%): " + decimalFormat.format(ivaReducido));
            } else if (tipoIVA.equals("superReducido")) {
            System.out.println("IVA(4%): " + decimalFormat.format(ivaSuperReducido));
            }

            if (base == ivaGeneral){
                System.out.println("Precio con IVA: " + (base + ivaGeneral));
            } else if (base == ivaReducido ) {
                System.out.println("Precio con IVA: " + (base + ivaReducido));
            }else{
                System.out.println("Precio con IVA: " + (base + ivaSuperReducido));
            }

            if (codigoPromo.equals("nopromo")){
                System.out.println("No se aplica promoción");
            } else if (codigoPromo.equals("promo50pro")) {
                System.out.println("Cód.promo. (promo50por) " + (base * (base - 0.50)/ 100));
            } else if (codigoPromo.equals("promo50eur")) {
                System.out.println("Cód. promo. (promo50eur) " + (base * (base - 0.05)/100));
            }else {
                System.out.println("Cód. promo. (promo5por) " + (base * (base - 0.05)/100));
            }
            if (codigoPromo.equals("nopromo")){
            System.out.println("No se aplica promoción");
            } else if (codigoPromo.equals("promo50pro")) {
            System.out.println("Total " + (base * (base - 0.50)/ 100));
            } else if (codigoPromo.equals("promo50eur")) {
            System.out.println("Total " + (base * (base - 0.05)/100));
         }else {
            System.out.println("Total " + (base * (base - 0.05)/100));
        }

    }
}
