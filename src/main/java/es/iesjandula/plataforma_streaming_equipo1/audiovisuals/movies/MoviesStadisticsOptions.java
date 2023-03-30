package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.RecomendationsType;

public interface MoviesStadisticsOptions 
{
	public static void clearScreen() 
	{	
		//Method for clear the screen
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
	
	public static void movieStadistics(Scanner scanner,Scanner scanner2,Movies[] arrayMoviesGeneral) 
	{
		clearScreen();
		System.out.println("Select option:\n"
				+ "[1] Number Of Movies\n"
				+ "[2] Information Of Movie , by Category\n"
				+ "[4] View the Most Popular Movies (Positive Recomendations on TOP)\n"
				+ "[5] View the Most Unpopular Movies (Negative Recomendations on TOP)\n"
				+ "[6] Coming son...");
		int selectedOption=0;
		selectedOption=scanner.nextInt();
		if(selectedOption==1) 
		{
			clearScreen();
			System.out.println("Total Movies in the System : "+arrayMoviesGeneral.length);
		}
		else if(selectedOption==2) 
		{
			//---------MOVIES BY CATEGORY IDS------------
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
			
			clearScreen();
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
		else if(selectedOption==3) 
		{
			//---------MOVIES BY ACTORS IDS------------
			int moviesContResults=0;
			int[] arrayOfActorsId=new int[0];
			int actorId=0;
			while(actorId>=0) 
			{
				System.out.println("Indicate the Ids of the Actors (-1 to finish)\n");
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
				System.out.println("-------Were found: "+moviesContResults+" Movies with the actor id:"+actorIdx+"-------\n");	
				moviesContResults=0;//Reset for next Id
			}
			
		}
		else if(selectedOption==4) 
		{
			//--------MOST-POPULARS TOP - POSITIVE RECOMENDATIONS----------
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
		else if(selectedOption==5) 
		{
			//--------MOST-UN-POPULARS TOP - NEGATIVE RECOMENDATIONS----------
			System.out.println("Top Most Unpopular Series:\n");
			int negativeRecomendationsCont=0;
			
			//---------GETTING THE CUANTITIE OF POSITIVE RECOMENDATIONS BY SERIE--------------
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
	}
}
