import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine().trim();
        
        if (cadena.isEmpty()) {
            System.out.println("No se ingresaron palabras");
        } else {
            String[] palabras = cadena.split("\\s+");
            System.out.println("Número de palabras: " + palabras.length);
        }
    }
}