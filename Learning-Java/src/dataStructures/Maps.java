package dataStructures;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        // HashMap: estructura de datos que guarda información en pares clave-valor.
        // Es similar a un diccionario.

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>(); // Clave y valor como Strings
        var numbers = new HashMap<Integer, String>(); // El compilador deduce los tipos

        // Tamaño
        System.out.println("Tamaño inicial: " + names.size());

        // Añadir elementos
        names.put("Jinming", "programadorJunior");
        names.put("Pablo","especialistaEnFrontEnd");
        names.put("Aitana","especialistaEnRedes");

        System.out.println("Tamaño después de añadir elementos: " + names.size());
        System.out.println(names);

        // Acceder a elementos mediante la clave
        System.out.println("Valor de Jinming: " + names.get("Jinming"));
        System.out.println("Valor de Dev (no existe): " + names.get("Dev")); // Devuelve null

        // Verificar existencia de claves
        System.out.println("Contiene clave 'Jinming'? " + names.containsKey("Jinming"));
        System.out.println("Contiene clave 'Dev'? " + names.containsKey("Dev"));

        // Eliminar elementos
        names.remove("Jinming"); // Elimina la clave y su valor asociado
        System.out.println(names);

        // Limpiar todo el HashMap
        names.clear();
        System.out.println("HashMap después de limpiar: " + names);

        // Comprobar si está vacío
        if (names.isEmpty()) {
            System.out.println("El HashMap está vacío");
        }

        // Trabajando con claves y valores
        numbers.put(1, "Primero");
        numbers.put(2, "Segundo");
        numbers.put(3, "Tercero");
        numbers.put(4, "Cuarto");
        numbers.put(5, "Quinto");

        // Obtener todas las claves
        for (Integer key : numbers.keySet()) {
            System.out.println("Clave: " + key);
        }

        // Obtener todos los valores
        for (String value : numbers.values()) {
            System.out.println("Valor: " + value);
        }

        // Recorrer clave-valor con entrySet
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue());
        }

        // Modificar elementos
        var paisCapital = new HashMap<String, String>();
        paisCapital.put("España","Madrid");
        paisCapital.put("Portugal","Lisboa");
        paisCapital.put("Francia", "Paris");
        paisCapital.put("Italia","Roma");
        paisCapital.put("Alemania","Berlin");
        paisCapital.put("Bolivia", "Sucre");

        // Mostrar todos los países y capitales
        for (Map.Entry<String, String> entry : paisCapital.entrySet()) {
            System.out.println("País: " + entry.getKey() + " | Capital: " + entry.getValue());
        }

        // Cambiar la capital de Bolivia
        paisCapital.put("Bolivia","La Paz");
        System.out.println("------------------------------------");
        for (Map.Entry<String, String> entry : paisCapital.entrySet()) {
            System.out.println("País: " + entry.getKey() + " | Capital: " + entry.getValue());
        }

        // putIfAbsent(): añade solo si la clave no existe
        paisCapital.putIfAbsent("Nueva Zelanda","Wellington");

        // replace(): modifica solo si la clave existe
        paisCapital.replace("Bolivia", "Sucre");
        System.out.println("Contiene la capital 'Sucre'? " + paisCapital.containsValue("Sucre"));

        // getOrDefault(): devuelve un valor por defecto si la clave no existe
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 30);
        edades.put("Miguel", 40);

        System.out.println("Edad de Ana: " + edades.getOrDefault("Ana", 0)); // 30
        System.out.println("Edad de Carlos: " + edades.getOrDefault("Carlos", 0)); // 0
    }
}

