package hashtables;

import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> personas = new Hashtable<>();
        
        personas.put("Joan", 22);
        personas.put("Santiago", 32);
        personas.put("Luisa", 21);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una edad para verificar: ");
        int edad = scanner.nextInt();
        
        if (personas.containsValue(edad)) {
            System.out.println("La edad " + edad + " se encuentra registrada.");
        } else {
            System.out.println("La edad " + edad + " no se encuentra registrada.");
        }
    }
}
