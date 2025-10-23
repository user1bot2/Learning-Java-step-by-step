package exercises;

// Programa que solicita un número entero al usuario y lo imprime en pantalla
import java.util.Scanner;

public class EjercicioPropio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca un número entero
        System.out.print("Introduce un número entero: ");

        // Leer el número introducido y almacenarlo en una variable de tipo int
        int num = sc.nextInt();

        // Mostrar el número introducido por el usuario
        System.out.println("Has introducido: " + num);

        // Cerrar el Scanner
        sc.close();
    }
}
