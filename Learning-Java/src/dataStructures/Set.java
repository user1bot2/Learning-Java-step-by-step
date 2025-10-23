package dataStructures;

import java.util.*;

public class Set {
    public static void main(String[] args) {

        // =========================
        // HASHSET
        // =========================
        // HashSet almacena elementos únicos, sin orden garantizado.
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño inicial
        System.out.println(names.size()); // 0 porque está vacío

        // Añadir elementos
        names.add("Jinming");
        names.add("PROGRAMADORJAVA");
        names.add("ordenador");
        System.out.println(names.size()); // 3 elementos

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminar elementos (no necesitamos índice, solo valor)
        names.remove("ordenador");
        System.out.println(names.size()); // 2

        // Buscar elementos
        System.out.println(names.contains("Jinming"));   // true
        System.out.println(names.contains("ordenador")); // false

        // Intentar añadir elementos duplicados
        names.add("Jinming");
        names.add("Jinming");
        System.out.println(names); // Se mantiene único: ["Jinming", "PROGRAMADORJAVA"]

        // Combinar sets
        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Estados Unidos");
        countries.add("China");

        names.addAll(countries); // Añade todos los elementos de countries a names
        System.out.println(names);

        // names.retainAll(countries); // Mantiene solo los elementos comunes
        // names.removeAll(countries); // Elimina los elementos de countries en names

        // =========================
        // LINKEDHASHSET
        // =========================
        // Similar a HashSet pero mantiene el orden de inserción
        System.out.println("LinkedHashSet");
        LinkedHashSet<String> ciudades = new LinkedHashSet<>();
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");

        ciudades.add("Madrid"); // No se añade, ya existe

        // Mostrar contenido (mantiene orden de inserción)
        System.out.println(ciudades); // [Madrid, Barcelona, Valencia, Sevilla]

        // Eliminar elemento
        ciudades.remove("Valencia");
        System.out.println(ciudades); // [Madrid, Barcelona, Sevilla]

        // Buscar elemento
        System.out.println(ciudades.contains("Sevilla")); // true
        System.out.println(ciudades.contains("Valencia")); // false

        // Tamaño
        System.out.println("Tamaño: " + ciudades.size());

        // =========================
        // TREESET
        // =========================
        // TreeSet almacena elementos únicos y ordenados automáticamente.
        // No permite null porque necesita comparar elementos.
        System.out.println("TreeSet");
        TreeSet<String> frutas = new TreeSet<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Fresa");

        frutas.add("Banana"); // No se añade, ya existe

        // Mostrar elementos (ordenados alfabéticamente)
        System.out.println(frutas); // [Banana, Fresa, Manzana, Pera]

        // Eliminar elemento
        frutas.remove("Pera");
        System.out.println(frutas); // [Banana, Fresa, Manzana]

        // Buscar elemento
        System.out.println(frutas.contains("Fresa")); // true
        System.out.println(frutas.contains("Pera"));  // false

        // Tamaño
        System.out.println("Tamaño: " + frutas.size());
    }
}

