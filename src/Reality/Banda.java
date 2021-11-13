package Reality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import filtros.Filtro;

public abstract class Banda {
	//Atributos
	private ArrayList<TemaMusical> canciones;
	protected String nombre;	
	
	public Banda(String nombre) {
		canciones= new ArrayList<>();
		this.nombre = nombre;
	}

	public void addCanciones(TemaMusical c) {
		if(!canciones.contains(c))
			canciones.add(c);
		}
	
	
	public abstract String getNombre();
	public abstract ArrayList<String> listadoInstrumentos();
	public abstract ArrayList<String> listadoGenerosPreferencia();
	public abstract ArrayList<String> listadoIdiomasPreferencia();
	public abstract int getEdad();
	
	
	public abstract ArrayList<Banda> buscar(Filtro f);
	
	public ArrayList<Banda> buscarOrdenado(Filtro f, Comparator<Banda> c){
		ArrayList<Banda> listado = this.buscar(f);
		Collections.sort(listado, c);
		return listado;
	}
	
	public boolean esGeneroDePreferencia(String genero) {
		return this.listadoGenerosPreferencia().contains(genero);
	}
	
	public boolean esIdiomaPreferente(String idioma) {
		return this.listadoIdiomasPreferencia().contains(idioma);
	}
	
	public boolean esIstrumentoPreferente(String instrumento) {
		return this.listadoInstrumentos().contains(instrumento);
	}
}
