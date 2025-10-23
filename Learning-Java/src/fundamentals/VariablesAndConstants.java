package fundamentals;

public class VariablesAndConstants {
    public static void main(String[] args) {

        // -----------------------------
        // Declaración de variables
        // -----------------------------
        String name = "Jinming"; // Declaramos una variable de tipo String
        System.out.println(name);

        // Modificar el valor de la variable
        name = "JinmingDev";
        System.out.println(name);

        // name = 37; // ERROR: No se puede cambiar el tipo de dato de la variable

        // -----------------------------
        // Tipos de datos primitivos
        // -----------------------------
        int age = 20; // Número entero
        System.out.println(age);

        // -----------------------------
        // Constantes
        // -----------------------------
        // Se usa 'final' para declarar una constante que no se puede modificar.
        // Convención: escribir constantes en mayúsculas para distinguirlas.
        final String EMAIL = "example@example1.com";
        // EMAIL = "bravo@bravo1.com"; // ERROR: No se puede modificar una constante
        System.out.println(EMAIL);

        // -----------------------------
        // Uso de 'var' (tipo inferido)
        // -----------------------------
        // Java infiere el tipo de dato según el valor que se asigna
        var email = "example@example.com";
        System.out.println(email);

        // email = 20; // ERROR: Java es de tipado fuerte, no se puede asignar un tipo distinto

        var year = 2025; // Java infiere que 'year' es int
        System.out.println(year);
    }
}
