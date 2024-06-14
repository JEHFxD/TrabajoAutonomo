package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        HashMap<String, Integer> personas = new HashMap<>();
        
         personas.put("Joan", 22);
         personas.put("Santiago", 32);
         personas.put("Luisa", 21);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre para buscar la edad: ");
        String nombre = scanner.nextLine();
        
        if (personas.containsKey(nombre)) {
            System.out.println("La edad de " + nombre + " es: " + personas.get(nombre));
        } else {
            System.out.println("El nombre " + nombre + " no se encuentra ingresado.");
        }
    }
}
