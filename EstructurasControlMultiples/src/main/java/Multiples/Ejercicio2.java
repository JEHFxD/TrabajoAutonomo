package Multiples;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresee el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce la operación (suma, resta, multiplicacion, division): ");
        String operacion = scanner.next();

        switch (operacion) {
            case "suma":
                System.out.println("Resultado de la suma es: " + (num1 + num2));
                break;
            case "resta":
                System.out.println("Resultado de la resta es: " + (num1 - num2));
                break;
            case "multiplicacion":
                System.out.println("Resultado de la multiplicaión es: " + (num1 * num2));
                break;
            case "division":
                if (num2 != 0) {
                    System.out.println("Resultado de la división es: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("Operación no válida, ingrese una operación valida");
                break;
        }
    }
}
