package Reality;

import Estrategias.*;

public class CoachExigente extends Coach{
	Estrategia criterio1;
	Estrategia criterio2;
	Estrategia criterio3;

	
	
	public CoachExigente(String nombre, Estrategia criterio1, Estrategia criterio2, Estrategia criterio3) {
		super(nombre);
		this.criterio1 = new EstrategiaInstrumento("Bateria");
		this.criterio2 = new EstrategiaAnd(new EstrategiaIdioma("Ingles"), new EstrategiaIdioma("Español"));
		this.criterio3 = new EstrategiaGenero("Pop");
	}

	@Override
	public void addMiembroEquipo(Banda b) {
		//Si cumple los 3 criterios que solicita acepta al participante
		if(criterio1.criterioSeleccion(b) && criterio2.criterioSeleccion(b) && criterio3.criterioSeleccion(b))
			equipo.add(b);
	}

	//Set de los criterios
	public void setCriterio1(Estrategia criterio1) {
		this.criterio1 = criterio1;
	}

	public void setCriterio2(Estrategia criterio2) {
		this.criterio2 = criterio2;
	}

	public void setCriterio3(Estrategia criterio3) {
		this.criterio3 = criterio3;
	}
}
