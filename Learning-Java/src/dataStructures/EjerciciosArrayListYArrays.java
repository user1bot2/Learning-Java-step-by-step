package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosArrayListYArrays {
    public static void main(String[] args) {

        // ===============================
        // EJERCICIOS CON ARRAYS
        // ===============================

        // Crear un array de 5 nombres
        String[] nombres = {"Ana", "Luis", "Carla", "Pedro", "Marta"};

        // Mostrar los nombres usando un bucle for
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
        }

        // ===============================
        // SUMA DE ELEMENTOS EN UN ARRAY
        // ===============================

        // Crear un array de números
        int[] numeros = {1, 2, 3, 4};

        // Sumar los elementos usando un bucle for-each
        int sumaTotal = 0;
        for (int num : numeros) {
            sumaTotal += num; // Equivalente a sumaTotal = sumaTotal + num
        }
        System.out.println("Suma total: " + sumaTotal);

        // ===============================
        // EJERCICIOS CON ARRAYLIST
        // ===============================

        // Crear y mostrar un ArrayList de frutas
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Plátano");
        frutas.add("Fresa");

        // Recorrer el ArrayList con for-each
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // ===============================
        // AÑADIR Y ELIMINAR ELEMENTOS EN UN ARRAYLIST
        // ===============================

        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);

        System.out.println("Lista original: " + enteros);

        // Eliminar el segundo elemento (índice 1)
        enteros.remove(1);
        System.out.println("Lista después de eliminar el segundo elemento: " + enteros);

        // ===============================
        // BUSCAR ELEMENTOS EN UN ARRAYLIST
        // ===============================

        ArrayList<String> nombresUser = new ArrayList<>();
        nombresUser.add("Pedro");
        nombresUser.add("Juan");
        nombresUser.add("Camilo");
        nombresUser.add("Carla");
        nombresUser.add("María");
        nombresUser.add("Cristina");

        System.out.println("Nombres en la lista: " + nombresUser);

        // Pedir al usuario un nombre y verificar si está en la lista
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre para verificar si está en la lista: ");
        String nombreLista = sc.nextLine();

        if (nombresUser.contains(nombreLista)) {
            System.out.println("El nombre " + nombreLista + " está en la lista.");
        } else {
            System.out.println("El nombre " + nombreLista + " no está en la lista.");
        }

        sc.close();
    }
}

