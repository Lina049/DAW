package DAW.src.main.java.ExtraActividadesUD5;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class Extra16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double programadorJunior = 950;
        final double programdorSenior = 1200;
        final double jefeProyecto = 1600;

        System.out.print("\n1 - Programdor junior" +
                "\n2 - Programador senior " +
                "\n3 - Jefe de proyecto " +
                "\n Introduce el cargo del empleado(1 - 3): ");
        int opciones = scanner.nextInt();

        System.out.print("¿Cuántos dias ha estado de viaje visitando clientes? ");
        int dias = scanner.nextInt();

        System.out.print("Introduce  su estado civil(1 - Soltero, 2 - Casado): ");
        int estado = scanner.nextInt();
        double sueldoBase = 0;
        if (opciones == 1){
        sueldoBase = programadorJunior;
        } else if (opciones == 2) {
            sueldoBase = programdorSenior;
        }else if (opciones == 3){
            sueldoBase = jefeProyecto;
        }else {
            System.out.println("Cargo invalido");
            System.exit(0);
        }
        double dietas = dias * 30;
        double sueldoBruto = sueldoBase + dietas;
        double retencion = 0;
        int porcentaje = 0;
        if (estado == 1){
             retencion = sueldoBruto * 0.25;
             porcentaje = 25;
        } else if (estado == 2) {
            retencion = sueldoBruto * 0.20;
            porcentaje = 20;
        }else {
            System.out.println("Estado civil invalido");
            System.exit(0);
        }
        double sueldoNeto = sueldoBruto - retencion;
        String texto = "-------------------------------------\n" +
                "| Sueldo base              \t\t{0} |\n" +
                "| Dietas ({1}  viajes)     \t\t{2} |\n" +
                "|                              \t\t|\n" +
                "| Sueldo bruto             \t\t{3} |\n" +
                "| Retención IRPF ({4})     \t\t{5} |\n" +
                "|                             \t\t|\n" +
                "| Sueldo neto              \t\t{6}|\n" +
                "-------------------------------------\n";
        System.out.println(MessageFormat.format(texto, sueldoBase, dias, dietas, sueldoBruto, porcentaje, retencion, sueldoNeto));
    }
}