package controlFlow;

import java.util.*;


public class RepeatConditionalExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una de las opciones: ");
        System.out.println("1. Comprobar si un usuario puede votar (mayor o igual a 18).");
        System.out.println("2. Comparar dos números y mostrar cuál es mayor o si son iguales.");
        System.out.println("3. Verificar si un número es positivo, negativo o cero.");
        System.out.println("4. Determinar si un número es par o impar.");
        System.out.println("5. Verificar si un número está en el rango de 1 a 100.");
        System.out.println("6. Mostrar el día de la semana según un número (1-7).");
        System.out.println("7. Sistema de notas: Suspenso (0-49), Aprobado (50-79), Sobresaliente (80-100).");
        System.out.println("8. Entrada al cine: al menos 15 años o ir acompañado.");
        System.out.println("9. Determinar si una letra es vocal o consonante");
        System.out.println("10. Mostrar el mayor de tres números");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> usuarioMayorOIgual18(sc);
            case 2 -> compararDosNumerosMostrarMayorOIguales(sc);
            case 3 -> verificarNumeroPositivoNegativoCero(sc);
            case 4 -> determinarSiNumEsParImpar(sc);
            case 5 -> verificarNumDentroRango(sc);
            case 6 -> mostrarDiaDeLaSemana(sc);
            case 7 -> sistemaNotas(sc);
            case 8 -> entradaAlCina(sc);
            case 9 -> letraVocalOConsonante(sc);
            case 10 -> mostrarMayor3Numeros(sc);
            default -> System.out.println("Este opción no es válida.");
        }

    }
    // 1. Comprobar si un usuario puede votar (mayor o igual a 18)
    public static void usuarioMayorOIgual18(Scanner sc) {
        // Declarando variable
        int edadUsuario;

        // Recogida de dato
        System.out.println("Introduce tu edad: ");
        edadUsuario = sc.nextInt();

        // Verficar si es mayor o no
        if (edadUsuario > 18) {
            System.out.println("El usuario es mayor de edad, tiene más de 18 años y puede votar");
        } else if (edadUsuario == 18) {
            System.out.println("El usuario tiene 18 y puede votar");
        } else {
            System.out.println("El usuario no tiene mayoría de edad, por ende no puede votar");
        }
    }

    // 2. Comparar dos números y mostrar cuál es mayor o si son iguales
    public static void compararDosNumerosMostrarMayorOIguales(Scanner sc) {
        // Declarando variables
        double a, b;
        // Recogida de datos
        System.out.println("Introduce dos números reales: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        // Saber cuál es mayor o si son iguales
        if (a > b) {
            System.out.println("El número mayor es: " + a);
        } else if (b > a) {
            System.out.println("El número mayor es: " + b);
        } else {
            System.out.println("Los números son iguales.");
        }
    }

    // 3. Verificar si un número es positivo, negativo o cero.
    public static void verificarNumeroPositivoNegativoCero(Scanner sc) {
        // Declarar variable
        int a;
        // Pedir dato al usuario
        System.out.println("Introduce el número: ");
        a = sc.nextInt();
        // Comprobar si es positivo, negativo o cero
        if (a > 0) {
            System.out.println("Es un número positivo");
        } else if (a < 0) {
            System.out.println("Es un número negativo");
        } else {
            System.out.println("El número es igual a 0");
        }
    }

    public static void determinarSiNumEsParImpar(Scanner sc) {
        // Declarar variables
        int a;
        String resultado;
        // Pedir datos al usuario
        System.out.println("Dame un valor real: ");
        a = sc.nextInt();
        // Determinar even || odd
        resultado = (a % 2 == 0) ? ("El número " + a + " es par") : ("El número " + a + " no es par");
        System.out.println(resultado);
    }

    // 5. Verificar si un número está en el rango de 1 a 100
    public static void verificarNumDentroRango(Scanner sc) {
        // Declarar variable
        int a;
        // Pedir dato al usuario
        System.out.println("Dame un número: ");
        a = sc.nextInt();
        // Determinar número
        if (a >= 1 && a <= 100) {
            System.out.println("Está dentro del rango.");
        } else {
            System.out.println("No está dentro del rango.");
        }

    }

    // 6. Mostrar el día de la semana según un número (1-7)
    public static void mostrarDiaDeLaSemana(Scanner sc) {
        // Declarar variables
        int numDiaSemana;
        // Pedir dato
        System.out.println("Dame de 1 - 7 el día de la semana: ");
        numDiaSemana = sc.nextInt();
        // Imprimir dia de la semana
        switch (numDiaSemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Error número inválido. ");
        }
    }
    // 7. Sistema de notas: Suspenso (0-49), Aprobado (50-79), Sobresaliente (80-100)
    public static void sistemaNotas(Scanner sc) {
        // Declaración de variblaes
        int nota;
        // Pedir dato al usuario
        System.out.println("Introduce tu nota: ");
        nota = sc.nextInt();
        // Sistemas de nota
        if (nota < 0 || nota > 100) {
            System.out.println("Error: la nota debe estar entre 0 y 100.");
        } else if (nota >= 0 && nota <= 49) {
            System.out.println("Tu nota es " + nota + " estas suspenso.");
        }
        else if (nota >= 80 && nota <= 100) {
            System.out.println("Tu nota es " + nota + " es un sobresaliente.");
        } else {
            System.out.println("Tu nota es " + nota + " estas aprobado");
        }
    }

    // 8. Entrada al cine: al menos 15 años o ir acompañado
    public static void entradaAlCina(Scanner sc) {
        int edad;
        boolean acompanado;
        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();
        sc.nextLine(); // Limpiando el buffer
        System.out.println("¿Vas acompañado? True o False: ");
        acompanado = sc.nextBoolean();

        if (edad >= 15 || acompanado) {
            System.out.println("Puedes entrar al cine.");
        } else {
            System.out.println("Necesita ir acompañado.");
        }
    }

    // 9. Determinar si una letra es vocal o consonante
    public static void letraVocalOConsonante(Scanner sc) {
        // Pedir dato al usuario
        System.out.println("Dame una letra: ");
        char letra = sc.next().charAt(0);
        // Normalizar el dato que nos dará el usuario
        letra = Character.toLowerCase(letra);
        // Crear un array de los vocales
        Character[] vocales = {'a', 'e','i','o','u'};
        // Asumimos inicialmente que la letra no es una vocal
        boolean esVocal = false;
        // En el bucle for-each vamos a recorrer los vocales
        for (Character v : vocales) {
            // Bucle if, vamos a comprobar si es vocal o no
            if (letra == v) {
                esVocal = true;
                break;
            }
        }

        // Imprimir dato por pantalla
        if (esVocal) {
            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("La letra no es una vocal.");
        }
    }

    // 10. Mostrar el mayor de tres números
    public static void mostrarMayor3Numeros(Scanner sc) {
        int a, b, c;
        System.out.println("Dame tres números: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        if (b >= a && b >= c) {
            System.out.println("El número mayor es " + b);
        } else if (c >= a && c >= b) {
            System.out.println("Número mayor es " + c);
        } else {
            System.out.println("Número mayor es " + a);
        }

    }
}
