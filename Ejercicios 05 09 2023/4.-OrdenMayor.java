package ejercicio;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner CondiSi = new Scanner(System.in);
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el " + (i + 1) + "er numero: ");
            num[i] = CondiSi.nextInt();
        }

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        CondiSi.close();
        
        if (num[0] == num[1] && num[1] == num[2]) {
            System.out.println();
            System.out.println("======================================");
            System.out.println("Los tres numeros son iguales y es: " +num[0]);
            System.out.println("======================================");
        } else {
            System.out.println();
            System.out.println("===================================");
            System.out.println("El numero '" + num[2] + "' es mayor");
            System.out.println("El numero '" + num[1] + "' es medio");
            System.out.println("El numero '" + num[0] + "' es menor");
            System.out.println("===================================");
        }
    }
}