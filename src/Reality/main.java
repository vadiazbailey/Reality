package Reality;

public class main {

	public static void main(String[] args) {
		
		//Produccion
		Produccion produccion = new Produccion();
		
		//Temas Musicales de Produccion
		TemaMusical elSensei = new TemaMusical("elSensei", "español");
		elSensei.addGeneroMusical("rock");
		elSensei.addInstrumentoMusical("guitarra");
		TemaMusical cerveza = new TemaMusical("cerveza", "español");
		cerveza.addGeneroMusical("pop");
		cerveza.addInstrumentoMusical("guiro");
		TemaMusical indigo = new TemaMusical("indigo", "español");
		indigo.addGeneroMusical("pop");
		indigo.addInstrumentoMusical("ukelele");
		produccion.addTema(elSensei);
		produccion.addTema(cerveza);
		produccion.addTema(indigo);
		
		//participantes equipo 1:
		Coach lali = new Coach("lali");
		Participante pocha = new Participante("pocha", 28,"diaz");
		Participante caro = new Participante("caro", 24, "navarrete");
		Participante beltran = new Participante("beltran",21, "peña");
		Participante chancha = new Participante("juan", 29, "mauro");
		Grupo teclas = new Grupo("teclas");
		teclas.addParticipante(pocha);
		teclas.addParticipante(caro);
		lali.addMiembroEquipo(teclas);
		lali.addMiembroEquipo(chancha);
		lali.addMiembroEquipo(beltran);
		
		//participantes equipo2:
		CoachExigente montaner = new CoachExigente("montaner");
		Participante juampi = new Participante("juan", 23,"correa");
		Participante trini = new Participante("trini",23,"monsalvo");
		Participante mela = new Participante("mela",23,"pedemonte");
		Participante anto = new Participante("anto",26,"miculic");
		Participante lucas = new Participante("lucas",21,"duana");
		Grupo losOtros = new Grupo("losOtros");
		losOtros.addParticipante(mela);
		losOtros.addParticipante(trini);
		juampi.addInstrumento("bateria");
		juampi.addIdioma("español");
		juampi.addIdioma("ingles");
		juampi.addGenero("pop");
		trini.addInstrumento("bateria");
		trini.addIdioma("español");
		trini.addIdioma("ingles");
		trini.addGenero("pop");
		mela.addInstrumento("bateria");
		mela.addIdioma("español");
		mela.addIdioma("ingles");
		mela.addGenero("pop");
		anto.addInstrumento("bateria");
		anto.addIdioma("español");
		anto.addIdioma("ingles");
		anto.addGenero("pop");
		montaner.addMiembroEquipo(juampi);
		montaner.addMiembroEquipo(lucas);
		montaner.addMiembroEquipo(anto);
		montaner.addMiembroEquipo(losOtros);
		System.out.println(montaner.toString());
	}

}
