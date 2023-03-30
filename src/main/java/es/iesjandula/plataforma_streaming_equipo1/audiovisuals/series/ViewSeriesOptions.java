package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series;

import java.util.Scanner;

public interface ViewSeriesOptions 
{
	public static void viewSeries(Scanner scanner,Series[] arraySeriesGeneral) 
	{
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
				serie.setViews(serie.getViews()+1);
			}
		}
	}
}
