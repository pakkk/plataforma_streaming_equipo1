package es.iesjandula.plataforma_streaming_equipo1.audiovisuals;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.Movies;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.Series;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.RecomendationsType;

public interface SeriesMoviesStadisticsOptions 
{
	public static void clearScreen() 
	{	
		//Method for clear the screen
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
	
	public static void serieMovieStadistics(Scanner scanner,Scanner scanner2,Series[] arraySeriesGeneral,Movies[] arrayMoviesGeneral) 
	{

		//--MOVIE--AND SERIES---STADISTICS---------------
		clearScreen();
		System.out.println("Select option:\n"
				+ "[1] Number Of Total Series and Movies\n"
				+ "[2] Information Of Sereis and Movies , by Categorys\n"
				+ "[4] View the Most Popular Movies and Series (Positive Recomendations on TOP)\n"
				+ "[5] View the Most Unpopular Movies and Series (Negative Recomendations on TOP)\n"
				+ "[6] Coming son...");
		int selectedOption=0;
		selectedOption=scanner.nextInt();
		
		if(selectedOption==1) 
		{
			//--MOVIE--AND SERIES---NUMBERS---------------
			clearScreen();
			System.out.println("Total Series in the System : "+arraySeriesGeneral.length);
			System.out.println("Total Movies in the System : "+arrayMoviesGeneral.length);
			System.out.println("Sub-Total : "+(arraySeriesGeneral.length+arrayMoviesGeneral.length)+"");
		//--MOVIE--AND SERIES---NUMBERS---------------
		}
		else if(selectedOption==2) 
		{
			//---------SERIES AND MOVIES BY CATEGORY IDS------------
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
			
			clearScreen();
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
			//---------SERIES AND MOVIES BY CATEGORY IDS------------
		}
		else if(selectedOption==3) 
		{
			//---------SERIES AND MOVIES BY ACTORS IDS------------
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
			
			clearScreen();
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
			//---------SERIES AND MOVIES BY ACTORS IDS------------
		}
		else if(selectedOption==4) 
		{
			//--------POPULARS MOVIES AND SERIES TOP - POSITIVE RECOMENDATIONS----------
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
		else if(selectedOption==5) 
		{

			//--------UN-POPULARS MOVIES AND SERIES TOP - POSITIVE RECOMENDATIONS----------
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
	}
}
