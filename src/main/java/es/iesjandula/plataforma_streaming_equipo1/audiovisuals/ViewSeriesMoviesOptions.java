package es.iesjandula.plataforma_streaming_equipo1.audiovisuals;
/**
 * 
 * @author David Martinez
 *
 */
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.animations.ViewAnimation;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.Movies;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.Series;


/**
 * 
 *  Interface for view series or movies
 *
 */

public interface ViewSeriesMoviesOptions 
{
	/**
	 * Method static 
	 * @param Scanner for read String
	 * @param Scanner for read number
	 * @param Arrays the movies 
	 * @param Arrray the series
	 *
	 */
	public static void viewSeriesMovies(Scanner scanner,Scanner scanner2,Movies[] arrayMoviesGeneral,Series[] arraySeriesGeneral) throws InterruptedException 
	{
		System.out.println("Series and Movies: \n");
		for (Series serie:arraySeriesGeneral) 
		{
			System.out.println("Title: "+serie.getTitle()+" | Id: "+serie.getSerieId()+" |  Views : "+serie.getViews()+" | Type: "+serie.getType());
		}
		for (Movies movie:arrayMoviesGeneral) 
		{
			System.out.println("Title: "+movie.getTitle()+" | Id: "+movie.getMovieId()+" |  Views : "+movie.getViews()+" | Type: "+movie.getType());
		}
		System.out.println("Indicate title to view:");
		String titleSelected = scanner2.nextLine();
		for (Series serie:arraySeriesGeneral) 
		{
			if(serie.getTitle().equals(titleSelected)) 
			{
				System.out.println("Playing "+serie.getTitle());
				ViewAnimation.playingSerieMovie();
				serie.setViews(serie.getViews()+1);
			}
		}
		for (Movies movie:arrayMoviesGeneral) 
		{
			if(movie.getTitle().equals(titleSelected)) 
			{
				ViewAnimation.playingSerieMovie();
				System.out.println("Playing "+movie.getTitle());
				movie.setViews(movie.getViews()+1);
			}
		}
	}
}
