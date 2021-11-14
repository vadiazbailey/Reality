package Estrategias;

import Reality.Banda;

public class EstrategiaIdioma implements Estrategia {

	private String idioma;
	
	public EstrategiaIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean criterioSeleccion(Banda participante) {
		return participante.listadoIdiomasPreferencia().contains(idioma);
	}

}
