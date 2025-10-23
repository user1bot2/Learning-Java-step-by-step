package repeatExercises;

import java.awt.*;
import java.util.*;

public class JavaExercisesFindingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción: ");
        System.out.println("1. Filtrar nombres de usuarios válidos.");
        System.out.println("2. Censurar palabras + contar las palabras censuradas.");
        System.out.println("3. Constructor de mensajes seguros.");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> filtrarNombresUsuarios();
            case 2 -> censurarPalabrasYContar();
            case 3 -> constructorMensajesSeguros();
            default -> System.out.println("No es una opción válida.");
        }

    }

    // 1. Filtrar nombres de usuarios válidos.
    public static void filtrarNombresUsuarios() {
        /*

        Goal: Print only the usernames that are allowed (i.e., not in a banned list).

        Instructions:
        Create an ArrayList<String> of usernames:
        "ana123", "hacker99", "peace", "toxic_user", "coder2025", "spamBot"
        Create a HashSet<String> of banned usernames:
        "hacker99", "toxic_user", "spamBot"
        Loop through the list.
        → If the username is not banned, print it.
        → If it is banned, skip it (print nothing).
         */

        // Nombres de usuarios
        ArrayList<String> usernames = new ArrayList<>(Arrays.asList(
                "ana123", "hacker99", "peace", "toxic_user", "coder2025", "spamBot"
        ));
        // Lista de palabras prohibidas
        HashSet<String> bannedUsernames = new HashSet<>(Arrays.asList(
                "hacker99", "toxic_user", "spamBot"
        ));
        // Bucle para comprobar
        for (String user : usernames) {
            // Si contiene usuarios prohibidos entonces salta ese índice
            if (bannedUsernames.contains(user)) {
                continue;
                // Si el nombre de usuario no está prohibido entonces imprime
            } else {
                System.out.println(user);
            }
        }
    }

    // 2. Censurar palabras + contar las palabras censuradas.
    public static void censurarPalabrasYContar() {
        /*
        Goal: Censor forbidden words and count how many were censored.

        Instructions:

        Use the same palabras and palabrasProhibidas as in your original code.
            Code:
                ArrayList<String> palabras = new ArrayList<>(Arrays.asList(
                    "hola", "odio", "tonto", "buenas", "inútil", "quizás", "bobo"
            ));
            HashSet<String> palabrasProhibidas = new HashSet<>(Arrays.asList(
                    "tonto","odio","inútil","bobo"
            ));
        Add an int contadorCensuradas = 0; before the loop.
        Inside the if (when a word is prohibited):
        Print the censored version (*.repeat(...))
        Increment the counter
        After the loop, print:
        "Total palabras censuradas: X"
         */

        // Crear un variable para guardar cuántas palabras censuradas hay
        int contadorCensurados;
        // Código original:
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList(
                "hola", "odio", "tonto", "buenas", "inútil", "quizás", "bobo"
        ));
        HashSet<String> palabrasProhibidas = new HashSet<>(Arrays.asList(
                "tonto","odio","inútil","bobo"
        ));
        // Incializar la variable contadorCensurados = 0;
        contadorCensurados = 0;
        // Usar bucle para determinar las palabras prohibidas y la cantidad de palabras que fueron prohibidas.
        for (String p : palabras) {
            // Saber si las palabras están censuradas o no
            if (palabrasProhibidas.contains(p)) {
                System.out.println("*".repeat(p.length()));
                contadorCensurados +=1;
            } else {
                System.out.println(p);
            }
        }
        // Lo ponemos afuera del if, porque no queremos que vaya a estar imprimiendo cada vez que haya un true.

        System.out.println("Estas fueron las palabras censuradas: " + contadorCensurados);
    }

    // 3. Constructor de mensajes seguros.
    public static void constructorMensajesSeguros() {
        /*
        Goal: Build a clean sentence with censored words replaced by ****, and return it as a single string.

        Instructions:

        Use the same word list: "hola", "odio", "tonto", "buenas"
        Same prohibited set: "odio", "tonto"
        Instead of printing each word, build a new sentence:
        Use a StringBuilder
        For each word:
        If prohibited → append "****"
        Else → append the original word
        Add a space between words
        At the end, print the full sentence.
        Expected output:
        hola **** **** buenas
         */
        StringBuilder conjuntosDePalabras = new StringBuilder();
        // Crear un variable para guardar cuántas palabras censuradas hay
        int contadorCensurados;
        // Código original:
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList(
                "hola", "odio", "tonto", "buenas", "inútil", "quizás", "bobo"
        ));
        HashSet<String> palabrasProhibidas = new HashSet<>(Arrays.asList(
                "tonto","odio","inútil","bobo"
        ));
        for (int i = 0; i < palabras.size(); i++) {
            // Convertir int a String. Queremos usar los índices de i.
            String p = palabras.get(i);

            // Decidir que version usar: censurada o original
            String palabrasAMostrar;
            if (palabrasProhibidas.contains(p)) {
                palabrasAMostrar = "*".repeat(p.length());
                System.out.println(palabrasAMostrar);
            } else {
                palabrasAMostrar = p;
                System.out.println(p); // print original
            }

            // Usar el método append
            conjuntosDePalabras.append(palabrasAMostrar);

            // Añadir espacio si no es la última palabra
            if (i < palabras.size() - 1) {
                conjuntosDePalabras.append(" ");
            }
        }
        String mensajeFinal = conjuntosDePalabras.toString();
        System.out.println("Mensaje final: " + mensajeFinal);
    }

}

