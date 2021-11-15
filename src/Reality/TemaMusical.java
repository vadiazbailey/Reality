package Reality;

import java.util.ArrayList;

public class TemaMusical {
	//Atributos
	private String titulo, idioma;
	private ArrayList<String> generosMusicalesPertenecientes;
	private ArrayList<String> instumentosMusicales;
	
	//Constructor
	public TemaMusical(String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma;
		generosMusicalesPertenecientes = new ArrayList<String>();
		instumentosMusicales = new ArrayList<String>();
	}

	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void addGeneroMusical(String genero){
		generosMusicalesPertenecientes.add(genero);
	}
	
	public void addInstrumentoMusical(String instrumento){
		instumentosMusicales.add(instrumento);
	}
	
	public boolean tieneGenero(String genero) {
		return this.generosMusicalesPertenecientes.contains(genero);
	}
	
	public boolean tieneInstrumento(String instrumento) {
		return this.instumentosMusicales.contains(instrumento);
	}
	
	@Override
	public boolean equals(Object o1) {
		try {
			TemaMusical t1 = (TemaMusical) o1;
			return this.getTitulo().equals(t1.getTitulo()) && this.getIdioma().equals(t1.getIdioma());
		}
		catch(Exception e){
			return false;
		}
	}

	public boolean tieneAlgunGenero(ArrayList<String> listadoGenerosPreferencia) {
		for (String genero : listadoGenerosPreferencia) {
			if(this.tieneGenero(genero))
				return true;
		}
		return false;
	}
	
	public boolean tieneAlgunInstrumento(Banda b) {
		ArrayList<String> aux = b.listadoInstrumentos();
		for(String instrumento: aux) {
			if(this.tieneInstrumento(instrumento))
				return true;
		}
	return false;
	}
}

