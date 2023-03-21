package es.iesjandula.plataforma_streaming_equipo1.audiovisuals;

import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categories;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;

public class Audiovisuals {

	//Variables
	protected Type type;
	protected Actors[] actores= new Actors[0]; 
	protected Categories[] categ = new Categories[0];
	protected String tittle;
	protected String originalLenguaje;
	protected String[] adaptedLenguajes = new String[0];
	protected Subtitles[] avaliableSubtitles = new Subtitles[0];
	protected Double duration;
	protected int creationYear;
	
	//Constructor
	public Audiovisuals(Type type, Actors[] actores, Categories[] categ, String tittle, String originalLenguaje,
			String[] adaptedLenguajes, Subtitles[] avaliableSubtitles, Double duration, int creationYear) {
		this.type = type;
		this.actores = actores;
		this.categ = categ;
		this.tittle = tittle;
		this.originalLenguaje = originalLenguaje;
		this.adaptedLenguajes = adaptedLenguajes;
		this.avaliableSubtitles = avaliableSubtitles;
		this.duration = duration;
		this.creationYear = creationYear;
	}

	//Getters and setters
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	public Actors[] getActores() {
		return actores;
	}
	public void setActores(Actors[] actores) {
		this.actores = actores;
	}

	public Categories[] getCateg() {
		return categ;
	}
	public void setCateg(Categories categ) {
		this.categ=Arrays.copyOf(this.categ,this.categ.length+1);
		this.categ[this.categ.length-1]=categ;
	}

	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getOriginalLenguaje() {
		return originalLenguaje;
	}
	public void setOriginalLenguaje(String originalLenguaje) {
		this.originalLenguaje = originalLenguaje;
	}

	public String[] getAdaptedLenguajes() {
		return adaptedLenguajes;
	}
	public void setAdaptedLenguajes(String[] adaptedLenguajes) {
		this.adaptedLenguajes = adaptedLenguajes;
	}

	public Subtitles[] getAvaliableSubtitles() {
		return avaliableSubtitles;
	}
	public void setAvaliableSubtitles(Subtitles[] avaliableSubtitles) {
		this.avaliableSubtitles = avaliableSubtitles;
	}

	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public int getCreationYear() {
		return creationYear;
	}
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	//ToString
	@Override
	public String toString() {
		return "Audiovisuals [type=" + type + ", actores=" + Arrays.toString(actores) + ", categ="
				+ Arrays.toString(categ) + ", tittle=" + tittle + ", originalLenguaje=" + originalLenguaje
				+ ", adaptedLenguajes=" + Arrays.toString(adaptedLenguajes) + ", avaliableSubtitles="
				+ Arrays.toString(avaliableSubtitles) + ", duration=" + duration + ", creationYear=" + creationYear
				+ "]";
	}
	
	
	
}
