package ExtraActividadesUD5;

import java.util.Objects;
import java.util.Scanner;

/*
Datos de entrada: Pintar una pirámide rellena con un caracter introducido por un usuario que podra
ser una letra, número o un simbolo. Debe permitir al usuario mediante un menú elegir si el vertice
de la piramide está apuntado hacia arriba, abajo, izquierda o derecha.
Salida: Mostrar la piramide rellena con los caracteres introducidos.
//piramideArriba = piramideArriba.replace(".",relleno);
 */
public class Extra14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un carácter de relleno: ");
        String relleno = scanner.next();
        String piramideArriba ="\n  ." +
                               "\n ..." +
                               "\n.....";

        String piramideAbajo = "\n....." +
                               "\n ..." +
                               "\n  .";

        String piramideIzq = "\n    ." +
                            "\n  . ." +
                            "\n. . ." +
                            "\n  . ." +
                            "\n    .";

        String piramideDer = "\n." +
                            "\n. ." +
                            "\n. . ." +
                            "\n. ." +
                            "\n.";

        System.out.print("\n1. Con el vértice hacia arriba " +
                "\n2. Con vértice hacia abajo " +
                "\n3. Con el vértice hacia la izquierda" +
                "\n4. Con el vértice hacia la dercha " +
                "\n Elige un tipo de pirámide: ");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            System.out.println(piramideArriba.replace(".",relleno));
        } else if (opcion == 2) {
            System.out.println(piramideAbajo.replace(".",relleno));
        }else if (opcion == 3) {
            System.out.println(piramideIzq.replace(".",relleno));
        } else if (opcion == 4) {
            System.out.println(piramideIzq.replace(".",relleno));
        }

    }
}
