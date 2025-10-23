package fundamentals;

public class Operators {
    public static void main(String[] args) {

        // =========================
        // OPERADORES ARITMÉTICOS
        // =========================
        float a = 5;
        var b = 3;

        System.out.println(a + b); // Suma
        System.out.println(a - b); // Resta
        System.out.println(a * b); // Multiplicación
        System.out.println(a / b); // División (uno de los valores debe ser float o double para obtener decimal)
        System.out.println(a % b); // Módulo (resto de la división)

        // =========================
        // OPERADORES DE ASIGNACIÓN
        // =========================
        a = b;         // Asignación directa
        System.out.println(a);

        a = b * 2;     // Asignación con operación
        System.out.println(a);

        a += 1;        // Incremento: a = a + 1
        System.out.println(a);

        a -= 2;        // Decremento: a = a - 2
        System.out.println(a);

        a *= 3;        // Multiplicación asignada: a = a * 3
        System.out.println(a);

        a /= 5;        // División asignada: a = a / 5
        System.out.println(a);

        a %= 10;       // Módulo asignado: a = a % 10
        System.out.println(a);

        // =========================
        // OPERADORES DE COMPARACIÓN
        // =========================
        System.out.println(a == b);  // Igualdad
        System.out.println(a != b);  // Diferente
        System.out.println(a > b);   // Mayor que
        System.out.println(a >= b);  // Mayor o igual que
        System.out.println(a < b);   // Menor que
        System.out.println(a <= b);  // Menor o igual que

        // =========================
        // OPERADORES LÓGICOS
        // =========================
        // AND (&&): true solo si ambas condiciones son true
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        // Ejemplo práctico
        System.out.println(3 > 2 && 5 == 2); // false porque no se cumplen ambas

        // OR (||): true si al menos una condición es true
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        // Ejemplo
        System.out.println(3 > 2 || 5 == 2); // true porque 3 > 2 es true

        // NOT (!): invierte el valor booleano
        System.out.println(!true);   // false
        System.out.println(!false);  // true

        // Ejemplo
        System.out.println(!(3 > 2) || 5 == 2); // false || false => false

        // =========================
        // OPERADORES UNARIOS
        // =========================
        System.out.println(+b);  // Positivo
        System.out.println(-b);  // Negativo

        System.out.println(b++); // Post-incremento: muestra el valor y luego suma 1
        System.out.println(++b); // Pre-incremento: suma 1 y luego muestra el valor
        System.out.println(b--); // Post-decremento: muestra el valor y luego resta 1
        System.out.println(--b); // Pre-decremento: resta 1 y luego muestra el valor
    }
}
