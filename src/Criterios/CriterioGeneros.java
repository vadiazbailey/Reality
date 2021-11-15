package Criterios;

import java.util.Comparator;

import Reality.Banda;

public class CriterioGeneros implements Comparator<Banda> {

	//Elige el ganador por la cantidad de generos preferidos 
	@Override
	public int compare(Banda participante1, Banda participante2) {
		return participante1.listadoGenerosPreferencia().size()-participante2.listadoGenerosPreferencia().size();
	}

}
