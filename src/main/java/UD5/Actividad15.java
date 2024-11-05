package DAW.src.main.java.UD5;

import java.util.Scanner;

/*
Datos de entrada: Solicitar el usuario el importe total de un pediddo,
según las condiciones, se aplicarán promociones o recargos.
Salida: El importe total con los descuentos o recargos aplicados
 */
public class Actividad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el importe total del pedido: ");
        int importeT = scanner.nextInt();
        if (importeT > 100){
            System.out.println("El descuento del 10% es: " + (importeT - (importeT * 10/100)));
        } else if (importeT < 50)  {
            System.out.println("Se le aplico el recargo por el envio del pedido:  " + (importeT - 5));
        }else {
            System.out.println("No se aplico ni descuento ni recargo en el pedido");
        }
    }
}
