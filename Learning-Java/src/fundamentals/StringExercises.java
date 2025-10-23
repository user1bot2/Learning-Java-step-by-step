package fundamentals;

public class StringExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto
        var textoUno = "Hola me llamo Jinming";
        var textoDos = ", mucho gusto de conocerte.";
        System.out.println(textoUno + textoDos);

        // 2. Muestra la longitud de una cadena de texto
        String cadenaTexto = "Hola hola hola";
        System.out.println(cadenaTexto.length()); // Devuelve el número de caracteres

        // 3. Muestra el primer y último carácter de un string
        var primerUltimo = "Asado";
        System.out.println(primerUltimo.charAt(0)); // Primer carácter
        System.out.println(primerUltimo.charAt(primerUltimo.length() - 1)); // Último carácter

        // 4. Convierte a mayúsculas y minúsculas un string
        var convertirString = "HolaComoEstas";
        System.out.println(convertirString.toLowerCase()); // Todo en minúsculas
        System.out.println(convertirString.toUpperCase()); // Todo en mayúsculas

        // 5. Comprueba si una cadena de texto contiene una palabra concreta
        String palabraConcreta = "estoEsUnSol";
        System.out.println(palabraConcreta.contains("esto")); // true
        System.out.println(palabraConcreta.toUpperCase().contains("SOL")); // true
        System.out.println(palabraConcreta.toLowerCase().contains("esunsol")); // true

        // 6. Formatea un string con variables (entero, double, string)
        final String NOMBRE = "Pablo";
        int edad = 47;
        double altura = 1.82;
        System.out.println(String.format(
                "Hola, mi nombre es %s, encantado de conocerte. Este año cumplo %d años. Me gusta jugar al baloncesto y hago entradas, gracias a mi altura de %.2f m.",
                NOMBRE, edad, altura
        ));

        // 7. Elimina los espacios en blanco al principio y final de un string
        String eliminarEspacio = " Esto es un texto con espacios al principio y al final ";
        System.out.println(eliminarEspacio.trim());

        // 8. Sustituye todos los espacios en blanco por un guión (-)
        var espacioGuion = "Esto es un texto con espacios que serán reemplazados por guiones";
        System.out.println(espacioGuion.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales (== compara referencias, no contenido)
        String a = new String("hello");
        String b = "hello";
        String c = "hello";
        System.out.println(a == b); // false, diferentes referencias
        System.out.println(b == c); // true, misma referencia en pool de Strings

        // Para comparar contenido, usar equals()
        System.out.println(a.equals(b)); // true, compara contenido

        // 10. Comprueba si dos strings tienen la misma longitud
        var d = "holaholahola";
        var e = "holaholahola";
        var f = "holahola";
        System.out.println(d.length() == e.length()); // true
        System.out.println(d.length() == f.length()); // false
    }
}
