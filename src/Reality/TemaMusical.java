package Reality;

import java.util.ArrayList;

public class TemaMusical {
	//Atributos
	private String titulo;
	private String idioma;
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

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public void addGeneroMusical(String genero){
		generosMusicalesPertenecientes.add(genero);
	}
}
