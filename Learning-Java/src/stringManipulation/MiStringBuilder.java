package stringManipulation;

import java.util.*;
import java.util.Arrays;


public class MiStringBuilder {
    public static void main(String[] args) {
        /*
        Como sabemos en Java, los String son valores inmutables, por eso cuando intentamos cambiar de valor, es decir,
        String mensaje = "Hola";
        mensaje += " Mundo"; ---> Crea un nuevo String con otra ruta de memoria.
        Esto se creará un nuevo tipo de referencia, el valor original de mensaje con Hola, seguirá estando, pero de manera temporal.
        ¿Qué está pasando? La nueva referencia de mensaje será con otra difección de memoria.
         ¿Cómo podemos arreglar esto? Usando StringBuilder con el método .append().
         */
        // Crear un StringBuilder vacío
        StringBuilder sb = new StringBuilder();

        // Ir añadiendo partes
        sb.append("Me ");
        sb.append("gusta ");
        sb.append("programar ");
        sb.append("en Java!");

        // Convertir a String para usarlo
        String frase = sb.toString();

        // Imprimir
        System.out.println(frase);

        /*
        ¿Por qué no usamos + con String?
        String frase = " Me " + "gusta " + "programar " + "en Java!";
        En proyectos pequeños no pasaría nada, pero si tenemos que iterar mil veces, entonces el programar se hará lento:
        Ejemplo:
        String frase = "";
        for (int i = 0; i < 1000; i++) {
            frase = frase + "palabra "; // Crea 1000 Strings nuevos!
        }

        Con StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("palabra "); // Solo modifica UN objeto
        }
        String frase = sb.toString();
         */

        // Otro ejemplo usando StringBuilder y el método .append()
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Tengo ");
        sb1.append(23);
        sb1.append(" años y ");
        sb1.append(1.75);
        sb1.append(" metros.");

        // Convertir a String para usarlo
        String frase1 = sb1.toString();

        // Imprimir
        System.out.println(frase1);

        /*
        StringBuilder en bucles
         */
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList(
                "Java", "es", "genial"
        ));
        StringBuilder sb2 = new StringBuilder();

        // Usando un bucle para recorrer palabras e ir añadiendo valores de palabras y espacios
        for (String p : palabras) {
            sb2.append(p).append(" ");
        }
        // Quitar el último espacio
        String frase2 = sb2.toString().trim();
        System.out.println(frase2);


        // Ejemplo usando un bucle for tradicional
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Números del 1 al 5: ");

        for (int i = 1; i <= 5; i++) {
            sb3.append(i);
            if (i < 5) {
                sb3.append(", ");
            }
        }
        // Salida: Números del 1 al 5: 1, 2, 3, 4, 5
        System.out.println(sb3.toString());


    }
}
