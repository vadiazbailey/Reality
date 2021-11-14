package Reality;

import java.util.ArrayList;
import java.util.Collections;

import filtros.Filtro;

public class Grupo extends Banda {
	
	
	//Atributos
	private ArrayList<Banda> participantes;
	
	//Constructor
	public Grupo(String nombre, ArrayList<Banda> participantes) {
		super(nombre);
		participantes = new ArrayList<>();
	}

	public void addParticipante(Banda participante) {
		participantes.add(participante);
	}
	
	@Override
	public int getEdad() {
		//La edad del grupo se calcula como el promedio de los participantes
		int edad = 0;
		for(Banda p: participantes) 
			edad += p.getEdad();
		return edad/participantes.size();
	}

	
	//Hacer interseccion para lista de generos de Coach
	@Override
	public ArrayList<String> listadoGenerosPreferencia() {
		ArrayList<String> generos = new ArrayList<>();
		generos.addAll((participantes.get(0)).listadoGenerosPreferencia());
		for(Banda p: participantes) {
			ArrayList<String> auxiliar = p.listadoGenerosPreferencia();
			for(String gen: generos) {
				if(!auxiliar.contains(gen))
					generos.remove(gen);
			}
		}
		Collections.sort(generos);
		return generos;
	}
	
	//Hacer una union para lista de Coach
	@Override
	public ArrayList<String> listadoIdiomasPreferencia() {
		ArrayList<String> idiomas = new ArrayList<>();
		for (Banda b : participantes) {
			ArrayList<String> aux = b.listadoIdiomasPreferencia();
			for (String idi : aux) {
				if(!idiomas.contains(idi))
					idiomas.add(idi);
			}
		}
		return idiomas;
	}

	@Override
	public ArrayList<String> listadoInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
		for (Banda b : participantes) {
			ArrayList<String> aux = b.listadoInstrumentos();
			for (String ins : aux) {
				if(!instrumentos.contains(ins))
					instrumentos.add(ins);
			}
		}
		return instrumentos;
	}
	
	@Override
	public ArrayList<Banda> buscar(Filtro f) {
		ArrayList<Banda> listado = new ArrayList<>();
		if(f.cumple(this)) {
			listado.add(this);
		}else {
			for(Banda b: listado) {
				listado.addAll(b.buscar(f));
			}
		}
		return listado;
	}

}
