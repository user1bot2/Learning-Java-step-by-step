package fundamentals;

public class DataTypes {
    public static void main(String[] args) {

        // Tipos de datos primitivos en Java

        // Entero
        int myInt = 20;
        System.out.println(myInt);

        // Número decimal (double tiene más precisión que float)
        double myDouble = 20.1111111111111111;
        System.out.println(myDouble);

        /*
         * Otros tipos numéricos:
         * float: números decimales con menos precisión que double (ej: 20.1f)
         * long: números enteros muy grandes
         * byte: números enteros muy pequeños
         * Orden por tamaño de memoria: byte < int < long
         */

        // Carácter
        char myChar = 'a'; // Usamos comillas simples para un solo carácter
        System.out.println(myChar);

        // Booleano (verdadero o falso)
        boolean myBoolean = true;
        System.out.println(myBoolean);

        // String: cadena de texto (no es primitivo, es una clase)
        String myString = "Hola, Java!";
        System.out.println(myString);

        // Obtener el tipo de datos de un objeto en tiempo de ejecución
        System.out.println(myString.getClass().getSimpleName());
    }
}
