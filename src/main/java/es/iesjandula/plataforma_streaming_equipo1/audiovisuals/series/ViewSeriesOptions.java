package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series;

import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.animations.ViewAnimation;
/**
 * 
 * @author David Martinez
 *
 */
public interface ViewSeriesOptions 
{
	/**
	 * this interface implements the methods used to view the movie 
	 * @param scanner the scanner
	 * @param arraySeriesGeneral the series array general
	 * @throws InterruptedException the possible exception
	 */
	public static void viewSeries(Scanner scanner,Series[] arraySeriesGeneral) throws InterruptedException 
	{
		//--VIEW--SERIES---
		System.out.println("Series: \n");
		for (Series serie:arraySeriesGeneral) 
		{
			System.out.println("Title: "+serie.getTitle()+" | Id: "+serie.getSerieId()+" |  Views : "+serie.getViews()+" | Type: "+serie.getType());
		}
		System.out.println("Select ID for view:");
		int idSelected = scanner.nextInt();
		for (Series serie:arraySeriesGeneral) 
		{
			if(serie.getSerieId()==idSelected) 
			{
				System.out.println("Playing "+serie.getTitle());
				ViewAnimation.playingSerieMovie();
				serie.setViews(serie.getViews()+1);
			}
		}
	}
}
