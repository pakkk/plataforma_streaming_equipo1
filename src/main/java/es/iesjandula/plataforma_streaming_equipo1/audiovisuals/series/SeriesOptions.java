package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series;

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
 * this interface ad all the series options
 */
public interface SeriesOptions 
{
	/**
	 * Create subtitles for the series 
	 * @param scanner the sacnner
	 * @return Subtitles Array
	 */
	public static Subtitles[] createSubtitlesSerie(Scanner scanner) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Select the Subtitles: ");
		
		int subTitle=2;
		int subtitlesCont=0;
		Subtitles[] subTitlesArray= new Subtitles[0];
		while(subTitle>=1&subTitle<=7) 
		{
			ScreenUtilities.clearScreen();
			System.out.println("Selected subtitles: "+Arrays.toString(subTitlesArray));
			System.out.println("Select subtitle to add: \n"
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
	 * Create an adapted language for the series
	 * @param scanner the scanner
	 * @return AdaptedLanguages array
	 */
	public static AdaptedLanguages[] createAdaptedLanguagesSerie(Scanner scanner) 
	{
		int adaptedLang=1;
		int adaptedLangCont=0;
		AdaptedLanguages[] adaptedLanguagesArray= new AdaptedLanguages[0];
		
		while(adaptedLang>=1&adaptedLang<=7) 
		{
			ScreenUtilities.clearScreen();
			System.out.println("Selected adapted languages: "+Arrays.toString(adaptedLanguagesArray));
			System.out.println("Select the adapted languages: \n"
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
	 * Create an Actor for the series 
	 * @param scanner the scanner
	 * @param arrayActorsGeneral array of actors
	 * @return Actors array
	 */
	public static Actors[] createActorsSerie(Scanner scanner,Actors[] arrayActorsGeneral) 
	{
		int actorIdInsert = 0;
		int actorCountResult = 0;
		Actors[] arrayOfActors= new Actors[0];
		while(actorIdInsert>=0) 
		{
			System.out.println("Actors added: "+Arrays.toString(arrayOfActors));
			System.out.println("Tell me the Id of the Actors (-1 to finish): ");
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
			System.out.println("Actors found for add: "+actorCountResult);
		}
		return arrayOfActors;
	}
	
	/**
	 * Create a Category for the series 
	 * @param scanner the scanner
	 * @param arrayCategoriesGeneral array of categories general
	 * @return Categorie Array
	 */
	public static Categorie[] createCategoriesSerie(Scanner scanner,Categorie[] arrayCategoriesGeneral) 
	{
		ScreenUtilities.clearScreen();
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
	 * Create a Director for the series 
	 * @param scanner the scanner
	 * @param arrayDirectorsGeneral array of directors general
	 * @return Directors Array
	 */
	public static Directors[] createDirectorsSerie(Scanner scanner, Directors[] arrayDirectorsGeneral) 
	{
		int directorIdInsert = 0;
		int directorCountResult=0;
		Directors[] arrayOfDirectors= new Directors[0];
		while(directorIdInsert>=0) 
		{
			System.out.println("Directors added: "+Arrays.toString(arrayOfDirectors));
			System.out.println("Tell me the Id of the Directors (-1 to finish): ");
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
			System.out.println("Directors found for add: "+directorCountResult);
		}
		return arrayOfDirectors;
	}
	
	/**
	 * Create a new serie 
	 * @param scanner the scanner
	 * @param scanner2 the scanner2
	 * @param arraySeriesGeneral series general array
	 * @param arrayDirectorsGeneral directors general array
	 * @param arrayActorsGeneral actors general array
	 * @param arrayCategoriesGeneral categories general array
	 * @param arraySubtitlesGeneral subtitles general array
	 * @param serieIdCont serie id cont
	 * @return Series Array
	 */
	public static Series[] createSerie(Scanner scanner,Scanner scanner2,Series[] arraySeriesGeneral,Directors[] arrayDirectorsGeneral,Actors[] arrayActorsGeneral,Categorie[] arrayCategoriesGeneral,Subtitles[] arraySubtitlesGeneral,int serieIdCont) 
	{

		//--------SERIE--REGISTER------
		
		System.out.println("Tell me the Title of the Series"); 
		String title="Undefined";
		title=scanner2.nextLine();
		ScreenUtilities.clearScreen();
		
		//--DIRECTOR TO NEW SERIE---
		Directors[] arrayOfDirectors = SeriesOptions.createDirectorsSerie(scanner, arrayDirectorsGeneral);
		
		
		//--CATEGORIES TO NEW SERIE---
		Categorie[] arrayOfCategories= SeriesOptions.createCategoriesSerie(scanner, arrayCategoriesGeneral);
		
		
		//---ACTORS TO NEW SERIE---
		Actors[] arrayOfActors = SeriesOptions.createActorsSerie(scanner, arrayActorsGeneral);
		
		
		//--ORIGINAL--LANGUAGE TO NEW SERIE---
		System.out.println("Write the Original language: ");
		String originalLenguage=scanner2.nextLine();
		ScreenUtilities.clearScreen();
		
		
		//---ADAPTED LANGUAGES--TO NEW SERIE----
		AdaptedLanguages[] adaptedLanguagesArray = SeriesOptions.createAdaptedLanguagesSerie(scanner);
		
		
		//--SUBTITLES-TO NEW SERIE----
		Subtitles[] subTitlesArray= SeriesOptions.createSubtitlesSerie(scanner);
		
		
		//--TOTAL DURATION TO NEW SERIE----
		ScreenUtilities.clearScreen();
		System.out.println("Select a total duration (in minutes): ");
		double minutosTiempoDuracion=0;
		minutosTiempoDuracion=scanner.nextDouble();
		
		//---CREATION YEAR TO NEW SERIE----
		ScreenUtilities.clearScreen();
		System.out.println("Select a creation year: ");
		int anyoCreacion=9999;
		anyoCreacion=scanner.nextInt();
		
		//--NUMBER OF CAPITULES TO NEW SERIE----
		ScreenUtilities.clearScreen();
		System.out.println("Select a number of chapters: ");
		int numeroCapitulos=0;
		numeroCapitulos=scanner.nextInt();
		
		//--NUMBER OF SEASONS TO NEW SERIE----
		ScreenUtilities.clearScreen();
		System.out.println("Select a number of seasons: ");
		int numeroTemporadas=0;
		numeroTemporadas=scanner.nextInt();
		ScreenUtilities.clearScreen();
		
		//--ADD THE SERIE TO GENERAL SERIES ARRAY---
		arraySeriesGeneral=Arrays.copyOf(arraySeriesGeneral, arraySeriesGeneral.length+1);
		arraySeriesGeneral[arraySeriesGeneral.length-1]=new Series(arrayOfActors,arrayOfDirectors,arrayOfCategories,title,originalLenguage,adaptedLanguagesArray,subTitlesArray,minutosTiempoDuracion,anyoCreacion,numeroCapitulos,numeroTemporadas,serieIdCont++);
		System.out.println(arraySeriesGeneral[arraySeriesGeneral.length-1]);
		
		return arraySeriesGeneral;
	}
	
	/**
	 * this  method search a serie of the arrays of series
	 * @param scanner the scanner
	 * @param scanner2 the scanner 2
	 * @param arraySeriesGeneral array series general
	 */
	public static void searchSerie(Scanner scanner,Scanner scanner2,Series[] arraySeriesGeneral) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Select the search method: \n"
				+ "[1] Actors \n"
				+ "[2] Directores \n"
				+ "[3] Title \n"
				+ "[4] Original lenguaje \n"
				+ "[5] Adapted Lenguaje\n"
				+ "[6] Categories \n"
				+ "[7] Duration\n"
				+ "[8] Creation Year\n"
				+ "[9] SubTitle\n"
				+ "[10] Number of chapters\n"
				+ "[11] Number of Seasons\n"
				+ "[12] Id of the Serie\n");
		int selection1 = scanner.nextInt();
		ScreenUtilities.clearScreen();
		if (selection1==1) 
		{
			//---------Search By Actor (ID)------------
			int seriesContResults=0;
			System.out.println("Indicate the Id of the actor \n");
			int actorId=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Series serie:arraySeriesGeneral) 
			{
				for(Actors actor : serie.getActors()) 
				{
					if(actor.getActorId()==actorId) 
					{
						seriesContResults++;
						System.out.println(serie);
					}
					
				}
			}
			System.out.println("Were found: "+seriesContResults+" Series.");
		}
		else if (selection1==2) 
		{
			//---------Search By Director (ID)------------
			int seriesContResults=0;
			System.out.println("Indicate the Id of the Director \n");
			int directorId=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Series serie:arraySeriesGeneral) 
			{
				for(Directors director : serie.getDirectors()) 
				{
					if(director.getDirectorId()==directorId) 
					{
						seriesContResults++;
						System.out.println(serie);
					}
					
				}
			}
			System.out.println("Were found: "+seriesContResults+" Series.");
		}
		else if (selection1==3) 
		{
			//---------Search By Title (ID)------------
			int seriesContResults=0;
			System.out.println("Indicate the Title or part of it: \n");
			String titleSearch=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Series serie:arraySeriesGeneral) 
			{
				if(serie.getTitle().contains(titleSearch)) {
					seriesContResults++;
					System.out.println(serie);
				}
			}
			System.out.println("Were found: "+seriesContResults+" Series.");
		}
		else if (selection1==4) 
		{
			//---------Search By Original Language (ID)------------
			int seriesContResults=0;
			System.out.println("Indicate the original lenguaje or part of it: \n");
			String origLanguageSearch=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Series serie:arraySeriesGeneral) 
			{
				if(serie.getOriginalLanguage().contains(origLanguageSearch)) 
				{
					seriesContResults++;
					System.out.println(serie);
				}
			}
			System.out.println("Were found: "+seriesContResults+" Series.");
		}
		else if (selection1==5) 
		{
			//---------Search By Adapted Language (ID)------------
			int seriesContResults=0;
			System.out.println("Select the adapted lenguaje: \n"
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
			for (Series serie:arraySeriesGeneral) 
			{
				for(AdaptedLanguages adapted : serie.getAdaptedLanguages()) {
					if(adapted.getAdaptedLang()==adaptedSearch) {
						seriesContResults++;
						System.out.println(serie);
					}
					
				}
			}
			System.out.println("Were found: "+seriesContResults+" Series.");
		}
		else if (selection1==6) 
		{
			//---------Search By Category-----------
			System.out.println("Search by category Id or Name:\n"
					+ "[1] Id\n"
					+ "[2] Name\n");
			int typeOfSearchCategory=scanner.nextInt();
			
			int seriesContResults=0;
			
			if(typeOfSearchCategory==1) 
			{
				//---------Search By Category (ID)-----------
				System.out.println("Indicate the Id of the categorie \n");
				int categoryId=scanner.nextInt();
				ScreenUtilities.clearScreen();
				System.out.println("Results: \n");
				for (Series serie:arraySeriesGeneral) 
				{
					for(Categorie category : serie.getCateg()) {
						if(category.getCategorieID()==categoryId) {
							seriesContResults++;
							System.out.println(serie);
						}
						
					}
				}
				System.out.println("Were found: "+seriesContResults+" Series.");
			}
			else if(typeOfSearchCategory==2) 
			{
				//---------Search By Name-----------
				System.out.println("Indicate the Name of the categorie \n");
				String categoryName=scanner2.nextLine();
				ScreenUtilities.clearScreen();
				System.out.println("Results: \n");
				for (Series serie:arraySeriesGeneral) 
				{
					for(Categorie category : serie.getCateg()) {
						if(category.getName().contains(categoryName)) {
							seriesContResults++;
							System.out.println(serie);
						}
						
					}
				}
				System.out.println("Were found: "+seriesContResults+" Series.");
				
			}
		}
		else if (selection1==7) 
		{
			//---------Search By Duration------------
			int seriesContResults=0;
			System.out.println("Indicate the total duration: \n");
			double durationTotalTime=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Series serie:arraySeriesGeneral) 
			{
				if(serie.getDuration()==durationTotalTime) 
				{
					seriesContResults++;
					System.out.println(serie);
				}
			}
			System.out.println("Were found: "+seriesContResults+" Series.");
		}
		else if (selection1==8) 
		{
			//---------Search By Creation Year------------
			int seriesContResults=0;
			System.out.println("Indicate the total duration: \n");
			int creationYear=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Series serie:arraySeriesGeneral) 
			{
				if(serie.getCreationYear()==creationYear) 
				{
					seriesContResults++;
					System.out.println(serie);
				}
			}
			System.out.println("Were found: "+seriesContResults+" Series.");
		}
		else if (selection1==9) 
		{
			//---------Search By Subtitles------------
			int seriesContResults=0;
			System.out.println("Select suntitle for the search: \n"
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
			for (Series serie:arraySeriesGeneral) 
			{
				for(Subtitles subtitle : serie.getAvaliableSubtitles()) 
				{
					if(subtitle.getSubtitle()==subtitleToFind) 
					{
						seriesContResults++;
						System.out.println(serie);
					}
					
				}
			}
			System.out.println("This series where found: "+seriesContResults);
		}
		else if (selection1==10) 
		{
			//---------Search By total capitule number (ID)------------
			int seriesContResults=0;
			System.out.println("Indicate the number of chapters \n");
			int numberOfChapters=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Series serie:arraySeriesGeneral) 
			{
				if(serie.getnChapter()==numberOfChapters) 
				{
					seriesContResults++;
					System.out.println(serie);
				}
			}
			System.out.println("This series where found: "+seriesContResults);
		}
		else if (selection1==11) 
		{
			//---------Search By total seasons (ID)------------
			int seriesContResults=0;
			System.out.println("Indicate the number of seasons \n");
			int numberOfSeasons=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Series serie:arraySeriesGeneral) 
			{
				if(serie.getSeasons()==numberOfSeasons) 
				{
					seriesContResults++;
					System.out.println(serie);
				}
			}
			System.out.println("This series where found: "+seriesContResults);
		}
		else if (selection1==12) 
		{
			//---------Search By Serie ID------------
			int seriesContResults=0;
			System.out.println("Indicate the Id de la Serie \n");
			int serieId=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Series serie:arraySeriesGeneral) 
			{
				if(serie.getSerieId()==serieId) 
				{
					seriesContResults++;
					System.out.println(serie);
				}
			}
			System.out.println("This series where found: "+seriesContResults);
		}
	}
	
	/**
	 * this method modify all the diferents series of the arrays  
	 * @param scanner the scanner
	 * @param scanner2 the scanner2
	 * @param arraySeriesGeneral Series general array
	 * @param arrayDirectorsGeneral directors general array
	 * @param arrayActorsGeneral actors general array
	 * @param arrayCategoriesGeneral categories general array
	 * @param serieIdCont serie id cont
	 * @return
	 */
	public static Series[] modifySerie(Scanner scanner,Scanner scanner2,Series[] arraySeriesGeneral,Directors[] arrayDirectorsGeneral,Actors[] arrayActorsGeneral,Categorie[] arrayCategoriesGeneral,int serieIdCont) 
	{

		System.out.println("Indicate the Id of the Serie to modify: ");
		int selectedSerieId=scanner.nextInt();
		boolean positiveResult=false;
		for(Series serie : arraySeriesGeneral) 
		{
			if(serie.getSerieId()==selectedSerieId) 
			{
				positiveResult=true;
				System.out.println("Serie found \n ("+serie.getTitle()+")");
				System.out.println("Indicate what you whant to modify... \n"
						+ "[1] Actors \n"
						+ "[2] Directors \n"
						+ "[3] Tittle \n"
						+ "[4] Original lenguage \n"
						+ "[5] Adapted lenguages\n"
						+ "[6] Categories \n"
						+ "[7] Duration\n"
						+ "[8] Creation Year\n"
						+ "[9] Subtittle\n"
						+ "[10] Number Of Chapters\n"
						+ "[11] Number Of Seasons\n"
						+ "[12] Id of Serie (Not recomendable)\n");
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
						System.out.println("Write the Id of the Actor (-1 to finish) (-2 to cancel): ");
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
						System.out.println("Actors finded to add: "+actorCountResult);
					}
					if(!cancelled) 
					{
						serie.setActors(arrayOfActors);
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
						System.out.println("Write the Id of the Director (-1 to finish) (-2 to cancel): ");
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
						System.out.println("Directors finded to add: "+directorCountResult);
					}
					if(!cancelled) 
					{
						serie.setDirectors(arrayOfDirectors);
					}
					//-------------MODIFY---DIRECTORS-------------
				}
				else if(selectedOption==3) 
				{
					//-------------MODIFY---TITLE-------------
					boolean cancelled=false;
					System.out.println("Write the new tittle for the Serie (-2 to cancel)"); 
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
						serie.setTitle(title);
					}
					//-------------MODIFY---TITLE-------------
				}
				else if(selectedOption==4) 
				{
					//-------------MODIFY---ORIGINAL-LANGUAGE-------------
					boolean cancelled=false;
					System.out.println("Write the new Original lenguage (-2 to cancel)"); 
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
						serie.setOriginalLanguage(orignalLang);
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
						serie.setAdaptedLanguages(adaptedLanguagesArray);
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
						serie.setCateg(arrayOfCategories);
					}
				}
				else if(selectedOption==7) 
				{
					boolean cancelled=false;
					ScreenUtilities.clearScreen();
					System.out.println("Select the new total duration  (Time in minutes) (-2 to cacel): ");
					double minutosTiempoDuracion=0;
					minutosTiempoDuracion=scanner.nextDouble();
					if(minutosTiempoDuracion==-2) 
					{
						cancelled=true;
						System.out.println("Operation Cancelled");
					}
					if(!cancelled) 
					{
						serie.setDuration(minutosTiempoDuracion);
					}
				}
				else if(selectedOption==8) 
				{
					boolean cancelled=false;
					ScreenUtilities.clearScreen();
					System.out.println("Select the year of creation (-2 to cancel): ");
					int anyoCreacion=9999;
					anyoCreacion=scanner.nextInt();
					if(anyoCreacion==-2)
					{
						cancelled=true;
						System.out.println("Operation Cancelled");
					}
					if(!cancelled) 
					{
						serie.setCreationYear(serieIdCont);
					}
				}
				else if(selectedOption==9) 
				{
					ScreenUtilities.clearScreen();
					System.out.println("Select the new Subtitles: ");
					boolean cancelled=false;
					int subTitle=2;
					int subtitlesCont=0;
					Subtitles[] subTitlesArray= new Subtitles[0];
					while(subTitle>=1&subTitle<=7) 
					{
						System.out.println("Select a subtitle to add: (-2 to cancel)\n"
								+ "[1] ES\n"
								+ "[2] EN\n"
								+ "[3] DE\n"
								+ "[4] RU\n"
								+ "[5] IT\n"
								+ "[6] CH\n"
								+ "[7] OTHER\n"
								+ "[Other] END...");
						subTitle=scanner.nextInt();
						if(subTitle==-2) 
						{
							cancelled=true;
							System.out.println("Operation Cancelled");
							break;
						}
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
					if(!cancelled)
					{
						serie.setAvaliableSubtitles(subTitlesArray);
					}
				}
				else if(selectedOption==10) 
				{
					ScreenUtilities.clearScreen();
					boolean cancelled=false;
					System.out.println("Select a new number of chapters: (-2 to cancel) ");
					int numeroCapitulos=0;
					numeroCapitulos=scanner.nextInt();
					if(numeroCapitulos==-2) 
					{
						System.out.println("Operation cancelled");
						cancelled=true;
					}
					if(!cancelled)
					{
						serie.setnChapter(serieIdCont);
					}
				}
				else if(selectedOption==11) 
				{
					boolean cancelled=false;
					ScreenUtilities.clearScreen();
					System.out.println("Select a number of seasons: ");
					int numeroTemporadas=0;
					numeroTemporadas=scanner.nextInt();
					if(numeroTemporadas==-2) 
					{
						cancelled=true;
						System.out.println("Operation Cancelled");
					}
					if(!cancelled)
					{
						serie.setSeasons(numeroTemporadas);
					}

				}
				else if(selectedOption==12) 
				{
					System.out.println("Warning , changing the id could put the sistem in danger\n"
					+ "*Change it only if you know what you are doing...");
					System.out.println("Indicate the new id: (-2 to cancel)");
					int newSerieId=scanner.nextInt();
					boolean cancelled=false;
					if(newSerieId==-2) 
					{
						cancelled=true;
						System.out.println("Operation Cancelled");
					}
					if(!cancelled) 
					{
						serie.setSerieId(newSerieId);
					}
				}
			}
		}
		if(positiveResult) 
		{
			System.out.println("Changes Saved..");
		}
		else 
		{
			System.out.println("No series with that id where found...");
		}
		return arraySeriesGeneral;
	}
	
	/**
	 * this methods delete a selected serie of the array by a atribute
	 * @param scanner the scanner
	 * @param arraySeriesGeneral array series general
	 * @return
	 */
	public static Series[] deleteSerie(Scanner scanner,Series[] arraySeriesGeneral) 
	{

		int positionCont=0;
		boolean cancelled=false;
		System.out.println("Warning , deleting a serie cant be fix , do it if you know what you are doing.");
		System.out.println("Indicate the Id of the serie to delete (-2 to cancel)");
		int deleteSerieId=scanner.nextInt();
		if(deleteSerieId==-2) 
		{
			cancelled=true;
			System.out.println("Operation Cancelled");
		}
		if(!cancelled) 
		{
			for(Series serie:arraySeriesGeneral) 
			{
				if(serie.getSerieId()==deleteSerieId) 
				{
					System.out.println("Serie found: ("+serie.getTitle()+")\n"
							+ "-Do you want to delete it ?\n"
							+ "[1] Yes\n"
							+ "[2] No..");
					int finalDecision = scanner.nextInt();
					if(finalDecision==2) 
					{
						System.out.println("Operation Aborted");
					}
					else 
					{
						System.out.println(serie.getTitle());
						for(int i =0;i<arraySeriesGeneral.length;i++) 
						{
							if(i==positionCont) 
							{
								arraySeriesGeneral[i]=arraySeriesGeneral[arraySeriesGeneral.length-1];
								arraySeriesGeneral=Arrays.copyOf(arraySeriesGeneral, arraySeriesGeneral.length-1);
							}
						}
						System.out.println("Deleted Correctly...");
					}
					
				}
				positionCont++;
			}
		}
		return arraySeriesGeneral;
	}
}
