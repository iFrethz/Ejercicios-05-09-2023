package sep05_ejercicio_multiplicar;

import java.util.Scanner;

public class Sep05_Ejercicio_Multiplicar {

    public static void main(String[] args) {
        
        int numerador = 0;
        
        Scanner Ingreso = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea multiplicar: ");
            int Num = Ingreso.nextInt();
         System.out.println("=============="); 
            
            for (int i = 0; i < 12; i++) {
                numerador = numerador + 1;
                int prom = Num * numerador;
                   System.out.println(Num + " * " + numerador + " = " + prom); 
        }
        
    }
    
}
