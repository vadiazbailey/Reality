package Reality;

import java.util.ArrayList;

public class TemaFinalRestrictivo extends TemaMusical {

	private int cantidadParticipantes;

	public TemaFinalRestrictivo(String titulo, String idioma, int cantidadParticipantes) {
		super(titulo, idioma);
		this.cantidadParticipantes = cantidadParticipantes;
	}

	public int getCantidadParticipantes() {
		return cantidadParticipantes;
	}

	public void setCantidadParticipantes(int cantidadParticipantes) {
		this.cantidadParticipantes = cantidadParticipantes;
	}
	
	@Override
	public boolean tieneAlgunInstrumento(Banda b) {
		ArrayList<String> aux = b.listadoInstrumentos();
		for(String instrumento: aux) {
			if(this.tieneInstrumento(instrumento))
				if(b.cantidadQueToca(instrumento)>= getCantidadParticipantes())
				return true;
		}
	return false;
	}
}
