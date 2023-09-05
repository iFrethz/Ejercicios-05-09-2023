package sep05092023;

import java.util.Random;
import java.util.Scanner;

public class Sep05092023 {

    public static void main(String[] args) {
        
        int NumMin = 1;
        int NumMax = 100;
        
        Scanner Iniciar = new Scanner(System.in);
        System.out.println("¿Desea iniciar el Juego de adivinanza?");
        System.out.println("1.- Si, Empecemos");
        System.out.println("2.- No, Adios:)");
        int Inicio = Iniciar.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
        
        switch(Inicio){
            case 1:
                Random random = new Random();
                 int NumRandom = random.nextInt(100) + 1;
                 
                 for (int Intento = 4; Intento > -1; Intento--) {
                 Scanner Eleccion = new Scanner(System.in);
                    System.out.println("========================");
                    System.out.println("       ADIVINANZA              ");
                    System.out.println("========================");
                    System.out.print("Ingrese un numero del " + NumMin + " a " + NumMax + ": ");
                 int n = Eleccion.nextInt();
                 
                     for (int i = 0; i < 10; i++) {
                         System.out.println("");
                     }
                 
                 if (NumRandom == n) {
                     System.out.println("========================");
                     System.out.println("     ¡HAS GANADO!");
                     System.out.println("Numero Random: "+ NumRandom);
                     System.out.println("Numero Jugador: "+ n);
                     System.out.println("========================");
                     
                  Scanner Salida = new Scanner(System.in);
                    System.out.println("Presione una tecla para continuar...");
                 int salir = Salida.nextInt();
                 
                     break;
                 } else if (NumRandom > n) {
                     System.out.println("¡TE QUEDAN " + Intento + " OPORTUNIDADES!");
                     System.out.println("El numero es mayor a "+ n);
                     NumMin = n;
                     
                  } else if (NumRandom < n) {
                     System.out.println("¡TE QUEDAN " + Intento + " OPORTUNIDADES!");
                     System.out.println("El numero es menor a "+ n);
                     NumMax = n;
                     
                 }
                }
                 
            case 2:
                 System.out.println("========================");
                 System.out.println("    ADIOS VUELVE PRONTO   ");
                 System.out.println("========================");
                 break;
        }
            
    }
    
}
