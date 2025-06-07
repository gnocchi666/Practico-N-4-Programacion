import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        String nombre = scanner.nextLine();
        
        if (!nombre.isEmpty()) {
            System.out.println("El nombre comienza con: " + nombre.charAt(0));
        } else {
            System.out.println("No se ingresó ningún nombre");
        }
    }
}