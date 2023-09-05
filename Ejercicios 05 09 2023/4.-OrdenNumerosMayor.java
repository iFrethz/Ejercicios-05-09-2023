package ejercicio;

import java.util.Scanner;

public class Ejercicio {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Elija un patrón (1: Cuadrado, 2: Pirámide, 3: Triángulo): ");
        int opcion = input.nextInt();
        
        switch (opcion) {
            case 1:
                dibujarCuadrado();
                break;
            case 2:
                dibujarPiramide();
                break;
            case 3:
                dibujarTriangulo();
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija 1, 2 o 3.");
        }
        
        input.close();
    }
    
    public static void dibujarCuadrado() {
        int lado = 5; // Tamaño del cuadrado (puedes cambiarlo)
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void dibujarPiramide() {
        int altura = 5; // Altura de la pirámide (puedes cambiarlo)
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void dibujarTriangulo() {
        int altura = 5; // Altura del triángulo (puedes cambiarlo)
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}