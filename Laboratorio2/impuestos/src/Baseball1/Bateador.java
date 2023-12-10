package Baseball1;

public class Bateador {

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

    }

