package DoWhiles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Introduce números y un número negativo para terminar el programa");
        do {
            numero = scanner.nextInt();
            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("La suma de los números positivos es: " + suma);
    }
}
