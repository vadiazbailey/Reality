package Reality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import filtros.Filtro;

public abstract class Banda {
	//Atributos
	private ArrayList<TemaMusical> canciones;
	protected String nombre;	
	
	
	//----------------------Preguntar-----------------------------
	public Banda(String nombre) {
		canciones= new ArrayList<>();
		this.nombre = nombre;
	}

	public void addCanciones(TemaMusical c) {
		if(!canciones.contains(c))
			canciones.add(c);
		}
	//-------------------------------------------------------------
	
	public abstract int getEdad();
	public abstract ArrayList<String> listadoInstrumentos();
	public abstract ArrayList<String> listadoGenerosPreferencia();
	public abstract ArrayList<String> listadoIdiomasPreferencia();
	public abstract ArrayList<Banda> buscar(Filtro f);
	public abstract int cantidadQueToca(String instrumento);
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean sePuedeTocar(TemaMusical cancion) {
		/*puede ser interpretado por una banda/grupo/solista si puede cantar
		 *  en el idioma del
		tema y al menos uno de los géneros está entre las preferencias */
		return this.esIdiomaPreferente(cancion.getIdioma()) && cancion.tieneAlgunGenero(this.listadoGenerosPreferencia());
	}
	
	public boolean temaFinal(TemaMusical cancion) {
		/*para los temas de la final se debe chequear además de lo anterior que la
		 * banda/grupo/solista posea al menos un miembro que toque un instrumento
		 *  de los necesarios para interpretar el tema. */
		return this.sePuedeTocar(cancion) && cancion.tieneAlgunInstrumento(this);
	}
	
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
