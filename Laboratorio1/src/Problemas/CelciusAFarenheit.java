//Se agrega la clase al package Problemas
package Problemas;

// Importamos una herramienta Scanner para leer datos
import java.util.Scanner;

// se define una clase publica llamada"CelsiusAFarenheit"
public class CelciusAFarenheit {


    //Se agrega el bloque main
    public static void main(String[] args) {

        // Ahora se crea un objeto con el nombre de "scanner" para leer datos
        Scanner scanner = new Scanner (System.in);


        //Definimos nuestras variables tipo float
        float centigrados, farenheit, conversion;


        //Pedimos los grados centigrados
        System.out.print("Introduzca los grados centigrados: ");
        // Se leen los datos
        centigrados = scanner.nextFloat();

        // Se realiza la ecuacion correspondiente
        farenheit = 32+(9*centigrados/5);

        // Se imprime el resultado
        System.out.println("Transformando "+centigrados+"°C a Farenheit son "+farenheit+"°F");


    }
}