package es.iesjandula.plataforma_streaming_equipo1.audiovisuals;

import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categories;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;

public class Audiovisuals {

	//Variables
	protected Type type;
	protected Directors[] directors= new Directors[0];
	protected Actors[] actores= new Actors[0]; 
	protected Categories[] categ = new Categories[0];
	protected String tittle;
	protected String originalLenguaje;
	protected String[] adaptedLenguajes = new String[0];
	protected Subtitles[] avaliableSubtitles = new Subtitles[0];
	protected Double duration;
	protected int creationYear;
	protected int views;
	
	//Constructor
	public Audiovisuals(Type type,Directors[] directors, Actors[] actores, Categories[] categ, String tittle, String originalLenguaje,
			String[] adaptedLenguajes, Subtitles[] avaliableSubtitles, Double duration, int creationYear) {
		this.type = type;
		this.directors=directors;
		this.actores = actores;
		this.categ = categ;
		this.tittle = tittle;
		this.originalLenguaje = originalLenguaje;
		this.adaptedLenguajes = adaptedLenguajes;
		this.avaliableSubtitles = avaliableSubtitles;
		this.duration = duration;
		this.creationYear = creationYear;
		this.views=0;
	}

	//Getters and setters
	
	
	public Type getType() {
		return type;
	}
	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public void setType(Type type) {
		this.type = type;
	}

	
	public Directors[] getDirectors() {
		return directors;
	}

	public void setDirectors(Directors directors) {
		this.directors=Arrays.copyOf(this.directors,this.directors.length+1);
		this.directors[this.directors.length-1]=directors;
	}

	public Actors[] getActores() {
		return actores;
	}
	public void setActores(Actors actores) {
		this.actores=Arrays.copyOf(this.actores,this.actores.length+1);
		this.actores[this.actores.length-1]=actores;
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
	public void setAdaptedLenguajes(String adaptedLenguajes) {
		this.adaptedLenguajes=Arrays.copyOf(this.adaptedLenguajes,this.adaptedLenguajes.length+1);
		this.adaptedLenguajes[this.adaptedLenguajes.length-1]=adaptedLenguajes;
	}

	public Subtitles[] getAvaliableSubtitles() {
		return avaliableSubtitles;
	}
	public void setAvaliableSubtitles(Subtitles avaliableSubtitles) {
		this.avaliableSubtitles=Arrays.copyOf(this.avaliableSubtitles,this.avaliableSubtitles.length+1);
		this.avaliableSubtitles[this.avaliableSubtitles.length-1]=avaliableSubtitles;
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
				+ "]"+Arrays.toString(directors)+" views: "+this.views;
	}
	
	
	
}
