package Reality;

import filtros.Filtro;
import filtros.FiltroAnd;
import filtros.FiltroGenero;
import filtros.FiltroIdioma;
import filtros.FiltroInstrumento;

public class CoachExigente extends Coach{
	Filtro criterio1;
	Filtro criterio2;
	Filtro criterio3;

	
	
	public CoachExigente(String nombre, Filtro criterio1, Filtro criterio2, Filtro criterio3) {
		super(nombre);
		this.criterio1 = new FiltroInstrumento("Bateria");
		this.criterio2 = new FiltroAnd(new FiltroIdioma("Ingles"), new FiltroIdioma("Español"));
		this.criterio3 = new FiltroGenero("Pop");
	}

	@Override
	public void addMiembroEquipo(Banda b) {
		//Si cumple los 3 criterios que solicita acepta al participante
		if(criterio1.cumple(b) && criterio2.cumple(b) && criterio3.cumple(b))
			equipo.add(b);
	}

	//Set de los criterios
	public void setCriterio1(Filtro criterio1) {
		this.criterio1 = criterio1;
	}

	public void setCriterio2(Filtro criterio2) {
		this.criterio2 = criterio2;
	}

	public void setCriterio3(Filtro criterio3) {
		this.criterio3 = criterio3;
	}
}
