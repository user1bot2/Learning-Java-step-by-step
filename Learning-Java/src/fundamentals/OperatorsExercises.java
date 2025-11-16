package fundamentals;

public class OperatorsExercises {

    public static void main(String[] args) {

        // =========================
        // 1. OPERADORES ARITMÉTICOS
        // =========================
        var a = 1;

        System.out.println(a + a); // Suma
        System.out.println(a - a); // Resta
        System.out.println(a * a); // Multiplicación
        System.out.println(a / a); // División
        System.out.println(a & a); // AND bit a bit

        // =========================
        // 2. OPERADORES DE ASIGNACIÓN
        // =========================
        var b = a * 2; // Asignación con operación
        System.out.println(b);

        b += 2; // Incremento asignado: b = b + 2
        System.out.println(b);

        b -= 2; // Decremento asignado: b = b - 2
        System.out.println(b);

        b *= 2; // Multiplicación asignada: b = b * 2
        System.out.println(b);

        b /= 2; // División asignada: b = b / 2
        System.out.println(b);

        b %= 2; // Módulo asignado: b = b % 2
        System.out.println(b);

        // =========================
        // 3. COMPARACIONES VERDADERAS
        // =========================
        var c = 10;
        var d = 20;
        var e = d;

        System.out.println(5 == 5);  // Igualdad
        System.out.println(c < d);    // Menor que
        System.out.println(e == d);   // Igualdad con variable

        // =========================
        // 4. COMPARACIONES FALSAS
        // =========================
        System.out.println(5 == 20);  // Igualdad falsa
        System.out.println(c > d);    // Mayor que falsa
        System.out.println(c >= d);   // Mayor o igual falsa

        // =========================
        // 5. OPERADORES LÓGICOS
        // =========================
        System.out.println(true && true);   // AND: true si ambas condiciones son true
        System.out.println(true || false);  // OR: true si al menos una condición es true

        // Combinar AND y OR
        System.out.println((5 == 5 && a == d) || e >= c);

        // Negación
        System.out.println(!(a <= d)); // NOT: invierte el valor booleano

        // =========================
        // 6. OPERADORES UNARIOS
        // =========================
        System.out.println(++d); // Pre-incremento: incrementa y luego muestra
        System.out.println(-d);  // Negativo
        System.out.println(d++); // Post-incremento: muestra y luego incrementa

        // =========================
        // 7. COMBINACIÓN DE OPERADORES
        // =========================
        var z = 1;
        var y = 3;
        int x = 8;

        // Combina aritméticos, comparación y lógicos
        boolean resultado = ((z + y) >= x) && (y != 0);
        System.out.println("El resultado es: " + resultado);
    }
}
