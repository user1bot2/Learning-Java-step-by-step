package dataStructures;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

        // ===============================
        // CREAR Y DECLARAR ARRAYLIST
        // ===============================

        // Declaración explícita
        ArrayList<String> names = new ArrayList<>();

        // Declaración implícita usando var
        var numbers = new ArrayList<Integer>();
        // Es lo mismo que: ArrayList<Integer> numbers = new ArrayList<>();

        // Tamaño inicial (por defecto es 0)
        System.out.println("Tamaño inicial: " + names.size());

        // ===============================
        // AÑADIR ELEMENTOS
        // ===============================

        names.add("Jinming");
        names.add("PROGRAMADORJAVA");
        names.add("ordenador");

        System.out.println("Tamaño después de añadir elementos: " + names.size());

        // ===============================
        // ACCEDER A ELEMENTOS
        // ===============================

        // Primer elemento
        System.out.println("Primer elemento: " + names.get(0));

        // Segundo elemento
        System.out.println("Segundo elemento: " + names.get(1));

        // Último elemento
        System.out.println("Último elemento: " + names.get(names.size() - 1));

        // ===============================
        // MODIFICAR ELEMENTOS
        // ===============================

        names.set(1, "nuevoElemento"); // Cambiamos el segundo elemento
        System.out.println("Elemento modificado: " + names.get(1));

        // ===============================
        // ELIMINAR ELEMENTOS
        // ===============================

        names.remove(2); // Eliminamos el tercer elemento
        System.out.println("Tamaño después de eliminar: " + names.size());

        // ===============================
        // BUSCAR ELEMENTOS
        // ===============================

        System.out.println("Contiene 'Jinming'? " + names.contains("Jinming")); // true
        System.out.println("Contiene 'ordenador'? " + names.contains("ordenador")); // false

        // ===============================
        // LIMPIAR LISTA
        // ===============================

        names.clear();
        System.out.println("Tamaño después de limpiar: " + names.size()); // 0
    }
}
