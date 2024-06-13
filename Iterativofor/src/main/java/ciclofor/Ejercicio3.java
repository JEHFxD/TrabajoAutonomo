package ciclofor;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Ingrese un número:");
            int num = Integer.parseInt(input);
            suma += num;
        }
        
        double promedio = (double) suma / 5;
        JOptionPane.showMessageDialog(null, "El promedio de los números es: " + promedio, "Resultado");
    }
}
