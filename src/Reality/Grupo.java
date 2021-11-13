package Reality;

import java.util.ArrayList;
import java.util.Collections;

import filtros.Filtro;

public class Grupo extends Banda {
	
	private ArrayList<Banda> participantes;
	
	public Grupo(String nombre, ArrayList<Banda> participantes) {
		super(nombre);
		participantes = new ArrayList<>();
	}



	public void addParticipante(Banda participante) {
		participantes.add(participante);
	}
	
	@Override
	public ArrayList<String> listadoInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
		instrumentos.addAll((participantes.get(0)).listadoInstrumentos());
		for(Banda p: participantes) {
			ArrayList<String> auxiliar = p.listadoInstrumentos();
			for(String ins: instrumentos) {
				if(!auxiliar.contains(ins))
					instrumentos.remove(ins);
			}
		}
		return instrumentos;
	}

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
		idiomas.addAll((participantes.get(0)).listadoIdiomasPreferencia());
		for(Banda p: participantes) {
			ArrayList<String> auxiliar = p.listadoIdiomasPreferencia();
			for(String idi: idiomas) {
				if(!auxiliar.contains(idi))
					idiomas.remove(idi);
			}
		}
		return idiomas;
	}

	@Override
	public int getEdad() {
		int edad = 0;
		for(Banda p: participantes) 
			edad += p.getEdad();
		return edad/participantes.size();
	}

	@Override
	public String getNombre() {
		return this.nombre;
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
