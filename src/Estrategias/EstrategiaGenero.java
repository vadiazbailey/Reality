package Estrategias;

import Reality.Banda;

public class EstrategiaGenero implements Estrategia {

	private String genero;
	
	public EstrategiaGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean criterioSeleccion(Banda participante) {
		return participante.listadoGenerosPreferencia().contains(genero);
	}

}
