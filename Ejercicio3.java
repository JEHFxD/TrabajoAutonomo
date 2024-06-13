package com.mycompany.ejerciciosconstantes;

public class Ejercicio3 {
    private static final int LONGITUD = 10;
    private static final int ANCHO = 5;

    public static void main(String[] args) {
        int area = calcularArea();
        System.out.println("El área del rectángulo es: " + area);
    }

    public static int calcularArea() {
        return LONGITUD * ANCHO;
    }
}
