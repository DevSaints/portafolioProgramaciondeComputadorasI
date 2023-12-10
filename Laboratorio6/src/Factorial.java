import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Factorial {
    static void calcularFactorial() throws IOException {

        System.out.print("Ingresa un número para calcular su factorial: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        try {
            numero = Integer.parseInt(reader.readLine());
            if (numero < 0) {
                throw new IllegalArgumentException("No se permiten números negativos.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
