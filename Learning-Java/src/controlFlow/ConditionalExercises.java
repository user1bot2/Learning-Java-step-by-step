package controlFlow;

import java.util.Scanner;

public class ConditionalExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Comprobar si un usuario puede votar (mayor o igual a 18)
        System.out.print("Introduce tu edad: ");
        int edadUsuario = scanner.nextInt();

        if (edadUsuario >= 18) {
            System.out.println("El usuario es mayor de edad, puede votar");
        } else {
            System.out.println("El usuario es menor de edad, no puede votar");
        }

        // 2. Comparar dos números y mostrar cuál es mayor o si son iguales
        System.out.println("Dame dos números enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("num1 es mayor que num2");
        } else if (num1 == num2) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("num2 es mayor que num1");
        }

        // 3. Verificar si un número es positivo, negativo o cero
        int numPosNegC = -12;

        if (numPosNegC > 0) {
            System.out.println("El número es positivo");
        } else if (numPosNegC == 0) {
            System.out.println("El número es cero");
        } else {
            System.out.println("El número es negativo");
        }

        // 4. Determinar si un número es par o impar
        int numParImp = 27;

        if (numParImp % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // 5. Verificar si un número está en el rango de 1 a 100
        int verificarNum = 7;

        if (verificarNum >= 1 && verificarNum <= 100) {
            System.out.println("El número está dentro del rango");
        } else {
            System.out.println("El número no está dentro del rango");
        }

        // 6. Mostrar el día de la semana según un número (1-7)
        int diaSemana = 7;

        switch (diaSemana) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Número no válido"); break;
        }

        // 7. Sistema de notas: Suspenso (0-49), Aprobado (50-79), Sobresaliente (80-100)
        int nota = 80;

        if (nota >= 0 && nota <= 49) {
            System.out.println("Suspenso");
        } else if (nota >= 50 && nota <= 79) {
            System.out.println("Aprobado");
        } else if (nota >= 80 && nota <= 100) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota no válida");
        }

        // 8. Entrada al cine: al menos 15 años o ir acompañado
        int edadCine = 20;
        boolean acompañado = true;

        if (edadCine >= 15 || acompañado) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }

        // 9. Determinar si una letra es vocal o consonante
        System.out.print("Introduce una letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }

        // 10. Mostrar el mayor de tres números
        System.out.print("Introduce el valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el valor de b: ");
        int b = scanner.nextInt();
        System.out.print("Introduce el valor de c: ");
        int c = scanner.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El número más grande es: " + mayor);

        // Cerrar el Scanner
        scanner.close();
    }
}