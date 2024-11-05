package UD5;

import java.util.Scanner;

/*
Datos de entrada: Almancenar cadena de caracteres "thebest" en una variable "clave", no hay que tener en cuenta
las mayusculas y minusculas.
Salida:Mostrar la pantalla la clave y que imprima por la pantalla si la clave coincide con la variable.
El usuario podra introducir "TheBest", "THEBEST", "thEbeST".
 */
public class EJ9 {
    public static void main(String[] args) {
        final  String clave = "thebest";
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce la contraseña: ");
        String contrasena = scanner.next();
        if (clave.equals(contrasena.toLowerCase())){
            System.out.println("La contraseña es correcta");
        }else {
            System.out.println("La contraseña es incorrecta");
        }
    }
}
