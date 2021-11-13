package filtros;

import Reality.Banda;

public class FiltroNot extends Filtro {

	private Filtro f;
	
	public FiltroNot(Filtro f) {
		this.f = f;
	}

	@Override
	public boolean cumple(Banda b) {
		return !f.cumple(b);
	}

}
