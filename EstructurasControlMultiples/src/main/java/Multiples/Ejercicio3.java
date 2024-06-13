package Multiples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserte un numero: ");
        int numero = Integer.parseInt(input.readLine());
        
        String Estación = null;
        
        switch (numero) {
        case 1: 
        	Estación="Invierno"; break;
        case 2: 
        	Estación="Veranoo"; break;	
        case 3: 
        	Estación="Otoño"; break;
        case 4: 
        	Estación="´Primavera"; break;
        default:
        	System.out.println("No es un numero valido"); break;
        }
         System.out.println("La Estación es: "+Estación);
	}
}