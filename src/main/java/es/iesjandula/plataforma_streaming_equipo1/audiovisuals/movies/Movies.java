package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies;

import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Audiovisuals;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Type;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categories;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;

public class Movies extends Audiovisuals{
	protected Recomendations[] recomendationsMovies=new Recomendations[0];
	
	
	/**
	 * Constructor of the class
	 * 
	 * @param movies with the movies info
	 * 
	 * 
	 */
	
	public Movies(Actors[] actores, Categories[] categ, String tittle, String originalLenguaje,
			String[] adaptedLenguajes, Subtitles[] avaliableSubtitles, Double duration, int creationYear) {
		super(Type.PELICULA, actores, categ, tittle, originalLenguaje, adaptedLenguajes, avaliableSubtitles, duration, creationYear);
		// TODO Auto-generated constructor stub
	}
	
	
	/* SETTERS AND GETTERS*/
	public Recomendations[] getRecomendationsMovies() {
		return recomendationsMovies;
	}

	public void setRecomendationsMovies(Recomendations recomendationsMovies) {
		this.recomendationsMovies = Arrays.copyOf(this.recomendationsMovies,this.recomendationsMovies.length+1);
		this.recomendationsMovies[this.recomendationsMovies.length-1]=recomendationsMovies;
		
	}
	/* SETTERS AND GETTERS*/


	@Override
	public String toString() {
		return "movies [Movies=" + this.type +" "+Arrays.toString(this.actores)+" "
				+""+Arrays.toString(this.categ)+" "+this.tittle+" "+this.originalLenguaje +" "+Arrays.toString(this.adaptedLenguajes)+" "
						+ ""+Arrays.toString(this.avaliableSubtitles)+" "+ this.duration+" "+this.creationYear+"]";
	}
	
	

}
