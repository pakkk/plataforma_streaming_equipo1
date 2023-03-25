package es.iesjandula.plataforma_streaming_equipo1.audiovisuals;

import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;
/*
 * Audiovisuals class , store the audiovisuals
 */
public class Audiovisuals 
{

	//Variables
	protected Type type;
	protected Directors[] directors= new Directors[0];
	protected Actors[] actores= new Actors[0]; 
	protected Categorie[] categ = new Categorie[0];
	protected String title;
	protected String originalLanguage;
	protected AdaptedLanguages[] adaptedLanguages = new AdaptedLanguages[0];
	protected Subtitles[] avaliableSubtitles = new Subtitles[0];
	protected Double duration;
	protected int creationYear;
	protected int views;
	
	//Constructor
	public Audiovisuals(Type type,Directors[] directors, Actors[] actores, Categorie[] categ, String title, String originalLanguage,
			AdaptedLanguages[] adaptedLanguages, Subtitles[] avaliableSubtitles, Double duration, int creationYear) 
	{
		this.type = type;
		this.directors=directors;
		this.actores = actores;
		this.categ = categ;
		this.title = title;
		this.originalLanguage = originalLanguage;
		this.adaptedLanguages = adaptedLanguages;
		this.avaliableSubtitles = avaliableSubtitles;
		this.duration = duration;
		this.creationYear = creationYear;
		this.views=0;
	}


	//ToString for print all attributes
	@Override
	public String toString() 
	{
		return "Audiovisuals [type=" + type + ", actores=" + Arrays.toString(actores) + ", categ="
				+ Arrays.toString(categ) + ", title=" + title + ", originalLanguage=" + originalLanguage
				+ ", adaptedLanguages=" + Arrays.toString(adaptedLanguages) + ", avaliableSubtitles="
				+ Arrays.toString(avaliableSubtitles) + ", duration=" + duration + ", creationYear=" + creationYear
				+ "]"+Arrays.toString(directors)+" views: "+views;
	}

	
	//Getters and setters
	
	/**
	 * @return the type
	 */
	public Type getType() {
		return this.type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the directors
	 */
	public Directors[] getDirectors() {
		return this.directors;
	}

	/**
	 * @param directors the directors to set
	 */
	public void setDirectors(Directors[] directors) {
		this.directors = directors;
	}

	/**
	 * @return the actores
	 */
	public Actors[] getActores() {
		return this.actores;
	}

	/**
	 * @param actores the actores to set
	 */
	public void setActores(Actors[] actores) {
		this.actores = actores;
	}

	/**
	 * @return the categ
	 */
	public Categorie[] getCateg() {
		return this.categ;
	}

	/**
	 * @param categ the categ to set
	 */
	public void setCateg(Categorie[] categ) {
		this.categ = categ;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the originalLanguage
	 */
	public String getOriginalLanguage() {
		return this.originalLanguage;
	}

	/**
	 * @param originalLanguage the originalLanguage to set
	 */
	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	/**
	 * @return the adaptedLanguages
	 */
	public AdaptedLanguages[] getAdaptedLanguages() {
		return this.adaptedLanguages;
	}

	/**
	 * @param adaptedLanguages the adaptedLanguages to set
	 */
	public void setAdaptedLanguages(AdaptedLanguages[] adaptedLanguages) {
		this.adaptedLanguages = adaptedLanguages;
	}

	/**
	 * @return the avaliableSubtitles
	 */
	public Subtitles[] getAvaliableSubtitles() {
		return this.avaliableSubtitles;
	}

	/**
	 * @param avaliableSubtitles the avaliableSubtitles to set
	 */
	public void setAvaliableSubtitles(Subtitles[] avaliableSubtitles) {
		this.avaliableSubtitles = avaliableSubtitles;
	}

	/**
	 * @return the duration
	 */
	public Double getDuration() {
		return this.duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Double duration) {
		this.duration = duration;
	}

	/**
	 * @return the creationYear
	 */
	public int getCreationYear() {
		return this.creationYear;
	}

	/**
	 * @param creationYear the creationYear to set
	 */
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	/**
	 * @return the views
	 */
	public int getViews() {
		return this.views;
	}

	/**
	 * @param views the views to set
	 */
	public void setViews(int views) {
		this.views = views;
	}
	
	
	
}
