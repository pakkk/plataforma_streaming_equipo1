package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies;

import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Audiovisuals;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Type;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;
/**
 * @author Pablo Serrano
 * Movies class , store the movies
 */
public class Movies extends Audiovisuals
{
	private int movieId;
	private Recomendations[] recomendationsMovies=new Recomendations[0];
	
	
	/**
	 * Constructor of the class
	 * 
	 * @param movies with the movies info
	 * 
	 * 
	 */
	
	public Movies(Actors[] actores,Directors[] directors, Categorie[] categ, String tittle, String originalLenguaje,
			AdaptedLanguages[] adaptedLenguajes, Subtitles[] avaliableSubtitles, double duration, int creationYear,int movieId) 
	{
		//Calls to the pather constructor.
		super(Type.MOVIE, directors, actores, categ, tittle, originalLenguaje, adaptedLenguajes, avaliableSubtitles, duration, creationYear);
		this.movieId=movieId;
	}
	
	
	/* SETTERS AND GETTERS*/
	/**
	 * 
	 * @return Recomendations array
	 */
	public Recomendations[] getRecomendationsMovies() 
	{	
		//Get recommendations
		return this.recomendationsMovies;
	}

	/**
	 * 
	 * @param recomendationsMovies the recomendation
	 */
	public void setRecomendationMovies(Recomendations recomendationsMovies) 
	{	
		//Set Recommendation
		this.recomendationsMovies = Arrays.copyOf(this.recomendationsMovies,this.recomendationsMovies.length+1);
		this.recomendationsMovies[this.recomendationsMovies.length-1]=recomendationsMovies;
		
	}

	/**
	 * @return the movieId
	 */
	public int getMovieId() 
	{
		return this.movieId;
	}


	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(int movieId) 
	{
		this.movieId = movieId;
	}


	/**
	 * @param recomendationsMovies the recomendationsMovies to set
	 */
	public void setRecomendationsMovies(Recomendations[] recomendationsMovies) 
	{
		this.recomendationsMovies = recomendationsMovies;
	}
	
	
	/* SETTERS AND GETTERS*/

	/**
	 * toString method for print attributes
	 * @return return , the return
	 */
	@Override
	public String toString() 
	{	
		
		return "movies [Movies=" +this.type +" "+Arrays.toString(this.actors)+" "
		+""+Arrays.toString(this.categ)+" "+this.title+" "+this.originalLanguage +" "+Arrays.toString(this.adaptedLanguages)+" "
		+ ""+Arrays.toString(this.avaliableSubtitles)+" "+ this.duration+" "+this.creationYear+"]"+" "+Arrays.toString(this.directors)+""
		+ " id "+this.movieId;
	}


}
