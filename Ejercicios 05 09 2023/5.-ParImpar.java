package sep05_ejercicio_parimpar;

import java.util.Scanner;

public class Sep05_Ejercicio_ParImpar {

    public static void main(String[] args) {
      
        Scanner Pares = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
             int num = Pares.nextInt();
             
             if (num % 2 == 0) {
                 System.out.println("El numero " + num + " es PAR");
             } else {
                 System.out.println("El numero " + num + " es IMPAR");
             }
                
    }
    
}
