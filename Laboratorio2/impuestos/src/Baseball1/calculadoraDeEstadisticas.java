package Baseball1;
/* CALCULADORA DE ESTADISTICAS DE BASEBALL */

//se importa un truncador de decimales
import java.text.DecimalFormat;

public class calculadoraDeEstadisticas {
    // se coloca el static void main para colocar todo lo principal
    public static void main(String[]args) {
        //En esta clase principal se manejan cosas como (objetos, salidas, etc)
        Bateador Beto = new Bateador(2, 3, 4); //se crea el objeto Beto
        DecimalFormat df = new DecimalFormat("#.##"); // se hace uso de la creacion de un objeto para truncar decimales
        System.out.println("El promedio de Beto es: " + df.format(Beto.promedioBateo()) +
                "\ny su Slugging es: " + df.format(Beto.Slugging())); // se imprime las estadisticas
        Lanzador Mariano = new Lanzador(2, 3, 4, 5, 6); //se crea el objeto Mariano
        //se imprimen las estadisticas
        System.out.println("La efectividad es: " + df.format(Mariano.Efectividad()) + "\ny su WHIP es: " + df.format(Mariano.WHIPs()) + "\n y sus ponches por episodio son: " + df.format(Mariano.ponchesPorEpisodio()));
    }
    /* public static class Bateador{
     //Esta clase Bateador maneja(variables, funciones, calculos, etc)

        //se declaran las variables
        float numero_de_hits;
        float numero_de_turnos;
        float numero_de_base_rateada;

        //se crea el constructor
        public Bateador(float numero_de_hits, float numero_de_turnos, float numero_de_base_rateada){
            this.numero_de_hits = numero_de_hits;
            this.numero_de_turnos = numero_de_turnos;
            this.numero_de_base_rateada = numero_de_base_rateada;
        }

        //Funcion promedioBateo; calcula un promedio
        public double promedioBateo(){
            return (this.numero_de_hits / this.numero_de_turnos);
        }

        //Funcion Slugging; calcula los Sluggings
        public double Slugging(){
            return (this.numero_de_base_rateada / this.numero_de_turnos);
        }

    }*/
//
    /*public static class Lanzador{
        //Esta clase lANZADOR maneja(variables, funciones, calculos, etc)

        // se define las funciones
        float carreras_limpias;
        float episodios_lanzados;
        float hits;
        float bases_por_bolas;
        float numero_de_ponches;

        //se crea el constructor
        public Lanzador(float carreras_limpias, float episodios_lanzados, float bases_por_bolas, float numero_de_ponches, float hits){
            this.carreras_limpias = carreras_limpias;
            this.bases_por_bolas = bases_por_bolas;
            this.episodios_lanzados = episodios_lanzados;
            this.hits = hits;
            this.numero_de_ponches = numero_de_ponches;
        }

        //Se emplea la funcion efectividad; calcula la efectividad
        public float Efectividad(){
            return ((this.carreras_limpias / this.episodios_lanzados)*9);
        }

        //Se emplea la funcion WHIPs; calcula los Whips
        public float WHIPs(){
            return ((this.bases_por_bolas + this.hits)/this.episodios_lanzados);
        }

        // Se emplea la funcion ponches por episodio; calcula los ponches por episodio
        public float ponchesPorEpisodio(){
            return ((this.numero_de_ponches / this.episodios_lanzados)*9);
        }
    }*/

}
