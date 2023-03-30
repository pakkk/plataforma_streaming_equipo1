package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series;

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

public interface SeriesStadisticsOptions 
{
	public static void serieByNegatives(Series[] arraySeriesGeneral) 
	{
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
	public static void serieByPositives(Series[] arraySeriesGeneral) 
	{
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
	public static void serieByActors(Scanner scanner,Series[] arraySeriesGeneral) 
	{
		int seriesContResults=0;
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
	public static void serieByCategories(Scanner scanner,Series[] arraySeriesGeneral) 
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
			System.out.println("-------Were found: "+seriesContResults+" Series with category id:"+categoryIdx+"-------\n");	
			seriesContResults=0;//Reset for next Id
		}
	}
	
	/***
	 * 
	 * @param scanner the scanner
	 * @param scanner2 the scanner 2
	 * @param arraySeriesGeneral the array series general
	 */
	public static void serieStadistics(Scanner scanner,Scanner scanner2,Series[] arraySeriesGeneral) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Select option:\n"
				+ "[1] Number Of Series\n"
				+ "[2] Information Of Serie , by Category\n"
				+ "[3] Information Of Serie , by Actors\n"
				+ "[4] View the Most Popular Series (Positive Recomendations on TOP)\n"
				+ "[5] View the Most Unpopular Series (Negative Recomendations on TOP)\n"
				+ "[6] Information Of Serie by Subtitles\n"
				+ "[7] Information Of Serie, by Directors\n");
		int selectedOption=0;
		selectedOption=scanner.nextInt();
		if(selectedOption==1) 
		{
			//----TOTAL OF SERIES-------
			System.out.println("Total Series in the System : "+arraySeriesGeneral.length);
		}
		else if(selectedOption==2) 
		{
			//---------SERIES BY CATEGORY IDS------------
			serieByCategories(scanner, arraySeriesGeneral);
			
		}
		else if(selectedOption==3) 
		{
			//---------SERIES BY ACTORS IDS------------ J
			serieByActors(scanner, arraySeriesGeneral);
		}
		else if(selectedOption==4) 
		{
			//--------POPULAR TOP - POSITIVE RECOMENDATIONS----------
			serieByPositives(arraySeriesGeneral);
		}
		else if(selectedOption==5) 
		{
			//-------UN-POPULAR TOP - NEGATIVE RECOMENDATIONS----------
			serieByNegatives(arraySeriesGeneral);
		}
		else if(selectedOption==6) 
		{
			//--SERIES--BY--SUBTITLES---
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
			
		}
		else if(selectedOption==7) 
		{
			//---------SERIES BY DIRECTORS IDS------------
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
		}
	}
}
