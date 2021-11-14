package Reality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import filtros.Filtro;

public class Coach {
	
	//Atributos
	private String nombre;
	protected ArrayList<Banda> equipo;
	
	//Constructor
	public Coach(String nombre) {
		this.nombre = nombre;
		equipo = new ArrayList<>();
	}
	
	public void addMiembroEquipo(Banda participante) {
	//Agregamos control para evitar reeticion de participantes
		if(!equipo.contains(participante))
			equipo.add(participante);
	}

	//Getters & setters
	public String getNombre() {
		return nombre;
	}
	
	//---------------------PREGUNTAR-------------------------------
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
		Collections.sort(listaGeneros);
		return listaGeneros;
	}
	//----------------------------------------------------------------
	
	public int getPromedioEdad() {
		int aux = 0;
		for(Banda b: equipo) {
			aux+= b.getEdad();
		}
		return aux/equipo.size();
	}
	
	public ArrayList<Banda> busqueda(Filtro f){
		ArrayList<Banda> listado = new ArrayList<>();
		for (Banda b : equipo) 
			listado.addAll(b.buscar(f));
		return listado;
	}
	
	public ArrayList<Banda> listadoOrdenado(Filtro f, Comparator<Banda> criterio){
		ArrayList<Banda> listado = this.busqueda(f);
		Collections.sort(listado, criterio);		
		return listado;
	}
}
