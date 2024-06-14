package arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {14, 23, 35, 43, 52};
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
