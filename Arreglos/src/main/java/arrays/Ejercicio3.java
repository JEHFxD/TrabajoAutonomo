package arrays;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 1, 4, 2};
        Arrays.sort(numeros);
        
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
