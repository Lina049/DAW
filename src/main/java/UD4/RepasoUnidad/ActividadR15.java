package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

/*
Datos de entrada: Pregunta al usuario por número de horas trabajas y la
tarifa por hora.
Salida: Mostrar por pantalla la paga en bruto y el neto aplicando una
retención IRPF del 15%.
 */
public class ActividadR15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de horas trabajadas: ");
        int horaT = scanner.nextInt();
        System.out.println("Introduce la tarifa por hora: ");
        int tarifaH = scanner.nextInt();
        int bruto = horaT * tarifaH;
        double neto = bruto - (bruto * 0.15);
        System.out.println("Tu paga en bruto es de " + bruto + " y en neto " + neto + "(retención del 15%)");
    }
}
