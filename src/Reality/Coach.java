package Reality;

import java.util.ArrayList;

public class Coach {
	//Atributos
	private String nombre;
	protected ArrayList<Banda> equipo;
	
	public Coach(String nombre) {
		this.nombre = nombre;
		equipo = new ArrayList<>();
	}
	
	public void addMiembroEquipo(Banda participante) {
		if(!equipo.contains(participante))
			equipo.add(participante);
	}

	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<String> getInstrumentosEquipo(){
		ArrayList<String> listaInstrumentos = new ArrayList<>();
		for (Banda b : equipo) {
			ArrayList<String> instrumentos = b.listadoInstrumentos();
			for(String i: instrumentos) {
				if(!listaInstrumentos.contains(i))
					listaInstrumentos.add(i);
			}
		}
		return listaInstrumentos;
	}
	
	public ArrayList<String> getIdiomasEquipo(){
		ArrayList<String> listaIdiomas = new ArrayList<>();
		for (Banda b : equipo) {
			ArrayList<String> idiomas = b.listadoIdiomasPreferencia();
			for(String i: idiomas) {
				if(!listaIdiomas.contains(i))
					listaIdiomas.add(i);
			}
		}
		return listaIdiomas;
	}
	
	public ArrayList<String> getGenerosEquipo(){
		ArrayList<String> listaGeneros = new ArrayList<>();
		for (Banda b : equipo) {
			ArrayList<String> generos = b.listadoGenerosPreferencia();
			for(String g: generos) {
				if(!listaGeneros.contains(g))
					listaGeneros.add(g);
			}
		}
		return listaGeneros;
	}
	
	public int getPromedioEdad() {
		int aux = 0;
		for(Banda b: equipo) {
			aux+= b.getEdad();
		}
		return aux/equipo.size();
	}
}
