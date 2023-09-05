package sep05_ejercicio_negativos;

import java.util.Scanner;

public class Sep05_Ejercicio_Negativos {

    public static void main(String[] args) {

         Scanner Ingreso = new Scanner(System.in);
          while (true) {
              
            System.out.println("Ingrese un numero: ");
            int n = Ingreso.nextInt();
            
         if (n < -1) {
             System.out.println("Se ha acabado...");
             break;
         } else {
             System.out.println("El numero ingresado debe ser menor... '0'");
         }
    }
          
    }
    
}
