package Reality;

import java.util.ArrayList;
import java.util.Comparator;
import Criterios.*;

public class Produccion {
	
	//Atributos
	private ArrayList<TemaMusical> temasDisponibles;
	private Comparator<Banda> criterioBatalla;
	
	public Produccion() {
		temasDisponibles = new ArrayList<>();
		Comparator<Banda> genero = new CriterioGeneros();
		Comparator<Banda> edad = new CriterioEdad();
		Comparator<Banda> idioma = new CriterioIdiomas();
		Comparator<Banda> compuesto = new CriterioCompuesto(genero, idioma);
		criterioBatalla = new CriterioCompuesto(compuesto, edad);
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
	
	public void setCriterioBatalla(Comparator<Banda> criterioBatalla) {
		this.criterioBatalla = criterioBatalla;
	}
	
	public void batalla(Coach coach1, Coach coach2, Comparator<Banda> criterioBatalla) {
		
		if(!coach1.equipo.isEmpty() && !coach2.equipo.isEmpty()) {
			Banda participante1 = coach1.elegirParticipante(criterioBatalla);
			Banda participante2 = coach2.elegirParticipante(criterioBatalla);
			
			int resultado = criterioBatalla.compare(participante1, participante2);
			
			if(resultado == 1) {
				coach2.eliminarParticipante(participante2);
				System.out.println("Gano el participante: " + participante1.getNombre());
			}
			else if(resultado == -1){
				coach1.eliminarParticipante(participante1);
				System.out.println("Gano participante: " + participante2.getNombre());
			}
		}
		else {
			if(coach1.equipo.isEmpty()) {
				System.out.println("El Coach " + coach1.getNombre() + " se ha quedado sin participantes");
			}
			else {
				System.out.println("El Coach " + coach2.getNombre() + " se ha quedado sin participantes");
			}
		}
	}
}
