package Criterios;

import java.util.Comparator;

import Reality.Banda;

public class CriterioInstrumentos implements Comparator<Banda>{

	//Elige el ganador por la cantidad de instrumentos que toca cada equipo
	@Override
	public int compare(Banda participante1, Banda participante2) {
		return participante1.listadoInstrumentos().size()-participante2.listadoInstrumentos().size();
	}

}
