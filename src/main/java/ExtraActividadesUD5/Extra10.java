package DAW.src.main.java.ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: minicuestionario con 10 preguntas tipo test sobre una
asignatura del ciclo. Cada pregunta que acierte se suma 1 punto.
Salida:Se mostrará al final la calificación obtenida.
 */
public class Extra10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Minicuestionario de 10 preguntas sobre programación");
        System.out.print("¿Qué es una variable en programación?\nA- Un tipo de bucle \nB- Una ubicación  en la memoria que almacena datos \nC- Una funcion que imprime datos \nD- Un error en el código\nIntrododuce tu respuesta: ");
        String respuesta = scanner.next();
        int correcta = 1;
        if (respuesta.equals("A")){
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuesta.equals("B")) {
            System.out.println("¡CORRECTO!");
            System.out.println("+1 punto");
            correcta++;
        } else if (respuesta.equals("C")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.print("¿Cual de los siguientes es un lenguaje de programación orientado a objetos?\nA- HTML \nB- CSS \nC- Java \nD- SQL \nIntroduce tu respuesta: ");
        String respuestaU = scanner.next();
        if (respuestaU.equals("A")){
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaU.equals("B")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaU.equals("C")) {
            System.out.println("CORRECTO");
            System.out.println("+1 punto");
            correcta++;
        } else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.print("¿Cual de estas estructuras de control permite ejecutar código repetidamente mientras se cumpla una condición?\nA- if \nB- for \nC- while \nD- switch \nIntroduce tu respuesta: ");
        String respuestaD = scanner.next();
        if (respuestaD.equals("A")){
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaD.equals("B")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaD.equals("C")) {
            System.out.println("CORRECTO");
            System.out.println("+1 punto");
            correcta++;
        }else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.print("¿Qué operador se usa para asignar un valor a una variable en la mayoría de los lenguajes de programación?\nA == \nB = \nC += \nD :;=");
        String respuestaT = scanner.next();
        if (respuestaT.equals("A")){
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaT.equals("B")) {
            System.out.println("CORRECTO");
            System.out.println("+1 punto");
            correcta++;
        } else if (respuestaT.equals("C")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.print("¿Qué significa “debugging” en programación?");
        String respuestaC = scanner.next();
        if (respuestaC.equals("A")){
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaC.equals("B")) {
            System.out.println("¡CORRECTO!");
            System.out.println("+1 punto");
            correcta++;
        } else if (respuestaC.equals("C")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.print("¿Qué valor devuelve la expresión lógica True and False?\nA- True \nB- False \nC- Error de sintaxis \nD- None \nIntroduce tu respuesta: ");
        if (respuestaC.equals("A")){
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaC.equals("B")) {
            System.out.println("¡CORRECTO!");
            System.out.println("+1 punto");
            correcta++;
        } else if (respuestaC.equals("C")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.println("¿Qué función se usa comúnmente en Python para obtener la longitud de una lista?\nA- count() \nB- length() \nC- len() \nD- size() \nIntroduce tu respuesta: ");
        if (respuestaC.equals("A")){
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaC.equals("B")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaC.equals("C")) {
            System.out.println("¡CORRECTO!");
            System.out.println("+1 punto");
            correcta++;
        } else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.println("En SQL, ¿qué comando se utiliza para obtener datos de una tabla?\nA- Insert \nB- \nC- UPDATE \nD- Delate \nInserta tu respuesta correcta: ");
        if (respuestaC.equals("A")){
            System.out.println("INCORRECTO");
            System.out.println("+0 puntos");
        } else if (respuestaC.equals("B")) {
            System.out.println("CORRECTO");
            System.out.println("+1 punto");
            correcta++;
        } else if (respuestaC.equals("C")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.println(" ¿Cuál de los siguientes tipos de datos es generalmente mutable en Python?\nA- int \nB- str \nC- list \nD- tuple");
        if (respuestaC.equals("A")){
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaC.equals("B")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaC.equals("C")) {
            System.out.println("CORRECTO");
            System.out.println("+1 punto");
            correcta++;
        } else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.println("En el contexto de la programación web, ¿qué significa CSS?");
        if (respuestaC.equals("A")){
            System.out.println("¡CORRECTO!");
            System.out.println("+1 punto");
            correcta++;
        } else if (respuestaC.equals("B")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else if (respuestaC.equals("C")) {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        } else {
            System.out.println("INCORRECTO");
            System.out.println("0 puntos");
        }
        System.out.println("Has conseguido: " + correcta);
    }
}
