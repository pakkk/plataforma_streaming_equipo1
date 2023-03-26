package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series;
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
	protected int nChapter;
	
	/** Attribute - seasons */
	protected int seasons;
	
	/** Attribute - Recommendation */
	protected Recomendations recomendationsSerie[]=new Recomendations[0];
	
	/*
	 * Constructor of the class , use the superClass constructor.
	 * 
	 */
	public Series(Actors[] actors,Directors[] directors, Categorie[] categ, String tittle, String originalLenguaje,
			AdaptedLanguages[] adaptedLenguajes, Subtitles[] avaliableSubtitles, double duration, int creationYear,int nChapter
			,int seasons,int serieId) 
	{
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
		+ ""+Arrays.toString(actors)+"\n"
		+"Categories:\n"
		+ ""+Arrays.toString(categ)+"\n"
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
		+ ""+Arrays.toString(directors)+"\n"
		+ " Serie id: "+this.serieId+"\n";
	}



	/* SETTERS AND GETTERS */
	
	
	public int getnChapter() 
	{
		//Get the number of capitules
		return nChapter;
	}

	public void setnChapter(int nChapter) 
	{
		//Set the number of chapter
		this.nChapter = nChapter;
	}

	public int getSeasons() 
	{
		//Get the seasons
		return this.seasons;
	}

	public void setSeasons(int seasons) 
	{
		//Set the seasons
		this.seasons = seasons;
	}

	public Recomendations[] getRecomendationsSerie() 
	{
		//Get the recommendations array
		return this.recomendationsSerie;
	}

	public void setRecomendationSerie(Recomendations recomendationsSerie) 
	{
		//Set recommendation 
		this.recomendationsSerie=Arrays.copyOf(this.recomendationsSerie,this.recomendationsSerie.length+1);
		this.recomendationsSerie[this.recomendationsSerie.length-1]=recomendationsSerie;
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
