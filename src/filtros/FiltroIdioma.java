package filtros;

import Reality.Banda;

public class FiltroIdioma extends Filtro {

	//Atributos
	private String idioma;
	
	//Constructor
	public FiltroIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(Banda b) {
		return b.esIdiomaPreferente(idioma);
	}

}
