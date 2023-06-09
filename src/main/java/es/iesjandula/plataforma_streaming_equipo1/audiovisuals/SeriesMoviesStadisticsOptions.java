package es.iesjandula.plataforma_streaming_equipo1.audiovisuals;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.Movies;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.Series;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.RecomendationsType;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.AvaliableSubtitles;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;
import es.iesjandula.plataforma_streaming_equipo1.utilities.ScreenUtilities;
/**
 * 
 *@author David Martinez
 *@author Pablo Serrano
 *@author Luis David
 *@author Antonio
 *@author Juan Miguel
 */
public interface SeriesMoviesStadisticsOptions 
{	
	
	/**
	 * 
	 * @param scanner the scanner
	 * @param arraySeriesGeneral array series general
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void serieMovieStadistics(Scanner scanner,Series[] arraySeriesGeneral,Movies[] arrayMoviesGeneral) 
	{
		//--MOVIE--AND SERIES---STADISTICS---------------
		ScreenUtilities.clearScreen();
		System.out.println("Select option:\n"
				+ "[1] Number Of Total Series and Movies\n"
				+ "[2] Information Of Series and Movies , by Categorys\n"
				+ "[4] View the Most Popular Movies and Series (Positive Recomendations on TOP)\n"
				+ "[5] View the Most Unpopular Movies and Series (Negative Recomendations on TOP)\n"
				+ "[6] Information Of Series and Movies by Subtitles\n"
				+ "[7] Information Of Movie, by Directors\n");
		
		int selectedOption=0;
		selectedOption=scanner.nextInt();
		
		if(selectedOption==1) 
		{
			//--TOTAL OF -- MOVIE--AND SERIES-------------
			ScreenUtilities.clearScreen();
			System.out.println("Total Series in the System : "+arraySeriesGeneral.length);
			System.out.println("Total Movies in the System : "+arrayMoviesGeneral.length);
			System.out.println("Sub-Total : "+(arraySeriesGeneral.length+arrayMoviesGeneral.length)+"");
		
		}
		else if(selectedOption==2) 
		{
			//---------SERIES AND MOVIES BY CATEGORY IDS------------
			serieMovieByCategories(scanner, arraySeriesGeneral, arrayMoviesGeneral);
		}
		else if(selectedOption==3) 
		{
			//---------SERIES AND MOVIES BY ACTORS IDS------------
			serieMovieByActor(scanner, arraySeriesGeneral, arrayMoviesGeneral);
		}
		else if(selectedOption==4) 
		{
			//--------POPULARS MOVIES AND SERIES TOP - POSITIVE RECOMENDATIONS----------
			serieMovieByPositives(arraySeriesGeneral, arrayMoviesGeneral);
		}
		else if(selectedOption==5) 
		{

			//--------UN-POPULARS MOVIES AND SERIES TOP - POSITIVE RECOMENDATIONS----------
			serieMovieByNegatives(arraySeriesGeneral, arrayMoviesGeneral);
		}
		else if(selectedOption==6) 
		{
			//--SERIES--BY--SUBTITLES---
			serieMovieBySubtitles(scanner, arraySeriesGeneral, arrayMoviesGeneral);
		}
		else if(selectedOption==7) 
		{
			//---------SERIES BY DIRECTORS IDS------------
			serieMovieByDirectors(scanner, arraySeriesGeneral, arrayMoviesGeneral);
		}
		
	}
	
	/**
	 * 
	 * @param scanner the scanner
	 * @param arraySeriesGeneral array series general
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void serieMovieByDirectors(Scanner scanner,Series[] arraySeriesGeneral,Movies[] arrayMoviesGeneral) 
	{
		int seriesContResults=0;
		int[] arrayOfDirectorsId=new int[0];
		int directorId=0;
		while(directorId>=0) 
		{
			System.out.println("Indicate the Ids of Directors (-1 to finish)\n");
			directorId=scanner.nextInt();
			if(directorId>=0) 
			{
				arrayOfDirectorsId=Arrays.copyOf(arrayOfDirectorsId, arrayOfDirectorsId.length+1);
				arrayOfDirectorsId[arrayOfDirectorsId.length-1]=directorId;
			}
		}
		
		ScreenUtilities.clearScreen();
		System.out.println("Resultados : \n");
		boolean exist=false;
		for(int directorIdx: arrayOfDirectorsId) 
		{
			exist=false;
			for (Series serie:arraySeriesGeneral) 
			{
				
				for(Directors director : serie.getDirectors()) 
				{
					if(director.getDirectorId()==directorIdx) 
					{
						seriesContResults++;
						exist=true;
						System.out.println(serie);
					}
					
				}
			}
			System.out.println("-------Were found: "+seriesContResults+" Series with director id:"+directorIdx+"-------\n");	
			seriesContResults=0;//Reset for next Id
		}
		int moviesContResults=0;
		exist=false;
		for(int directorIdx: arrayOfDirectorsId) 
		{
			exist=false;
			for (Movies movie:arrayMoviesGeneral) 
			{
				
				for(Directors director : movie.getDirectors()) 
				{
					if(director.getDirectorId()==directorIdx) 
					{
						moviesContResults++;
						exist=true;
						System.out.println(movie);
					}
					
				}
			}
			System.out.println("-------Were found: "+moviesContResults+" Movies with director id:"+directorIdx+"-------\n");	
			moviesContResults=0;//Reset for next Id
		}
	}
	
	/**
	 * 
	 * @param scanner the scanner
	 * @param arraySeriesGeneral array series general
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void serieMovieBySubtitles(Scanner scanner,Series[] arraySeriesGeneral,Movies[] arrayMoviesGeneral) 
	{
		int subtitleSelected=1;
		Subtitles[] totalSubtitles = new Subtitles[0];
		
		while(subtitleSelected>0) 
		{
			ScreenUtilities.clearScreen();
			System.out.println("Selected subtitles-> "+Arrays.toString(totalSubtitles));
			System.out.println("Select the subtitles: (-1 to finish)\n"
					+ "[1] ES\n"
					+ "[2] EN\n"
					+ "[3] DE\n"
					+ "[4] RU\n"
					+ "[5] IT\n"
					+ "[6] CH\n"
					+ "[7] OTHER");
			subtitleSelected = scanner.nextInt();
			
			if(subtitleSelected==1) 
			{
				totalSubtitles=Arrays.copyOf(totalSubtitles, totalSubtitles.length+1);
				totalSubtitles[totalSubtitles.length-1]=new Subtitles(AvaliableSubtitles.ES);
			}
			else if(subtitleSelected==2) 
			{
				totalSubtitles=Arrays.copyOf(totalSubtitles, totalSubtitles.length+1);
				totalSubtitles[totalSubtitles.length-1]=new Subtitles(AvaliableSubtitles.EN);
			}
			else if(subtitleSelected==3) 
			{
				totalSubtitles=Arrays.copyOf(totalSubtitles, totalSubtitles.length+1);
				totalSubtitles[totalSubtitles.length-1]=new Subtitles(AvaliableSubtitles.DE);
			}
			else if(subtitleSelected==4) 
			{
				totalSubtitles=Arrays.copyOf(totalSubtitles, totalSubtitles.length+1);
				totalSubtitles[totalSubtitles.length-1]=new Subtitles(AvaliableSubtitles.RU);
			}
			else if(subtitleSelected==5) 
			{
				totalSubtitles=Arrays.copyOf(totalSubtitles, totalSubtitles.length+1);
				totalSubtitles[totalSubtitles.length-1]=new Subtitles(AvaliableSubtitles.IT);
			}
			else if(subtitleSelected==6) 
			{
				totalSubtitles=Arrays.copyOf(totalSubtitles, totalSubtitles.length+1);
				totalSubtitles[totalSubtitles.length-1]=new Subtitles(AvaliableSubtitles.CH);
			}
			else if(subtitleSelected==7) 
			{
				totalSubtitles=Arrays.copyOf(totalSubtitles, totalSubtitles.length+1);
				totalSubtitles[totalSubtitles.length-1]=new Subtitles(AvaliableSubtitles.OTHER);
			}
		}
		
		for(Series serie : arraySeriesGeneral) 
		{
			boolean exists=false;
			for(Subtitles subtitle:serie.getAvaliableSubtitles()) 
			{
				for(Subtitles subtitle2 : totalSubtitles) 
				{
					if(subtitle.getSubtitle().equals(subtitle2.getSubtitle())) 
					{
						exists=true;
					}
				}
				
			}
			if(exists) 
			{
				System.out.println("Serie : "+serie.getTitle()+" id: "+serie.getSerieId()+"\n"
						+ "Subtitles: "+Arrays.toString(serie.getAvaliableSubtitles())+"");
			}
		}
		
		for(Movies movie : arrayMoviesGeneral) 
		{
			boolean exists=false;
			for(Subtitles subtitle:movie.getAvaliableSubtitles()) 
			{
				for(Subtitles subtitle2 : totalSubtitles) 
				{
					if(subtitle.getSubtitle().equals(subtitle2.getSubtitle())) 
					{
						exists=true;
					}
				}
				
			}
			if(exists) 
			{
				System.out.println("Movie : "+movie.getTitle()+" id: "+movie.getMovieId()+"\n"
						+ "Subtitles: "+Arrays.toString(movie.getAvaliableSubtitles())+"");
			}
		}
		
	}
	
	/**
	 * 
	 * @param arraySeriesGeneral array Series general
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void serieMovieByNegatives(Series[] arraySeriesGeneral,Movies[] arrayMoviesGeneral) 
	{
		System.out.println("Top Unpopular Movies and Series:\n");
		
		int negativeRecomendationsCont=0;
		
		for(Movies movie:arrayMoviesGeneral) 
		{
			for(Recomendations recomendation:movie.getRecomendationsMovies()) 
			{
				if(recomendation.getType().equals(RecomendationsType.NEGATIVE)) 
				{
					negativeRecomendationsCont++;
				}
				
			}
			if(negativeRecomendationsCont>0) 
			{
				System.out.println(movie.getTitle()+" NEGATIVE --> "+negativeRecomendationsCont+" | Type :"+movie.getType());
			}
			negativeRecomendationsCont=0;
		}
		
		for(Series serie:arraySeriesGeneral) 
		{
			for(Recomendations recomendation:serie.getRecomendationsSerie()) 
			{
				if(recomendation.getType().equals(RecomendationsType.NEGATIVE)) 
				{
					negativeRecomendationsCont++;
				}
				
			}
			if(negativeRecomendationsCont>0) 
			{
				System.out.println(serie.getTitle()+" NEGATIVE --> "+negativeRecomendationsCont+" | Type :"+serie.getType());
			}
			negativeRecomendationsCont=0;
		}
	}
	
	/**
	 * 
	 * @param arraySeriesGeneral array series general
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void serieMovieByPositives(Series[] arraySeriesGeneral,Movies[] arrayMoviesGeneral) 
	{
		System.out.println("Top popular Movies and Series:\n");
		
		int positiveRecomendationsCont=0;
		
		for(Movies movie:arrayMoviesGeneral) 
		{
			for(Recomendations recomendation:movie.getRecomendationsMovies()) 
			{
				if(recomendation.getType().equals(RecomendationsType.POSITIVE)) 
				{
					positiveRecomendationsCont++;
				}
				
			}
			if(positiveRecomendationsCont>0) 
			{
				System.out.println(movie.getTitle()+" POSITVE --> "+positiveRecomendationsCont+" | Type :"+movie.getType());
			}
			positiveRecomendationsCont=0;
		}
		
		for(Series serie:arraySeriesGeneral) 
		{
			for(Recomendations recomendation:serie.getRecomendationsSerie()) 
			{
				if(recomendation.getType().equals(RecomendationsType.POSITIVE)) 
				{
					positiveRecomendationsCont++;
				}
				
			}
			if(positiveRecomendationsCont>0) 
			{
				System.out.println(serie.getTitle()+" POSITVE --> "+positiveRecomendationsCont+" | Type :"+serie.getType());
			}
			positiveRecomendationsCont=0;
		}
	}
	
	/**
	 * 
	 * @param scanner the scanner
	 * @param arraySeriesGeneral array series general
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void serieMovieByActor(Scanner scanner,Series[] arraySeriesGeneral,Movies[] arrayMoviesGeneral) 
	{
		int seriesContResults=0;
		int[] arrayOfActorsId=new int[0];
		int actorId=0;
		while(actorId>=0) 
		{
			System.out.println(" Indicates the Ids of the Category (Gender) (-1 to finish)\n");
			actorId=scanner.nextInt();
			if(actorId>=0) 
			{
				arrayOfActorsId=Arrays.copyOf(arrayOfActorsId, arrayOfActorsId.length+1);
				arrayOfActorsId[arrayOfActorsId.length-1]=actorId;
			}
		}
		
		ScreenUtilities.clearScreen();
		System.out.println("Results : \n");
		for(int actorIdx: arrayOfActorsId) 
		{
			for (Series serie:arraySeriesGeneral) 
			{
				
				for(Actors actor : serie.getActors()) 
				{
					if(actor.getActorId()==actorIdx) 
					{
						seriesContResults++;
						System.out.println(serie);
					}
					
				}
			}
			System.out.println("-------Were found: "+seriesContResults+" Movies with actor id: "+actorIdx+"-------\n");	
			seriesContResults=0;//Reset for next Id
		}
		int moviesContResults=0;
		System.out.println("Results : \n");
		for(int actorIdx: arrayOfActorsId) 
		{
			for (Movies movie:arrayMoviesGeneral) 
			{
				
				for(Actors actor : movie.getActors()) {
					if(actor.getActorId()==actorIdx) {
						moviesContResults++;
						System.out.println(movie);
					}
					
				}
			}
			System.out.println("-------Were found: "+moviesContResults+" Movies with actor id: "+actorIdx+"--------\n");	
			moviesContResults=0;//Reset for next Id
		}
		
	}
	
	/**
	 * 
	 * @param scanner the scanner
	 * @param arraySeriesGeneral array series general
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void serieMovieByCategories(Scanner scanner,Series[] arraySeriesGeneral,Movies[] arrayMoviesGeneral) 
	{
		int seriesContResults=0;
		int[] arrayOfCategoriesId=new int[0];
		int categoryId=0;
		while(categoryId>=0) 
		{
			System.out.println("Indicates the Ids of the Category (Gender) (-1 to finish)\n");
			categoryId=scanner.nextInt();
			if(categoryId>=0) 
			{
			arrayOfCategoriesId=Arrays.copyOf(arrayOfCategoriesId, arrayOfCategoriesId.length+1);
			arrayOfCategoriesId[arrayOfCategoriesId.length-1]=categoryId;
			}
		}
		
		ScreenUtilities.clearScreen();
		System.out.println("Results : \n");
		for(int categoryIdx: arrayOfCategoriesId) 
		{
			for (Series serie:arraySeriesGeneral) 
			{
				
				for(Categorie category : serie.getCateg()) 
				{
					if(category.getCategorieID()==categoryIdx) 
					{
						seriesContResults++;
						System.out.println(serie);
					}
					
				}
			}
			System.out.println("-------Were found: "+seriesContResults+" Series with category id: "+categoryIdx+"-------\n");	
			seriesContResults=0;//Reset for next Id
		}
		int moviesContResults=0;
		for(int categoryIdx: arrayOfCategoriesId) 
		{
			for (Movies movie:arrayMoviesGeneral) 
			{
				
				for(Categorie category : movie.getCateg()) 
				{
					if(category.getCategorieID()==categoryIdx) 
					{
						moviesContResults++;
						System.out.println(movie);
					}
					
				}
			}
			System.out.println("-------Were found: "+moviesContResults+" Movies with category id:"+categoryIdx+"-------\n");	
			moviesContResults=0;//Reset for next Id
		}
	}
}
