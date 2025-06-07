import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un correo: ");
        String correo = scanner.nextLine();
        
        boolean valido = correo.length() <= 12 && 
                        correo.contains("@") && 
                        correo.endsWith(".com");
        
        System.out.println(valido ? "Correo válido" : "Correo no válido");
    }
}