package filtros;

import Reality.Banda;
import Reality.TemaFinalRestrictivo;

public class FiltroTemaExigente extends Filtro {

	TemaFinalRestrictivo tema;
	
	public FiltroTemaExigente(TemaFinalRestrictivo tema) {
		this.tema = tema;
	}

	@Override
	public boolean cumple(Banda b) {
		return b.temaFinal(tema);
	}

}
