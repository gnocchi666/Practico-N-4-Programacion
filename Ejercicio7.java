import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena con punto: ");
        String cadena = scanner.nextLine();
        int puntoIndex = cadena.indexOf('.');
        
        if (puntoIndex != -1 && puntoIndex < cadena.length() - 1) {
            System.out.println("Texto después del punto: " + cadena.substring(puntoIndex + 1));
        } else {
            System.out.println("No hay texto después del punto");
        }
    }
}