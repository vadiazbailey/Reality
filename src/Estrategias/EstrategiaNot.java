package Estrategias;

import Reality.Banda;

public class EstrategiaNot implements Estrategia {

	private Estrategia e;
	
	public EstrategiaNot(Estrategia e) {
		this.e = e;
	}

	@Override
	public boolean criterioSeleccion(Banda participante) {
		return (!e.criterioSeleccion(participante));
	}

}
