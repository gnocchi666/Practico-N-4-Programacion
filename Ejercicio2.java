import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena con espacios: ");
        String cadena = scanner.nextLine();
        String sinEspacios = cadena.replaceAll("\\s+", "");
        System.out.println("Cadena sin espacios: " + sinEspacios);
    }
}