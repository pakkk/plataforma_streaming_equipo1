package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies;

import java.util.Arrays;

import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AvaliableAdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.AvaliableSubtitles;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;
import es.iesjandula.plataforma_streaming_equipo1.utilities.ScreenUtilities;
/**
 * 
 * @author David Martinez
 * this interface have the methods for the movie options
 */
public interface MoviesOptions 
{
	/**
	 * this method create a new movie director
	 * @param scanner the scanner
	 * @param arrayDirectorsGeneral array Directors general
	 * @param arrayActorsGeneral array Actors general
	 * @param arrayCategoriesGeneral array Categories General
	 * @param arraySubtitlesGeneral array Subtitles General
	 * @param movieIdCont movie id
	 * @return Directors array
	 */
	public static Directors[] createMovieDirectors(Scanner scanner,Directors[] arrayDirectorsGeneral,Actors[] arrayActorsGeneral,Categorie[] arrayCategoriesGeneral,Subtitles[] arraySubtitlesGeneral,int movieIdCont) 
	{	//---DIRECTORS--TO NEW MOVIE--
		int directorIdInsert = 0;
		int directorCountResult=0;
		Directors[] arrayOfDirectors= new Directors[0];
		
		while(directorIdInsert>=0) 
		{
			System.out.println("Directors added: "+Arrays.toString(arrayOfDirectors));
			System.out.println("Write the id of the Director/s (-1 to finish): ");
			directorIdInsert=scanner.nextInt();
			
			ScreenUtilities.clearScreen();
			if(directorIdInsert>=0) 
			{
				for(Directors director:arrayDirectorsGeneral) 
				{
					if(director.getDirectorId()==directorIdInsert) 
					{
						directorCountResult++;
						arrayOfDirectors=Arrays.copyOf(arrayOfDirectors,arrayOfDirectors.length+1);
						arrayOfDirectors[arrayOfDirectors.length-1]=director;
					}
				}
			}
			System.out.println("Directors finded to add: "+directorCountResult);
		}
		return arrayOfDirectors;
				
	}
	
	
	/**
	 * this method create a new movie subtitle
	 * @param scanner the scanner
	 * @return array of Subtitles
	 */
	public static Subtitles[] createSubtitlesMovie(Scanner scanner) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Select the Subtitles: ");
		
		int subTitle=2;
		int subtitlesCont=0;
		Subtitles[] subTitlesArray= new Subtitles[0];
		
		while(subTitle>=1&subTitle<=7) 
		{
			ScreenUtilities.clearScreen();
			System.out.println("Subtitles added: "+Arrays.toString(subTitlesArray));
			System.out.println("Select the subtitles to add: \n"
					+ "[1] ES\n"
					+ "[2] EN\n"
					+ "[3] DE\n"
					+ "[4] RU\n"
					+ "[5] IT\n"
					+ "[6] CH\n"
					+ "[7] OTHER\n"
					+ "[Other] END...");
			subTitle=scanner.nextInt();
			switch(subTitle) 
				{
				case 1:
				{
					subtitlesCont++;
					subTitlesArray=Arrays.copyOf(subTitlesArray, subTitlesArray.length+1);
					subTitlesArray[subTitlesArray.length-1]=new Subtitles(AvaliableSubtitles.ES);
					break;
				}
				case 2:
				{
					subtitlesCont++;
					subTitlesArray=Arrays.copyOf(subTitlesArray, subTitlesArray.length+1);
					subTitlesArray[subTitlesArray.length-1]=new Subtitles(AvaliableSubtitles.EN);
					break;
				}
				case 3:
				{
					subtitlesCont++;
					subTitlesArray=Arrays.copyOf(subTitlesArray, subTitlesArray.length+1);
					subTitlesArray[subTitlesArray.length-1]=new Subtitles(AvaliableSubtitles.DE);
					break;
				}
				case 4:
				{
					subtitlesCont++;
					subTitlesArray=Arrays.copyOf(subTitlesArray, subTitlesArray.length+1);
					subTitlesArray[subTitlesArray.length-1]=new Subtitles(AvaliableSubtitles.RU);
					break;
				}
				case 5:
				{
					subtitlesCont++;
					subTitlesArray=Arrays.copyOf(subTitlesArray, subTitlesArray.length+1);
					subTitlesArray[subTitlesArray.length-1]=new Subtitles(AvaliableSubtitles.IT);
					break;
				}
				case 6:
				{
					subtitlesCont++;
					subTitlesArray=Arrays.copyOf(subTitlesArray, subTitlesArray.length+1);
					subTitlesArray[subTitlesArray.length-1]=new Subtitles(AvaliableSubtitles.CH);
					break;
				}
				case 7:
				{
					subtitlesCont++;
					subTitlesArray=Arrays.copyOf(subTitlesArray, subTitlesArray.length+1);
					subTitlesArray[subTitlesArray.length-1]=new Subtitles(AvaliableSubtitles.OTHER);
					break;
				}
				default:
				{
					break;
				}
			}
			System.out.println("Subtitles added : "+subtitlesCont);
		}
		return subTitlesArray;
	}
	
	/**
	 * this method create a new movie language
	 * @param scanner the scanner
	 * @return Adapted Languages array
	 */
	public static AdaptedLanguages[] createAdaptedLanguagesMovie(Scanner scanner)
	{	
		//---ADPATEDS LANGUAGES TO NEW MOVIE----
		int adaptedLang=1;
		int adaptedLangCont=0;
		AdaptedLanguages[] adaptedLanguagesArray= new AdaptedLanguages[0];
		
		while(adaptedLang>=1&adaptedLang<=7) 
		{
			ScreenUtilities.clearScreen();
			System.out.println("Adapted lenguages added: "+Arrays.toString(adaptedLanguagesArray));
			System.out.println("Select the Adapted lenguages: \n"
					+ "[1] ES\n"
					+ "[2] EN\n"
					+ "[3] DE\n"
					+ "[4] RU\n"
					+ "[5] IT\n"
					+ "[6] CH\n"
					+ "[7] OTHER\n"
					+ "[Other] END...");
			adaptedLang=scanner.nextInt();
			switch(adaptedLang) 
			{
				case 1:
				{
					adaptedLangCont++;
					adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
					adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.ES);
					break;
				}
				case 2:
				{
					adaptedLangCont++;
					adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
					adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.EN);
					break;
				}
				case 3:
				{
					adaptedLangCont++;
					adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
					adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.DE);
					break;
				}
				case 4:
				{
					adaptedLangCont++;
					adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
					adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.RU);
					break;
				}
				case 5:
				{
					adaptedLangCont++;
					adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
					adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.IT);
					break;
				}
				case 6:
				{
					adaptedLangCont++;
					adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
					adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.CH);
					break;
				}
				case 7:
				{
					adaptedLangCont++;
					adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
					adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.OTHER);
					break;
				}
				default:
				{
					break;
				}
			}
			System.out.println("Adapted Languages added: "+adaptedLangCont);
		}
		return adaptedLanguagesArray;
	}
	
	/**
	 * this method create a new movie Actor
	 * @param scanner the sacanner
	 * @param arrayActorsGeneral array of actors general
	 * @return array of Actors
	 */
	public static Actors[] createActorsMovie(Scanner scanner,Actors[] arrayActorsGeneral) 
	{
		//--ACTORS--TO NEW MOVIE---
		int actorIdInsert = 0;
		int actorCountResult = 0;
		Actors[] arrayOfActors= new Actors[0];
		
		while(actorIdInsert>=0) 
		{
			System.out.println("Actors added: "+Arrays.toString(arrayOfActors));
			System.out.println("Write the id of the actors (-1 to finish): ");
			actorIdInsert=scanner.nextInt();
			ScreenUtilities.clearScreen();
			if(actorIdInsert>=0) 
			{
				for(Actors actor:arrayActorsGeneral) 
				{
					if(actor.getActorId()==actorIdInsert) 
					{
						actorCountResult++;
						arrayOfActors=Arrays.copyOf(arrayOfActors,arrayOfActors.length+1);
						arrayOfActors[arrayOfActors.length-1]=actor;
					}
				}
			}
			System.out.println("Actors finded to add: "+actorCountResult);
		}
		return arrayOfActors;
	}
	
	/**
	 * this method create a new movie Categorie
	 * @param scanner the scanner
	 * @param arrayCategoriesGeneral array Categories General
	 * @return array of Categorie
	 */
	public static Categorie[] createCategoriesMovie(Scanner scanner,Categorie[] arrayCategoriesGeneral) 
	{
		//---CATEGORIES--TO NEW MOVIE--
		int categoryIdInsert = 0;
		int categoryCountResult = 0;
		
		Categorie[] arrayOfCategories= new Categorie[0];
		
		while(categoryIdInsert>=0) 
		{
			System.out.println("Categories added: "+Arrays.toString(arrayOfCategories));
			System.out.println("Write the Id of the Categorie (-1 to cancel): ");
			categoryIdInsert=scanner.nextInt();
			ScreenUtilities.clearScreen();
			
			if(categoryIdInsert>=0) 
			{
				for(Categorie category:arrayCategoriesGeneral) 
				{
					if(category.getCategorieID()==categoryIdInsert) 
					{
						categoryCountResult++;
						arrayOfCategories=Arrays.copyOf(arrayOfCategories,arrayOfCategories.length+1);
						arrayOfCategories[arrayOfCategories.length-1]=category;
					}
				}
			}
			System.out.println("Categorie finded to add: "+categoryCountResult);
		}
		return arrayOfCategories;
	}
	
	
	/**
	 * this method create a new movie 
	 * @param scanner the scanner
	 * @param scanner2 the scanner2
	 * @param arrayMoviesGeneral array movies general
	 * @param arrayDirectorsGeneral array directors general
	 * @param arrayActorsGeneral array actors general
	 * @param arrayCategoriesGeneral array categories general
	 * @param arraySubtitlesGeneral array subtitles general
	 * @param movieIdCont movieID cont
	 * @return
	 */
	public static Movies[] createMovie(Scanner scanner,Scanner scanner2,Movies[] arrayMoviesGeneral,Directors[] arrayDirectorsGeneral,Actors[] arrayActorsGeneral,Categorie[] arrayCategoriesGeneral,Subtitles[] arraySubtitlesGeneral,int movieIdCont) 
	{

		//--------MOVIE--REGISTER------
		
		System.out.println("Write the title of the movie"); 
		String title="Undefined";
		title=scanner2.nextLine();
		ScreenUtilities.clearScreen();
		
		//---DIRECTORS--TO NEW MOVIE--
		Directors[] arrayOfDirectors=MoviesOptions.createMovieDirectors(scanner2, arrayDirectorsGeneral, arrayActorsGeneral, arrayCategoriesGeneral, arraySubtitlesGeneral, movieIdCont);
	
		//---CATEGORIES--TO NEW MOVIE--
		ScreenUtilities.clearScreen();
		Categorie[] arrayOfCategories=MoviesOptions.createCategoriesMovie(scanner2, arrayCategoriesGeneral);
		
		//--ACTORS--TO NEW MOVIE---
		Actors[] arrayOfActors=MoviesOptions.createActorsMovie(scanner2, arrayActorsGeneral);
				
		//--ORIGINAL--LANGUAGE---
		System.out.println("Write the Original lenguage: ");
		String originalLenguage=scanner2.nextLine();
		ScreenUtilities.clearScreen();
		
		//---ADPATEDS LANGUAGES TO NEW MOVIE----
		AdaptedLanguages[] adaptedLanguagesArray=MoviesOptions.createAdaptedLanguagesMovie(scanner);
		
		//--SUBTITLES TO NEW MOVIE---
		Subtitles[] subTitlesArray =MoviesOptions.createSubtitlesMovie(scanner);
		
		//---DURATION TO NEW MOVIE----
		ScreenUtilities.clearScreen();
		System.out.println("Select the total duration (Time in minutes): ");
		double minutosTiempoDuracion=0;
		minutosTiempoDuracion=scanner.nextDouble();
		
		//---CREATION YEAR TO NEW MOVIE---
		ScreenUtilities.clearScreen();
		System.out.println("Select the year of creation: ");
		int anyoCreacion=9999;
		anyoCreacion=scanner.nextInt();
		
		//--ADD-THE NEW MOVIE----
		arrayMoviesGeneral=Arrays.copyOf(arrayMoviesGeneral, arrayMoviesGeneral.length+1);
		arrayMoviesGeneral[arrayMoviesGeneral.length-1]=new Movies(arrayOfActors,arrayOfDirectors,arrayOfCategories,title,originalLenguage,adaptedLanguagesArray,subTitlesArray,minutosTiempoDuracion,anyoCreacion,movieIdCont++);
		System.out.println(arrayMoviesGeneral[arrayMoviesGeneral.length-1]);
		
		return arrayMoviesGeneral;
	}
	
	/**
	 * this method search by movie
	 * @param scanner the scanner
	 * @param scanner2 the scanner2
	 * @param arrayMoviesGeneral array movies general
	 */
	public static void searchMovie(Scanner scanner,Scanner scanner2,Movies[] arrayMoviesGeneral) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Select the search method: \n"
				+ "[1] Actors \n"
				+ "[2] Directors \n"
				+ "[3] Title \n"
				+ "[4] Original lenguage \n"
				+ "[5] Adapted lenguages\n"
				+ "[6] Categories \n"
				+ "[7] Duration\n"
				+ "[8] Creation Year\n"
				+ "[9] Subtitle\n"
				+ "[10] Id of the movie\n");
		int selection1 = scanner.nextInt();
		ScreenUtilities.clearScreen();
		if (selection1==1) 
		{
			//---------Search By Actor (ID)------------
			int moviesContResults=0;
			System.out.println("Indicate the Id of the actor \n");
			int actorId=scanner.nextInt();
			
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Movies movie:arrayMoviesGeneral) 
			{
				for(Actors actor : movie.getActors()) 
				{
					if(actor.getActorId()==actorId) 
					{
						moviesContResults++;
						System.out.println(movie);
					}
					
				}
			}
			System.out.println("Where finded: "+moviesContResults+" Movies.");
		}
		else if (selection1==2) 
		{
			//---------Search By Director (ID)------------
			int moviesContResults=0;
			System.out.println("Indicate the Id of the Director \n");
			int directorId=scanner.nextInt();
			
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			
			for (Movies movie:arrayMoviesGeneral) 
			{
				for(Directors director : movie.getDirectors()) 
				{
					if(director.getDirectorId()==directorId) 
					{
						moviesContResults++;
						System.out.println(movie);
					}
					
				}
			}
			System.out.println("Where finded: "+moviesContResults+" Movies.");
		}
		else if (selection1==3) 
		{
			//---------Search By Title ------------
			int moviesContResults=0;
			System.out.println("Indicate the Title or part of it: \n");
			String titleSearch=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			
			System.out.println("Results: \n");
			
			for (Movies movie:arrayMoviesGeneral) 
			{
				if(movie.getTitle().contains(titleSearch)) 
				{
					moviesContResults++;
					System.out.println(movie);
				}
			}
			System.out.println("Where finded: "+moviesContResults+" Movies.");
		}
		else if (selection1==4) 
		{
			//---------Search By Original Language (ID)------------
			int moviesContResults=0;
			System.out.println("Indicate the Lenguage Original or part of it: \n");
			String origLanguageSearch=scanner2.nextLine();
			
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			
			for (Movies movie:arrayMoviesGeneral) 
			{
				if(movie.getOriginalLanguage().contains(origLanguageSearch)) 
				{
					moviesContResults++;
					System.out.println(movie);
				}
			}
			System.out.println("Where finded: "+moviesContResults+" Movies.");
		}
		else if (selection1==5) 
		{
			//---------Search By Adapted Language (ID)------------
			int moviesContResults=0;
			
			System.out.println("Select the Adapted Lenguaje: \n"
					+ "[1] ES\n"
					+ "[2] EN\n"
					+ "[3] DE\n"
					+ "[4] RU\n"
					+ "[5] IT\n"
					+ "[6] CH\n"
					+ "[Other] Other");
			int adaptedLanguageSelectionSearch=scanner.nextInt();
			ScreenUtilities.clearScreen();
			
			AvaliableAdaptedLanguages adaptedSearch=null;
			if(adaptedLanguageSelectionSearch==1) 
			{
				adaptedSearch=AvaliableAdaptedLanguages.ES;
			}
			else if(adaptedLanguageSelectionSearch==2) 
			{
				adaptedSearch=AvaliableAdaptedLanguages.EN;
			}
			else if(adaptedLanguageSelectionSearch==3) 
			{
				adaptedSearch=AvaliableAdaptedLanguages.DE;
			}
			else if(adaptedLanguageSelectionSearch==4) 
			{
				adaptedSearch=AvaliableAdaptedLanguages.RU;
			}
			else if(adaptedLanguageSelectionSearch==5) 
			{
				adaptedSearch=AvaliableAdaptedLanguages.IT;
			}
			else if(adaptedLanguageSelectionSearch==6) 
			{
				adaptedSearch=AvaliableAdaptedLanguages.CH;
			}
			else
			{
				adaptedSearch=AvaliableAdaptedLanguages.OTHER;
			}
			System.out.println("Results: \n");
			
			for (Movies movie:arrayMoviesGeneral) 
			{
				for(AdaptedLanguages adapted : movie.getAdaptedLanguages()) 
				{
					if(adapted.getAdaptedLang()==adaptedSearch) 
					{
						moviesContResults++;
						System.out.println(movie);
					}
					
				}
			}
			System.out.println("Where finded: "+moviesContResults+" Movies.");
		}
		else if (selection1==6) 
		{
			//---------Search By Category-----------
			System.out.println("Search by category Id or Name:\n"
					+ "[1] Id\n"
					+ "[2] Name\n");
			int typeOfSearchCategory=scanner.nextInt();
			
			int moviesContResults=0;
			
			if(typeOfSearchCategory==1) 
			{
				//---------Search By Category (ID)-----------
				System.out.println("Indicate the Id of the categorie \n");
				int categoryId=scanner.nextInt();
				ScreenUtilities.clearScreen();
				System.out.println("Results: \n");
				for (Movies movie:arrayMoviesGeneral) 
				{
					for(Categorie category : movie.getCateg()) 
					{
						if(category.getCategorieID()==categoryId) 
						{
							moviesContResults++;
							System.out.println(movie);
						}
						
					}
				}
				System.out.println("Were found: "+moviesContResults+" Movies.");
			}
			else if(typeOfSearchCategory==2) 
			{
				//---------Search By Name-----------
				System.out.println("Indicate the Name of the categorie \n");
				String categoryName=scanner2.nextLine();
				ScreenUtilities.clearScreen();
				System.out.println("Results: \n");
				for (Movies movie:arrayMoviesGeneral) 
				{
					for(Categorie category : movie.getCateg()) 
					{
						if(category.getName().contains(categoryName)) 
						{
							moviesContResults++;
							System.out.println(movie);
						}
						
					}
				}
				System.out.println("Were found: "+moviesContResults+" Movies.");
				
			}
		}
		else if (selection1==7) 
		{
			//---------Search By Duration------------
			int moviesContResults=0;
			System.out.println("Indicate the total duration: \n");
			double durationTotalTime=scanner.nextInt();
			
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Movies movie:arrayMoviesGeneral) 
			{
				if(movie.getDuration()==durationTotalTime) 
				{
					moviesContResults++;
					System.out.println(movie);
				}
			}
			System.out.println("Were found: "+moviesContResults+" Movies.");
		}
		else if (selection1==8) 
		{
			//---------Search By Creation Year------------
			int moviesContResults=0;
			System.out.println("Indicate the total duration: \n");
			int creationYear=scanner.nextInt();
			
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Movies movie:arrayMoviesGeneral) 
			{
				if(movie.getCreationYear()==creationYear) 
				{
					moviesContResults++;
					System.out.println(movie);
				}
			}
			System.out.println("Were found: "+moviesContResults+" Movies.");
		}
		else if (selection1==9) 
		{
			//---------Search By Subtitles------------
			int moviesContResults=0;
			System.out.println("Select a subtitle for the search: \n"
					+ "[1] ES\n"
					+ "[2] EN\n"
					+ "[3] DE\n"
					+ "[4] RU\n"
					+ "[5] IT\n"
					+ "[6] CH\n"
					+ "[7] OTHER\n"
					+ "[Other] END...");
			int subtitleSearch=scanner.nextInt();
			
			AvaliableSubtitles subtitleToFind=null;
			ScreenUtilities.clearScreen();
			if(subtitleSearch==1) 
			{
				subtitleToFind=AvaliableSubtitles.ES;
			}
			else if(subtitleSearch==2) 
			{
				subtitleToFind=AvaliableSubtitles.EN;
			}
			else if(subtitleSearch==3) 
			{
				subtitleToFind=AvaliableSubtitles.DE;
			}
			else if(subtitleSearch==4) 
			{
				subtitleToFind=AvaliableSubtitles.RU;
			}
			else if(subtitleSearch==5) 
			{
				subtitleToFind=AvaliableSubtitles.IT;
			}
			else if(subtitleSearch==6) 
			{
				subtitleToFind=AvaliableSubtitles.CH;
			}
			else
			{
				subtitleToFind=AvaliableSubtitles.OTHER;
			}
			System.out.println("Results: \n");
			
			for (Movies movie:arrayMoviesGeneral) 
			{
				for(Subtitles subtitle : movie.getAvaliableSubtitles()) 
				{
					if(subtitle.getSubtitle()==subtitleToFind) 
					{
						moviesContResults++;
						System.out.println(movie);
					}
					
				}
			}
			System.out.println("Were found: "+moviesContResults+" Movies.");
		}
		else if (selection1==10) 
		{
			//---------Search By movie ID------------
			int moviesContResults=0;
			System.out.println("Indicate the Id of the movie \n");
			int movieId=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Movies movie:arrayMoviesGeneral) 
			{
				if(movie.getMovieId()==movieId) 
				{
					moviesContResults++;
					System.out.println(movie);
				}
			}
			System.out.println("Were found: "+moviesContResults+" Movies.");
		}
	}
	
	/**
	 * this method modify movies by all attributes
	 * @param scanner the scanner
	 * @param scanner2 the scanner 2
	 * @param arrayMoviesGeneral array movies general
	 * @param arrayDirectorsGeneral array directors general
	 * @param arrayActorsGeneral array actors general
	 * @param arrayCategoriesGeneral array categories general
	 * @param movieIdCont movie id
	 * @return Movies array
	 */
	public static Movies[] modifyMovie(Scanner scanner,Scanner scanner2,Movies[] arrayMoviesGeneral,Directors[] arrayDirectorsGeneral,Actors[] arrayActorsGeneral,Categorie[] arrayCategoriesGeneral,int movieIdCont) 
	{
		System.out.println("Indicate the Id of the movie to modify: ");
		int selectedMovieId=scanner.nextInt();
		boolean positiveResult=false;
		for(Movies movie : arrayMoviesGeneral) 
		{
			if(movie.getMovieId()==selectedMovieId) 
			{
				positiveResult=true;
				System.out.println("Movie found \n ("+movie.getTitle()+")");
				System.out.println("Indicate what you want to modify.. \n"
						+ "[1] Actors \n"
						+ "[2] Directors \n"
						+ "[3] Title \n"
						+ "[4] Original Lenguaje \n"
						+ "[5] Adapted Lenguaje\n"
						+ "[6] Categories \n"
						+ "[7] Duration\n"
						+ "[8] Creation Year\n"
						+ "[9] Subtitle\n"
						+ "[10] Id of the movie (Not recomended)\n");
				int selectedOption=scanner.nextInt();
				if(selectedOption==1) 
				{
					//-------------MODIFY---ACTORS-------------
					boolean cancelled=false;
					int actorIdInsert = 0;
					int actorCountResult = 0;
					Actors[] arrayOfActors= new Actors[0];
					while(actorIdInsert>=0) 
					{
						System.out.println("Write the Ids of the new actors (-1 to finish)(-2 to cancel): ");
						actorIdInsert=scanner.nextInt();
						ScreenUtilities.clearScreen();
						if(actorIdInsert>=0) 
						{
							for(Actors actor:arrayActorsGeneral) 
							{
								if(actor.getActorId()==actorIdInsert) 
								{
									actorCountResult++;
									arrayOfActors=Arrays.copyOf(arrayOfActors,arrayOfActors.length+1);
									arrayOfActors[arrayOfActors.length-1]=actor;
								}
							}
						}
						else if(actorIdInsert==-2) 
						{
							cancelled=true;
							System.out.println("Cancelled");
							break;
						}
						System.out.println("Actors found for add: "+actorCountResult);
					}
					if(!cancelled) 
					{
						movie.setActors(arrayOfActors);
					}
					//-------------MODIFY---ACTORS-------------
				}
				else if(selectedOption==2) 
				{
					//-------------MODIFY---DIRECTORS-------------
					boolean cancelled=false;
					int directorIdInsert = 0;
					int directorCountResult=0;
					Directors[] arrayOfDirectors= new Directors[0];
					while(directorIdInsert>=0) 
					{
						System.out.println("Write the Ids of the new Directors (-1 to finish)(-2 to cancel): ");
						directorIdInsert=scanner.nextInt();
						ScreenUtilities.clearScreen();
						if(directorIdInsert>=0) 
						{
							for(Directors director:arrayDirectorsGeneral) 
							{
								if(director.getDirectorId()==directorIdInsert) 
								{
									directorCountResult++;
									arrayOfDirectors=Arrays.copyOf(arrayOfDirectors,arrayOfDirectors.length+1);
									arrayOfDirectors[arrayOfDirectors.length-1]=director;
								}
							}
						}
						else if(directorIdInsert==-2) 
						{
							cancelled=true;
							System.out.println("Cancelled");
							break;
						}
						System.out.println("Directors found for add: "+directorCountResult);
					}
					if(!cancelled) 
					{
						movie.setDirectors(arrayOfDirectors);
					}
					//-------------MODIFY---DIRECTORS-------------
				}
				else if(selectedOption==3) 
				{
					//-------------MODIFY---TITLE-------------
					boolean cancelled=false;
					System.out.println("Tell me the new Title of the movie (-2 to cancel)"); 
					String title="Undefined-title";
					title=scanner2.nextLine();
					ScreenUtilities.clearScreen();
					if(title.equals("-2")) 
					{
						cancelled=true;
						System.out.println("Operation Cancelled");
					}
					if(!cancelled) 
					{
						movie.setTitle(title);
					}
					//-------------MODIFY---TITLE-------------
				}
				else if(selectedOption==4) 
				{
					//-------------MODIFY---ORIGINAL-LANGUAGE-------------
					boolean cancelled=false;
					System.out.println("Tell me the new Original Language (-2 to cancel)"); 
					String orignalLang="Undefined-Original-Lang";
					orignalLang=scanner2.nextLine();
					ScreenUtilities.clearScreen();
					if(orignalLang.equals("-2")) 
					{
						cancelled=true;
						System.out.println("Operation Cancelled");
					}
					if(!cancelled) 
					{
						movie.setOriginalLanguage(orignalLang);
					}
					//-------------MODIFY---ORIGINAL-LANGUAGE-------------
				}
				else if(selectedOption==5) 
				{
					//-------------MODIFY---ADAPTED-LANGUAGE-------------
					boolean cancelled=false;
					int adaptedLang=1;
					int adaptedLangCont=0;
					AdaptedLanguages[] adaptedLanguagesArray= new AdaptedLanguages[0];
					
					while(adaptedLang>=1&adaptedLang<=7) 
					{
						System.out.println("Select the new Adapted lenguages: \n"
								+ "[1] ES\n"
								+ "[2] EN\n"
								+ "[3] DE\n"
								+ "[4] RU\n"
								+ "[5] IT\n"
								+ "[6] CH\n"
								+ "[7] OTHER\n"
								+ "[Other] END...");
						adaptedLang=scanner.nextInt();
						if(adaptedLang==-2)
						{
							cancelled=true;
							System.out.println("Operation Cancelled");
							break;
						}
						switch(adaptedLang) 
						{
							case 1:
							{
								adaptedLangCont++;
								adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
								adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.ES);
								break;
							}
							case 2:
							{
								adaptedLangCont++;
								adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
								adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.EN);
								break;
							}
							case 3:
							{
								adaptedLangCont++;
								adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
								adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.DE);
								break;
							}
							case 4:
							{
								adaptedLangCont++;
								adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
								adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.RU);
								break;
							}
							case 5:
							{
								adaptedLangCont++;
								adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
								adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.IT);
								break;
							}
							case 6:
							{
								adaptedLangCont++;
								adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
								adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.CH);
								break;
							}
							case 7:
							{
								adaptedLangCont++;
								adaptedLanguagesArray=Arrays.copyOf(adaptedLanguagesArray, adaptedLanguagesArray.length+1);
								adaptedLanguagesArray[adaptedLanguagesArray.length-1]=new AdaptedLanguages(AvaliableAdaptedLanguages.OTHER);
								break;
							}
							default:
							{
								break;
							}
						}
						System.out.println("Adapted Languages added: "+adaptedLangCont);
					}
					
					if(!cancelled) 
					{
						movie.setAdaptedLanguages(adaptedLanguagesArray);
					}
					//-------------MODIFY---ADAPTED-LANGUAGE-------------
				}
				else if(selectedOption==6) 
				{
					ScreenUtilities.clearScreen();
					boolean cancelled=false;
					int categoryIdInsert = 0;
					int categoryCountResult = 0;
					Categorie[] arrayOfCategories= new Categorie[0];
					while(categoryIdInsert>=0) 
					{
						System.out.println("Write the Id of the Categorie (-1 to cancel): ");
						categoryIdInsert=scanner.nextInt();
						ScreenUtilities.clearScreen();
						
						if(categoryIdInsert>=0) 
						{
							for(Categorie category:arrayCategoriesGeneral) 
							{
								if(category.getCategorieID()==categoryIdInsert) 
								{
									categoryCountResult++;
									arrayOfCategories=Arrays.copyOf(arrayOfCategories,arrayOfCategories.length+1);
									arrayOfCategories[arrayOfCategories.length-1]=category;
								}
							}
						}
						System.out.println("Categorie finded to add: "+categoryCountResult);
						if(categoryIdInsert==-2) 
						{
							cancelled=true;
							System.out.println("Operation Cancelled");
							break;
						}
					}
					if(!cancelled) 
					{
						movie.setCateg(arrayOfCategories);
					}
				}
				else if(selectedOption==7) 
				{
					boolean cancelled=false;
					ScreenUtilities.clearScreen();
					System.out.println("Select the new total duration  (Time in minutes) (-2 to cacel): ");
					double timeMinutesDuration=0;
					timeMinutesDuration=scanner.nextDouble();
					if(timeMinutesDuration==-2) 
					{
						cancelled=true;
						System.out.println("Operacion cancelled");
					}
					if(!cancelled) 
					{
						movie.setDuration(timeMinutesDuration);
					}
				}
				else if(selectedOption==8) 
				{
					boolean cancelled=false;
					ScreenUtilities.clearScreen();
					System.out.println("Select the year of creation (-2 to cancel): ");
					int yearCreation=9999;
					yearCreation=scanner.nextInt();
					if(yearCreation==-2)
					{
						cancelled=true;
						System.out.println("Operation cancelled");
					}
					if(!cancelled) 
					{
						movie.setCreationYear(movieIdCont);
					}
				}
				else if(selectedOption==9) 
				{
					ScreenUtilities.clearScreen();
					System.out.println("Selecct the new subtitle: ");
					boolean cancelled=false;
					int subtitle=2;
					int subtitlesCont=0;
					Subtitles[] subtitlesArray= new Subtitles[0];
					while(subtitle>=1 & subtitle<=7) 
					{
						System.out.println("Select subtitle to add: (-2 to cancel)\n"
								+ "[1] ES\n"
								+ "[2] EN\n"
								+ "[3] DE\n"
								+ "[4] RU\n"
								+ "[5] IT\n"
								+ "[6] CH\n"
								+ "[7] OTHER\n"
								+ "[Other] END...");
						subtitle=scanner.nextInt();
						if(subtitle==-2) 
						{
							cancelled=true;
							System.out.println("Operation cancelled");
							break;
						}
						switch(subtitle) 
							{
							case 1:
							{
								subtitlesCont++;
								subtitlesArray=Arrays.copyOf(subtitlesArray, subtitlesArray.length+1);
								subtitlesArray[subtitlesArray.length-1]=new Subtitles(AvaliableSubtitles.ES);
								break;
							}
							case 2:
							{
								subtitlesCont++;
								subtitlesArray=Arrays.copyOf(subtitlesArray, subtitlesArray.length+1);
								subtitlesArray[subtitlesArray.length-1]=new Subtitles(AvaliableSubtitles.EN);
								break;
							}
							case 3:
							{
								subtitlesCont++;
								subtitlesArray=Arrays.copyOf(subtitlesArray, subtitlesArray.length+1);
								subtitlesArray[subtitlesArray.length-1]=new Subtitles(AvaliableSubtitles.DE);
								break;
							}
							case 4:
							{
								subtitlesCont++;
								subtitlesArray=Arrays.copyOf(subtitlesArray, subtitlesArray.length+1);
								subtitlesArray[subtitlesArray.length-1]=new Subtitles(AvaliableSubtitles.RU);
								break;
							}
							case 5:
							{
								subtitlesCont++;
								subtitlesArray=Arrays.copyOf(subtitlesArray, subtitlesArray.length+1);
								subtitlesArray[subtitlesArray.length-1]=new Subtitles(AvaliableSubtitles.IT);
								break;
							}
							case 6:
							{
								subtitlesCont++;
								subtitlesArray=Arrays.copyOf(subtitlesArray, subtitlesArray.length+1);
								subtitlesArray[subtitlesArray.length-1]=new Subtitles(AvaliableSubtitles.CH);
								break;
							}
							case 7:
							{
								subtitlesCont++;
								subtitlesArray=Arrays.copyOf(subtitlesArray, subtitlesArray.length+1);
								subtitlesArray[subtitlesArray.length-1]=new Subtitles(AvaliableSubtitles.OTHER);
								break;
							}
							default:
							{
								break;
							}
						}
						System.out.println("Subtitles added : "+subtitlesCont);
					}
					if(!cancelled)
					{
						movie.setAvaliableSubtitles(subtitlesArray);
					}
				}
				else if(selectedOption==10) 
				{
					System.out.println("Warning, changing an ID may endanger the system \n"
							+ "*Change it only if you really know what you are doing...");
					System.out.println("Indique nuevo ID de movie: (-2 para cancelar)");
					int newMovieId=scanner.nextInt();
					boolean cancelled=false;
					if(newMovieId==-2) 
					{
						cancelled=true;
						System.out.println("Operation cancelled");
					}
					if(!cancelled) 
					{
						movie.setMovieId(newMovieId);
					}
				}
			}
		}
		if(positiveResult) 
		{
			System.out.println("Changes saved");
		}
		else 
		{
			System.out.println("No movie was found with the given ID...");
		}
		
		return arrayMoviesGeneral;
	}
	
	
	/**
	 * this method delete movie by attribute
	 * @param scanner the scanner
	 * @param arrayMoviesGeneral array of movies general
	 * @return Movies array
	 */
	public static Movies[] deleteMovie(Scanner scanner,Movies[] arrayMoviesGeneral) 
	{

		int positionCont=0;
		boolean cancelled=false;
		System.out.println("Warning, deleting a movie cannot be reversed, do it if you know what you are doing.");
		System.out.println("Enter movie ID to delete (-2 to cancel)");
		int deletemovieId=scanner.nextInt();
		if(deletemovieId==-2) 
		{
			cancelled=true;
			System.out.println("Operation cancelled");
		}
		if(!cancelled) 
		{
			for(Movies movie:arrayMoviesGeneral) 
			{
				if(movie.getMovieId()==deletemovieId) 
				{
					System.out.println("Found movie: ("+movie.getTitle()+")\n"
							+ "-Do you want to delete the movie? ?\n"
							+ "[1] Yes of course\n"
							+ "[2] No..");
					int finalDecision = scanner.nextInt();
					if(finalDecision==2) 
					{
						System.out.println("Aborting operation");
					}
					else 
					{
						System.out.println(movie.getTitle());
						for(int i =0;i<arrayMoviesGeneral.length;i++) 
						{
							if(i==positionCont) 
							{
								arrayMoviesGeneral[i]=arrayMoviesGeneral[arrayMoviesGeneral.length-1];
								arrayMoviesGeneral=Arrays.copyOf(arrayMoviesGeneral, arrayMoviesGeneral.length-1);
							}
						}
						System.out.println("Deleted successfully...");
					}
					
				}
				positionCont++;
			}
		}
		return arrayMoviesGeneral;
	}

}
