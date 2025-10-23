package controlFlow;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        // Scanner para leer datos desde la consola
        Scanner sc = new Scanner(System.in);

        // Pedir la edad del usuario
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        // Estructura if-else if-else
        if (edad > 18) {
            System.out.println("El usuario es mayor de edad: " + edad + " años");
        } else if (edad == 18) {
            System.out.println("El usuario acaba de cumplir 18 años");
        } else {
            System.out.println("El usuario es menor de edad: " + edad + " años");
        }

        // Pedir un número que represente un día de la semana
        System.out.print("Introduce la fecha de la semana (1-7): ");
        int dayOfWeek = sc.nextInt();

        // Estructura switch para mostrar el día según el número
        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            default:
                System.out.println("No es lunes, martes, miércoles o jueves");
        }

        // Cerramos el Scanner
        sc.close();
    }
}

