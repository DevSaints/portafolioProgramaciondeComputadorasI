import java.io.BufferedReader;
//ENUNCIADO Nombre de clase: Problema3, Nombre en el menu: Diagonal Secundaria
/*Haga un programa que lea una matriz cuadrada de K elementos enteros y
construya una función genere un vector con los elementos de la diagonal
secundaria ordenados de mayor a menor.*/
// impotaciones de librerias
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// clase principal del programa
public class Problema3 {
    // inicializacion de variables
    private static Integer[][] matriz;
    private static Integer[] diagonalSecundaria;

// metodo main, encargado de inicar el programa
    public static void main(String[] args) {
        Problema3 problema = new Problema3();
        problema.ejecutarPrograma();
    }
// metodo para ejecutar el programa
    public static void ejecutarPrograma() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // bucle while para que el programa siga preguntando hasta que se ingrese un numero valido
        while (true) {
            //try catch para capturar errores de entrada
            try {
                System.out.println("Ingrese el tamaño de la matriz cuadrada:");
                int tamano = Integer.parseInt(br.readLine());
                // if para validar que el numero de filas sea mayor a 0
                if (tamano <= 0) {
                    throw new IllegalArgumentException("El tamaño de la matriz debe ser mayor que 0");
                }
                // Crear la matriz original
                matriz = new Integer[tamano][tamano];
                // for para recorrer las filas
                for (int i = 0; i < tamano; i++) {
                    // for para recorrer las columnas
                    for (int j = 0; j < tamano; j++) {
                        // ingreso de elementos de la matriz
                        System.out.println("Ingrese el elemento en la posición [" + (i + 1) + "][" + (j + 1) + "]:");
                        matriz[i][j] = Integer.parseInt(br.readLine());
                    }
                }
                // Crear el vector de la diagonal secundaria
                diagonalSecundaria = new Integer[tamano];

                // for para recorrer las filas
                for (int i = 0; i < tamano; i++) {

                    //se asigna el valor de la diagonal secundaria a la matriz
                    diagonalSecundaria[i] = matriz[i][tamano - i - 1]; // -1 porque los indices empiezan en 0
                }
                // metodo para ordenar el vector de la diagonal secundaria
                Arrays.sort(diagonalSecundaria, Collections.reverseOrder());

                // mostrar matriz original
                System.out.println("Matriz ingresada:");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print("[ " + matriz[i][j] + " ] ");
                    }
                    System.out.println();
                }

                // mostrar vector de la diagonal secundaria
                System.out.println("La diagonal secundaria ordenada de mayor a menor es:");
                for (int i = 0; i < diagonalSecundaria.length; i++) {
                    System.out.println("diagonalSecundaria[" + i + "] = " + diagonalSecundaria[i]);
                }
                break;
            } catch (IOException e) {
                System.err.println("Ha ocurrido un error de entrada/salida. Intente de nuevo.");
            } catch (NumberFormatException e) {
                System.err.println("Ha ingresado un número inválido. Intente de nuevo.");
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage() + " Intente de nuevo.");
            }
        }
    }
}
