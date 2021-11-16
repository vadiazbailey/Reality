package filtros;

import Reality.Banda;
import Reality.TemaMusical;

public class FiltroTemaMusical extends Filtro {

	TemaMusical tema;
	
	public FiltroTemaMusical(TemaMusical tema) {
		this.tema = tema;
	}

	@Override
	public boolean cumple(Banda b) {
		return b.sePuedeTocar(tema);
	}

}
