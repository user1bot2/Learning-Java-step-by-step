package fundamentals;

public class BasicStrings {
    public static void main(String[] args) {

        // Cadenas de texto (String)
        String name = "Jinming";

        // Forma alternativa (poco habitual) de crear un String
        var surname = new String("Qiu");

        // Concatenación de cadenas
        System.out.println(name + " " + surname);

        // Longitud de la cadena
        System.out.println(name.length());

        // Obtener un carácter específico
        System.out.println(name.charAt(3));

        // Obtener el último carácter
        // Recuerda: en Java los índices empiezan desde 0
        System.out.println(name.charAt(name.length() - 1));

        // Substring: obtener una subcadena
        // El primer índice es inclusivo y el segundo exclusivo
        System.out.println(name.substring(0, 4));
        System.out.println(name.substring(1, 4));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Comprobar si contiene una secuencia de caracteres
        System.out.println(name.contains("inmin"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparación de cadenas
        System.out.println(name.equals("Jinming"));
        System.out.println(name.equals("jinming")); // False: distingue mayúsculas y minúsculas
        System.out.println(name.equalsIgnoreCase("jinming")); // Ignora mayúsculas y minúsculas

        // == vs equals()
        /*
         * En Java, los Strings son objetos.
         * El operador '==' compara las referencias en memoria (dirección del objeto).
         * El método 'equals()' compara el contenido del String.
         */

        var n = "Exitoso";
        var m = "Exitoso";
        String o = new String("Exitoso");

        System.out.println(n == m);  // True: apuntan al mismo objeto (intern pool)
        System.out.println(m == o);  // False: 'o' es un nuevo objeto en memoria
        System.out.println(n.equals(o)); // True: el contenido es el mismo

        // Eliminar espacios al inicio y al final
        System.out.println(" Hola, me llamo Jinming ".trim());

        // Reemplazar caracteres
        System.out.println(" Hola, me llamo Jinming ".replace("i", "a"));

        // Formatear cadenas
        // Permite insertar variables dentro de un texto de forma controlada
        final String NUEVO_NOMBRE = "Andrés";
        int nuevaEdad = 30;
        double nuevaAltura = 1.80;

        System.out.println(String.format(
                "Hola, %s. Este año tendrás %d años y medirás %.2f m",
                NUEVO_NOMBRE, nuevaEdad, nuevaAltura
        ));
        // %s = String, %d = entero, %.nf = número decimal con n decimales
    }
}
