package Criterios;

import java.util.Comparator;

import Reality.Banda;

public class CriterioEdad implements Comparator<Banda> {

	//Elige un ganador por la edad de los participantes
	@Override
	public int compare(Banda participante1, Banda participante2) {
		return participante1.getEdad()-participante2.getEdad();
	}

}
