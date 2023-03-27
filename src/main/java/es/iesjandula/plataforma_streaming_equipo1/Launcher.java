package es.iesjandula.plataforma_streaming_equipo1;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.IMenus.*;
import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AvaliableAdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Audiovisuals;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Type;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.Movies;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.Series;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.categories.CategorieTypes;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.RecomendationsType;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.AvaliableSubtitles;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;

/*
 * The main class
 */

public class Launcher
{
	public static void clearScreen() 
	{	
		//Method for clear the screen
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
	public static void main(String[] args) 
	{
		//Scanner variables.
		//sc , used for all type of data except String.
		Scanner scanner = new Scanner(System.in);
		//sc2 , used only for data type String
		Scanner scanner2 = new Scanner(System.in);
		//Main  
		
		//----------------BASE OBJECTS---CATEGORIE CLASS----------------------------
		int categorieIdCont=0;
		Categorie category1 = new Categorie(CategorieTypes.ACTION,categorieIdCont++);
		Categorie category2 = new Categorie(CategorieTypes.COMEDY,categorieIdCont++);
		Categorie category3 = new Categorie(CategorieTypes.TERROR,categorieIdCont++);
		Categorie category4 = new Categorie(CategorieTypes.SUSPENSE,categorieIdCont++);
		Categorie category5 = new Categorie(CategorieTypes.CHILDISH,categorieIdCont++);
		Categorie[] arrayCategories1 = {category1};
		Categorie[] arrayCategoriesGeneral = {category1,category2,category3,category4};
		//----------------BASE OBJECTS---CATEGORIE CLASS----------------------------
		
		
		
		//-----------------BASE OBJECTS-- DIRECTORS CLASS----------------------------
		int directorIdCont=0;
		
		Directors director1 = new Directors("Manuel","Perez",1980,"Spain",Genders.MAN,directorIdCont++);
		Directors director2 = new Directors("Luis","Molina",1953,"England",Genders.MAN,directorIdCont++);
		Directors director3 = new Directors("Sancho","Perez",1952,"EEUU",Genders.MAN,directorIdCont++);
		Directors director4 = new Directors("Maria","Molina",1934,"Mexico",Genders.WOMAN,directorIdCont++);
		Directors director5 = new Directors("Sara","Sanchez",1989,"Poland",Genders.WOMAN,directorIdCont++);
		Directors director6 = new Directors("Fernanda","Rosa",1999,"Ukrain",Genders.WOMAN,directorIdCont++);
		
		Directors[] arrayDirectors1 = {director1,director2};
		Directors[] arrayDirectorsGeneral = {director1,director2,director3,director4,director5,director6};
		
		//----------------BASE OBJECTS-- DIRECTORS CLASS----------------------------
		
		
		
		//----------------BASE OBJECTS-- ACTORS CLASS----------------------------
		int actorIdCont=0;
		Actors actor1 = new Actors("Pepe","Gonzales", "Spain",Genders.MAN,1990,actorIdCont++);
		Actors actor2 = new Actors("Arturo","Benitez", "England",Genders.MAN,1990,actorIdCont++);
		Actors actor3 = new Actors("Nelson","Martinez", "EEUU",Genders.MAN,1990,actorIdCont++);
		Actors actor4 = new Actors("Persiman","Letsen", "Polan",Genders.MAN,1990,actorIdCont++);
		Actors actor5 = new Actors("Julia","Rous", "Ukrain",Genders.WOMAN,1990,actorIdCont++);
		Actors actor6 = new Actors("Sofia","Hernandez", "Africa",Genders.WOMAN,1990,actorIdCont++);
		Actors[] arrayActors1 = {actor1,actor6};
		Actors[] arrayActorsGeneral = {actor1,actor2,actor3,actor4,actor5,actor6};
		
		//----------------BASE OBJECTS-- ACTORS CLASS----------------------------
		
		
		//-----------------BASE OBJECTS-- SUBTITLES CLASS----------------------------
		Subtitles subtitle1 = new Subtitles(AvaliableSubtitles.EN);
		Subtitles subtitle2 = new Subtitles(AvaliableSubtitles.ES);
		Subtitles subtitle3 = new Subtitles(AvaliableSubtitles.DE);
		Subtitles subtitle4 = new Subtitles(AvaliableSubtitles.RU);
		Subtitles subtitle5 = new Subtitles(AvaliableSubtitles.IT);
		Subtitles subtitle6 = new Subtitles(AvaliableSubtitles.CH);

		Subtitles[] arraySubtitles1 = {subtitle1,subtitle2};
		Subtitles[] arraySubtitlesGeneral = {subtitle1,subtitle2,subtitle3,subtitle4,subtitle5,subtitle6};
		//-----------------BASE OBJECTS-- SUBTITLES CLASS----------------------------		
		
		
		//-----------------BASE OBJECTS-- RECOMENDATIONS CLASS----------------------------
		Recomendations reco1 = new Recomendations("Buena peli me gusto",RecomendationsType.POSITIVE);
		Recomendations reco2 = new Recomendations("Me gusto",RecomendationsType.POSITIVE);
		Recomendations reco3 = new Recomendations("Bueno ni mal ni bien");
		Recomendations reco4 = new Recomendations("FENOMENAL !!!!!",RecomendationsType.POSITIVE);
		Recomendations reco5 = new Recomendations("Una basura...",RecomendationsType.POSITIVE);
		
		Recomendations[] arrayRecomendationsGeneral= {reco1,reco2,reco3,reco4,reco5};
		//-----------------BASE OBJECTS-- RECOMENDATIONS CLASS----------------------------
		
		
		
		//Array with AdaptedLanguages
		AdaptedLanguages adaptLang1 = new AdaptedLanguages(AvaliableAdaptedLanguages.EN);
		AdaptedLanguages adaptLang2 = new AdaptedLanguages(AvaliableAdaptedLanguages.ES);
		AdaptedLanguages adaptLang3 = new AdaptedLanguages(AvaliableAdaptedLanguages.DE);
		AdaptedLanguages adaptLang4 = new AdaptedLanguages(AvaliableAdaptedLanguages.RU);
		AdaptedLanguages adaptLang5 = new AdaptedLanguages(AvaliableAdaptedLanguages.IT);
		AdaptedLanguages adaptLang6 = new AdaptedLanguages(AvaliableAdaptedLanguages.CH);

		AdaptedLanguages[] arrayAdaptedLanguages1 = {adaptLang1,adaptLang2};
		AdaptedLanguages[] arrayAdaptedLanguagesGeneral = {adaptLang1,adaptLang2,adaptLang3,adaptLang4,adaptLang5,adaptLang6};
		
		
		//----------------BASE OBJECTS--MOVIES CLASS----------------------------
		int movieIdCont=0;
		Movies movie1 = new Movies(arrayActors1,arrayDirectors1,arrayCategories1,"Los 300","English",arrayAdaptedLanguages1,arraySubtitles1,145.0,2013,movieIdCont++);
		Movies[] arrayMoviesGeneral= {movie1};
		//----------------BASE OBJECTS--MOVIES CLASS----------------------------		
		
		
		//----------------BASE OBJECTS--SERIES CLASS----------------------------
		int serieIdCont=0;
		Series serie1 = new Series(arrayActors1,arrayDirectors1,arrayCategories1,"Hora de aventuras","English",arrayAdaptedLanguages1,arraySubtitles1,25.0,2010,100,10,serieIdCont++);
		Series serie2 = new Series(arrayActors1,arrayDirectors1,arrayCategories1,"Historias corrientes","English",arrayAdaptedLanguages1,arraySubtitles1,25.0,2015,100,10,serieIdCont++);
		serie1.setRecomendationSerie(reco4);
		serie1.setRecomendationSerie(reco2);
		serie1.setRecomendationSerie(reco3);
		serie2.setRecomendationSerie(reco1);
		serie2.setRecomendationSerie(reco5);
		Series[] arraySeriesGeneral= {serie1,serie2}; 
		//----------------BASE OBJECTS--SERIES CLASS----------------------------
		
		
		
		//-----------------------MENUS----------------------------------------
		
		//boolean for the main Loop
		boolean isRunning=true;
		
		//------MAIN--LOOP-------
		while(isRunning)
		{
			int firstSelection;
			IGeneralsMenu.generalMenu();
			System.out.print("-> ");
			//Principal selection
			firstSelection = scanner.nextInt();
			
			switch(firstSelection) 
			{
				case 1:
				{
					//-------------OPTIONS MENU CASE-------------
					clearScreen();
					IGeneralsMenu.optionsGeneralMenu();
					System.out.print("-> ");
					//Getting the Main menu selection
					int optionSelection = scanner.nextInt();
					
					switch(optionSelection) 
					{
						case 1:
						{
							//----------DIRECTORS OPTIONS--------------
							clearScreen();
							IMenuDirectors.directorMenu();
							int selection = scanner.nextInt();
							switch(selection) 
							{
								case 1:
								{//--CREATE NEW DIRECTOR------
									System.out.println("Tell me the name of the director");
									String name=scanner2.nextLine();
									clearScreen();
									System.out.println("Tell me the last name of the director");
									String lastName=scanner2.nextLine();
									clearScreen();
									System.out.println("Tell me the nationality of the director");
									String nationality=scanner2.nextLine();
									clearScreen();
									System.out.println("Select the gender of the director: \n"
											+ "[1] Man \n"
											+ "[2] Woman \n"
											+ "[3] Other \n");
									int gender = scanner.nextInt();
									clearScreen();
									Genders x=Genders.OTHER;
									if (gender==1)
									{
										x=Genders.MAN;
									}
									else if (gender==2)
									{
										x=Genders.WOMAN;
									}
									else 
									{
										x=Genders.OTHER;
									}
									System.out.println("Tell me the year of birth of the director:");
									int year=scanner.nextInt();
									clearScreen();
									
									arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length+1);
									arrayDirectorsGeneral[arrayDirectorsGeneral.length-1]=new Directors(name, lastName, year, nationality, x,directorIdCont++);
									System.out.println(arrayDirectorsGeneral[arrayDirectorsGeneral.length-1]);
									break;
									//--CREATE NEW DIRECTOR------
								}
								case 2:
								{
									//-----SEARCH-DIRECTOR-----
									clearScreen();
									System.out.println("Select the search method: \n"
											+ "[1] Name \n"
											+ "[2] Last Name \n"
											+ "[3] Year of birth \n"
											+ "[4] Nationality \n"
											+ "[5] Gender \n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1) 
									{
										System.out.println("Indicate the name \n");
										String name=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral) 
										{
											if (director.getName().equals(name)) 
											{
												System.out.println(director);
											}
										}
									}
									else if (selection1==2) 
									{
										System.out.println("Indicate the Surname \n");
										String lastName=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral) 
										{
											if (director.getLastName().equals(lastName)) 
											{
												System.out.println(director);
											}
										}
									}
									else if (selection1==3) 
									{
										System.out.println("Indicates the year of birth \n");
										int year=scanner.nextInt();
										clearScreen();
										System.out.println("Results: \n");
										for (Directors director:arrayDirectorsGeneral) 
										{
											if (director.getYear()==year) 
											{
												System.out.println(director);
											}
										}
									}
									else if (selection1==4) 
									{
										System.out.println("Indicate the nationality \n");
										String nationality=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral)
										{
											if (director.getNationality().equals(nationality)) 
											{
												System.out.println(director);
											}
										}
									}
									else 
									{
										System.out.println("Indicate the gender \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = scanner.nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1)
										{
											x=Genders.MAN;
										}
										else if (gender==2)
										{
											x=Genders.WOMAN;
										}
										else 
										{
											x=Genders.OTHER;
										}
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral)
										{
											if (director.getGender().equals(x)) 
											{
												System.out.println(director);
											}
										}
									}
									break;
									//-----SEARCH-DIRECTOR-----
								}
								case 3:
								{
									//------MODIFY DIRECTOR---------
									clearScreen();
									System.out.println("Select search method to modify the director: \n"
											+ "[1] Name \n"
											+ "[2] Last Name \n"
											+ "[3] Year of birth \n"
											+ "[4] Nationality \n"
											+ "[5] Gender \n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1) 
									{
										System.out.println("Indicate the name \n");
										String name=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral) 
										{
											if (director.getName().equals(name)) 
											{
												System.out.println("Found: ");
												System.out.println(director);
												System.out.println("Select which data you want to change from the director: \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Gender \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1) 
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													director.setName(name1);
												}
												else if (selection2==2) 
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}
												else if (selection2==3)
												{
													System.out.println("Tell me the year of birth ");
													int year=scanner.nextInt();
													clearScreen(); 
													director.setYear(year);
												}
												else if (selection2==4) 
												{
													System.out.println("Tell me the nationality ");
													String nationality=scanner2.nextLine(); 
													clearScreen();
													director.setNationality(nationality);
												}
												else 
												{
													System.out.println("Indicate the gender \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = scanner.nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) 
													{
														x=Genders.MAN;
													}
													else if (gender==2)
													{
														x=Genders.WOMAN;
													}
													else 
													{
														x=Genders.OTHER;
													}
													director.setGender(x);
												}
											}
										}
									}
									else if (selection1==2)
									{
										System.out.println("Indicate the last name \n");
										String lastName=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral) 
										{
											if (director.getLastName().equals(lastName)) 
											{
												System.out.println("Found: ");
												System.out.println(director);
												System.out.println("Select which data you want to change from the director: \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Gender \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1) 
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													director.setName(name1);
												}
												else if (selection2==2)
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}
												else if (selection2==3) 
												{
													System.out.println("Tell me the year of birth: ");
													int year=scanner.nextInt(); 
													clearScreen();
													director.setYear(year);
												}
												else if (selection2==4) 
												{
													System.out.println("Tell me the nationality ");
													String nationality=scanner2.nextLine(); 
													clearScreen();
													director.setNationality(nationality);
												}
												else 
												{
													System.out.println("Indicate the gender \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = scanner.nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) 
													{
														x=Genders.MAN;
													}
													else if (gender==2)
													{
														x=Genders.WOMAN;
													}
													else 
													{
														x=Genders.OTHER;
													}
													director.setGender(x);
												}
											}
										}
									}
									else if (selection1==3) 
									{
										System.out.println("Indicate the year of birth \n");
										int nacimiento=scanner.nextInt();
										clearScreen();
										//d
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral)
										{
											if (director.getYear()==nacimiento) 
											{
												System.out.println("Found: ");
												System.out.println(director);
												System.out.println("Select which data you want to change from the director: \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Genero \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1)
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													director.setName(name1);
												}
												else if (selection2==2)
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}
												else if (selection2==3) 
												{
													System.out.println("Tell me the year of birth: ");
													int year=scanner.nextInt();
													clearScreen(); 
													director.setYear(year);
												}
												else if (selection2==4) 
												{
													System.out.println("Tell me the nationality: ");
													String nationality=scanner2.nextLine(); 
													clearScreen();
													director.setNationality(nationality);
												}
												else
												{
													System.out.println("Indicate the gender \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = scanner.nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) 
													{
														x=Genders.MAN;
													}
													else if (gender==2)
													{
														x=Genders.WOMAN;
													}
													else 
													{
														x=Genders.OTHER;
													}
													director.setGender(x);
												}
											}
										}
									}
									else if (selection1==4) 
									{
										System.out.println("Indicate the nationality \n");
										String nacionalidad=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral)
										{
											if (director.getNationality().equals(nacionalidad))
											{
												System.out.println("Found: ");
												System.out.println(director);
												System.out.println("Select which data you want to change from the director: \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Gender \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1) 
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													director.setName(name1);
												}
												else if (selection2==2) 
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}
												else if (selection2==3) 
												{
													System.out.println("Tell me the year of birth: ");
													int year=scanner.nextInt(); 
													clearScreen();
													director.setYear(year);
												}
												else if (selection2==4)
												{
													System.out.println("Tell me the nationality: ");
													String nationality=scanner2.nextLine();
													clearScreen(); 
													director.setNationality(nationality);
												}
												else 
												{
													System.out.println("Tell me the gender: \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = scanner.nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) 
													{
														x=Genders.MAN;
													}
													else if (gender==2)
													{
														x=Genders.WOMAN;
													}
													else 
													{
														x=Genders.OTHER;
													}
													director.setGender(x);
												}
											}
										}
									}
									else
									{
										System.out.println("Indicate the gender \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = scanner.nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1)
										{
											x=Genders.MAN;
										}
										else if (gender==2)
										{
											x=Genders.WOMAN;
										}
										else 
										{
											x=Genders.OTHER;
										}
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral)
										{
											if (director.getGender().equals(x))
											{
												System.out.println("Found: ");
												System.out.println(director);
												System.out.println("Select which data you want to change from the director: \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Gender \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1) 
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													director.setName(name1);
												}
												else if (selection2==2) 
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}
												else if (selection2==3) 
												{
													System.out.println("Tell me the year of birth: ");
													int year=scanner.nextInt(); 
													clearScreen();
													director.setYear(year);
												}
												else if (selection2==4) 
												{
													System.out.println("Tell me the nationality: ");
													String nationality=scanner2.nextLine(); 
													clearScreen();
													director.setNationality(nationality);
												}
												else 
												{
													System.out.println("Indicate the gender \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender1 = scanner.nextInt();
													clearScreen();
													Genders x1=Genders.OTHER;
													if (gender1==1) 
													{
														x1=Genders.MAN;
													}
													else if (gender1==2)
													{
														x1=Genders.WOMAN;
													}
													else 
													{
														x1=Genders.OTHER;
													}
													director.setGender(x1);
												}
											}
										}
									}
									break;
									//------MODIFY DIRECTOR---------
								}
								case 4:
								{
									int cont=0;
									System.out.println("Select the search method to delete: \n"
											+ "[1] Name \n"
											+ "[2] Last Name \n"
											+ "[3] Year of birth \n"
											+ "[4] Nationality \n"
											+ "[5] Gender \n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1) 
									{
										System.out.println("Indicate the name: \n");
										String name=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral) 
										{
											if (director.getName().equals(name)) 
											{
												System.out.println(director);
												System.out.println("Position "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}
													else 
													{
													arrayDirectorsGeneral[i]=arrayDirectorsGeneral[i];
													}
												}
												
												arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayDirectorsGeneral));
										cont=0;
									}
									else if (selection1==2)
									{
										System.out.println("Indicate the last name: \n");
										String lastName=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral) 
										{
											if (director.getLastName().equals(lastName)) 
											{
												System.out.println(director);
												System.out.println("Position "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++) 
												{
													if(cont==i)
													{
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}
													else 
													{
													arrayDirectorsGeneral[i]=arrayDirectorsGeneral[i];
													}
												}
												
												arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayDirectorsGeneral));
										cont=0;
									}
									else if (selection1==3) 
									{
										System.out.println("Indicate the year of birth \n");
										int year=scanner.nextInt();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral) 
										{
											if (director.getYear()==year) 
											{
												System.out.println(director);
												System.out.println("Position "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}
													else 
													{
													arrayDirectorsGeneral[i]=arrayDirectorsGeneral[i];
													}
												}
												
												arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayDirectorsGeneral));
										cont=0;
									}
									else if (selection1==4) 
									{
										System.out.println("Indicate the nationality: \n");
										String nationality=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Directors director:arrayDirectorsGeneral)
										{
											if (director.getNationality().equals(nationality)) 
											{
												System.out.println(director);
												System.out.println("Position "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}
													else 
													{
													arrayDirectorsGeneral[i]=arrayDirectorsGeneral[i];
													}
												}
												
												arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayDirectorsGeneral));
										cont=0;
									}
									else
									{
										System.out.println("Indicate the gender \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = scanner.nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) 
										{
											x=Genders.MAN;
										}
										else if (gender==2)
										{
											x=Genders.WOMAN;
										}
										else 
										{
											x=Genders.OTHER;
										}
										System.out.println("Found : \n");
										for (Directors director:arrayDirectorsGeneral)
										{
											if (director.getGender().equals(x)) 
											{
												System.out.println(director);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++)
												{
													if(cont==i) 
													{
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}
													else 
													{
													arrayDirectorsGeneral[i]=arrayDirectorsGeneral[i];
													}
												}
												
												arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayDirectorsGeneral));
										cont=0;
									}
								}
									
							}
							break;
							//----------DIRECTORS OPTIONS--------------
						}
						
						
						case 2:
						{//----------ACTORS-OPTIONS--------------
							clearScreen();
							IMenuActors.actorMenu();
							int selection = scanner.nextInt();
							switch(selection) 
							{
								case 1:
								{

									System.out.println("Tell me the name of actors");
									String name=scanner2.nextLine();
									clearScreen();
									System.out.println("Tell me the last name of actors");
									String apellido=scanner2.nextLine();
									clearScreen();
									System.out.println("Tell me the nationality of actors");
									String nationality=scanner2.nextLine();
									clearScreen();
									System.out.println("Select the gender of actors: \n"
											+ "[1] Man \n"
											+ "[2] Woman \n"
											+ "[3] Other \n");
									int gender = scanner.nextInt();
									clearScreen();
									Genders x=Genders.OTHER;
									if (gender==1)
									{
										x=Genders.MAN;
									}
									else if (gender==2)
									{
										x=Genders.WOMAN;
									}
									else 
									{
										x=Genders.OTHER;
									}
									System.out.println("Tell me the year of birth of actors");
									int year=scanner.nextInt();
									clearScreen();
									
									arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length+1);
									arrayActorsGeneral[arrayActorsGeneral.length-1]=new Actors(name, apellido, nationality, x, year,actorIdCont++);
									System.out.println(arrayActorsGeneral[arrayActorsGeneral.length-1]);
									break;
								}
								case 2:
								{
									clearScreen();
									System.out.println("Select the search method: \n"
											+ "[1] Name \n"
											+ "[2] LastName \n"
											+ "[3] Year of birth \n"
											+ "[4] Nationality \n"
											+ "[5] Gender \n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1) 
									{
										System.out.println("Indicate the name \n");
										String name=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getName().equals(name)) 
											{
												System.out.println(actor);
											}
										}
									}
									else if (selection1==2) 
									{
										System.out.println("Indicate the last name: \n");
										String apellido=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getLastName().equals(apellido)) 
											{
												System.out.println(actor);
											}
										}
									}
									else if (selection1==3) 
									{
										System.out.println("Indicate the year of birth: \n");
										int year=scanner.nextInt();
										clearScreen();
										System.out.println("Results: \n");
										for (Actors actor:arrayActorsGeneral)
										{
											if (actor.getYear()==year) 
											{
												System.out.println(actor);
											}
										}
									}
									else if (selection1==4) 
									{
										System.out.println("Indicate the nationality \n");
										String nationality=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getNationality().equals(nationality)) 
											{
												System.out.println(actor);
											}
										}
									}
									else 
									{
										System.out.println("Indicate the gender \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = scanner.nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) 
										{
											x=Genders.MAN;
										}
										else if (gender==2)
										{
											x=Genders.WOMAN;
										}
										else 
										{
											x=Genders.OTHER;
										}
										System.out.println("Found : \n");
										for (Actors actor:arrayActorsGeneral)
										{
											if (actor.getGender().equals(x)) 
											{
												System.out.println(actor);
											}
										}
									}
									break;
								}
								case 3:
								{
									clearScreen();
									System.out.println("Select search method to modify the actor: \n"
											+ "[1] Name \n"
											+ "[2] Last Name \n"
											+ "[3] Year of birth \n"
											+ "[4] Nationality \n"
											+ "[5] Gender \n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1) 
									{
										System.out.println("Indicate the name: \n");
										String name=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getName().equals(name))
											{
												System.out.println("Found: ");
												System.out.println(actor);
												System.out.println("Select which data you want to change from the actor: \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Gender \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1)
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													actor.setName(name1);
												}
												else if (selection2==2) 
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}
												else if (selection2==3) 
												{
													System.out.println("Tell me the year of birth: ");
													int year=scanner.nextInt();
													clearScreen(); 
													actor.setYear(year);
												}
												else if (selection2==4) 
												{
													System.out.println("Tell me the nationality: ");
													String nationality=scanner2.nextLine(); 
													clearScreen();
													actor.setNationality(nationality);
												}
												else 
												{
													System.out.println("Indicate the gender: \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = scanner.nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1)
													{
														x=Genders.MAN;
													}
													else if (gender==2)
													{
														x=Genders.WOMAN;
													}
													else
													{
														x=Genders.OTHER;
													}
													actor.setGender(x);
												}
											}
										}
									}
									else if (selection1==2) 
									{
										System.out.println("Indicate the last name: \n");
										String apellido=scanner2.nextLine();
										clearScreen();
										System.out.println("Results : \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getLastName().equals(apellido)) 
											{
												System.out.println("Found: ");
												System.out.println(actor);
												System.out.println("Select what data you want to change from the actor: \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Gender \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1)
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													actor.setName(name1);
												}
												else if (selection2==2)
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}
												else if (selection2==3) 
												{
													System.out.println("Tell me the year of birth: ");
													int year=scanner.nextInt(); 
													clearScreen();
													actor.setYear(year);
												}
												else if (selection2==4) 
												{
													System.out.println("Tell me the nationality ");
													String nationality=scanner2.nextLine(); 
													clearScreen();
													actor.setNationality(nationality);
												}
												else 
												{
													System.out.println("Indicate the gender \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = scanner.nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) 
													{
														x=Genders.MAN;
													}
													else if (gender==2)
													{
														x=Genders.WOMAN;
													}
													else 
													{
														x=Genders.OTHER;
													}
													actor.setGender(x);
												}
											}
										}
									}
									else if (selection1==3) 
									{
										System.out.println("Tell me the year of birth \n");
										int yearBirth=scanner.nextInt();
										clearScreen();
										System.out.println("Results : \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getYear()==yearBirth) 
											{
												System.out.println("Found: ");
												System.out.println(actor);
												System.out.println("Select what data you want to change from the actor: \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Gender \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1) 
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													actor.setName(name1);
												}
												else if (selection2==2) 
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}
												else if (selection2==3)
												{
													System.out.println("Tell me the year of birth: ");
													int year=scanner.nextInt();
													clearScreen(); 
													actor.setYear(year);
												}
												else if (selection2==4) 
												{
													System.out.println("Tell me the nationality: ");
													String nationality=scanner2.nextLine(); 
													clearScreen();
													actor.setNationality(nationality);
												}
												else 
												{
													System.out.println("Indicate the gender \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = scanner.nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) 
													{
														x=Genders.MAN;
													}
													else if (gender==2)
													{
														x=Genders.WOMAN;
													}
													else 
													{
														x=Genders.OTHER;
													}
													actor.setGender(x);
												}
											}
										}
									}
									else if (selection1==4) 
									{
										System.out.println("Indicate the nationality \n");
										String nationality=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getNationality().equals(nationality))
											{
												System.out.println("Found: ");
												System.out.println(actor);
												System.out.println("Select what data you want to change from the actor: \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Gender \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1) 
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													actor.setName(name1);
												}
												else if (selection2==2) 
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}
												else if (selection2==3)
												{
													System.out.println("Tell me the year of birth: ");
													int year=scanner.nextInt(); 
													clearScreen();
													actor.setYear(year);
												}
												else if (selection2==4) 
												{
													System.out.println("Tell me the nationality ");
													String nationality1=scanner2.nextLine();
													clearScreen(); 
													actor.setNationality(nationality1);
												}
												else 
												{
													System.out.println("Indicate the gender \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = scanner.nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1)
													{
														x=Genders.MAN;
													}
													else if (gender==2)
													{
														x=Genders.WOMAN;
													}
													else 
													{
														x=Genders.OTHER;
													}
													actor.setGender(x);
												}
											}
										}
									}
									else 
									{
										System.out.println("Indicate the gender \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = scanner.nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) 
										{
											x=Genders.MAN;
										}
										else if (gender==2)
										{
											x=Genders.WOMAN;
										}
										else 
										{
											x=Genders.OTHER;
										}
										System.out.println("Results : \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getGender().equals(x)) 
											{
												System.out.println("Found: ");
												System.out.println(actor);
												System.out.println("Select what data you want to change from the actor : \n"
														+ "[1] Name \n"
														+ "[2] Last Name \n"
														+ "[3] Year of birth \n"
														+ "[4] Nationality \n"
														+ "[5] Gender \n");
												int selection2 = scanner.nextInt();
												clearScreen();
												if (selection2==1) 
												{
													System.out.println("Tell me the name: ");
													String name1=scanner2.nextLine(); 
													clearScreen();
													actor.setName(name1);
												}
												else if (selection2==2) 
												{
													System.out.println("Tell me the last name: ");
													String lastName1=scanner2.nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}
												else if (selection2==3) 
												{
													System.out.println("Tell me the year of birth: ");
													int year=scanner.nextInt(); 
													clearScreen();
													actor.setYear(year);
												}
												else if (selection2==4) 
												{
													System.out.println("Tell me the year of birth ");
													String nationality=scanner2.nextLine(); 
													clearScreen();
													actor.setNationality(nationality);
												}
												else 
												{
													System.out.println("Indicate the gender \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender1 = scanner.nextInt();
													clearScreen();
													Genders x1=Genders.OTHER;
													if (gender1==1) 
													{
														x1=Genders.MAN;
													}
													else if (gender1==2)
													{
														x1=Genders.WOMAN;
													}
													else 
													{
														x1=Genders.OTHER;
													}
													actor.setGender(x1);
												}
											}
										}
									}
									break;
								}
								case 4:
								{
									int cont=0;
									System.out.println("Select the search method to delete: \n"
											+ "[1] Name \n"
											+ "[2] Last Name \n"
											+ "[3] Year of birth \n"
											+ "[4] Nationality \n"
											+ "[5] Genero \n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1)
									{
										System.out.println("Indicate the name: \n");
										String name=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getName().equals(name))
											{
												System.out.println(actor);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}
													else 
													{
													arrayActorsGeneral[i]=arrayActorsGeneral[i];
													}
												}
												
												arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayActorsGeneral));
										cont=0;
									}
									else if (selection1==2) 
									{
										System.out.println("Indicate the last name: \n");
										String apellido=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getLastName().equals(apellido)) 
											{
												System.out.println(actor);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}
													else 
													{
													arrayActorsGeneral[i]=arrayActorsGeneral[i];
													}
												}
												arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayActorsGeneral));
										cont=0;
									}
									else if (selection1==3)
									{
										System.out.println("Indicate the year of birth: \n");
										int year=scanner.nextInt();
										clearScreen();
										System.out.println("Results: \n");
										for (Actors actor:arrayActorsGeneral)
										{
											if (actor.getYear()==year) {
												System.out.println(actor);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}
													else
													{
													arrayActorsGeneral[i]=arrayActorsGeneral[i];
													}
												}
												
												arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayActorsGeneral));
										cont=0;
									}
									else if (selection1==4) 
									{
										System.out.println("Indicate the Nationality \n");
										String nacionalidad=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getNationality().equals(nacionalidad)) 
											{
												System.out.println(actor);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}
													else
													{
													arrayActorsGeneral[i]=arrayActorsGeneral[i];
													}
												}
												
												arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayActorsGeneral));
										cont=0;
									}
									else 
									{
										System.out.println("Indicate the gender \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = scanner.nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) 
										{
											x=Genders.MAN;
										}
										else if (gender==2)
										{
											x=Genders.WOMAN;
										}
										else 
										{
											x=Genders.OTHER;
										}
										System.out.println("Results: \n");
										for (Actors actor:arrayActorsGeneral) 
										{
											if (actor.getGender().equals(x)) 
											{
												System.out.println(actor);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}
													else 
													{
													arrayActorsGeneral[i]=arrayActorsGeneral[i];
													}
												}
												
												arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayActorsGeneral));
										cont=0;
									}
								}
									
							}
							break;
							
							
						}//----------ACTORS-OPTIONS--------------
						
						case 3:
						{//----------RECOMENDATIONS-OPTIONS--------------
							clearScreen();
							IMenuRecommendations.recommendationMenu();
							//String recommendations,RecomendationsType Type
							
							int selection = scanner.nextInt();
							switch(selection) 
							{
								case 1:
								{
									//-------------CREATE-RECOMENDATION-----------------
									System.out.println("Texto de la Recomandacion:");
									String texto=scanner2.nextLine();
									clearScreen();
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
		
									clearScreen();
									
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
									
									
									//-------------ADD-RECOMENDATION-TO-SERIE-MOVIE------------------
									break;
									
									//-------------CREATE-RECOMENDATION-----------------
								}
								case 2:
								{
									//-------------SEARCH-RECOMENDATIONS-----------------
									clearScreen();
									System.out.println("Select the search method: \n"
											+ "[1] Text \n"
											+ "[2] Type (Positive,Negative,Neutral) \n"
											+ "[3] Serie or Movie ID\n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1) 
									{
										//--SARCH-BY-TEXT--
										System.out.println("Indicate the text \n");
										String text=scanner2.nextLine();
										clearScreen();
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
										
										clearScreen();
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
									
									break;

									//-------------SEARCH-RECOMENDATIONS-----------------
								}
								case 3:
								{
									//-------------MODIFY-RECOMENDATION-----------------
									clearScreen();
									System.out.println("Select the search method to modify: \n"
											+ "[1] Text \n"
											+ "[2] Type (Positive,Negative,Neutral) \n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1) 
									{
										//--MODIFY-BY-TEXT--
										System.out.println("Indicate the text \n");
										String texto=scanner2.nextLine();
										clearScreen();
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
										
										clearScreen();
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
									}//--MODIFY-BY-TYPE--
									
									break;
								}
								case 4:
								{
									//-------------SEARCH-RECOMENDATIONS-----------------
									clearScreen();
									System.out.println("Select the search method to delete: \n"
											+ "[1] Text \n"
											+ "[2] Type (Positive,Negative,Neutral) \n");
									int selection1 = scanner.nextInt();
									clearScreen();
									int cont=0;
									if (selection1==1) 
									{
										//--DELETE-BY-TEXT--
										System.out.println("Indicate the el texto \n");
										String texto=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Recomendations recomendation:arrayRecomendationsGeneral) 
										{
											if (recomendation.getRecomendations().contains(texto)) 
											{
												System.out.println("Borrada:\n"+recomendation+"\n");
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayRecomendationsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayRecomendationsGeneral[i]=arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1];
													}
													else 
													{
														arrayRecomendationsGeneral[i]=arrayRecomendationsGeneral[i];
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
										System.out.println("Tipo de recomendacion:\n"
												+ "[1] Positiva\n"
												+ "[2] Negativa\n"
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
										
										clearScreen();
										System.out.println("Results: \n");
										for (Recomendations recomendation:arrayRecomendationsGeneral) 
										{
											if (recomendation.getType().equals(x)) {
												System.out.println("Borrada:\n"+recomendation+"\n");
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayRecomendationsGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayRecomendationsGeneral[i]=arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1];
													}
													else 
													{
														arrayRecomendationsGeneral[i]=arrayRecomendationsGeneral[i];
													}
												}
												
												arrayRecomendationsGeneral=Arrays.copyOf(arrayRecomendationsGeneral, arrayRecomendationsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayRecomendationsGeneral));
										cont=0;
									}
									//--DELETE-BY-TYPE--
									
									break;
									
									//-------------SEARCH-RECOMENDATIONS-----------------
								}
									
							}
							break;
						}
						//----------RECOMENDATIONS-OPTIONS--------------
						
						
						case 4:
						{
							//----------CATEGORIES-OPTIONS--------------
							clearScreen();
							IMenuCategories.categoriesMenu();
						 {
							int selection2 = scanner.nextInt();
							switch(selection2) 
							{
								case 1:
								{
									CategorieTypes x= CategorieTypes.OTHER;
									Categorie last =new Categorie(x,categorieIdCont++);
									System.out.println("Write the name of the categorie");
									String nameCategorie=scanner2.nextLine();
									last.setName(nameCategorie);
									clearScreen();
									System.out.println("Write the type of categorie");
									String tipoCategorie=scanner2.nextLine();
									clearScreen();
									last.setType(x);
									System.out.println("Write a basic description");
									String description=scanner2.nextLine();
									clearScreen();
									last.setDescription(description);
									System.out.println("Introduce minimum age");
									int minAge = scanner.nextInt();
									clearScreen();
									last.setMinAge(minAge);
									
									
									
									arrayCategoriesGeneral=Arrays.copyOf(arrayCategoriesGeneral, arrayCategoriesGeneral.length+1);
									arrayCategoriesGeneral[arrayCategoriesGeneral.length-1]=last;
									System.out.println(arrayCategoriesGeneral[arrayCategoriesGeneral.length-1]);
									break;
								}
								case 2:
								{
									clearScreen();
									System.out.println("Select the search method: \n"
											+ "[1] Name \n"
											+ "[2] Type \n"
											+ "[3] Minimum age \n");
									int selection3 = scanner.nextInt();
									clearScreen();
									if (selection3==1) 
									{
										System.out.println("Indicate the name \n");
										String name=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getName().equals(name)) 
											{
												System.out.println(categorie);
											}
										}
									}
									else if (selection3==2) 
									{
										System.out.println("Indicate the type \n");
										String TypeCategorie=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getName().equals(TypeCategorie)) 
											{
												System.out.println(TypeCategorie);
											}
										}
									}
									else if (selection3==3) 
									{
										System.out.println("Indicate the minimum age \n");
										int MinAge=scanner.nextInt();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getMinAge()==(MinAge)) 
											{
												System.out.println(categorie);
											}
										}
									}
									break;
								}
								case 3:
								{
									clearScreen();
									System.out.println("Selecciona metodo de busqueda para modificar la category: \n"
											+ "[1] Nombre \n"
											+ "[2] edad minima \n"
											+ "[3] descripcion \n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1)
									{
										System.out.println("Indicate the name \n");
										String name=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getName().equals(name)) 
											{
												System.out.println("Encontrado: ");
												System.out.println(categorie);
												System.out.println("Selecciona que dato deseas cambiar de la category: \n"
														+ "[1] Nombre \n"
														+ "[2] edad minima \n"
														+ "[3] Descripcion\n");
												int selection4 = scanner.nextInt();
												clearScreen();
												if (selection4==1) 
												{
													System.out.println("Write name ");
													String name1=scanner2.nextLine();
													clearScreen();
													categorie.setName(name1);
												
												}
												else if (selection4==2) 
												{
													System.out.println("Write minimum age: ");
													int year=scanner.nextInt();
													clearScreen();
													categorie.setMinAge(year);
												}
												else
												{
													System.out.println("Write description: ");
													String desc=scanner2.nextLine();
													clearScreen();
													categorie.setDescription(desc);
												}
											}
										}
									}
									else if (selection1==2) 
									{
										System.out.println("Indicate the minimum age \n");
										int AgeMin=scanner.nextInt();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral)
										{
											if (categorie.getName().equals(AgeMin)) 
											{
												System.out.println("Found: ");
												System.out.println(categorie);
												System.out.println("Select the data you whant to change: \n"
														+ "[1] Name \n"
														+ "[2] Minimum age \n"
														+ "[3] Description\n");
												int selection4 = scanner.nextInt();
												clearScreen();
												if (selection4==1) 
												{
													System.out.println("Write the name ");
													String name1=scanner2.nextLine();
													clearScreen();
													categorie.setName(name1);
												}
												else if (selection4==2) 
												{
													System.out.println("Change the type ");
													clearScreen();
													CategorieTypes x= CategorieTypes.OTHER;
													Categorie last =new Categorie(x,categorieIdCont++);
													categorie.setType(x);
												}
												else if (selection4==3) 
												{
													System.out.println("Write the minimum age: ");
													int year=scanner.nextInt();
													clearScreen();
													categorie.setMinAge(year);
												}
												else
												{
													System.out.println("Write the descripcion: ");
													String desc=scanner2.nextLine();
													clearScreen();
													categorie.setDescription(desc);
												}
												
											}
										}
									}
									else if (selection1==3)
									{
										System.out.println("Indicate the description \n");
										String desc=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral)
										{
											if (categorie.getName().equals(desc)) 
											{
												System.out.println("Found: ");
												System.out.println(categorie);
												System.out.println("Select what data you whant to modify: \n"
														+ "[1] Name \n"
														+ "[2] Minimum Age \n"
														+ "[3] Description\n");
												int selection4 = scanner.nextInt();
												clearScreen();
												if (selection4==1) 
												{
													System.out.println("Write the name: ");
													String name1=scanner2.nextLine();
													clearScreen();
													categorie.setName(name1);
												}
												else if (selection4==2) 
												{
													System.out.println("Write minimum age: ");
													int year=scanner.nextInt();
													clearScreen();
													categorie.setMinAge(year);
												}
												else 
												{
													System.out.println("Write description: ");
													String descrip=scanner2.nextLine();
													clearScreen();
													categorie.setDescription(descrip);
												}
												
											}
										}
									}
									break;
								}
								case 4:
								{
									int cont=0;
									System.out.println("Select the search method to delete: \n"
											+ "[1] Name \n"
											+ "[2] Minimum age \n"
											+ "[3] Description\n");
									int selection1 = scanner.nextInt();
									clearScreen();
									if (selection1==1) 
									{
										System.out.println("Indicate the name \n");
										String name=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getName().equals(name)) 
											{
												System.out.println(categorie);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayCategoriesGeneral.length;i++)
												{
													if(cont==i) 
													{
														arrayCategoriesGeneral[i]=arrayCategoriesGeneral[arrayCategoriesGeneral.length-1];
													}
													else 
													{
														arrayCategoriesGeneral[i]=arrayCategoriesGeneral[i];
													}
												}
												
												arrayCategoriesGeneral=Arrays.copyOf(arrayCategoriesGeneral, arrayCategoriesGeneral.length-1);
											}
											cont+=1;
										}
										
										cont=0;
									}
									else if (selection1==2) 
									{
										System.out.println("Indicate the minimum age \n");
										int minAge=scanner.nextInt();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getMinAge()==minAge) 
											{
												System.out.println(categorie);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayCategoriesGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayCategoriesGeneral[i]=arrayCategoriesGeneral[arrayCategoriesGeneral.length-1];
													}
													else 
													{
													arrayCategoriesGeneral[i]=arrayCategoriesGeneral[i];
													}
												}
												
												arrayCategoriesGeneral=Arrays.copyOf(arrayCategoriesGeneral, arrayCategoriesGeneral.length-1);
											}
											cont+=1;
										}
									
										cont=0;
									}
									else if (selection1==3) 
									{
										System.out.println("Indicate the description \n");
										String year=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getName().equals(year)) 
											{
												System.out.println(categorie);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayCategoriesGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayCategoriesGeneral[i]=arrayCategoriesGeneral[arrayCategoriesGeneral.length-1];
													}
													else 
													{
													arrayCategoriesGeneral[i]=arrayCategoriesGeneral[i];
													}
												}
												
												arrayCategoriesGeneral=Arrays.copyOf(arrayCategoriesGeneral, arrayCategoriesGeneral.length-1);
											}
											cont+=1;
										}
										
										cont=0;
									}
								}
									
							}
			
						
							
							break;
						}
						 //----------CATEGORIES-OPTIONS--------------
					}
						
						case 5:
						{
							//----------MOVIES-SERIES-OPTIONS--------------
							clearScreen();
							IGeneralsMenu.selectMovieSerie();
							int selected = scanner.nextInt();
							if(selected==1) 
							{
								//---SERIES SELECTED OPTIONS---
								clearScreen();
								IMenuSeries.seriesMenu();
								//----------SERIE OPTIONS--------------
								clearScreen();
								IMenuSeries.seriesMenu();
								
								int selection = scanner.nextInt();
								switch(selection) 
								{
									case 1:
									{
										//--------SERIE--REGISTER------
										
										System.out.println("Tell me the Title of the Series"); 
										String title="Undefined";
										title=scanner2.nextLine();
										clearScreen();
										
										int directorIdInsert = 0;
										int directorCountResult=0;
										Directors[] arrayOfDirectors= new Directors[0];
										while(directorIdInsert>=0) 
										{
											System.out.println("Tell me the Id of the Directors (-1 to finish): ");
											directorIdInsert=scanner.nextInt();
											clearScreen();
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
										
										clearScreen();
										int categoryIdInsert = 0;
										int categoryCountResult = 0;
										Categorie[] arrayOfCategories= new Categorie[0];
										while(categoryIdInsert>=0) 
										{
											System.out.println("Write the Id of the Categorie (-1 to cancel): ");
											categoryIdInsert=scanner.nextInt();
											clearScreen();
											
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
										
										int actorIdInsert = 0;
										int actorCountResult = 0;
										Actors[] arrayOfActors= new Actors[0];
										while(actorIdInsert>=0) 
										{
											System.out.println("Tell me the Id of the Actors (-1 to finish): ");
											actorIdInsert=scanner.nextInt();
											clearScreen();
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
										
										System.out.println("Write the Original language: ");
										String originalLenguage=scanner2.nextLine();
										clearScreen();
										
										int adaptedLang=1;
										int adaptedLangCont=0;
										AdaptedLanguages[] adaptedLanguagesArray= new AdaptedLanguages[0];
										
										while(adaptedLang>=1&adaptedLang<=7) 
										{
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
										
										clearScreen();
										System.out.println("Select the Subtitles: ");
										
										int subTitle=2;
										int subtitlesCont=0;
										Subtitles[] subTitlesArray= new Subtitles[0];
										while(subTitle>=1&subTitle<=7) 
										{
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
										clearScreen();
										System.out.println("Select a total duration (in minutes): ");
										double minutosTiempoDuracion=0;
										minutosTiempoDuracion=scanner.nextDouble();

										clearScreen();
										System.out.println("Select a creation year: ");
										int anyoCreacion=9999;
										anyoCreacion=scanner.nextInt();
										
										clearScreen();
										System.out.println("Select a number of chapters: ");
										int numeroCapitulos=0;
										numeroCapitulos=scanner.nextInt();
										
										clearScreen();
										System.out.println("Select a number of seasons: ");
										int numeroTemporadas=0;
										numeroTemporadas=scanner.nextInt();
										clearScreen();

										arraySeriesGeneral=Arrays.copyOf(arraySeriesGeneral, arraySeriesGeneral.length+1);
										arraySeriesGeneral[arraySeriesGeneral.length-1]=new Series(arrayOfActors,arrayOfDirectors,arrayOfCategories,title,originalLenguage,adaptedLanguagesArray,subTitlesArray,minutosTiempoDuracion,anyoCreacion,numeroCapitulos,numeroTemporadas,serieIdCont++);
										System.out.println(arraySeriesGeneral[arraySeriesGeneral.length-1]);
										
										break;
										//--------SERIE--REGISTER------
									}
									case 2:
									{
										//--------SERIE--SEARCH------
										clearScreen();
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
										clearScreen();
										if (selection1==1) 
										{
											//---------Search By Actor (ID)------------
											int seriesContResults=0;
											System.out.println("Indicate the Id of the actor \n");
											int actorId=scanner.nextInt();
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
											//---------Search By Category (ID)------------
											//---HAY QUE ANYADIR QUE BUSQUE POR LAS categoryS POR DEFECTO TAMBIEN---
											int seriesContResults=0;
											System.out.println("Indicate the Id de la category \n");
											int categoryId=scanner.nextInt();
											clearScreen();
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
										else if (selection1==7) 
										{
											//---------Search By Duration------------
											int seriesContResults=0;
											System.out.println("Indicate the total duration: \n");
											double durationTotalTime=scanner.nextInt();
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
										break;
									}
									case 3:
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
														clearScreen();
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
														clearScreen();
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
													clearScreen();
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
													clearScreen();
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
													clearScreen();
													boolean cancelled=false;
													int categoryIdInsert = 0;
													int categoryCountResult = 0;
													Categorie[] arrayOfCategories= new Categorie[0];
													while(categoryIdInsert>=0) 
													{
														System.out.println("Write the Id of the Categorie (-1 to cancel): ");
														categoryIdInsert=scanner.nextInt();
														clearScreen();
														
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
													clearScreen();
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
													clearScreen();
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
													clearScreen();
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
													clearScreen();
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
													clearScreen();
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
										break;
									}
									case 4:
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
										break;
									}
									//----------SERIE OPTIONS--------------
								}	
							}
							//---------------------END OF IF SERIES SELECTED---------------------------
							else 
							{
								//---MOVIES SELECTED OPTIONS---
								clearScreen();
								IMenuMovies.moviesMenu();
								//----------MOVIE OPTIONS--------------
								
								int selection = scanner.nextInt();
								switch(selection) 
								{
									case 1:
									{//--------movie--REGISTER------
										
										System.out.println("Write the title of the movie"); 
										String title="Undefined";
										title=scanner2.nextLine();
										clearScreen();
										
										int directorIdInsert = 0;
										int directorCountResult=0;
										Directors[] arrayOfDirectors= new Directors[0];
										while(directorIdInsert>=0) 
										{
											System.out.println("Write the id of the Director/s (-1 to finish): ");
											directorIdInsert=scanner.nextInt();
											clearScreen();
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
										
										clearScreen();
										int categoryIdInsert = 0;
										int categoryCountResult = 0;
										Categorie[] arrayOfCategories= new Categorie[0];
										while(categoryIdInsert>=0) 
										{
											System.out.println("Write the Id of the Categorie (-1 to cancel): ");
											categoryIdInsert=scanner.nextInt();
											clearScreen();
											
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
										
										int actorIdInsert = 0;
										int actorCountResult = 0;
										Actors[] arrayOfActors= new Actors[0];
										while(actorIdInsert>=0) 
										{
											System.out.println("Write the id of the actors (-1 to finish): ");
											actorIdInsert=scanner.nextInt();
											clearScreen();
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
										
										System.out.println("Write the Original lenguage: ");
										String originalLenguage=scanner2.nextLine();
										clearScreen();
										
										int adaptedLang=1;
										int adaptedLangCont=0;
										AdaptedLanguages[] adaptedLanguagesArray= new AdaptedLanguages[0];
										
										while(adaptedLang>=1&adaptedLang<=7) 
										{
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
										
										clearScreen();
										System.out.println("Select the Subtitles: ");
										
										int subTitle=2;
										int subtitlesCont=0;
										Subtitles[] subTitlesArray= new Subtitles[0];
										while(subTitle>=1&subTitle<=7) 
										{
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
										clearScreen();
										System.out.println("Select the total duration (Time in minutes): ");
										double minutosTiempoDuracion=0;
										minutosTiempoDuracion=scanner.nextDouble();

										clearScreen();
										System.out.println("Select the year of creation: ");
										int anyoCreacion=9999;
										anyoCreacion=scanner.nextInt();
										

										arrayMoviesGeneral=Arrays.copyOf(arrayMoviesGeneral, arrayMoviesGeneral.length+1);
										arrayMoviesGeneral[arrayMoviesGeneral.length-1]=new Movies(arrayOfActors,arrayOfDirectors,arrayOfCategories,title,originalLenguage,adaptedLanguagesArray,subTitlesArray,minutosTiempoDuracion,anyoCreacion,movieIdCont++);
										System.out.println(arrayMoviesGeneral[arrayMoviesGeneral.length-1]);
										
										break;
										//--------movie--REGISTER------
									}
									case 2:
									{
										//--------movie--SEARCH------
										clearScreen();
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
										clearScreen();
										if (selection1==1) 
										{
											//---------Search By Actor (ID)------------
											int moviesContResults=0;
											System.out.println("Indicate the Id of the actor \n");
											int actorId=scanner.nextInt();
											clearScreen();
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
											clearScreen();
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
											//---------Search By Title (ID)------------
											int moviesContResults=0;
											System.out.println("Indicate the Title or part of it: \n");
											String titleSearch=scanner2.nextLine();
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
											//---------Search By Category (ID)-----------
											
											int moviesContResults=0;
											System.out.println("Indicate the Id of the categorie \n");
											int categoryId=scanner.nextInt();
											clearScreen();
											System.out.println("Results: \n");
											for (Movies movie:arrayMoviesGeneral) 
											{
												for(Categorie category : movie.getCateg()) {
													if(category.getCategorieID()==categoryId) {
														moviesContResults++;
														System.out.println(movie);
													}
													
												}
											}
											System.out.println("Were found: "+moviesContResults+" Movies.");
										}
										else if (selection1==7) 
										{
											//---------Search By Duration------------
											int moviesContResults=0;
											System.out.println("Indicate the total duration: \n");
											double durationTotalTime=scanner.nextInt();
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
											clearScreen();
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
										break;
									}
									case 3:
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
														+ "[10] Number of Chapters\n"
														+ "[11] Number of Seasons\n"
														+ "[12] Id of the movie (Not recomended)\n");
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
														clearScreen();
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
														clearScreen();
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
													clearScreen();
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
													clearScreen();
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
													clearScreen();
													boolean cancelled=false;
													int categoryIdInsert = 0;
													int categoryCountResult = 0;
													Categorie[] arrayOfCategories= new Categorie[0];
													while(categoryIdInsert>=0) 
													{
														System.out.println("Write the Id of the Categorie (-1 to cancel): ");
														categoryIdInsert=scanner.nextInt();
														clearScreen();
														
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
													clearScreen();
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
													clearScreen();
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
													clearScreen();
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
												}
												else if(selectedOption==11) 
												{

												}
												else if(selectedOption==12) 
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
														movie.setMovieId(newMovieId);;
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
										break;
									}
									case 4:
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
										break;
									}
									//----------movie OPTIONS--------------
								}	
							}
							//-----------END OF MOVIES ELSE SELECTED-------------------------

						}
							break;
						//----------MOVIES-SERIES-OPTIONS-END--------------
						case 6:
						{
							//----------SUBTITLES-OPTIONS--------------
							clearScreen();
							IMenuSubtitles.subtitlesMenu();
							int selected = scanner.nextInt();
							if(selected==1) 
							{
								//---SERIES SELECTED---
								clearScreen();
								IMenuSeries.seriesMenu();
								
								
							}
							else 
							{
								//---MOVIES SELECTED---
								clearScreen();
								IMenuMovies.moviesMenu();
								
								
							}
							break;
						}
						//----------SUBTITLES-OPTIONS--------------
						
						
						default:
						{
							System.out.println("Opcion desconocida");
							break;
						}
					}
					break;
				}
				case 2:
				{
					
					//---------INFORMATIONS AND STADISTICS MENU-------
					IMenuStadistics.stadisticsMenu();
					int stadisticsSelection = scanner.nextInt();
					
				
						if (stadisticsSelection==1) 
						{
							//--SERIE---STADISTICS---------------
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
								int totalSeriesCont=0;
								for(Series serie : arraySeriesGeneral) 
								{
									totalSeriesCont++;
								}
								System.out.println("Total Series in the System : "+totalSeriesCont);
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
								boolean exist=false;
								for(int categoryIdx: arrayOfCategoriesId) 
								{
									exist=false;
									for (Series serie:arraySeriesGeneral) 
									{
										
										for(Categorie category : serie.getCateg()) {
											if(category.getCategorieID()==categoryIdx) {
												seriesContResults++;
												exist=true;
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
								boolean exist=false;
								for(int actorIdx: arrayOfActorsId) 
								{
									exist=false;
									for (Series serie:arraySeriesGeneral) 
									{
										
										for(Actors actor : serie.getActors()) 
										{
											if(actor.getActorId()==actorIdx) 
											{
												seriesContResults++;
												exist=true;
												System.out.println(serie);
											}
											
										}
									}
									System.out.println("-------Were found: "+seriesContResults+" Series with actor id:"+actorIdx+"-------\n");	
									seriesContResults=0;//Reset for next Id
								}
								
							}
							else if(selectedOption==4) 
							{//--------MOST-POPULARS TOP - POSITIVE RECOMENDATIONS----------
								System.out.println("Top Most popular Series:\n");
								
								int[] arrayOfPositiveRecomendations=new int[0];
								int positiveRecomendationsCont=0;
								
								//---------GETTING THE CUANTITIE OF POSITIVE RECOMENDATIONS--------------
								for(Series serie:arraySeriesGeneral) 
								{
									for(Recomendations recomendation:serie.getRecomendationsSerie()) 
									{
										if(recomendation.getType().equals(RecomendationsType.POSITIVE)) 
										{
											positiveRecomendationsCont++;
										}
										
									}
									arrayOfPositiveRecomendations=Arrays.copyOf(arrayOfPositiveRecomendations, arrayOfPositiveRecomendations.length+1);
									arrayOfPositiveRecomendations[arrayOfPositiveRecomendations.length-1]=positiveRecomendationsCont;
									positiveRecomendationsCont=0;
								}
								
								//----VIEW THE SERIES (THE TOP IS TE MOST POPULAR BY POSITIVE RECOMENDATIONS)------
								//Sort the array.
								Arrays.sort(arrayOfPositiveRecomendations);
								
								//Start on the final of the array , becuase it is sorted.
								//Every puntuation of the array search the same puntuation on the posible series.
								int[] lastIds= {-1};
								
								boolean exists=false;
								
								for (int i =arrayOfPositiveRecomendations.length-1;i>=0;i--) 
								{
									int cuantitie=arrayOfPositiveRecomendations[i];
									for(Series serie:arraySeriesGeneral) 
									{
										for(Recomendations recomendation:serie.getRecomendationsSerie()) 
										{
											if(recomendation.getType().equals(RecomendationsType.POSITIVE)) 
											{
												positiveRecomendationsCont++;
											}
										}
										for(int id : lastIds) 
										{
											if(id==serie.getSerieId()) 
											{
												exists=true;
											}
										}
										if(!exists & positiveRecomendationsCont==cuantitie)//Is equals to the cuantitie?
										{
											lastIds=Arrays.copyOf(lastIds, lastIds.length+1);
											lastIds[lastIds.length-1]=serie.getSerieId();
											
											System.out.println(serie.getTitle()+" POSITIVES-> "+cuantitie);//Print the serie
										}
										positiveRecomendationsCont=0;//Reset cont
										
									}	
								}
								
								
							}
							else if(selectedOption==5) 
							{//--------MOST-UN-POPULARS TOP - NEGATIVE RECOMENDATIONS----------
								System.out.println("Top Most popular Series:\n");
								
								int[] arrayOfNegativeRecomendations=new int[0];
								int negativeRecomendationsCont=0;
								
								//---------GETTING THE CUANTITIE OF NEGATIVE RECOMENDATIONS--------------
								for(Series serie:arraySeriesGeneral) 
								{
									for(Recomendations recomendation:serie.getRecomendationsSerie()) 
									{
										if(recomendation.getType().equals(RecomendationsType.NEGATIVE)) 
										{
											negativeRecomendationsCont++;
										}
										
									}
									arrayOfNegativeRecomendations=Arrays.copyOf(arrayOfNegativeRecomendations, arrayOfNegativeRecomendations.length+1);
									arrayOfNegativeRecomendations[arrayOfNegativeRecomendations.length-1]=negativeRecomendationsCont;
									negativeRecomendationsCont=0;
								}
								
								//----VIEW THE SERIES (THE TOP IS TE MOST UN-POPULAR BY NEGATIVE RECOMENDATIONS)------
								//Sort the array.
								Arrays.sort(arrayOfNegativeRecomendations);
								
								//Start on the final of the array , becuase it is sorted.
								//Every puntuation of the array search the same puntuation on the posible series.
								int[] lastIds= {-1};
								
								boolean exists=false;
								
								for (int i =arrayOfNegativeRecomendations.length-1;i>=0;i--) 
								{
									int cuantitie=arrayOfNegativeRecomendations[i];
									for(Series serie:arraySeriesGeneral) 
									{
										for(Recomendations recomendation:serie.getRecomendationsSerie()) 
										{
											if(recomendation.getType().equals(RecomendationsType.NEGATIVE)) 
											{
												negativeRecomendationsCont++;
											}
										}
										for(int id : lastIds) 
										{
											if(id==serie.getSerieId()) 
											{
												exists=true;
											}
										}
										if(!exists & negativeRecomendationsCont==cuantitie)//Is equals to the cuantitie?
										{
											lastIds=Arrays.copyOf(lastIds, lastIds.length+1);
											lastIds[lastIds.length-1]=serie.getSerieId();
											
											System.out.println(serie.getTitle()+" NEGATIVES-> "+cuantitie);//Print the serie
										}
										negativeRecomendationsCont=0;//Reset cont
										
									}	
								}
								
								
							}
						}
						else if(stadisticsSelection==2)
						{
							//--MOVIE---STADISTICS---------------
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
								int totalMoviesCont=0;
								for(Movies movie : arrayMoviesGeneral) 
								{
									totalMoviesCont++;
								}
								clearScreen();
								System.out.println("Total Movies in the System : "+totalMoviesCont);
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
								boolean exist=false;
								for(int categoryIdx: arrayOfCategoriesId) 
								{
									exist=false;
									for (Movies movie:arrayMoviesGeneral) 
									{
										
										for(Categorie category : movie.getCateg()) 
										{
											if(category.getCategorieID()==categoryIdx)
											{
												moviesContResults++;
												exist=true;
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
								boolean exist=false;
								for(int actorIdx: arrayOfActorsId) 
								{
									exist=false;
									for (Movies movie:arrayMoviesGeneral) 
									{
										
										for(Actors actor : movie.getActors()) 
										{
											if(actor.getActorId()==actorIdx) 
											{
												moviesContResults++;
												exist=true;
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
								System.out.println("Top Most popular Movies:\n");
								
								int[] arrayOfPositiveRecomendations=new int[0];
								int positiveRecomendationsCont=0;
								
								//---------GETTING THE CUANTITIE OF POSITIVE RECOMENDATIONS--------------
								for(Movies movie:arrayMoviesGeneral) 
								{
									for(Recomendations recomendation:movie.getRecomendationsMovies()) 
									{
										if(recomendation.getType().equals(RecomendationsType.POSITIVE)) 
										{
											positiveRecomendationsCont++;
										}
										
									}
									arrayOfPositiveRecomendations=Arrays.copyOf(arrayOfPositiveRecomendations, arrayOfPositiveRecomendations.length+1);
									arrayOfPositiveRecomendations[arrayOfPositiveRecomendations.length-1]=positiveRecomendationsCont;
									positiveRecomendationsCont=0;
								}
								
								//----VIEW THE SERIES (THE TOP IS TE MOST POPULAR BY POSITIVE RECOMENDATIONS)------
								//Sort the array.
								Arrays.sort(arrayOfPositiveRecomendations);
								
								//Start on the final of the array , becuase it is sorted.
								//Every puntuation of the array search the same puntuation on the posible series.
								int[] lastIds= {-1};
								
								boolean exists=false;
								
								for (int i =arrayOfPositiveRecomendations.length-1;i>=0;i--) 
								{
									int cuantitie=arrayOfPositiveRecomendations[i];
									for(Movies movie:arrayMoviesGeneral) 
									{
										for(Recomendations recomendation:movie.getRecomendationsMovies()) 
										{
											if(recomendation.getType().equals(RecomendationsType.POSITIVE)) 
											{
												positiveRecomendationsCont++;
											}
										}
										for(int id : lastIds) 
										{
											if(id==movie.getMovieId()) 
											{
												exists=true;
											}
										}
										if(!exists & positiveRecomendationsCont==cuantitie)//Is equals to the cuantitie?
										{
											lastIds=Arrays.copyOf(lastIds, lastIds.length+1);
											lastIds[lastIds.length-1]=movie.getMovieId();
											
											System.out.println(movie.getTitle()+" POSITIVES-> "+cuantitie);//Print the serie
										}
										positiveRecomendationsCont=0;//Reset cont
										
									}	
								}
								
								
							}
							else if(selectedOption==5) 
							{
								//--------MOST-UN-POPULARS TOP - NEGATIVE RECOMENDATIONS----------
								System.out.println("Top Most Unpopular Series:\n");
								
								int[] arrayOfNegativeRecomendations=new int[0];
								int negativeRecomendationsCont=0;
								
								//---------GETTING THE CUANTITIE OF NEGATIVE RECOMENDATIONS--------------
								for(Movies movie:arrayMoviesGeneral) 
								{
									for(Recomendations recomendation:movie.getRecomendationsMovies()) 
									{
										if(recomendation.getType().equals(RecomendationsType.NEGATIVE)) 
										{
								
											
											negativeRecomendationsCont++;
										}
										
									}
									arrayOfNegativeRecomendations=Arrays.copyOf(arrayOfNegativeRecomendations, arrayOfNegativeRecomendations.length+1);
									arrayOfNegativeRecomendations[arrayOfNegativeRecomendations.length-1]=negativeRecomendationsCont;
									negativeRecomendationsCont=0;
								}
								
								//----VIEW THE SERIES (THE TOP IS TE MOST UN-POPULAR BY NEGATIVE RECOMENDATIONS)------
								//Sort the array.
								Arrays.sort(arrayOfNegativeRecomendations);
								
								//Start on the final of the array , becuase it is sorted.
								//Every puntuation of the array search the same puntuation on the posible series.
								int[] lastIds= {-1};
								
								boolean exists=false;
								
								for (int i =arrayOfNegativeRecomendations.length-1;i>=0;i--) 
								{
									int cuantitie=arrayOfNegativeRecomendations[i];
									for(Movies movie:arrayMoviesGeneral) 
									{
										for(Recomendations recomendation:movie.getRecomendationsMovies()) 
										{
											if(recomendation.getType().equals(RecomendationsType.NEGATIVE)) 
											{
												negativeRecomendationsCont++;
											}
										}
										for(int id : lastIds) 
										{
											if(id==movie.getMovieId()) 
											{
												exists=true;
											}
										}
										if(!exists & negativeRecomendationsCont==cuantitie)//Is equals to the cuantitie?
										{
											lastIds=Arrays.copyOf(lastIds, lastIds.length+1);
											lastIds[lastIds.length-1]=movie.getMovieId();
											
											System.out.println(movie.getTitle()+" NEGATIVES-> "+cuantitie);//Print the serie
										}
										negativeRecomendationsCont=0;//Reset cont
										
									}	
								}
							}
							
						}
						else if(stadisticsSelection==3)
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
								int totalMoviesCont=0;
								int totalSeriesCont=0;
								clearScreen();
								for(Series serie : arraySeriesGeneral) 
								{
									totalSeriesCont++;
								}
								System.out.println("Total Series in the System : "+totalSeriesCont);
								for(Movies movie : arrayMoviesGeneral) 
								{
									totalMoviesCont++;
								}
								System.out.println("Total Movies in the System : "+totalMoviesCont);
								System.out.println("Sub-Total : "+(totalSeriesCont+totalMoviesCont)+"");
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
								boolean exist=false;
								for(int categoryIdx: arrayOfCategoriesId) 
								{
									exist=false;
									for (Series serie:arraySeriesGeneral) 
									{
										
										for(Categorie category : serie.getCateg()) 
										{
											if(category.getCategorieID()==categoryIdx) 
											{
												seriesContResults++;
												exist=true;
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
									exist=false;
									for (Movies movie:arrayMoviesGeneral) 
									{
										
										for(Categorie category : movie.getCateg()) 
										{
											if(category.getCategorieID()==categoryIdx) 
											{
												moviesContResults++;
												exist=true;
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
								boolean exist=false;
								for(int actorIdx: arrayOfActorsId) 
								{
									exist=false;
									for (Series serie:arraySeriesGeneral) 
									{
										
										for(Actors actor : serie.getActors()) 
										{
											if(actor.getActorId()==actorIdx) 
											{
												seriesContResults++;
												exist=true;
												System.out.println(serie);
											}
											
										}
									}
									System.out.println("-------Were found: "+seriesContResults+" Movies with actor id: "+actorIdx+"-------\n");	
									seriesContResults=0;//Reset for next Id
								}
								int moviesContResults=0;
								System.out.println("Results : \n");
								exist=false;
								for(int actorIdx: arrayOfActorsId) 
								{
									exist=false;
									for (Movies movie:arrayMoviesGeneral) 
									{
										
										for(Actors actor : movie.getActors()) {
											if(actor.getActorId()==actorIdx) {
												moviesContResults++;
												exist=true;
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
								//--------MOST-POPULARS MOVIES AND SERIES TOP - POSITIVE RECOMENDATIONS----------
								System.out.println("Top Most popular Movies and Series:\n");
								
								int[] arrayOfPositiveRecomendations=new int[0];
								int positiveRecomendationsCont=0;
								
								//---------GETTING THE CUANTITIE OF POSITIVE RECOMENDATIONS--------------
								for(Movies movie:arrayMoviesGeneral) 
								{
									for(Recomendations recomendation:movie.getRecomendationsMovies()) 
									{
										if(recomendation.getType().equals(RecomendationsType.POSITIVE)) 
										{
											positiveRecomendationsCont++;
										}
										
									}
									arrayOfPositiveRecomendations=Arrays.copyOf(arrayOfPositiveRecomendations, arrayOfPositiveRecomendations.length+1);
									arrayOfPositiveRecomendations[arrayOfPositiveRecomendations.length-1]=positiveRecomendationsCont;
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
									arrayOfPositiveRecomendations=Arrays.copyOf(arrayOfPositiveRecomendations, arrayOfPositiveRecomendations.length+1);
									arrayOfPositiveRecomendations[arrayOfPositiveRecomendations.length-1]=positiveRecomendationsCont;
									positiveRecomendationsCont=0;
								}
								
								//----VIEW THE MOVIES (THE TOP IS TE MOST POPULAR BY POSITIVE RECOMENDATIONS)------
								//Sort the array.
								Arrays.sort(arrayOfPositiveRecomendations);
								
								//Start on the final of the array , becuase it is sorted.
								//Every puntuation of the array search the same puntuation on the posible series.
								System.out.println("Movies: ");
								int[] lastIds= {-1};
								
								boolean exists=false;
								
								for (int i =arrayOfPositiveRecomendations.length-1;i>=0;i--) 
								{
									int cuantitie=arrayOfPositiveRecomendations[i];
									for(Movies movie:arrayMoviesGeneral) 
									{
										for(Recomendations recomendation:movie.getRecomendationsMovies()) 
										{
											if(recomendation.getType().equals(RecomendationsType.POSITIVE)) 
											{
												positiveRecomendationsCont++;
											}
										}
										for(int id : lastIds) 
										{
											if(id==movie.getMovieId()) 
											{
												exists=true;
											}
										}
										if(!exists & positiveRecomendationsCont==cuantitie)//Is equals to the cuantitie?
										{
											lastIds=Arrays.copyOf(lastIds, lastIds.length+1);
											lastIds[lastIds.length-1]=movie.getMovieId();
											
											System.out.println(movie.getTitle()+" POSITIVES-> "+cuantitie);//Print the serie
										}
										positiveRecomendationsCont=0;//Reset cont
										
									}	
								}
								System.out.println("Series: ");
								int[] lastIds2= {-1};
								lastIds=lastIds2;
								
								exists=false;
								
								for (int i =arrayOfPositiveRecomendations.length-1;i>=0;i--) 
								{
									int cuantitie=arrayOfPositiveRecomendations[i];
									for(Series serie:arraySeriesGeneral) 
									{
										for(Recomendations recomendation:serie.getRecomendationsSerie()) 
										{
											if(recomendation.getType().equals(RecomendationsType.POSITIVE)) 
											{
												positiveRecomendationsCont++;
											}
										}
										for(int id : lastIds) 
										{
											if(id==serie.getSerieId()) 
											{
												exists=true;
											}
										}
										if(!exists & positiveRecomendationsCont==cuantitie)//Is equals to the cuantitie?
										{
											lastIds=Arrays.copyOf(lastIds, lastIds.length+1);
											lastIds[lastIds.length-1]=serie.getSerieId();
											
											System.out.println(serie.getTitle()+" POSITIVES-> "+cuantitie);//Print the serie
										}
										positiveRecomendationsCont=0;//Reset cont
										
									}	
								}
								
								
							}
							else if(selectedOption==5) 
							{
								//--------MOST-UN-POPULARS MOVIES AND SERIES TOP - POSITIVE RECOMENDATIONS----------
								System.out.println("Top Most Unpopular Movies and Series:\n");
								
								int[] arrayOfNegativeRecomendations=new int[0];
								int negativeRecomendationsCont=0;
								
								//---------GETTING THE CUANTITIE OF POSITIVE RECOMENDATIONS--------------
								for(Movies movie:arrayMoviesGeneral) 
								{
									for(Recomendations recomendation:movie.getRecomendationsMovies()) 
									{
										if(recomendation.getType().equals(RecomendationsType.NEGATIVE)) 
										{
											negativeRecomendationsCont++;
										}
										
									}
									arrayOfNegativeRecomendations=Arrays.copyOf(arrayOfNegativeRecomendations, arrayOfNegativeRecomendations.length+1);
									arrayOfNegativeRecomendations[arrayOfNegativeRecomendations.length-1]=negativeRecomendationsCont;
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
									arrayOfNegativeRecomendations=Arrays.copyOf(arrayOfNegativeRecomendations, arrayOfNegativeRecomendations.length+1);
									arrayOfNegativeRecomendations[arrayOfNegativeRecomendations.length-1]=negativeRecomendationsCont;
									negativeRecomendationsCont=0;
								}
								
								//----VIEW THE MOVIES (THE TOP IS TE MOST POPULAR BY POSITIVE RECOMENDATIONS)------
								//Sort the array.
								Arrays.sort(arrayOfNegativeRecomendations);
								
								//Start on the final of the array , becuase it is sorted.
								//Every puntuation of the array search the same puntuation on the posible series.
								System.out.println("Movies: ");
								int[] lastIds= {-1};
								
								boolean exists=false;
								
								for (int i =arrayOfNegativeRecomendations.length-1;i>=0;i--) 
								{
									int cuantitie=arrayOfNegativeRecomendations[i];
									for(Movies movie:arrayMoviesGeneral) 
									{
										for(Recomendations recomendation:movie.getRecomendationsMovies()) 
										{
											if(recomendation.getType().equals(RecomendationsType.NEGATIVE)) 
											{
												negativeRecomendationsCont++;
											}
										}
										for(int id : lastIds) 
										{
											if(id==movie.getMovieId()) 
											{
												exists=true;
											}
										}
										if(!exists & negativeRecomendationsCont==cuantitie)//Is equals to the cuantitie?
										{
											lastIds=Arrays.copyOf(lastIds, lastIds.length+1);
											lastIds[lastIds.length-1]=movie.getMovieId();
											
											System.out.println(movie.getTitle()+" NEGATIVES-> "+cuantitie);//Print the serie
										}
										negativeRecomendationsCont=0;//Reset cont
										
									}	
								}
								System.out.println("Series: ");
								int[] lastIds2= {-1};
								lastIds=lastIds2;
								
								exists=false;
								
								for (int i =arrayOfNegativeRecomendations.length-1;i>=0;i--) 
								{
									int cuantitie=arrayOfNegativeRecomendations[i];
									for(Series serie:arraySeriesGeneral) 
									{
										for(Recomendations recomendation:serie.getRecomendationsSerie()) 
										{
											if(recomendation.getType().equals(RecomendationsType.NEGATIVE)) 
											{
												negativeRecomendationsCont++;
											}
										}
										for(int id : lastIds) 
										{
											if(id==serie.getSerieId()) 
											{
												exists=true;
											}
										}
										if(!exists & negativeRecomendationsCont==cuantitie)//Is equals to the cuantitie?
										{
											lastIds=Arrays.copyOf(lastIds, lastIds.length+1);
											lastIds[lastIds.length-1]=serie.getSerieId();
											
											System.out.println(serie.getTitle()+" NEGATIVES-> "+cuantitie);//Print the serie
										}
										negativeRecomendationsCont=0;//Reset cont
										
									}	
								}
								
								
							}
						}
					break;
				}
				case 3:
				{
					//-----------VIEW SERIES OR MOVIES MENU------------
					
					break;
				}
				
				//SELECTION 4 (OR OTHERS)...
				default:
				{
					//----------EXIT SELECTED MENU FOR EXIT----------
					System.out.println("Leaving the program...");
					isRunning=false;//Stop the main loop, boolean false.
					break;
				}
				
			}
			
		}
		scanner.close();
		scanner2.close();
	}

}
