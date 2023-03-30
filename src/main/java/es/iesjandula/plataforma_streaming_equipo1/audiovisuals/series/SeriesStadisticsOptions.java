package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.RecomendationsType;

public interface SeriesStadisticsOptions 
{
	public static void clearScreen() 
	{	
		//Method for clear the screen
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
	public static void serieStadistics(Scanner scanner,Scanner scanner2,Series[] arraySeriesGeneral) 
	{
		clearScreen();
		System.out.println("Select option:\n"
				+ "[1] Number Of Series\n"
				+ "[2] Information Of Serie , by Category\n"
				+ "[3] Information Of Serie , by Actors\n"
				+ "[4] View the Most Popular Series (Positive Recomendations on TOP)\n"
				+ "[5] View the Most Unpopular Series (Negative Recomendations on TOP)\n"
				+ "[6] Coming son...");
		int selectedOption=0;
		selectedOption=scanner.nextInt();
		if(selectedOption==1) 
		{
			//----NUMBER OF SERIES SELECTED-------
			System.out.println("Total Series in the System : "+arraySeriesGeneral.length);
		}
		else if(selectedOption==2) 
		{
			//---------SERIES BY CATEGORY IDS------------
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
				System.out.println("-------Were found: "+seriesContResults+" Series with category id:"+categoryIdx+"-------\n");	
				seriesContResults=0;//Reset for next Id
			}
			
		}
		else if(selectedOption==3) 
		{
			//---------SERIES BY ACTORS IDS------------ J
			int seriesContResults=0;
			int[] arrayOfActorsId=new int[0];
			int actorId=0;
			while(actorId>=0) 
			{
				System.out.println("Indicate the las Ids de los/as Actors (-1 para terminar)\n");
				actorId=scanner.nextInt();
				if(actorId>=0) 
				{
					arrayOfActorsId=Arrays.copyOf(arrayOfActorsId, arrayOfActorsId.length+1);
					arrayOfActorsId[arrayOfActorsId.length-1]=actorId;
				}
			}
			
			clearScreen();
			System.out.println("Results: \n");
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
				System.out.println("-------Were found: "+seriesContResults+" Series with actor id:"+actorIdx+"-------\n");	
				seriesContResults=0;//Reset for next Id
			}
			
		}
		else if(selectedOption==4) 
		{
			//--------POPULAR TOP - POSITIVE RECOMENDATIONS----------
			System.out.println("Top popular Series:\n");
			
			int positiveRecomendationsCont=0;
			
			//---------GETTING THE CUANTITIE OF POSITIVE RECOMENDATIONS BY SERIE--------------
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
					System.out.println(serie.getTitle()+" POSITIVES --> "+positiveRecomendationsCont);
				}
				positiveRecomendationsCont=0;
			}
		}
		else if(selectedOption==5) 
		{
			//-------UN-POPULAR TOP - NEGATIVE RECOMENDATIONS----------
			System.out.println("Top Unpopular Series:\n");
			
			int negativeRecomendationsCont=0;
			
			//---------GETTING THE CUANTITIE OF NEGATIVE RECOMENDATIONS BY SERIE--------------
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
					System.out.println(serie.getTitle()+" NEGATIVES --> "+negativeRecomendationsCont);
				}
				negativeRecomendationsCont=0;
			}
		}
	}
}
