package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies;

import java.util.Scanner;

public interface ViewMoviesOptions 
{
	public static void viewMovies(Scanner scanner,Movies[] arrayMoviesGeneral) 
	{
		System.out.println("Movies: \n");
		for (Movies movie:arrayMoviesGeneral) 
		{
			System.out.println("Title: "+movie.getTitle()+" | Id: "+movie.getMovieId()+" |  Views : "+movie.getViews()+" | Type: "+movie.getType());
		}
		System.out.println("Select ID for view:");
		int idSelected = scanner.nextInt();
		for (Movies movie:arrayMoviesGeneral) 
		{
			if(movie.getMovieId()==idSelected) 
			{
				System.out.println("Playing "+movie.getTitle());
				movie.setViews(movie.getViews()+1);
			}
		}
	}
}
