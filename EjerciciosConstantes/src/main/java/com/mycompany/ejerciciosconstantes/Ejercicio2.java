package com.mycompany.ejerciciosconstantes;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final double DIVISOR = 2.0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / DIVISOR;

        System.out.println("El área del triángulo es: " + area);
    }
}

