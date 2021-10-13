package Reality;

import java.util.ArrayList;

public class Participante {
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<String> generosDePreferencia;
	private ArrayList<String> idiomasQueCanta;
	private ArrayList<String> instrumentosQueToca;
	
	//Constructor
	public Participante(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		generosDePreferencia = new ArrayList<String>();
		idiomasQueCanta = new ArrayList<String>();
		instrumentosQueToca = new ArrayList<String>();
	}
	
	
}
