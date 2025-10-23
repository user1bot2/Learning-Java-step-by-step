package repeatExercises;

import java.lang.reflect.Array;
import java.util.*;
public class ContarOcurrencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 1: Contar vocales en una palabra. Con el bucle for-each.");
        System.out.println("Ejercicio 2: Contar vocales en una palabra. Con el bucle for tradicional.");
        System.out.println("Ejercicio 3: Contar palabras en una frase. Con el bucle for-each.");
        System.out.println("Ejercicio 4: Contar palabras en una frase. Con el bucle for tradicional.");
        System.out.println("Ejercicio 5: Contar edades repetidas. Con el bucle for-each");
        System.out.println("Ejercicio 6: Contar edades repetidas. Con el bucle for tradicional");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> contarVocalesPalabraForEach(sc);
            case 2 -> contarVocalesPalabraForTradicional(sc);
            case 3 -> contarPalabrasEnUnaFraseForEach();
            case 4 -> contarPalabrasEnUnaFraseForTradicional();
            case 5 -> contarEdadesRepetidasForEach();
            case 6 -> contarEdadesRepetidasForTradicional();
        }
        sc.close();
    }

    // Ejercicio 1: Contar vocales en una palabra
    public static void contarVocalesPalabraForEach(Scanner sc) {
        /*
        Dada una palabra (por ejemplo, "murciélago"), cuenta cuántas veces aparece cada vocal (a, e, i, o, u), ignorando mayúsculas y no vocales.
         */
        sc.nextLine(); // Limpiando buffer
        System.out.println("Dame una palabra");
        String palabra = sc.nextLine();
        // Normalizamos todo a minúsculas
        palabra = palabra.toLowerCase();
        HashMap<Character,Integer> contarVocales = new HashMap<>();
        // Recorremos cada letra de la palabra
        for (char letra : palabra.toCharArray()) {
            // Solo contamos si la letra es una vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                int vecesVistas = contarVocales.getOrDefault(letra, 0);
                contarVocales.put(letra, vecesVistas + 1);
            }
        }
        System.out.println(contarVocales);
    }

    // Ejercicio 2: Contar vocales en una palabra. Con el bucle for tradicional.
    public static void contarVocalesPalabraForTradicional(Scanner sc) {
        sc.nextLine();
        System.out.println("Dame una palabra");
        String palabra = sc.nextLine();
        // Normalizamos todo a minúsculas
        palabra = palabra.toLowerCase();
        HashMap<Character,Integer> contarVocales = new HashMap<>();
        // Miramos cada letra una por una
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            // Comprobar si es letra una vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                int veceVisto = contarVocales.getOrDefault(letra, 0);
                contarVocales.put(letra, veceVisto + 1);
            }

        }
        System.out.println(contarVocales);
    }

    // Ejercicio 3: Contar palabras en una frase. Con el bucle for-each.
    public static void contarPalabrasEnUnaFraseForEach() {
        // Declarar variable
        String frase = "Hola mundo HOla JaVA mundo";
        String fraseJuntaSinEspacio = frase.replaceAll("\\s+", "");
        // Convertir a minúsculas
        frase = frase.toLowerCase();

        HashMap<Character, Integer> conteoFrase = new HashMap<>();
        // Bucle for-each para recorrer la variable frase. Usando toCharArray podemos convertir una array a texto
        for (char f : frase.toCharArray()) {
            if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') {
                int vecesVisto = conteoFrase.getOrDefault(f, 0);
                conteoFrase.put(f, vecesVisto + 1);
            }
        }

        // Comprobar si funciona el "\\s+", ""
        System.out.println(fraseJuntaSinEspacio);

        // Imprimir dato por pantalla
        System.out.println("Aquí están la cantidad de vocales que hay" + conteoFrase);
    }

    // Ejercicio 4: Contar palabras en una frase. Con el bucle for tradicional.
    public static void contarPalabrasEnUnaFraseForTradicional() {
        // Declarar variable
        String frase = "Hola mundo HOla JaVA mundo";
        frase = frase.toLowerCase();
        String fraseSinEspacio = frase.replaceAll("\\s+", "");

        HashMap<Character, Integer> conteoFrase = new HashMap<>();
        // Bucle if
        for (int i = 0; i < fraseSinEspacio.length(); i++) {
            // Queremos que el string pueda ser leído en character
            char letras = fraseSinEspacio.charAt(i);
            if (letras == 'a' || letras == 'e' || letras == 'e' || letras == 'o' || letras == 'u') {
                int vecesVisto = conteoFrase.getOrDefault(letras, 0);
                conteoFrase.put(letras, vecesVisto + 1);
            }
        }
        System.out.println("Aquí están la cantidad de vocales que hay" + conteoFrase);
    }

    //Ejercicio 5: Contar edades repetidas. Con el bucle for-each
    public static void contarEdadesRepetidasForEach() {
        ArrayList<Integer> edades = new ArrayList<>(Arrays.asList(
                25, 30, 25, 40, 30, 25
        ));
        HashMap<Integer, Integer> conteoEdades = new HashMap<>();
        for (int edad : edades) {
            int vecesVisto = conteoEdades.getOrDefault(edad, 0);
            conteoEdades.put(edad, vecesVisto + 1);
        }

        System.out.println("Las edades son: " + conteoEdades);
    }

    //  Ejercicio 6: Contar edades repetidas
    public static void contarEdadesRepetidasForTradicional() {
        ArrayList<Integer> edades = new ArrayList<>(Arrays.asList(
                25, 30, 25, 40, 30, 25
        ));
        HashMap<Integer, Integer> conteoEdades = new HashMap<>();
        for (int i = 0; i < edades.size(); i++) {
            int edad = edades.get(i);
            int vecesVisto = conteoEdades.getOrDefault(edad, 0);
            conteoEdades.put(edad, vecesVisto + 1);
        }

        System.out.println("Las edades son: " + conteoEdades);
    }
}
