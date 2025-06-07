import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        System.out.println("La longitud de la cadena es: " + cadena.length());
    }
}