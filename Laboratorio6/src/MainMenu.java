// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/* En grupos de 3, desarrollar los siguientes problemas:
Factorial                                       1.	Calcule el factorial de un número. Recuerde que no se puede calcular el factorial de números negativos. Por definición, el factorial de 0 es 1.
Sumatoria                                   2.	Calcule la suma de los dígitos de un número ingresado por el usuario. (no calcular números negativos)
  ciclo desde hasta, validando con modulo   3.	Determine la cantidad de números primos que hay entre dos números n1 y n2. Imprima el listado de primos, la cantidad total y la suma de los primos.
 este está chuchon   4.	Desarrolle un programa que encuentre el número más grande de una serie de números ingresados por el usuario. El programa debe dejar de solicitar números cuando se ingrese un número negativo. ( sin arreglos)

  menu-> desde el programa principal, imprima un menú que le permita escoger al usuario que problema realizar. Luego de realizarlo, el usuario podrá escoger que otro problema desea resolver. Incluya también una opción para cerrar el programa.

        Haga las validaciones de datos correspondientes a cada problema. Incluya manejo de excepciones.*/
/*Resumen:
1. hacer un menu para los problemas--->Jim
2. hacer una clase para cada uno de los problemas
3. hacer una clase para excepciones--->Jim
4. hacer pruebas para los inputs
5. hacer repositorio en github */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;

        do {
            limpiarPantalla();
            mostrarMenu();
            try {
                System.out.print("Elige una opción: ");
                String input = reader.readLine();
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1:
                        Factorial.calcularFactorial();
                        break;
                    case 2:
                        Sumatoria.calcularSumatoria();
                        break;
                    case 3:
                        NumerosPrimos.calcularPrimos();
                        break;
                    case 4:
                        NumeroMayor.encontrarNumeroMayor();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");

                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
                if (opcion != 5) {
                    System.out.print("Presiona Enter para continuar...");
                    reader.readLine();
                }
            } catch (IOException e) {
                System.out.println("Error de entrada/salida. " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingresa un número válido.");
            }

        } while (opcion != 5);
    }

    private static void limpiarPantalla() {
        for (int i = 0; i < 30; i++) {
            System.out.println("\n");
        }
    }

    private static void mostrarMenu() {
        System.out.println("MAIN MENU LABORATORIO 6:");
        System.out.println("[1]____Calcular Factorial");
        System.out.println("[2]____Calcular Sumatoria");
        System.out.println("[3]____Calcular Cantidad de números primos");
        System.out.println("[4]____Calcular el mayor de una serie de números");
        System.out.println("[5]____Salir");
        System.out.println("____________________________________________");
    }
}