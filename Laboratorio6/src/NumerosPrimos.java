import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumerosPrimos {
    public static void calcularPrimos() {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = 0;
            int n2 = 0;

            try {
                while (true) {
                    System.out.print("Ingresa el primer número: ");
                    String input = br.readLine();
                    if (!isValidInteger(input)) {
                        System.out.println("Has introducido un valor inválido. Por favor, intenta de nuevo.");
                        continue;
                    }
                    n1 = Integer.parseInt(input);
                    break;
                }

                while (true) {
                    System.out.print("Ingresa el segundo número: ");
                    String input = br.readLine();
                    if (!isValidInteger(input)) {
                        System.out.println("Has introducido un valor inválido. Por favor, intenta de nuevo.");
                        continue;
                    }
                    n2 = Integer.parseInt(input);
                    break;
                }

                int cantidadPrimos = 0;
                int sumaPrimos = 0;

                System.out.println("Listado de números primos entre " + n1 + " y " + n2 + ":");
                for (int i = n1; i <= n2; i++) {
                    if (esPrimo(i)) {
                        System.out.println(i);
                        cantidadPrimos++;
                        sumaPrimos += i;
                    }
                }

                System.out.println("\nCantidad total de primos: " + cantidadPrimos);
                System.out.println("Suma de primos: " + sumaPrimos);

            } catch (IOException e) {
                System.out.println("Ha ocurrido un problema de entrada/salida. " + e.getMessage());
            }
        }

        private static boolean isValidInteger(String input) {
            try {
                Integer.parseInt(input);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        private static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
