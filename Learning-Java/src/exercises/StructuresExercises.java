package exercises;

import java.util.*;
import java.util.Arrays;

public class StructuresExercises {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige el ejercicio que quieras ejecutar: ");
        System.out.println("1. Crea un Array con 5 valores e imprime su longitud.");
        System.out.println("2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.");
        System.out.println("3. Crea un ArrayList vacío.");
        System.out.println("4. Añade 4 valores al ArrayList y elimina uno a continuación.");
        System.out.println("5. Crea un HashSet con 2 valores diferentes.");
        System.out.println("6. Añade un nuevo valor repetido y otro sin repetir al HashSet.");
        System.out.println("7. Elimina uno de los elementos del HashSet.");
        System.out.println("8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.");
        System.out.println("9. Modifica uno de los contactos y elimina otro.");
        System.out.println("10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.");
        System.out.print("Introduce tu número por favor: ");

        number = sc.nextInt();

        switch (number) {
            case 1 -> crearArray5valores();
            case 2 -> modificarArray();
            case 3 -> arrayVacio();
            case 4 -> eliminandoValorEnArraylist();
            case 5 -> crear2ValoresDiferentesEnHashSet();
            case 6 -> valorRepetidoYValorNoRepetido();
            case 7 -> eliminarElementosEnHashSet();
            case 8 -> crearContactosEnHashMap();
            case 9 -> modificarUnoDeLosContactos();
            case 10 -> transformarTiposDeEstructura();
            default -> System.out.println("No existe este ejercicio");
        }
        sc.close();
    }

    // 1. Crear un Array con 5 valores e imprimir su longitud
    public static void crearArray5valores() {
        String[] arrayValor = {"Yo", "Jinming", "Jose", "Josue", "Pedro"};
        System.out.println("Longitud del Array: " + arrayValor.length);
    }

    // 2. Modificar un valor del Array e imprimir antes y después
    public static void modificarArray() {
        String[] arrayValor = {"Yo", "Jinming", "Jose", "Josue", "Pedro"};

        System.out.println("Antes de modificar:");
        for (String valor : arrayValor) {
            System.out.println(valor);
        }

        arrayValor[0] = "Tu"; // Modificación del primer valor

        System.out.println("Después de modificar:");
        for (String valor : arrayValor) {
            System.out.println(valor);
        }
    }

    // 3. Crear un ArrayList vacío
    public static void arrayVacio() {
        ArrayList<String> vacio = new ArrayList<>();
    }

    // 4. Añadir 4 valores al ArrayList y eliminar uno
    public static void eliminandoValorEnArraylist() {
        ArrayList<String> paises = new ArrayList<>(Arrays.asList("España", "México", "China", "Guatemala"));
        paises.remove(3); // Eliminamos "Guatemala"
        System.out.println(paises);
    }

    // 5. Crear un HashSet con 2 valores diferentes
    public static void crear2ValoresDiferentesEnHashSet() {
        HashSet<String> diferentes = new HashSet<>();
        diferentes.add("Hola");
        diferentes.add("Adiós");
        System.out.println(diferentes);
    }

    // 6. Añadir un valor repetido y otro sin repetir al HashSet
    public static void valorRepetidoYValorNoRepetido() {
        HashSet<String> valores = new HashSet<>();
        valores.add("Hola");       // Valor repetido, solo se guarda una vez
        valores.add("Hola");
        valores.add("NoRepetido"); // Valor único
        System.out.println(valores);
    }

    // 7. Eliminar un elemento del HashSet
    public static void eliminarElementosEnHashSet() {
        HashSet<String> diferentes = new HashSet<>();
        diferentes.add("Hola");
        diferentes.add("Adiós");
        System.out.println("Antes de eliminar: " + diferentes);

        diferentes.remove("Adiós"); // Eliminamos un elemento
        System.out.println("Después de eliminar: " + diferentes);
    }

    // 8. Crear un HashMap con nombres y números de teléfono
    public static void crearContactosEnHashMap() {
        HashMap<String, Integer> agenda = new HashMap<>();
        agenda.put("Franklin", 123456789);
        agenda.put("Michael", 1111234567);
        agenda.put("Trevor", 678912345);

        for (Map.Entry<String, Integer> contacto : agenda.entrySet()) {
            System.out.println("Contacto: " + contacto.getKey() + ", Teléfono: " + contacto.getValue());
        }
    }

    // 9. Modificar un contacto y eliminar otro en el HashMap
    public static void modificarUnoDeLosContactos() {
        HashMap<String, Integer> agenda = new HashMap<>();
        agenda.put("Franklin", 123456789);
        agenda.put("Michael", 1111234567);
        agenda.put("Trevor", 678912345);

        System.out.println("Agenda antes de modificaciones:");
        agenda.forEach((nombre, numero) -> System.out.println("Contacto: " + nombre + ", Teléfono: " + numero));

        agenda.replace("Franklin", 1111232324); // Modificar número de Franklin
        agenda.remove("Trevor");                // Eliminar a Trevor

        System.out.println("Agenda después de modificaciones:");
        agenda.forEach((nombre, numero) -> System.out.println("Contacto: " + nombre + ", Teléfono: " + numero));
    }

    // 10. Transformar un Array en ArrayList, HashSet y HashMap
    public static void transformarTiposDeEstructura() {
        String[] nombresArray = {"Peter", "María", "Macchiato"};

        // ArrayList
        ArrayList<String> nombresList = new ArrayList<>(Arrays.asList(nombresArray));

        // HashSet (elimina duplicados)
        HashSet<String> nombresSet = new HashSet<>(nombresList);

        // HashMap con clave y valor iguales
        HashMap<String, String> nombresMap = new HashMap<>();
        for (String nombre : nombresSet) {
            nombresMap.put(nombre, nombre);
        }

        System.out.println(nombresMap);
    }
}
