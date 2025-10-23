package dataStructures;

import java.util.*;
import java.util.Arrays;

public class DataStructuresExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Menú de ejercicios
        System.out.println("Elige un ejercicio que quieras ejecutar:");
        System.out.println("1. Eliminar duplicados");
        System.out.println("2. Contar ocurrencias");
        System.out.println("3. Buscar palabras prohibidas");
        System.out.println("4. Invertir array");
        System.out.println("5. Email duplicados");
        System.out.println("6. Eliminar palabras prohibidas en comentarios");
        System.out.println("7. Frecuencia de errores en log");
        System.out.println("8. Buscar elementos en un Set");
        System.out.println("9. Recorrer HashMap");

        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer después de nextInt

        switch (opcion) {
            case 1 -> eliminarDuplicados();
            case 2 -> ejercicioContarOcurrencias();
            case 3 -> buscarPalabrasProhibidas();
            case 4 -> invertirArray();
            case 5 -> emailDuplicados();
            case 6 -> eliminarPalabrasProhibidasComentarios();
            case 7 -> frecuenciaErroresLog();
            case 8 -> buscarElementosSet(sc); // Pasamos el scanner
            case 9 -> recorrerHashMap();
            default -> System.out.println("Opción no válida");
        }

        sc.close();
    }

    public static void eliminarDuplicados() {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList(
                "Josué","Jorge","Aitor","Héctor","Paula","María","Cristina","Carolina",
                "Carolina","Josué","Aitor","María"
        ));
        LinkedHashSet<String> nombresSinDuplicados = new LinkedHashSet<>(nombres);
        System.out.println(nombresSinDuplicados);
    }

    public static void ejercicioContarOcurrencias() {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(
                1,2,3,4,5,6,7,8,1,1,6,6,6,7,8,7,8,7,8
        ));
        HashMap<Integer, Integer> conteos = new HashMap<>();
        for (int numero : numeros) {
            int veces = conteos.getOrDefault(numero, 0);
            conteos.put(numero, veces + 1);
        }
        System.out.println(conteos);
    }

    public static void buscarPalabrasProhibidas() {
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList(
                "hola", "odio", "tonto", "buenas", "inútil", "quizás", "bobo"
        ));
        HashSet<String> palabrasProhibidas = new HashSet<>(Arrays.asList(
                "tonto","odio","inútil","bobo"
        ));
        for (String p : palabras) {
            if (palabrasProhibidas.contains(p)) {
                System.out.println("*".repeat(p.length()));
            } else {
                System.out.println(p);
            }
        }
    }

    public static void invertirArray() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void emailDuplicados() {
        ArrayList<String> emails = new ArrayList<>(Arrays.asList(
                "veveoveo@ejemplo.com","holaquetal@example.com","example@example.com",
                "imitadora@imitadora.com","veveoveo@ejemplo.com","holaquetal@example.com"
        ));
        HashSet<String> emailsSinDuplicados = new HashSet<>(emails);
        int eliminados = emails.size() - emailsSinDuplicados.size();
        System.out.println("Emails eliminados: " + eliminados);
        System.out.println("Emails restantes: " + emailsSinDuplicados.size());
        System.out.println("Emails únicos: " + emailsSinDuplicados);
    }

    public static void eliminarPalabrasProhibidasComentarios() {
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("hola","no","si","malo"));
        HashSet<String> palabrasCensuradas = new HashSet<>(Arrays.asList("no","malo"));
        for (String c : palabras) {
            if (palabrasCensuradas.contains(c)) {
                System.out.println("*".repeat(c.length()));
            } else {
                System.out.println(c);
            }
        }
    }

    public static void frecuenciaErroresLog() {
        ArrayList<String> errores = new ArrayList<>(Arrays.asList(
                "404","500","404","403","500","404","500","404"
        ));
        HashMap<String,Integer> conteos = new HashMap<>();
        for (String e : errores) {
            conteos.put(e, conteos.getOrDefault(e,0)+1);
        }
        for (Map.Entry<String,Integer> entry : conteos.entrySet()) {
            System.out.println("Error " + entry.getKey() + " aparece " + entry.getValue() + " veces.");
        }
    }

    // Ahora pasamos el Scanner desde main para evitar conflictos
    public static void buscarElementosSet(Scanner sc) {
        HashSet<String> frutas = new HashSet<>(Arrays.asList(
                "manzanas","peras","platano","sandias","melocotones"
        ));
        System.out.println("Introduce una fruta para buscar:");
        String busqueda = sc.nextLine().toLowerCase();
        if (frutas.contains(busqueda)) {
            System.out.println("La fruta " + busqueda + " está en el conjunto.");
        } else {
            System.out.println("La fruta " + busqueda + " NO está en el conjunto.");
        }
    }

    public static void recorrerHashMap() {
        HashMap<String,Integer> personas = new HashMap<>();
        personas.put("Ana M.",23);
        personas.put("Pedro F.",30);
        personas.put("Jose J.",18);
        personas.put("Aitor O.",60);
        for(Map.Entry<String,Integer> entry : personas.entrySet()) {
            System.out.println(entry.getKey() + " tiene " + entry.getValue() + " años.");
        }
    }
}
