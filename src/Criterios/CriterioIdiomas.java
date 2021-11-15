package Criterios;

import java.util.Comparator;

import Reality.Banda;

public class CriterioIdiomas implements Comparator<Banda> {

	//Elige un ganador por la cantidad de idiomas preferentes
	@Override
	public int compare(Banda participante1, Banda participante2) {
		return participante1.listadoIdiomasPreferencia().size()-participante2.listadoIdiomasPreferencia().size();
	}

}
