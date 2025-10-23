package controlFlow;
import java.util.*;
import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona el tipo de bucle que quieras ejecutar:");
        System.out.println("1. For tradicional (clásico)");
        System.out.println("2. For-each");
        System.out.println("3. While / Do While");
        System.out.println("4. Control de bucle");

        int seccion = sc.nextInt();

        switch (seccion) {
            case 1 -> forTradicional(sc);
            case 2 -> forEach();
            case 3 -> whileDoWhile();
            case 4 -> controlBucle();
            default -> System.out.println("Error. Opción no válida");
        }

        sc.close(); // Cerramos el Scanner al final del programa
    }

    /*
     * ===============================
     * BUCLE FOR TRADICIONAL
     * ===============================
     * El bucle "for" se usa cuando conocemos de antemano cuántas veces queremos repetir una acción.
     * Su estructura consta de:
     *   1️⃣ Inicialización → variable de control
     *   2️⃣ Condición → hasta cuándo se repite
     *   3️⃣ Actualización → incremento o decremento
     */
    public static void forTradicional(Scanner sc) {
        // Ejemplo simple: imprimir un mensaje 5 veces
        for (int i = 0; i < 5; i++) {
            System.out.println("Holaaaaa");
        }

        // Recorrer un ArrayList usando for tradicional
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("HolaA", "HolaB", "HolaC", "HolaD"));
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre en la lista: " + nombres.get(i));
        }

        // Recorrer un array normal
        String[] apellidos = {"Lopez", "De León", "Suárez", "Fiestas", "Jaizme"};
        System.out.println("Cantidad de apellidos: " + apellidos.length);
        for (int i = 0; i < apellidos.length; i++) {
            System.out.println("Apellido: " + apellidos[i]);
        }

        // Bucle con decremento (de 5 a 0)
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
        }

        // Invertir una palabra introducida por el usuario
        System.out.println("Dame una palabra: ");
        sc.nextLine(); // Limpia el buffer
        String palabra = sc.nextLine();
        String palabraInvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
    }

    /*
     * ===============================
     * BUCLE FOR-EACH
     * ===============================
     * Este tipo de bucle se utiliza cuando queremos recorrer todos los elementos
     * de una colección (array, lista, set, mapa...) sin preocuparnos del índice.
     * Es más limpio y menos propenso a errores.
     */
    public static void forEach() {
        // Array de String
        String[] apellidos = {"Lopez", "De León", "Suárez", "Fiestas", "Jaizme"};
        for (String a : apellidos) {
            System.out.println(a);
        }

        // Set de Integer
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int n : numbers) {
            System.out.println(n);
        }

        // HashMap (clave → valor)
        HashMap<String, String> email = new HashMap<>(Map.of(
                "Alvaro", "alvaro@gmail.com",
                "Pedro", "pedro@gmail.com",
                "Adrián", "adrian@gmail.com",
                "Paula", "paula@gmail.com"
        ));
        for (Map.Entry<String, String> e : email.entrySet()) {
            System.out.println("Nombre: " + e.getKey() + " - Email: " + e.getValue());
        }
    }

    /*
     * ===============================
     * BUCLES WHILE Y DO-WHILE
     * ===============================
     * Ambos se utilizan cuando NO sabemos exactamente cuántas veces se repetirá
     * una acción, pero queremos que se repita MIENTRAS se cumpla una condición.
     *
     * WHILE: evalúa la condición ANTES de ejecutar el bloque.
     * DO-WHILE: ejecuta el bloque al menos UNA VEZ, y luego evalúa la condición.
     */
    public static void whileDoWhile() {
        // Ejemplo básico con while
        int ejemplo = 0;
        while (ejemplo < 5) {
            System.out.println("Iteración " + ejemplo);
            ejemplo++;
        }

        // Otro ejemplo
        int index = 0;
        while (index <= 5) {
            System.out.println("Hola Java! " + index);
            index++;
        }

        /*
         * Bucle DO-WHILE:
         * Primero ejecuta el bloque, luego verifica la condición.
         * Es útil cuando queremos asegurarnos de que el bloque se ejecute al menos una vez.
         */
        int doWhileEjemplo = 0;
        do {
            System.out.println("Iteración (do-while): " + doWhileEjemplo);
            doWhileEjemplo++;
        } while (doWhileEjemplo <= 0);

        /*
         * Comparación entre WHILE y DO-WHILE
         * En este ejemplo, el bucle while no se ejecutará porque la condición inicial es falsa.
         * En cambio, el do-while sí se ejecutará una vez antes de comprobar la condición.
         */
        System.out.println("_______________________");
        System.out.println("Ejemplo de diferencia");
        System.out.println("_______________________");

        int numero = 10;

        // WHILE
        while (numero < 5) {
            System.out.println("Bucle while. Iteración " + numero);
        }

        // DO-WHILE
        do {
            System.out.println("Bucle do-while. Iteración " + numero);
            numero++;
        } while (numero < 5);
    }

    // Control de bucle
    public static void controlBucle() {

        /*
        Dentro de los bucles queremos tener cierto control de lo que pasa ahí dentro. Para ello existen diferentes tipos de controles:
         */
        // - break
        String[] apellidos = {"Lopez", "De León", "Suárez", "Fiestas", "Jaizme"};
        for (String a : apellidos) {
            /**
             * Dentro del bucle for-each podemos añadir otro bucle.
             * En este caso el if
             * Lo que haremos será que una vez que llegue a determinado valor, el bucle tenga que pausar y salir, en este caso lo ideal será usar el break.
             *
             */
            if (a.equals("Fiestas")) {
                break;
            }
            System.out.println(a);
        }

        // - continue
        /**
         * También existe otro tipo de control, que es el continue.
         * Este es lo opuesto de break.
         * Con continue, vamos a poder hacer que una vez que llegue en x valor o elementos, este se salte ese x valor, pero en vez de detenerse como en break, lo que hará será continuar sin tener en cuenta el valor x
         */
        for (int i = 5; i >= 0; i--) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}

