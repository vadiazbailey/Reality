package Estrategias;

import Reality.Banda;

public class EstrategiaInstrumento implements Estrategia {

	private String instrumento; 
	
	public EstrategiaInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public boolean criterioSeleccion(Banda participante) {
		return participante.listadoInstrumentos().contains(instrumento);
	}

}
