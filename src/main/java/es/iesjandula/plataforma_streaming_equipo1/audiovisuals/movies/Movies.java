package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies;

import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Audiovisuals;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Type;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;
/*
 * Movies class , store the movies
 */
public class Movies extends Audiovisuals
{
	protected Recomendations[] recomendationsMovies=new Recomendations[0];
	
	
	/**
	 * Constructor of the class
	 * 
	 * @param movies with the movies info
	 * 
	 * 
	 */
	
	public Movies(Actors[] actores,Directors[] directors, Categorie[] categ, String tittle, String originalLenguaje,
			String[] adaptedLenguajes, Subtitles[] avaliableSubtitles, Double duration, int creationYear) 
	{//Calls to the pather constructor.
		super(Type.PELICULA, directors, actores, categ, tittle, originalLenguaje, adaptedLenguajes, avaliableSubtitles, duration, creationYear);
		
	}
	
	
	/* SETTERS AND GETTERS*/
	public Recomendations[] getRecomendationsMovies() 
	{	//Get recomendations
		return recomendationsMovies;
	}

	public void setRecomendationsMovies(Recomendations recomendationsMovies) 
	{	//Set Recomendation
		this.recomendationsMovies = Arrays.copyOf(this.recomendationsMovies,this.recomendationsMovies.length+1);
		this.recomendationsMovies[this.recomendationsMovies.length-1]=recomendationsMovies;
		
	}
	/* SETTERS AND GETTERS*/


	@Override
	public String toString() 
	{	//toString method for print attributes
		return "movies [Movies=" +type +" "+Arrays.toString(actores)+" "
		+""+Arrays.toString(categ)+" "+title+" "+originalLanguage +" "+Arrays.toString(adaptedLanguages)+" "
		+ ""+Arrays.toString(avaliableSubtitles)+" "+ duration+" "+creationYear+"]"+" "+Arrays.toString(directors);
	}
	
	

}
