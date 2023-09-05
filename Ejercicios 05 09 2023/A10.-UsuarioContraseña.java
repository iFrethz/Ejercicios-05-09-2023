package sep05_ejercicio_contraseña;

import java.util.Scanner;

public class Sep05_Ejercicio_Contraseña {

    public static void main(String[] args) {
        
        String admin = "ipchile";
        String passa = "ipchile";
        
        for (int i = 1; i < 4; i++) {
        Scanner cuenta = new Scanner(System.in);
            System.out.println("Numero intento: " + i + "°");
            System.out.println("Ingrese nombre de usuario: ");
            String usuario = cuenta.nextLine();
         
            System.out.println("Ingrese la contraseña: ");
            String pass = cuenta.nextLine();
            
            if (usuario.equals(admin) && pass.equals(passa)) {
                System.out.println("Ha iniciado sesion como admin...");
                break;
            } else if (i == 3) {
                 System.out.println("La cuenta ha sido bloqueda...");
            } else {
                System.out.println("Vuelva a intentarlo");
            }
        }
    }
    
}
