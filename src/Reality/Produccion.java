package Reality;

import java.util.ArrayList;

public class Produccion {
	
	//Atributos
	private ArrayList<TemaMusical> temasDisponibles;
	
	public Produccion() {
		temasDisponibles = new ArrayList<>();
	}
	
	public void addTema(TemaMusical tema) {
		if(!temasDisponibles.contains(tema))
			temasDisponibles.add(tema);
	}
	
	public ArrayList<TemaMusical> getTemasDisponibles() {
		ArrayList<TemaMusical> aux = new ArrayList<>();
		aux.addAll(temasDisponibles);
		return aux;
	}
}
