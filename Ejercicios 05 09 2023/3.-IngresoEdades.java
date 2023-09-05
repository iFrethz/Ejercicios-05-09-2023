package sep05_ejercicio_edades;

import java.util.Scanner;

public class Sep05_Ejercicio_Edades {

    public static void main(String[] args) {
        
        Scanner Edades = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
       int edad = Edades.nextInt();
       
       if (edad <= 17) {
           System.out.println("Edad: "+ edad);
           System.out.println("Usted es menor de edad");
           
       } else {
           System.out.println("Edad: "+ edad);
           System.out.println("Usted es mayor de edad");
       }
        
    }
    
}
