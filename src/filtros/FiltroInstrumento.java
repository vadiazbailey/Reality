package filtros;

import Reality.Banda;

public class FiltroInstrumento extends Filtro {

	public String instrumento;
	
	public FiltroInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumple(Banda b) {
		return b.esIstrumentoPreferente(instrumento);
	}

}
