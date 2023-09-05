package sep05_1;

import java.util.Scanner;

public class Sep05_1 {

    public static void main(String[] args) {
        
        Scanner Promedios = new Scanner(System.in);
        int[] nota;
        nota = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("====================");
            System.out.println("Ingrese la nota " + (i + 1) + ": ");
            System.out.println("====================");
            nota[i] = Promedios.nextInt();
            
        }
            
            int NotaFinal = (nota[0] + nota[1] + nota[2]) / 3;
            
            System.out.println("Promedio Final: "+ NotaFinal);
        
    }
    
}
