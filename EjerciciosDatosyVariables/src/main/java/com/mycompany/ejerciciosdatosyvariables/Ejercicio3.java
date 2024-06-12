package com.mycompany.ejerciciosdatosyvariables;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base de un triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura de un triángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura/2;

        System.out.println("El área del triángulo: " + area);
    }
}
