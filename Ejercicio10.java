import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;
        
        do {
            System.out.print("Ingrese una cadena: ");
            cadena = scanner.nextLine().trim();
            
            boolean longitudValida = cadena.length() > 8;
            boolean mayusculaValida = !cadena.isEmpty() && Character.isUpperCase(cadena.charAt(0));
            
            if (longitudValida && mayusculaValida) {
                System.out.println("Cadena correcta");
                break;
            } else {
                System.out.println("Cadena incorrecta. Debe:");
                if (!longitudValida) System.out.println("- Tener más de 8 caracteres");
                if (!mayusculaValida) System.out.println("- Empezar con mayúscula");
            }
        } while (true);
    }
}