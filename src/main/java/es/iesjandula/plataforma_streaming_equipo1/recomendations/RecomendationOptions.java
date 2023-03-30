package es.iesjandula.plataforma_streaming_equipo1.recomendations;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.Movies;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.Series;
import es.iesjandula.plataforma_streaming_equipo1.utilities.ScreenUtilities;

/**
 * @author David Martinez
 */
public interface RecomendationOptions 
{
	/**
	 * 
	 * @param scanner 
	 * @param scanner2
	 * @param arrayRecomendationsGeneral the romendations array
	 * @param arrayMoviesGeneral the movies array
	 * @param arraySeriesGeneral the series array
	 * @return Object array
	 */
	public static Object[] createRecomendation(Scanner scanner,Scanner scanner2, Recomendations[] arrayRecomendationsGeneral,Movies[] arrayMoviesGeneral, Series[] arraySeriesGeneral) 
	{

		//-------------CREATE-RECOMENDATION-----------------
		System.out.println("Texto de la Recomandacion:");
		String texto=scanner2.nextLine();
		ScreenUtilities.clearScreen();
		System.out.println("Text of the recomemendation:\n"
				+ "[1] Positive\n"
				+ "[2] Negative\n"
				+ "[3] Neutral\n");
		int recomendationType=scanner.nextInt();
		RecomendationsType x;
		if (recomendationType==1) 
		{
			x=RecomendationsType.POSITIVE;
		}
		else if (recomendationType==2) 
		{
			x=RecomendationsType.NEGATIVE;
		}
		else 
		{
			x=RecomendationsType.NEUTRAL;
		}

		ScreenUtilities.clearScreen();
		
		arrayRecomendationsGeneral=Arrays.copyOf(arrayRecomendationsGeneral, arrayRecomendationsGeneral.length+1);
		arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1]=new Recomendations(texto,x);
		System.out.println(arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1]);
		
		//-------------ADD-RECOMENDATION-TO-SERIE-MOVIE------------------
		System.out.println("Indicate if the recommendation is for a Series or a Movie:\n"
		+ "[1] Serie\n"
		+ "[2] Movie\n");
		int selectionType=0;
		selectionType=scanner.nextInt();
		
		if(selectionType==1) 
		{
			System.out.println("Indicate the Id of Serie: ");
			int serieSelectedId=0;
			serieSelectedId=scanner.nextInt();
			
			boolean exist=false;
			for(Series serie:arraySeriesGeneral) 
			{
				if(serie.getSerieId()==serieSelectedId) 
				{
					exist=true;
					//ADD THE LAST RECOMENDATION CREATED
					System.out.println("Serie found: "+serie.getTitle());
					serie.setRecomendationSerie(arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1]);
				}
			}
			if(!exist) 
			{
				System.out.println("There isn´t a Serie with this id: "+serieSelectedId+" , the recommendation will be canceled");
				//DELETE THE LAST
				arrayRecomendationsGeneral=Arrays.copyOf(arrayRecomendationsGeneral, arrayRecomendationsGeneral.length-1);
			}
		}
		else if(selectionType==2) 
		{
			System.out.println("Indicate the Id of the Serie: ");
			int movieSelectedId=0;
			movieSelectedId=scanner.nextInt();
			
			boolean exist=false;
			for(Movies movie:arrayMoviesGeneral) 
			{
				if(movie.getMovieId()==movieSelectedId) 
				{
					exist=true;
					//ADD THE LAST RECOMENDATION CREATED
					System.out.println("Movie found: "+movie.getTitle());
					movie.setRecomendationMovies(arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1]);
				}
			}
			if(!exist) 
			{
				System.out.println("There isn´t a movie with this id: "+movieSelectedId+" , the recommendation will be canceled");
				//DELETE THE LAST
				arrayRecomendationsGeneral=Arrays.copyOf(arrayRecomendationsGeneral, arrayRecomendationsGeneral.length-1);
			}
		}
		
		Object[] objects={arrayRecomendationsGeneral,arraySeriesGeneral,arrayMoviesGeneral};
		return objects;
		//-------------ADD-RECOMENDATION-TO-SERIE-MOVIE------------------
	}
	
	
	/**
	 * 
	 * @param scanner the scanner
	 * @param scanner2 the scanner 2
	 * @param arrayRecomendationsGeneral the array of recomendations
	 * @return Recomendations array
	 */
	public static Recomendations[] modifyRecomendation(Scanner scanner,Scanner scanner2, Recomendations[] arrayRecomendationsGeneral) 
	{
		//-------------MODIFY-RECOMENDATION-----------------
		ScreenUtilities.clearScreen();
		System.out.println("Select the search method to modify: \n"
				+ "[1] Text \n"
				+ "[2] Type (Positive,Negative,Neutral) \n");
		int selection1 = scanner.nextInt();
		ScreenUtilities.clearScreen();
		if (selection1==1) 
		{
			//--MODIFY-BY-TEXT--
			System.out.println("Indicate the text \n");
			String texto=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Recomendations recomendation:arrayRecomendationsGeneral) 
			{
				if (recomendation.getRecomendations().contains(texto)) 
				{
					System.out.println(recomendation);
					System.out.println("Indicate what you want to change:\n"
							+ "[1] Text\n"
							+ "[2] Type(Positive,Negative,Neutra)");
					int selection2 = scanner.nextInt();
					if(selection2==1)
					{
						System.out.println("Indicate the new text: \n");
						recomendation.setRecomendations(scanner2.nextLine());
					}
					else
					{
						System.out.println("New type of recomendation:\n"
								+ "[1] Positive\n"
								+ "[2] Negative\n"
								+ "[3] Neutral\n");
						int recomendationType=scanner.nextInt();
						RecomendationsType x;
						if (recomendationType==1) 
						{
							x=RecomendationsType.POSITIVE;
						}
						else if (recomendationType==2) 
						{
							x=RecomendationsType.NEGATIVE;
						}
						else
						{
							x=RecomendationsType.NEUTRAL;
						}
						recomendation.setType(x);
					}
				}
			}
			//--MODIFY-BY-TEXT--
			
		}
		else if (selection1==2)
		{
			//--MODIFY-BY-TYPE--
			System.out.println("Indicate the type of recommendation:\n"
					+ "[1] Positive\n"
					+ "[2] Negative\n"
					+ "[3] Neutral\n");
			int recomendationType=scanner.nextInt();
			RecomendationsType x;
			if (recomendationType==1) 
			{
				x=RecomendationsType.POSITIVE;
			}
			else if (recomendationType==2) 
			{
				x=RecomendationsType.NEGATIVE;
			}
			else 
			{
				x=RecomendationsType.NEUTRAL;
			}
			
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Recomendations recomendation:arrayRecomendationsGeneral) 
			{
				if (recomendation.getType().equals(x))
				{
					System.out.println(recomendation);
					System.out.println("Indicate what you want to change: \n"
							+ "[1] Text\n"
							+ "[2] Type(Positive,Negative,Neutra)");
					int selection2 = scanner.nextInt();
					if(selection2==1)
					{
						System.out.println("Indicate the new text:\n");
						recomendation.setRecomendations(scanner2.nextLine());
					}
					else
					{
						System.out.println("New type of recommendation:\n"
								+ "[1] Positive\n"
								+ "[2] Negative\n"
								+ "[3] Neutral\n");
						int recomendationType2=scanner.nextInt();
						RecomendationsType x2;
						
						if (recomendationType2==1) 
						{
							x2=RecomendationsType.POSITIVE;
						}
						else if (recomendationType2==2) 
						{
							x2=RecomendationsType.NEGATIVE;
						}
						else 
						{
							x2=RecomendationsType.NEUTRAL;
						}
						recomendation.setType(x2);
					}
				}
			}
		}
		
		return arrayRecomendationsGeneral;
		//--MODIFY-BY-TYPE--
	}


	/**
	 * 
	 * @param scanner 
	 * @param scanner2
	 * @param arrayRecomendationsGeneral the romendations array
	 * @param arrayMoviesGeneral the movies array
	 * @param arraySeriesGeneral the series array
	 * @return Object array
	 */
	public static Object[] deleteRecomendation(Scanner scanner,Scanner scanner2, Recomendations[] arrayRecomendationsGeneral,Movies[] arrayMoviesGeneral,Series[] arraySeriesGeneral) 
	{

		//--DELETE---RECOMENDATIONS---
		ScreenUtilities.clearScreen();
		System.out.println("Select the search method to delete: \n"
				+ "[1] Text \n"
				+ "[2] Type (Positive,Negative,Neutral) \n");
		int selection1 = scanner.nextInt();
		ScreenUtilities.clearScreen();
		int cont=0;
		if (selection1==1) 
		{
			//--DELETE-BY-TEXT--
			System.out.println("Indicate the text \n");
			String texto=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Recomendations recomendation:arrayRecomendationsGeneral) 
			{
				if (recomendation.getRecomendations().contains(texto)) 
				{
					System.out.println("Erased:\n"+recomendation+"\n");
					System.out.println("Position: "+cont);
					
					for(Series serie:arraySeriesGeneral) 
					{
						int count=0;
						Recomendations newRecomendations[]=serie.getRecomendationsSerie();
						for(Recomendations recomen : newRecomendations) 
						{
							if(recomen.getRecomendations().contains(texto)) 
							{
								if(newRecomendations.length==1) 
								{
									newRecomendations= new Recomendations[0];
								}
								else 
								{
									newRecomendations[count]=newRecomendations[newRecomendations.length-1];
									newRecomendations=Arrays.copyOf(newRecomendations, newRecomendations.length-1);
								}
							}
							count++;
						}
						serie.setRecomendationsSerie(newRecomendations);
					}
					
					for(Movies movie:arrayMoviesGeneral) 
					{
						int count=0;
						Recomendations newRecomendations[]=movie.getRecomendationsMovies();
						for(Recomendations recomen : newRecomendations) 
						{
							if(recomen.getRecomendations().contains(texto)) 
							{
								if(newRecomendations.length==1) 
								{
									newRecomendations= new Recomendations[0];
								}
								else 
								{
									newRecomendations[count]=newRecomendations[newRecomendations.length-1];
									newRecomendations=Arrays.copyOf(newRecomendations, newRecomendations.length-1);
								}
							}
							count++;
						}
						movie.setRecomendationsMovies(newRecomendations);
					}
					
					
					for(int i=0;i<arrayRecomendationsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayRecomendationsGeneral[i]=arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1];
						}
						
					}
					
					arrayRecomendationsGeneral=Arrays.copyOf(arrayRecomendationsGeneral, arrayRecomendationsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayRecomendationsGeneral));
			cont=0;
			//--DELETE-BY-TEXT--
			
		}
		else if (selection1==2) 
		{
			//--DELETE-BY-TYPE--
			System.out.println("Type of recomendation:\n"
					+ "[1] Positive\n"
					+ "[2] Negative\n"
					+ "[3] Neutral\n");
			int recomendationType=scanner.nextInt();
			RecomendationsType x;
			if (recomendationType==1) 
			{
				x=RecomendationsType.POSITIVE;
			}
			else if (recomendationType==2) 
			{
				x=RecomendationsType.NEGATIVE;
			}
			else 
			{
				x=RecomendationsType.NEUTRAL;
			}
			
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Recomendations recomendation:arrayRecomendationsGeneral) 
			{
				if (recomendation.getType().equals(x)) {
					System.out.println("Erased:\n"+recomendation+"\n");
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayRecomendationsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayRecomendationsGeneral[i]=arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1];
						}
						
					}
					
					arrayRecomendationsGeneral=Arrays.copyOf(arrayRecomendationsGeneral, arrayRecomendationsGeneral.length-1);
				}
				cont+=1;
			}
			for(Series serie:arraySeriesGeneral) 
			{
				int count=0;
				Recomendations[] newRecomendations=serie.getRecomendationsSerie();
				for(Recomendations recomen : newRecomendations) 
				{
					if(recomen.getType().equals(x)) 
					{
						if(newRecomendations.length==1) 
						{
							newRecomendations= new Recomendations[0];
						}
						else 
						{
							newRecomendations[count]=newRecomendations[newRecomendations.length-1];
							newRecomendations=Arrays.copyOf(newRecomendations, newRecomendations.length-1);
						}
					}
					count++;
				}
				serie.setRecomendationsSerie(newRecomendations);
			}
			
			for(Movies movie:arrayMoviesGeneral) 
			{
				int count=0;
				Recomendations[] newRecomendations=movie.getRecomendationsMovies();
				for(Recomendations recomen : newRecomendations) 
				{
					if(recomen.getType().equals(x)) 
					{
						newRecomendations[count]=newRecomendations[newRecomendations.length-1];
						newRecomendations=Arrays.copyOf(newRecomendations, newRecomendations.length-1);
					}
					count++;
				}
				movie.setRecomendationsMovies(newRecomendations);
			}
			System.out.println(Arrays.toString(arrayRecomendationsGeneral));
			cont=0;
		}
		//--DELETE-BY-TYPE--
		
		Object[] objects={arrayRecomendationsGeneral,arraySeriesGeneral,arrayMoviesGeneral};
		return objects;
		
	}
	
	
	/**
	 * 
	 * @param scanner 
	 * @param scanner2
	 * @param arrayRecomendationsGeneral the romendations array
	 * @param arrayMoviesGeneral the movies array
	 * @param arraySeriesGeneral the series array
	 * 
	 */
	public static void searchRecomendation(Scanner scanner,Scanner scanner2, Recomendations[] arrayRecomendationsGeneral,Movies[] arrayMoviesGeneral, Series[] arraySeriesGeneral) 
	{

		//-------------SEARCH-RECOMENDATIONS-----------------
		ScreenUtilities.clearScreen();
		System.out.println("Select the search method: \n"
				+ "[1] Text \n"
				+ "[2] Type (Positive,Negative,Neutral) \n"
				+ "[3] Serie or Movie ID\n");
		int selection1 = scanner.nextInt();
		ScreenUtilities.clearScreen();
		if (selection1==1) 
		{
			//--SARCH-BY-TEXT--
			System.out.println("Indicate the text \n");
			String text=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Recomendations recomendation:arrayRecomendationsGeneral) 
			{
				if (recomendation.getRecomendations().contains(text)) 
				{
					System.out.println(recomendation);
				}
			}
			//--SARCH-BY-TEXT--
			
		}
		else if (selection1==2) 
		{
			//--SARCH-BY-TYPE--
			System.out.println("Type of recommendation:\n"
					+ "[1] Positive\n"
					+ "[2] Negative\n"
					+ "[3] Neutral\n");
			int recomendationType=scanner.nextInt();
			RecomendationsType x;
			if (recomendationType==1) 
			{
				x=RecomendationsType.POSITIVE;
			}
			else if (recomendationType==2) 
			{
				x=RecomendationsType.NEGATIVE;
			}
			else 
			{
				x=RecomendationsType.NEUTRAL;
			}
			
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Recomendations recomendation:arrayRecomendationsGeneral) 
			{
				if (recomendation.getType().equals(x))
				{
					System.out.println(recomendation);
				}
			}
		}//--SARCH-BY-TYPE--
		else if(selection1==3) 
			//--SEARCH BY - SERIE - MOVIE ID
		{
			System.out.println("Indicate the option:\n"
			+ "[1] Indicate the serie Id\n"
			+ "[2] Indicate the Movie Id\n"
			+ "");
			int selectionTypeId=scanner.nextInt();
			if(selectionTypeId==1) 
			{
				System.out.println("Indicate the ID of serie: ");
				int serieIdSelected=scanner.nextInt();
				
				boolean exist=false;
				
				for(Series serie : arraySeriesGeneral) 
				{
					if(serie.getSerieId()==serieIdSelected) 
					{
						exist=true;
						System.out.println("Serie found : "+serie.getTitle());
						System.out.println("Recommendations:\n"
						+ Arrays.toString(serie.getRecomendationsSerie()));
					}
				}
				if(!exist) 
				{
					System.out.println("No Series found with id:"+serieIdSelected);
				}
			}
			else if(selectionTypeId==2) 
			{
				System.out.println("Indicate the Id of the Movie: ");
				int movieIdSelected=scanner.nextInt();
				
				boolean exist=false;
				
				for(Movies movie : arrayMoviesGeneral) 
				{
					if(movie.getMovieId()==movieIdSelected) 
					{
						exist=true;
						System.out.println("Movie found : "+movie.getTitle());
						System.out.println("Recommendations:\n"
						+ Arrays.toString(movie.getRecomendationsMovies()));
					}
				}
				if(!exist) 
				{
					System.out.println("The movie not found with this id: "+movieIdSelected);
				}
			}
			//--SEARCH BY - SERIE - MOVIE ID
		}
		
	}
}
