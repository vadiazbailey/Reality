package filtros;

import Reality.Banda;

public class FiltroMayorEdad extends Filtro {

	private int edad;

	public FiltroMayorEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumple(Banda b) {
		return b.getEdad()>edad;
	}

}
