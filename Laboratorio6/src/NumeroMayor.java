import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumeroMayor {
    public static void encontrarNumeroMayor() {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int mayor = Integer.MIN_VALUE;

            try {
                while (true) {
                    System.out.print("¿Quieres ingresar un número? (s/n): ");
                    String respuesta = br.readLine().toLowerCase();

                    if (!respuesta.equals("s")) {
                        break;
                    }

                    System.out.print("Ingresa un número: ");
                    String input = br.readLine();

                    if(input.isEmpty()) {
                        System.out.println("No has ingresado ningún valor. Por favor, intenta de nuevo.");
                        continue;
                    }

                    try {
                        int numero = Integer.parseInt(input);

                        if (numero < 0) {
                            System.out.println("Has introducido un número negativo. Finalizando el programa...");
                            break;
                        }

                        if (numero > mayor) {
                            mayor = numero;
                        }

                    } catch(NumberFormatException e) {
                        System.out.println("El valor introducido no es un número válido. Por favor, intenta de nuevo.");
                    }

                }

                if (mayor == Integer.MIN_VALUE) {
                    System.out.println("No has ingresado ningún número.");
                } else {
                    System.out.println("El número mayor ingresado es: " + mayor);
                }

            } catch(IOException e) {
                System.out.println("Ha ocurrido un error de entrada/salida. " + e.getMessage());
            }
        }
    }
