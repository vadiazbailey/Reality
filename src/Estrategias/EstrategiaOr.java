package Estrategias;

import Reality.Banda;

public class EstrategiaOr implements Estrategia {

	private Estrategia e1;
	private Estrategia e2;
	
	public EstrategiaOr(Estrategia e1, Estrategia e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public boolean criterioSeleccion(Banda participante) {
		return e1.criterioSeleccion(participante) || e2.criterioSeleccion(participante);
	}

}
