package exercises;

import java.util.*;

public class InterviewExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el ejercicio que quieras ejecutar: ");
        System.out.println("1. Suma todos los elementos de un array de entero.");
        System.out.println("2. Encuentra el número mayor en un array.");
        System.out.println("3. Imverte una cadena de texto.");
        System.out.println("4. Determina si una palabra es un palíndromo.");
        System.out.println("5. Cuenta las vocales en una cadena.");
        System.out.println("6. Imprime números del 1 al 100, pero... múltiplos de 3 = “Fizz”, de 5 = “Buzz”, de ambos = “FizzBuzz”.");
        System.out.println("7. Calcula el factorial de un número dado.");
        System.out.println("8. Cuenta cuántos número pares e impares hay en un array.");
        int ejercicio = sc.nextInt();

        switch (ejercicio) {
            case 1 -> sumaTodosElementosArrayEntero();
            case 2 -> encontrarNumeroMayorArray();
            case 3 -> invertirCadenaTexto(sc);
            case 4 -> determinarPalabraPalindromo(sc);
            case 5 -> contarVocales(sc);
            case 6 -> imprimirNum1al100();
            case 7 -> calcularFactorialNumero(sc);
            case 8 -> contarNumeroParImpar(sc);
            default -> System.out.println("Opción inválida.");
        }
    }

    public static void sumaTodosElementosArrayEntero() {
    /*
    Hint
    Usa un for tradicional o un for-each. Guarda la suma en una variable acumuladora.
     */
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        // Queremos inicializar la variblae con cero, esto para que luego al sumar pueda contener un nuevo variable.
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println(suma);
    }


    public static void encontrarNumeroMayorArray() {
        /*
        Hint
        Compara cada elemento con una variable max. Inicialízala con el primer valor del array
         */
        int[] numeros = {1,34,5,56,2,90,5,100};
        // Vamos a iniciar con el primer elemento del array en caso de que haya un número negativo.
        int max = numeros[0];
        // Usaremos el bucle for each para recorrer los índices de numeros
        for (int n : numeros) {
            // Quiero comparar si es max mayor o no que n
            if (max < n) {
                max = n;
            }
        }
        // Imprimir resultados por pantalla
        System.out.println("El número más grande es " + max);
    }


    public static void invertirCadenaTexto(Scanner sc) {
        /*
        Hint.
        Usa un bucle for desde el final hacia el principio y concatena los caracteres.
         */
        sc.nextLine(); // Limpiar de buffer
        // Pedir datos al usuario
        System.out.println("Dame una palabra: ");
        String palabra = sc.nextLine();
        // Crear una variable String vacía, para que luego podemos sumar con otro String
        String palabraInvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            // Sumar el nuevo texto invertido con nuestra cadena, como nuestra cadena inicialmente no lleva nada es decir 0, entonces no interfiere en nada.
            palabraInvertida += palabra.charAt(i);
        }
        // Imprirmir datos por pantalla
        System.out.println("Tu palabra es " + palabra + " y esta es la palabra invertida: " + palabraInvertida);
    }


    public static void determinarPalabraPalindromo(Scanner sc) {
        /*
        Hint.
        Compara el string con su versión invertida ignorando mayúsculas.
         */
        sc.nextLine(); // Limpieza buffer
        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();

        // Normalizar, queremos que las palabras sean todas en minúsculas
        String palabraMinuscula = palabra.toLowerCase();
        boolean palabraPolindromo = true;

        // Comparamos desde los extremos hacia el centro
        int longitud = palabraMinuscula.length();
        for (int i = 0; i < longitud / 2; i++ ) {
            if(palabraMinuscula.charAt(i) !=palabraMinuscula.charAt(longitud - 1 - i)) {
                palabraPolindromo = false;
                break;
            }
        }

        // Mostrar el resultado
        if (palabraPolindromo) {
            System.out.println("La " + palabra + " es un políndromo.");
        } else {
            System.out.println("La " + palabra + " no es un políndromo.");
        }
    }


    public static void contarVocales(Scanner sc) {
        /*
        Hint.
        Recorre cada carácter de la cadena y comprueba si es una vocal (a, e, i, o, u).
        Convierte la cadena a minúsculas para simplificar la comparación.
     */
        // Pedir datos al usuario
        System.out.println("Dame una palabra: ");
        sc.nextLine(); // Limpiar buffer
        String palabra = sc.nextLine();
        // Hacer que los datos que introduzca se convierta en minúscular
        palabra = palabra.toLowerCase();
        // Declarar el conteo de vocales y lo inializamos antes de entrar al bucle
        int vocales = 0;
        // Usar un bucle for tradicional para recorrer los carácteres
        for (int i = 0; i < palabra.length(); i++) {
            // Hacer que los datos se guarden en la variable character
            char character = palabra.charAt(i);
            // Que pasaría sí es vocal
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                // Se hace un vocales += 1;
                vocales++;
                System.out.println("Es vocal: " + character);
            } else {
                System.out.println("No es vocal: " + character);
            }

        }
        // Imprimir resultados por pantalla
        System.out.println("En total la palabra " + palabra + " tiene " + vocales + " vocales.");
    }




    public static void imprimirNum1al100() {
        /*
        Hint.
        Usa un bucle for del 1 al 100.
        Si el número es múltiplo de 3, imprime “Fizz”; si es múltiplo de 5, imprime “Buzz”;
        si es múltiplo de ambos (3 y 5), imprime “FizzBuzz”.
        En caso contrario, imprime el número.
         */

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }


    public static void calcularFactorialNumero(Scanner sc) {
        /*
        Ejemplo 5! = 5 × 4 × 3 × 2 × 1 = 120
         */
        int numero, resultado;
        System.out.println("Dame un número entero (no sirve negativos): ");
        numero = sc.nextInt();
        // Queremos que el primer número se multiplique por uno, así no cambia el resultado. Luego podemos guardar el total en la variable resultado
        resultado = 1;

        // Bucle para comprobar si es número positivo
        if (numero > 0) {
            for (int i = numero; i > 0; i-- ) {
                resultado *= i;
            }
            System.out.println("Resultado de tu número " + numero + "! es " + resultado);
            // Comprobar si es número 0
        } else if (numero == 0) {
            System.out.println("El factorial de 0! es 1.");
            // Comprobar si es número negativo
        } else {
            System.out.println("Es inválido ingresar números negativos");
        }
    }


    public static void contarNumeroParImpar(Scanner sc) {
        // Declarar variablee
        int numero;
        // Pedir datos al usuario
        System.out.println("Dame un número: ");
        numero = sc.nextInt();
        // Bucle para recorrer los número y determinar si es par o impar
        for (int i = 1; i <= numero ; i ++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par.");
            } else {
                System.out.println(i + " impar.");
            }
        }
    }
}

