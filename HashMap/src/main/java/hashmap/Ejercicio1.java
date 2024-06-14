package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
    public static void main(String[] args) {
        HashMap<String, Integer> personas = new HashMap<>();
        
        personas.put("Joan", 22);
        personas.put("Santiago", 32);
        personas.put("Luisa", 21);
        
        for (Map.Entry<String, Integer> entry : personas.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }
    }
}
