package sep05_ejercicio_multiplo3;

import java.util.Scanner;

public class Sep05_Ejercicio_Multiplo3 {

    public static void main(String[] args) {
        
        Scanner Ingreso = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
             int num = Ingreso.nextInt();
            
             if (num % 3 == 0){
                 System.out.println("==============");
                 for (int i = 0; i < num+1; i++) {
                     System.out.println(i);
                 }
                 } else {
                         System.out.println("No es multiplo de 3");
           }
    }
    
}
