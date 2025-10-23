package exercises;

public class BeginnerExercises {
    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String myName = "Jinming";
        System.out.println(myName);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myAge = 20;
        System.out.println(myAge);

        // 3. Crea una variable double con tu altura en metros.
        double myHeight = 1.75;
        System.out.println(myHeight);

        // 4. Declara una variable boolean que indique si te gusta programar.
        boolean doILikeProgramming = true;
        System.out.println(doILikeProgramming);

        // 5. Declara una constante con tu email.
        final String MY_EMAIL = "example@example.com";
        System.out.println(MY_EMAIL);

        // 6. Crea una variable de tipo char y guarda tu inicial.
        char myInitial = 'J';
        System.out.println(myInitial);

        // 7. Declara una variable String con tu localidad, cámbiale el valor e imprímela de nuevo.
        String myLocation = "Europe";
        System.out.println(myLocation);

        myLocation = "Asia";
        System.out.println(myLocation);

        // 8. Crea dos variables int (a y b) e imprime la suma de ambas.
        int a = 2;
        int b = 3;
        System.out.println(a + b);

        // 9. Imprime el tipo de una variable (solo funciona con objetos, no con tipos primitivos).
        System.out.println(myLocation.getClass().getSimpleName());

        // 10. Declara una variable sin inicializarla y asígnale un valor antes de imprimirla.
        String name;
        name = "Lamborghini";
        System.out.println(name);
    }
}

