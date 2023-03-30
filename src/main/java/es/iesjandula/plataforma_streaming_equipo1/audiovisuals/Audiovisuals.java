package es.iesjandula.plataforma_streaming_equipo1.audiovisuals;

import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;
/**
 * @LuisDavidCastillo
 * 
 * Audiovisuals class , store and use the audiovisuals
 */
public class Audiovisuals 
{

	/** Variable - type */
	protected Type type;
	
	/** Variable - directors */
	protected Directors[] directors= new Directors[0];
	
	/** Variable - actors */
	protected Actors[] actors= new Actors[0]; 
	
	/** Variable - categ */
	protected Categorie[] categ = new Categorie[0];
	
	/** Variable - title */
	protected String title;
	
	/** Variable - originalLanguage */
	protected String originalLanguage;
	
	/** Variable - adaptedLanguages */
	protected AdaptedLanguages[] adaptedLanguages = new AdaptedLanguages[0];
	
	/** Variable - avaliableSubtitles */
	protected Subtitles[] avaliableSubtitles = new Subtitles[0];
	
	/** Variable - duration */
	protected Double duration;
	
	/** Variable - creationYear */
	protected int creationYear;
	
	/** Variable - views */
	protected int views;
	
	/**
	 * Constructor
	 * 
	 * @param type with the type
	 * @param directors with the directors
	 * @param actores with the actors
	 * @param categ with the categories
	 * @param title with the title
	 * @param originalLanguage with the original language
	 * @param adaptedLanguages with the adapted languages
	 * @param avaliableSubtitles with the avaliables subtitles
	 * @param duration with the duration time
	 * @param creationYear with the creation year
	 */
	public Audiovisuals(Type type,Directors[] directors, Actors[] actores, Categorie[] categ, String title, String originalLanguage,
			AdaptedLanguages[] adaptedLanguages, Subtitles[] avaliableSubtitles, Double duration, int creationYear) 
	{
		this.type = type;
		this.directors=directors;
		this.actors = actores;
		this.categ = categ;
		this.title = title;
		this.originalLanguage = originalLanguage;
		this.adaptedLanguages = adaptedLanguages;
		this.avaliableSubtitles = avaliableSubtitles;
		this.duration = duration;
		this.creationYear = creationYear;
		this.views=0;
	}


	/**
	 * toString to print all attributes
	 */
	@Override
	public String toString() 
	{
		return "Audiovisuals [type=" + this.type + ", actores=" + Arrays.toString(this.actors) + ", categ="
				+ Arrays.toString(this.categ) + ", title=" + this.title + ", originalLanguage=" + this.originalLanguage
				+ ", adaptedLanguages=" + Arrays.toString(this.adaptedLanguages) + ", avaliableSubtitles="
				+ Arrays.toString(this.avaliableSubtitles) + ", duration=" + this.duration + ", creationYear=" + this.creationYear
				+ "]"+Arrays.toString(this.directors)+" views: "+this.views;
	}
	
	/**
	 * Getters and setters
	 *
	 *
	 * @return the type
	 */
	public Type getType() 
	{
		return this.type;
	}

	/**
	 * @param set the type
	 */
	public void setType(Type type) 
	{
		this.type = type;
	}

	/**
	 * @return the directors
	 */
	public Directors[] getDirectors() 
	{
		return this.directors;
	}

	/**
	 * @param set the directors
	 */
	public void setDirectors(Directors[] directors) 
	{
		this.directors = directors;
	}

	/**
	 * @return the actors
	 */
	public Actors[] getActors() 
	{
		return this.actors;
	}

	/**
	 * @param set the actors
	 */
	public void setActors(Actors[] actors) 
	{
		this.actors = actors;
	}

	/**
	 * @return the categ
	 */
	public Categorie[] getCateg() 
	{
		return this.categ;
	}

	/**
	 * @param set the categ
	 */
	public void setCateg(Categorie[] categ) 
	{
		this.categ = categ;
	}

	/**
	 * @return the title
	 */
	public String getTitle() 
	{
		return this.title;
	}

	/**
	 * @param set the title
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}

	/**
	 * @return the originalLanguage
	 */
	public String getOriginalLanguage() 
	{
		return this.originalLanguage;
	}

	/**
	 * @param set the originalLanguage
	 */
	public void setOriginalLanguage(String originalLanguage) 
	{
		this.originalLanguage = originalLanguage;
	}

	/**
	 * @return the adaptedLanguages
	 */
	public AdaptedLanguages[] getAdaptedLanguages()
	{
		return this.adaptedLanguages;
	}

	/**
	 * @param set the adaptedLanguages
	 */
	public void setAdaptedLanguages(AdaptedLanguages[] adaptedLanguages) 
	{
		this.adaptedLanguages = adaptedLanguages;
	}

	/**
	 * @return the avaliableSubtitles
	 */
	public Subtitles[] getAvaliableSubtitles()
	{
		return this.avaliableSubtitles;
	}

	/**
	 * @param set the avaliableSubtitles
	 */
	public void setAvaliableSubtitles(Subtitles[] avaliableSubtitles) 
	{
		this.avaliableSubtitles = avaliableSubtitles;
	}

	/**
	 * @return the duration
	 */
	public Double getDuration() 
	{
		return this.duration;
	}

	/**
	 * @param set the duration
	 */
	public void setDuration(Double duration) 
	{
		this.duration = duration;
	}

	/**
	 * @return the creationYear
	 */
	public int getCreationYear() 
	{
		return this.creationYear;
	}

	/**
	 * @param set the creationYear
	 */
	public void setCreationYear(int creationYear) 
	{
		this.creationYear = creationYear;
	}

	/**
	 * @return the views
	 */
	public int getViews() 
	{
		return this.views;
	}

	/**
	 * @param set the views
	 */
	public void setViews(int views) 
	{
		this.views = views;
	}
	
	
	
}
