package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series;
/*
 * Class Series
 * Stores the Series
 */
import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Audiovisuals;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Type;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;

public class Series extends Audiovisuals{
	/** Attribute - nCapitules */
	protected int nCapitules;
	
	/** Attribute - seasons */
	protected int seasons;
	
	/** Attribute - Recomentions */
	protected Recomendations recomendationsSerie[]=new Recomendations[0];
	
	/*
	 * Constructor of the class , use the superClass constructor.
	 * 
	 */
	public Series(Actors[] actores,Directors[] directors, Categorie[] categ, String tittle, String originalLenguaje,
			String[] adaptedLenguajes, Subtitles[] avaliableSubtitles, Double duration, int creationYear,int nCapitules
			,int seasons) 
	{
		super(Type.SERIE, directors, actores, categ, tittle, originalLenguaje, adaptedLenguajes, avaliableSubtitles, duration, creationYear);
		
		this.nCapitules=nCapitules;
		this.seasons=seasons;
		
	}
	
	
	//toString method for print the attributes
	@Override
	public String toString() 
	{
		return "Serie=" + type +" "+Arrays.toString(actores)+" "
		+""+Arrays.toString(categ)+" "+title+" "+originalLanguage +" "+Arrays.toString(adaptedLanguages)+" "
		+ ""+Arrays.toString(avaliableSubtitles)+" "+duration+" "+creationYear+" "+seasons+" "+nCapitules+" "+Arrays.toString(directors);
	}



	/* SETTERS AND GETTERS */
	
	
	public int getnCapitules() 
	{
		//Get the number of capitules
		return nCapitules;
	}

	public void setnCapitules(int nCapitules) 
	{
		//Set the number of capitules
		this.nCapitules = nCapitules;
	}

	public int getSeasons() 
	{
		//Get the seasons
		return seasons;
	}

	public void setSeasons(int seasons) 
	{
		//Set the seasons
		this.seasons = seasons;
	}

	public Recomendations[] getRecomendationsSerie() 
	{
		//Get the recomendations array
		return recomendationsSerie;
	}

	public void setRecomendationsSerie(Recomendations recomendationsSerie) 
	{
		//Set recomendation 
		this.recomendationsSerie=Arrays.copyOf(this.recomendationsSerie,this.recomendationsSerie.length+1);
		this.recomendationsSerie[this.recomendationsSerie.length-1]=recomendationsSerie;
	}
	/* SETTERS AND GETTERS */
	


}
