package stringManipulation;

import java.util.*;
import java.util.Arrays;

public class ExercisesStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicios de StringBuilder");
        System.out.println("1. 3 Ejercicios SIN bucles");
        System.out.println("2. 1 Ejercicios CON bucles: 1 for tradicional y 1 for-each. ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> ejerciciosSinBucles(sc);
            case 2 -> ejerciciosConBucles();
            default -> System.out.println("Opción errónea.");
        }
    }

    public static void ejerciciosSinBucles(Scanner sc) {
        /*
        Ejercicio 1: Saludo condicional
        Genera un saludo distinto según si es por la mañana o no.
        El valor de 'esManana' es fijo en el código, pero se compara con la entrada del usuario.
        */
        String nombre = "Ana";
        String frase = " ";
        boolean esManana = true;
        StringBuilder sb = new StringBuilder();
        System.out.println("Dame true o false.");
        boolean resultado = sc.nextBoolean();

        if (esManana == resultado) {
            sb.append("¡Buenos");
            sb.append(" días,");
            sb.append(nombre);
            frase = sb.toString();
        } else {
            sb.append("¡Buenas");
            sb.append(" noches,");
            sb.append(nombre);
            frase = sb.toString();
        }

        System.out.println(frase);

        /*
        Ejercicio 2: Validar contraseña segura
        Una contraseña se considera segura si tiene al menos 8 caracteres
        y contiene al menos un dígito del 0 al 9.
        */
        String password = "MiPass123!";
        int passwordSize = password.length();
        if (passwordSize >= 8) {
            if (password.contains("0") || password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8") || password.contains("9")) {
                System.out.println("Contraseña segura");
            } else {
                System.out.println("Contraseña débil");
            }
        }

        /*
        Ejercicio 3: Mensaje de censura único
        Si la palabra está en el conjunto de palabras prohibidas,
        se muestra reemplazada por asteriscos de la misma longitud.
        */
        String palabra = "odio";
        HashSet<String> prohibidas = new HashSet<>(Arrays.asList(
                "odio", "tonto"
        ));

        if (prohibidas.contains(palabra)) {
            System.out.println("*".repeat(palabra.length()));
        } else {
            System.out.println(palabra);
        }
    }

    public static void ejerciciosConBucles() {
        /*
        Ejercicio 1: Cuenta regresiva con for tradicional
        Construye una cadena con números desde n hasta 1, separados por comas,
        evitando una coma al final.
        */
        int n = 5;
        StringBuilder sb = new StringBuilder();
        sb.append("La cuenta atrás: ");

        for (int i = 5; i >= 1; i--) {
            sb.append(i);
            // Añadimos coma y espacio solo si no estamos en el último número (1)
            if (i > 1) {
                sb.append(", ");
            }
        }

        System.out.println(sb.toString());

        /*
        Ejercicio 2: Censura de palabras con for-each
        Recorre una lista de palabras y reemplaza las que estén en el conjunto
        de palabras prohibidas por asteriscos de igual longitud.
        Las palabras se unen en una oración con espacios.
        */
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("Hola", "odio", "el", "tráfico"));
        HashSet<String> prohibidas = new HashSet<>(Arrays.asList("odio", "tonto"));
        StringBuilder sb1 = new StringBuilder();

        for (String p : palabras) {
            // Determinamos qué versión de la palabra mostrar: original o censurada
            String palabrasAMostrar;
            if (prohibidas.contains(p)) {
                palabrasAMostrar = "*".repeat(p.length());
            } else {
                palabrasAMostrar = p;
            }
            System.out.println(palabrasAMostrar);

            // Añadimos la palabra procesada al StringBuilder con un espacio
            sb1.append(palabrasAMostrar).append(" ");
        }
        // Convertimos a String y eliminamos el espacio final sobrante
        String frase = sb1.toString().trim();
        System.out.println(frase);
    }
}