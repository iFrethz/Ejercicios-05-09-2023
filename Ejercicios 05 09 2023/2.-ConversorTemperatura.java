package sep05_2ejercicio_celsius;

import java.util.Scanner;

public class Sep05_2Ejercicio_Celsius {
    
    public static void main(String[] args) {
        
        Scanner Grados = new Scanner(System.in);
        System.out.println("Ingrese los CELSIUS: ");
       double celsius = Grados.nextInt();
        
       double Fahrenheit = (celsius * 9/5 + 32);
       
        System.out.println("Fahrenheit: " + Fahrenheit);
       
    }
    
}
