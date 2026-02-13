//EJERCICIO 1 CALCULADORA CON EXCEPCIONES
//El programa deberá solicitar al usuario:
//Un número entero.
//Otro número entero.
//Una operación matemática (+, -, *, /).

//El programa deberá realizar la operación indicada y mostrar el resultado por pantalla.
//---- Gestión de excepciones ----
//El programa deberá gestionar correctamente las siguientes situaciones:
//	Error de tipo de dato
//		Si el usuario introduce un valor que no sea un número entero, deberá capturarse la excepción correspondiente.
//		Se mostrará un mensaje indicando que el valor introducido no es válido.
//	División por cero
//		Si el usuario selecciona la división y el segundo número es cero, deberá capturarse la excepción correspondiente.
//		Se mostrará un mensaje indicando que no se puede dividir entre cero.
//	Operación no válida
//		Si el usuario introduce una operación distinta de +, -, * o /, el programa deberá lanzar manualmente una excepción usando throw.
//		La excepción deberá ser capturada y mostrarse un mensaje indicando que la operación no es válida.
//---- Estructura obligatoria ----
//Utilizar al menos un bloque try-catch.
//Utilizar throw para la operación inválida.
//El cálculo deberá realizarse en un metodo independiente.
//El programa deberá finalizar mostrando un mensaje de cierre.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número entero: ");
            int num1 = sc.nextInt();

            System.out.print("Introduce un segundo número entero: ");
            int num2 = sc.nextInt();

            sc.nextLine();

            System.out.print("Introduce tipo de operación(+, -, *, /): ");
            String operacion = sc.nextLine();

            int res = calculo(num1, num2, operacion);
            System.out.println("Resultado: " + res);

        } catch (InputMismatchException e) {
            System.out.println("Error1. Motivo: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Error2. Motivo: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa");
            sc.close();
        }

    }

    public static int calculo(int num1, int num2, String operacion) {
        switch (operacion) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Error.");
        }
    }
}
