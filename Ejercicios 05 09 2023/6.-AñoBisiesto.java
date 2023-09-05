package sep05_ejercicio_bisiesto;

import java.util.Scanner;

public class Sep05_Ejercicio_Bisiesto {

    public static void main(String[] args) {
        
        Scanner years = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
             int year = years.nextInt();
             
             boolean year2 = (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0));
             
             if (year2) {
                 System.out.println("El año " + year + " es bisiesto");
             } else {
                 System.out.println("El año " + year + " no es bisiesto");
             }
        
    }
    
}
