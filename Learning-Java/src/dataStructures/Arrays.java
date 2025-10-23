package dataStructures;

public class Arrays {
    public static void main(String[] args) {

        /**
         * Valores por defecto en los arrays
         * En Java, cuando creamos un array de tipos primitivos sin asignar valores,
         * el propio lenguaje inicializa cada elemento con un valor por defecto:
         *
         * - int → 0
         * - double → 0.0
         * - boolean → false
         * - char → '\u0000' (carácter nulo)
         */

        // Declaración y creación de un array de enteros
        int[] numbers = new int[3];
        /**
         * Desglose:
         * int[]      → indica que será un array de enteros.
         * numbers     → es el nombre (referencia) del array.
         * new int[3]  → crea un nuevo array con espacio para 3 valores.
         *
         * Nota: los arrays en Java tienen un tamaño fijo.
         */
        System.out.println(numbers.length); // Muestra el tamaño del array (3).

        // Declaración y creación de un array con valores predefinidos
        String[] names = {"Jinming", "Programacion", "Ordenador"};
        System.out.println(names[0]); // Acceso al primer elemento (índice 0).

        /**
         * Diferencias entre declarar con y sin "new":
         *
         * - Si usamos "new", reservamos memoria para un número determinado de posiciones,
         *   pero todavía sin definir qué valores habrá dentro.
         *
         * - Si ya conocemos los valores, usamos directamente las llaves { }.
         *
         * Ejemplo:
         *   int[] numeros = new int[5];           // tamaño definido, sin valores.
         *   String[] textos = {"a", "b", "c"};    // tamaño e inicialización directa.
         */

        // Modificar datos dentro del array
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]); // Imprime 1
        System.out.println(numbers[1]); // Imprime 10

        // Ver el valor antes y después de modificarlo
        System.out.println(names[1]); // Antes: "Programacion"
        names[1] = "programador@senior.com";
        System.out.println(names[1]); // Después: "programador@senior.com"

        /**
         * Importante:
         * Si intentas acceder o asignar un valor fuera del rango definido,
         * Java lanzará un error "ArrayIndexOutOfBoundsException".
         *
         * Ejemplo (esto falla):
         * numbers[3] = 2; // El array tiene posiciones 0, 1 y 2 → índice 3 no existe.
         */

        /**
         * Eliminar o vaciar un elemento
         * Los arrays en Java tienen tamaño fijo, por lo que no se pueden eliminar elementos.
         *
         * Lo que sí se puede hacer es “vaciar” una posición asignándole null,
         * pero solo si el array es de objetos (como String), no de tipos primitivos.
         *
         * null significa que esa posición no apunta a ningún valor en memoria.
         */
        System.out.println(names[0]); // "Jinming"
        names[0] = null;
        System.out.println(names[0]); // Ahora imprime "null"

        // numbers[2] = null; Esto causaría error porque int es un tipo primitivo.

        // Creación de un array booleano
        boolean[] booleanos = new boolean[6];
        System.out.println(booleanos[5]); // Imprime "false" (valor por defecto)
    }
}
