package filtros;

import Reality.Banda;

public class FiltroGenero extends Filtro {
		//Atributos
		private String genero;
		
		//Constructor
		public FiltroGenero(String genero) {
			this.genero = genero;
		}

		@Override
		public boolean cumple(Banda b) {
			return b.esGeneroDePreferencia(genero);
		}

}
