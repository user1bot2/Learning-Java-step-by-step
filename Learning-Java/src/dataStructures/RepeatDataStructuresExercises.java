package dataStructures;

import java.util.*;
import java.util.Arrays;

public class RepeatDataStructuresExercises {
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
    }

    // 1. Eliminar duplicados
    public static void eliminarDuplicados() {
        ArrayList<String> nombres = new ArrayList<>(java.util.Arrays.asList(
                "Josué","Jorge","Aitor","Héctor","Paula","María","Cristina","Carolina",
                "Carolina","Josué","Aitor","María"
        ));
        // Vamos a convertir este ArrayList en un HashSet
        HashSet<String> nombresSinDuplicados = new HashSet<>(nombres);
        System.out.println("Aquí está la lista de nombres: " + nombresSinDuplicados);
    }

    // 2. Contar ocurrencias
    public static void ejercicioContarOcurrencias() {
        ArrayList<Integer> numeros = new ArrayList<>(java.util.Arrays.asList(
                1,2,3,4,5,6,7,8,1,1,6,6,6,7,8,7,8,7,8
        ));
        HashMap<Integer,Integer> conteoPorNumero = new HashMap<>();
        for(int numero : numeros) {
            int vecesVistas = conteoPorNumero.getOrDefault(numero, 0);
            conteoPorNumero.put(numero, vecesVistas + 1);
        }
        System.out.println(conteoPorNumero);

        ArrayList<String> nombres = new ArrayList<>(java.util.Arrays.asList(
                "Josué","Jorge","Aitor","Héctor","Paula","María","Cristina","Carolina",
                "Carolina","Josué","Aitor","María","Pol"
        ));
        HashMap<String,Integer> conteoNombre = new HashMap<>();
        for (String nombre : nombres) {
            // Obtiene cuántas veces ya hemos visto este nombre (0 si es la primera vez)
            int vecesVistas2 = conteoNombre.getOrDefault(nombre, 0);
            // Guarda el nuevo conteo; una vez más que antes
            conteoNombre.put(nombre, vecesVistas2 + 1);
        }

        System.out.println(conteoNombre);
    }


    // 3. Buscar palabras prohibidas
    public static void buscarPalabrasProhibidas() {
        ArrayList<String> palabras = new ArrayList<>(java.util.Arrays.asList(
                "hola", "odio", "tonto", "buenas", "inutil", "quizás", "bobo"
        ));
        // Creamos las palabras prohibidas en con un HashSet
        HashSet<String> palabrasProhibidas = new HashSet<>(java.util.Arrays.asList(
                "odio", "tonto", "inutil", "bobo"
        ));
        for (String p : palabras) {
            if (palabrasProhibidas.contains(p)) {
                System.out.println("*".repeat(p.length()));
            } else {
                System.out.println(p);
            }
        }

    }

    // 4. Invertir array
    public static void invertirArray() {
        int[] numeros = {
                1,2,3,4,5,6,7,8,9
        };

        // Quiero ordenar en una sola String
        StringBuilder sb = new StringBuilder();
        sb.append("Los números invertidos serán de: ");
        // Invertir un array
        for (int i = numeros.length; i > 0; i--) {
            // Guardar los valores en sb
            sb.append(i);
            if (i > 1) {
                // Si i llega a 1 entonces deja de imprimir comas y espacios después de cada número
                sb.append(", ");
            }
        }
        String texto = sb.toString();
        System.out.println(texto);
    }

    // 5. Email duplicados
    public static void emailDuplicados() {
        ArrayList<String> email = new ArrayList<>(java.util.Arrays.asList(
                "veveoveo@ejemplo.com","holaquetal@example.com","example@example.com",
                "imitadora@imitadora.com","veveoveo@ejemplo.com","holaquetal@example.com"
        ));
        HashSet<String> emailSinDuplicados = new HashSet<>(email);
        // Queremos ver cuántos se han eliminado
        int eliminados = email.size() - emailSinDuplicados.size();
        System.out.println("Estas fueron las cantidades que se eliminaron: " + eliminados);
        System.out.println("Estos son los emails que no son duplicados: " + emailSinDuplicados);
    }

    // 6. Eliminar palabras prohibidas en comentarios
    public static void eliminarPalabrasProhibidasComentarios() {
        ArrayList<String> palabras = new ArrayList<>(java.util.Arrays.asList(
                "Hola", "odio", "el", "tráfico"
        ));
        HashSet<String> prohibidas = new HashSet<>(java.util.Arrays.asList(
                "odio", "tonto"
        ));
        // Usando un StringBuilder podemos hacer una frase
        StringBuilder sb = new StringBuilder();

        for (String p : palabras) {
            // Usaremos un ! negación para que NO imprima las palabras que coincidan
            if (!prohibidas.contains(p)) {
                sb.append(p).append(" ");
            }
        }
        String frase = sb.toString().trim();
        System.out.println(frase);
    }

    // 7. Frecuencia de errores en log
    public static void frecuenciaErroresLog() {
        ArrayList<String> errores = new ArrayList<>(java.util.Arrays.asList(
                "404","500","404","403","500","404","500","404","404","500","404","403","500","404","500","404","404","500","404","403","500","404","500","404"
        ));
        HashMap<String,Integer> conteos = new HashMap<>();
        for(String e : errores) {
            int vecesVistos = conteos.getOrDefault(e, 0);
            conteos.put(e, vecesVistos + 1);
        }
        // System.out.println(conteos);. Echando un vistazo si todo va bien.
        for (Map.Entry<String, Integer> c : conteos.entrySet()) {
            System.out.println("Se encontraron los errores " + c.getKey() + " y las veces que se repitieron " + c.getValue());
        }
    }

    // 8. Buscar elementos en un Set
    public static void buscarElementosSet(Scanner sc) {
        HashSet<String> fruta = new HashSet<>(Arrays.asList(
                "manzana", "pera", "plátano", "melocotón", "fresa", "uvas"
        ));
        // Pedir al usuario el dato
        System.out.println("Introduce la fruta que quieras buscar: ");
        String frutaBuscar = sc.nextLine();
        // Hacer que los datos que se introduzcan sean todos en minúsculas
        frutaBuscar = frutaBuscar.toLowerCase();
        if (fruta.contains(frutaBuscar)) {
            System.out.println("Está dentro " + frutaBuscar);
        } else {
            System.out.println("No está dentro " + frutaBuscar);
        }
    }

    // 9. Recorrer HashMap
    public static void recorrerHashMap() {
        HashMap<String,Integer> personas = new HashMap<>();
        personas.put("Ana M.",23);
        personas.put("Pedro F.",30);
        personas.put("Jose J.",18);
        personas.put("Aitor O.",60);
        for (Map.Entry<String, Integer> entry : personas.entrySet()) {
            System.out.println("Nombre y apellido: " + entry.getKey() + " edad: " + entry.getValue());
        }
    }
}
