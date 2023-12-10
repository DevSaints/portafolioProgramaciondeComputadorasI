import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sumatoria {
    static void calcularSumatoria() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;

        while (true) {
            try {
                System.out.print("Ingresa un número para calcular la suma de sus dígitos: ");
                String input = reader.readLine();

                if (input.contains(".")) {
                    // evitar que el número sea decimal
                    throw new DecimalNumberException("La entrada no puede ser un número decimal");
                }
                else if (input.isEmpty()) {
                    // evitar que el campo esté vacío
                    throw new EmptyStringException("El campo no puede estar vacío.");
                }
                else {
                    numero = Integer.parseInt(input);
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Por favor ingresa un número válido.");

            } catch (DecimalNumberException e) {
                System.err.println(e.getMessage());

            } catch (EmptyStringException e) {
                System.err.println(e.getMessage());

            }
        }

        int suma = 0;
        System.out.print("Digitos: \n");
        while (numero != 0) {
            int digito = numero % 10;
            System.out.print( digito+ "\n");
            suma += digito;
            numero /= 10;
        }
        System.out.println("__________________________________");
        System.out.println("La suma de los dígitos es: " + suma);

    }
}