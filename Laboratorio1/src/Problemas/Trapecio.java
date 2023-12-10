// se agrega la clase al package Problemas
package Problemas;

// Se importa la herramienta Scanner
import java.util.Scanner;


// Se crea una clase publica llamada "Trapecio"
public class Trapecio{

    // Se crea un bloque main
    public static void main(String[] args){

     // Se crea un nuevo objeto llamado "Scanner"
    Scanner scanner = new Scanner(System.in);

    // Se definen las variables
    Float base1, base2, haltura, area;

    //Se realiza el proceso de peticion y lectura de los datos
    System.out.print("Introduzca una Base del trapecio: ");
    base1 = scanner.nextFloat();
    System.out.print("Introduzca otra Base del trapecio: ");
    base2 = scanner.nextFloat();
    System.out.print("Introduzca la Altura del trapecio: ");
    haltura = scanner.nextFloat();

    // se calcula segun la formula provista
    area = (base1+base2)*haltura/2;

    // se regresa el resultado
    System.out.println("El Area de su trapecio es: "+area);



    }
}



