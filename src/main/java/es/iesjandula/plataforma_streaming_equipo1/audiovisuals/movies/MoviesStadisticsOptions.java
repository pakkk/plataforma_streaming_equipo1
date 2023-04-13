package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
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
public interface MoviesStadisticsOptions 
{
	/***
	 * 
	 * @param scanner the scanner
	 * @param scanner2 the scanner 2
	 * @param arrayMoviesGeneral the array movies general
	 */
	public static void movieStadistics(Scanner scanner,Scanner scanner2,Movies[] arrayMoviesGeneral) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Select option:\n"
				+ "[1] Number Of Movies\n"
				+ "[2] Information Of Movies , by Category\n"
				+ "[3] Information Of Movies , by Actors\n"
				+ "[4] View the Most Popular Movies (Positive Recomendations on TOP)\n"
				+ "[5] View the Most Unpopular Movies (Negative Recomendations on TOP)\n"
				+ "[6] Information Of Movies by Subtitles\n"
				+ "[7] Information Of Movies, by Directors\n");
		int selectedOption=0;
		selectedOption=scanner.nextInt();
		if(selectedOption==1) 
		{
			//----TOTAL OF MOVIES-------
			System.out.println("Total Movies in the System : "+arrayMoviesGeneral.length);
		}
		else if(selectedOption==2) 
		{
			//---------MOVIES BY CATEGORY IDS------------
			MoviesStadisticsOptions.movieByCategories(scanner, arrayMoviesGeneral);
			
		}
		else if(selectedOption==3) 
		{
			//---------MOVIES BY ACTORS IDS------------ J
			MoviesStadisticsOptions.movieByActors(scanner, arrayMoviesGeneral);
		}
		else if(selectedOption==4) 
		{
			//--------POPULAR TOP - POSITIVE RECOMENDATIONS----------
			MoviesStadisticsOptions.movieByPositives(arrayMoviesGeneral);
		}
		else if(selectedOption==5) 
		{
			//-------UN-POPULAR TOP - NEGATIVE RECOMENDATIONS----------
			MoviesStadisticsOptions.movieByNegatives(arrayMoviesGeneral);
		}
		else if(selectedOption==6) 
		{
			//--MOVIES--BY--SUBTITLES---
			MoviesStadisticsOptions.movieBySubtitles(arrayMoviesGeneral, scanner);
		}
		else if(selectedOption==7) 
		{
			//---------MOVIES BY DIRECTORS IDS------------
			MoviesStadisticsOptions.movieByDirectors(scanner, arrayMoviesGeneral);
		}
	}
	
	/**
	 * 
	 * @param scanner the scanner
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void movieByDirectors(Scanner scanner,Movies[] arrayMoviesGeneral) 
	{
		int moviesContResults=0;
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
		
		for(int directorIdx: arrayOfDirectorsId) 
		{
			for (Movies movie:arrayMoviesGeneral) 
			{
				
				for(Directors director : movie.getDirectors()) 
				{
					if(director.getDirectorId()==directorIdx) 
					{
						moviesContResults++;
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
	 * @param arrayMoviesGeneral array movies general
	 * @param scanner
	 */
	public static void movieBySubtitles(Movies[] arrayMoviesGeneral, Scanner scanner) 
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
				System.out.println("Movies : "+movie.getTitle()+" id: "+movie.getMovieId()+"\n"
						+ "Subtitles: "+Arrays.toString(movie.getAvaliableSubtitles())+"");
			}
		}
		
	}
	
	
	/**
	 * 
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void movieByNegatives(Movies[] arrayMoviesGeneral) 
	{
		System.out.println("Top Unpopular Movies:\n");
		
		int negativeRecomendationsCont=0;
		
		//---------GETTING THE CUANTITIE OF NEGATIVE RECOMENDATIONS BY SERIE--------------
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
				System.out.println(movie.getTitle()+" NEGATIVES --> "+negativeRecomendationsCont);
			}
			negativeRecomendationsCont=0;
		}
	}
	
	/**
	 * 
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void movieByPositives(Movies[] arrayMoviesGeneral) 
	{
		System.out.println("Top popular Movies:\n");
		
		int positiveRecomendationsCont=0;
		
		//---------GETTING THE CUANTITIE OF POSITIVE RECOMENDATIONS BY SERIE--------------
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
				System.out.println(movie.getTitle()+" POSITIVES --> "+positiveRecomendationsCont);
			}
			positiveRecomendationsCont=0;
		}
	}
	
	/** 
	 * @param scanner the scanner
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void movieByActors(Scanner scanner,Movies[] arrayMoviesGeneral) 
	{
		int moviesContResults=0;
		int[] arrayOfActorsId=new int[0];
		int actorId=0;
		while(actorId>=0) 
		{
			System.out.println("Indicate the Ids of Actors (-1 to finish)\n");
			actorId=scanner.nextInt();
			if(actorId>=0) 
			{
				arrayOfActorsId=Arrays.copyOf(arrayOfActorsId, arrayOfActorsId.length+1);
				arrayOfActorsId[arrayOfActorsId.length-1]=actorId;
			}
		}
		
		ScreenUtilities.clearScreen();
		System.out.println("Results: \n");
		for(int actorIdx: arrayOfActorsId) 
		{
			for (Movies movie:arrayMoviesGeneral) 
			{
				
				for(Actors actor : movie.getActors()) 
				{
					if(actor.getActorId()==actorIdx) 
					{
						moviesContResults++;
						System.out.println(movie);
					}
					
				}
			}
			System.out.println("-------Were found: "+moviesContResults+" Movies with actor id:"+actorIdx+"-------\n");	
			moviesContResults=0;//Reset for next Id
		}
		
	}
	
	/**
	 * 
	 * @param scanner the scanner
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void movieByCategories(Scanner scanner,Movies[] arrayMoviesGeneral) 
	{
		int moviesContResults=0;
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
