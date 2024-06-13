package com.mycompany.ejerciciosconstantes;

import java.util.Scanner;

public class EjerciciosConstantes {
    public static void main(String[] args) {
        final double PI = 3.14159;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double circunferencia = 2 * PI * radio;

        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }
}

