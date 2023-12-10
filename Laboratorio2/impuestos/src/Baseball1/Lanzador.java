package Baseball1;

public class Lanzador {
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
}
