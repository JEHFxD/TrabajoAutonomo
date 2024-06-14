package hashtables;

import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Hashtable<String, Integer> personas = new Hashtable<>();
        
        personas.put("Joan", 22);
        personas.put("Santiago", 32);
        personas.put("Luisa", 21);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un nombre para actualizar la edad: ");
        String nombre = scanner.nextLine();
        
        if (personas.containsKey(nombre)) {
            System.out.print("Introduce la nueva edad: ");
            int nuevaEdad = scanner.nextInt();
            personas.put(nombre, nuevaEdad);
            System.out.println("La edad de " + nombre + " ha sido actualizada a: " + nuevaEdad);
        } else {
            System.out.println("El nombre " + nombre + " no se encuentra en el hashtable.");
        }
        
        System.out.println("Lista de personas: " + personas);
    }
}
