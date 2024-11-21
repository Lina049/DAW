package DAW.src.main.java.UD4.RepasoUnidad;

import java.text.DecimalFormat;
import java.util.Scanner;
/*´
Dato de entrada: numero del radio.
Salida: la longitud del circulo, el area del circulo y el volumen de la
esfera del dicho del radio.
 */
public class ActividadR11 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        DecimalFormat format  = new DecimalFormat("#.##");
        System.out.println("Introduce la longitud del radio: ");
        int longitudCir = scanner.nextInt();
        System.out.println("Introduce el area del circulo: ");
        int areaCir = scanner.nextInt();
        System.out.println("Introduce el volumen de la esfera: ");
        int volumenCir = scanner.nextInt();

        double longititud = 2 * Math.PI * longitudCir;
        double area = Math.PI * (areaCir * areaCir);
        double volumen = Math.PI * 3 * (volumenCir * volumenCir * volumenCir);

        System.out.println("la lontitud del circulo es: " + (format.format(longititud)));
        System.out.println("El area del circulo es: " + (format.format(area)));
        System.out.println("El volumen del circulo es: " + (format.format(volumen)));
    }
}
