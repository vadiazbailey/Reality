package Reality;

import java.util.ArrayList;

import filtros.Filtro;

public class Participante extends Banda{
	
	//Atributos
	private String apellido;
	private int edad;
	private ArrayList<String> generosDePreferencia;
	private ArrayList<String> idiomasQueCanta;
	private ArrayList<String> instrumentosQueToca;
	
	//Constructor
	public Participante(String nombre, int edad, String apellido) {
		super(nombre);
		this.apellido = apellido;
		generosDePreferencia = new ArrayList<String>();
		idiomasQueCanta = new ArrayList<String>();
		instrumentosQueToca = new ArrayList<String>();
		this.edad = edad;
	}

	//Getters & Setters
	@Override
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}	
	
	
	//add
	public void addGenero(String g) {
		generosDePreferencia.add(g);
		}
	
	public void addIdioma(String id) {
		idiomasQueCanta.add(id);
		}
	
	public void addInstrumento(String in) {
		instrumentosQueToca.add(in);
	}
	

	@Override
	public boolean equals(Object o1) {
		try {
			Participante p1 = (Participante) o1;
			return this.getNombre().equals(p1.getNombre()) && this.getApellido().equals(p1.getApellido()) && this.getEdad()==p1.getEdad();
		}
		catch(Exception e){
			return false;
		}
	}
	
	@Override
	public ArrayList<String> listadoInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
		instrumentos.addAll(instrumentosQueToca);
		return instrumentos;
	}

	@Override
	public ArrayList<String> listadoGenerosPreferencia() {
		ArrayList<String> generos = new ArrayList<>();
		generos.addAll(generosDePreferencia);
		return generos;
	}

	@Override
	public ArrayList<String> listadoIdiomasPreferencia() {
		ArrayList<String> idiomas = new ArrayList<>();
		idiomas.addAll(idiomasQueCanta);
		return idiomas;
	}
	
	@Override
	public ArrayList<Banda> buscar(Filtro f) {
		ArrayList<Banda> listado = new ArrayList<>();
		if(f.cumple(this)) {
			listado.add(this);
		}
		return listado;
	}
}
