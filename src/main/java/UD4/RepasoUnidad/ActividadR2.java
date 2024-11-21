package DAW.src.main.java.UD4.RepasoUnidad;

import java.text.MessageFormat;
import java.util.Scanner;

/*
Datos de entrada: El usuario tiene que introducir un numero de la tabla
de multipicar
Salida: Mostrar la tabla de multiplicar de un numero
 */
public class ActividadR2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numM = scanner.nextInt();
        int contador = 1;
        String texto = "{0} * {1} = {2}";
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
        contador++;
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
        contador++;
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
        contador++;
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
        contador++;
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
        contador++;
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
        contador++;
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
        contador++;
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
        contador++;
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
        contador++;
        System.out.println(MessageFormat.format(texto, numM, contador, (numM * contador)));
    }
}
