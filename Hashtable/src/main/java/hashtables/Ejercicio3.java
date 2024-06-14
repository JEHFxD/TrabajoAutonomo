package hashtables;

import java.util.Hashtable;

public class ContarElementos {
    public static void main(String[] args) {
        Hashtable<String, Integer> personas = new Hashtable<>();
        
        personas.put("Joan", 22);
        personas.put("Santiago", 32);
        personas.put("Luisa", 21);
        
        System.out.println("La cantidad de personas ingresadas son: " + personas.size());
    }
}
