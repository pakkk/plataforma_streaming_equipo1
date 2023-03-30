package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series;

/**
 * @author David Martinez
 */

/*
 * Class Series
 * Stores the Series
 */
import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Audiovisuals;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Type;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;

public class Series extends Audiovisuals
{
	/** Attribute - serieId */
	private int serieId;
	
	/** Attribute - nChapter */
	private int nChapter;
	
	/** Attribute - seasons */
	private int seasons;
	
	/** Attribute - Recommendation */
	private Recomendations recomendationsSerie[]=new Recomendations[0];
	
	/**
	 * 
	 * @param actors the actors
	 * @param directors the directors
	 * @param categ the categories
	 * @param tittle the title
	 * @param originalLenguaje the orignal language
	 * @param adaptedLenguajes the adapted languages
	 * @param avaliableSubtitles the avaliable subtitles
	 * @param duration the duration 
	 * @param creationYear the creation year
	 * @param nChapter the number of capitules
	 * @param seasons the seasons
	 * @param serieId the serie id
	 */
	public Series(Actors[] actors,Directors[] directors, Categorie[] categ, String tittle, String originalLenguaje,
			AdaptedLanguages[] adaptedLenguajes, Subtitles[] avaliableSubtitles, double duration, int creationYear,int nChapter
			,int seasons,int serieId) 
	{
		//Calls to pather constructor
		super(Type.SERIE, directors, actors, categ, tittle, originalLenguaje, adaptedLenguajes, avaliableSubtitles, duration, creationYear);

		this.nChapter=nChapter;
		this.seasons=seasons;
		this.serieId=serieId;
		
	}
	
	
	//toString method for print the attributes
	@Override
	public String toString() 
	{
		return "Type: " + this.type +"\n"
		+ "Actors:\n"
		+ ""+Arrays.toString(this.actors)+"\n"
		+"Categories:\n"
		+ ""+Arrays.toString(this.categ)+"\n"
		+ "Title : "+this.title+"\n"
		+ "Original Language: "+this.originalLanguage+"\n"
		+ "Adapted Languages:\n"
		+ ""+Arrays.toString(this.adaptedLanguages)+"\n"
		+ "Avaliable Subtitles:\n"
		+ ""+Arrays.toString(this.avaliableSubtitles)+"\n"
		+ "Total Duration Timpe:"+this.duration+"\n"
		+ "Creation Year: "+this.creationYear+"\n"
		+ "Total Seasons: "+this.seasons+"\n"
		+ "Total Capitules: "+this.nChapter+"\n"
		+ "Directors: \n"
		+ ""+Arrays.toString(this.directors)+"\n"
		+ " Serie id: "+this.serieId+"\n";
	}

	/* SETTERS AND GETTERS */
	
	/**
	 * 
	 * @param recomendationsSerie to set recomendation
	 */
	public void setRecomendationSerie(Recomendations recomendationsSerie) 
	{
		//Set recommendation 
		this.recomendationsSerie=Arrays.copyOf(this.recomendationsSerie,this.recomendationsSerie.length+1);
		this.recomendationsSerie[this.recomendationsSerie.length-1]=recomendationsSerie;
	}


	/**
	 * @return the nChapter
	 */
	public int getnChapter() {
		return nChapter;
	}


	/**
	 * @param nChapter the nChapter to set
	 */
	public void setnChapter(int nChapter) {
		this.nChapter = nChapter;
	}


	/**
	 * @return the seasons
	 */
	public int getSeasons() {
		return seasons;
	}


	/**
	 * @param seasons the seasons to set
	 */
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}


	/**
	 * @return the recomendationsSerie
	 */
	public Recomendations[] getRecomendationsSerie() {
		return recomendationsSerie;
	}


	/**
	 * @return the serieId
	 */
	public int getSerieId() 
	{
		return this.serieId;
	}


	/**
	 * @param serieId the serieId to set
	 */
	public void setSerieId(int serieId) 
	{
		this.serieId = serieId;
	}


	/**
	 * @param recomendationsSerie the recomendationsSerie to set
	 */
	public void setRecomendationsSerie(Recomendations[] recomendationsSerie) 
	{
		this.recomendationsSerie = recomendationsSerie;
	}
	
	
	/* SETTERS AND GETTERS */
}
