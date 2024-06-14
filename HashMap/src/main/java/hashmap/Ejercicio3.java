package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        HashMap<String, Integer> personas = new HashMap<>();
        
         personas.put("Joan", 22);
         personas.put("Santiago", 32);
         personas.put("Luisa", 21);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre que quiere eliminar: ");
        String nombre = scanner.nextLine();
        
        if (personas.containsKey(nombre)) {
            personas.remove(nombre);
            System.out.println("El nombre " + nombre + " ha sido eliminado.");
        } else {
            System.out.println("El nombre " + nombre + " no se encuentra ingresado.");
        }
        
        System.out.println("Nombres de personas ingresadas: " + personas);
    }
}
