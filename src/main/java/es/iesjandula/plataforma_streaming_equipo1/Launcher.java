package es.iesjandula.plataforma_streaming_equipo1;

import java.util.Arrays;
import java.util.Scanner;
import es.iesjandula.plataforma_streaming_equipo1.IMenus.*;
import es.iesjandula.plataforma_streaming_equipo1.actors.ActorOptions;
import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages.AvaliableAdaptedLanguages;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.SeriesMoviesStadisticsOptions;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.ViewSeriesMoviesOptions;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.Movies;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.MoviesOptions;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.MoviesStadisticsOptions;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.ViewMoviesOptions;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.Series;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.SeriesOptions;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.SeriesStadisticsOptions;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.ViewSeriesOptions;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.categories.CategorieTypes;
import es.iesjandula.plataforma_streaming_equipo1.directors.DirectorOptions;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.RecomendationOptions;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.RecomendationsType;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.AvaliableSubtitles;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.SubtitlesOptions;

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
		Categorie[] arrayCategoriesGeneral = {category1,category2,category3,category4,category5};
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
		Subtitles subtitle7 = new Subtitles(AvaliableSubtitles.OTHER);

		Subtitles[] arraySubtitles1 = {subtitle1,subtitle2};
		Subtitles[] arraySubtitlesGeneral = {subtitle1,subtitle2,subtitle3,subtitle4,subtitle5,subtitle6,subtitle7};
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
								{	
									//---CREATE-DIRECTOR---
									arrayDirectorsGeneral=DirectorOptions.createDirector(scanner, scanner2, arrayDirectorsGeneral, directorIdCont);
									break;
								}
								case 2:
								{	
									//-----SEARCH-DIRECTOR-----
									DirectorOptions.searchDirector(scanner, scanner2, arrayDirectorsGeneral);
									break;
									
								}
								case 3:
								{
									//------MODIFY DIRECTOR---------
									arrayDirectorsGeneral=DirectorOptions.modifyDirectors(scanner, scanner2, arrayDirectorsGeneral);
									break;
									
								}
								case 4:
								{
									//DELETE-DIRECTOR
									arrayDirectorsGeneral=DirectorOptions.deleteDirector(scanner, scanner2, arrayDirectorsGeneral);
									break;
								}
									
							}
							break;
							//----------DIRECTORS OPTIONS--------------
						}
						
						case 2:
						{
							//----------ACTORS-OPTIONS--------------
							clearScreen();
							IMenuActors.actorMenu();
							int selection = scanner.nextInt();
							switch(selection) 
							{
								case 1:
								{	
									//--CREATE-ACTOR---
									arrayActorsGeneral=ActorOptions.createActor(scanner, scanner2, arrayActorsGeneral, actorIdCont);
									break;
								}
								case 2:
								{
									//-----SEARCH-ACTOR-----
									ActorOptions.searchActor(scanner, scanner2, arrayActorsGeneral);
									break;
								}
								case 3:
								{ 
									//-----MODIFY----ACTOR
									arrayActorsGeneral=ActorOptions.modifyActor(scanner, scanner2, arrayActorsGeneral);
									break;
								}
								case 4:
								{
									//----DELETE--ACTOR
									arrayActorsGeneral=ActorOptions.deleteActor(scanner, scanner2, arrayActorsGeneral);
									break;
								}
									
							}
							break;
							
							
						}//----------ACTORS-OPTIONS--------------
						
						case 3:
						{
							//----------RECOMENDATIONS-OPTIONS--------------
							clearScreen();
							IMenuRecommendations.recommendationMenu();
							//String recommendations,RecomendationsType Type
							
							int selection = scanner.nextInt();
							switch(selection) 
							{
								case 1:
								{
									
									//-------------CREATE-RECOMENDATION-----------------
									Object[] objects=RecomendationOptions.createRecomendation(scanner, scanner2, arrayRecomendationsGeneral, arrayMoviesGeneral, arraySeriesGeneral);
									arrayRecomendationsGeneral=(Recomendations[])objects[0];
									arraySeriesGeneral=(Series[])objects[1];
									arrayMoviesGeneral=(Movies[])objects[2];
									break;
								}
								case 2:
								{
									//-------------SEARCH-RECOMENDATIONS-----------------
									RecomendationOptions.searchRecomendation(scanner, scanner2, arrayRecomendationsGeneral, arrayMoviesGeneral, arraySeriesGeneral);
									break;
									
								}
								case 3:
								{
									//-----MODIFY----RECOMENDATIONS------
									arrayRecomendationsGeneral=RecomendationOptions.modifyRecomendation(scanner, scanner2, arrayRecomendationsGeneral);
									break;
								}
								case 4:
								{
									//-------------DELETE-RECOMENDATIONS-----------------
			
									Object[] objects=RecomendationOptions.deleteRecomendation(scanner, scanner2, arrayRecomendationsGeneral, arrayMoviesGeneral, arraySeriesGeneral);
									arrayRecomendationsGeneral=(Recomendations[])objects[0];
									arraySeriesGeneral=(Series[])objects[1];
									arrayMoviesGeneral=(Movies[])objects[2];
									break;
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
									//-----CREATE----CATEGORIE----
									CategorieTypes x= CategorieTypes.OTHER;
									Categorie last =new Categorie(x,categorieIdCont++);
									System.out.println("Write the name of the categorie");
									String nameCategorie=scanner2.nextLine();
									last.setName(nameCategorie);
									clearScreen();
									
									System.out.println("The new categories are considered of type other!\n"
											+ "Remember that the default categories types are:\n"
											+ "COMEDY, ACTION, TERROR, SUSPENSE, CHILDISH or OTHER\n");
									last.setType(CategorieTypes.OTHER);
									System.out.println("Write a basic description for Category "+nameCategorie);
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
										System.out.println("Indicate the type \n"
												+ "[1] ACTION\n"
												+ "[2] COMEDY\n"
												+ "[3] TERROR\n"
												+ "[4] SUSPENSE\n"
												+ "[5] CHILDISH\n"
												+ "[6] OTHER\n");
										int typeCategorie=scanner.nextInt();
										clearScreen();
										System.out.println("Results: \n");
										CategorieTypes typeOfCategory = CategorieTypes.OTHER;
										if(typeCategorie==1) 
										{
											typeOfCategory=CategorieTypes.ACTION;
										}
										else if(typeCategorie==2) 
										{
											typeOfCategory=CategorieTypes.COMEDY;
										}
										else if(typeCategorie==3) 
										{
											typeOfCategory=CategorieTypes.TERROR;
										} 
										else if(typeCategorie==4) 
										{
											typeOfCategory=CategorieTypes.SUSPENSE;
										} 
										else if(typeCategorie==5) 
										{
											typeOfCategory=CategorieTypes.CHILDISH;
										} 
										else if(typeCategorie==6) 
										{
											typeOfCategory=CategorieTypes.OTHER;
										} 
										
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getType().equals(typeOfCategory)) 
											{
												System.out.println(categorie);
											}
										}
									}
									else if (selection3==3) 
									{
										System.out.println("Indicate the minimum age \n");
										int minAge=scanner.nextInt();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getMinAge()==(minAge)) 
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
									System.out.println("Select search method to modify the category: \n"
											+ "[1] Name \n"
											+ "[2] Min age \n"
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
												System.out.println("Results: ");
												System.out.println(categorie);
												System.out.println("Select the data you whant to change: \n"
														+ "[1] Name \n"
														+ "[2] Minimum age \n"
														+ "[3] Description\n");
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
										int ageMin=scanner.nextInt();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral)
										{
											if (categorie.getMinAge()==(ageMin)) 
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
										desc=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral)
										{
											if (categorie.getDescription().equals(desc)) 
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
										String desc=scanner2.nextLine();
										clearScreen();
										System.out.println("Results: \n");
										for (Categorie categorie:arrayCategoriesGeneral) 
										{
											if (categorie.getDescription().equals(desc)) 
											{
												System.out.println(categorie);
												System.out.println("Position: "+cont);
												
												for(int i=0;i<arrayCategoriesGeneral.length;i++) 
												{
													if(cont==i) 
													{
														arrayCategoriesGeneral[i]=arrayCategoriesGeneral[arrayCategoriesGeneral.length-1];
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
										arraySeriesGeneral=SeriesOptions.createSerie(scanner, scanner2, arraySeriesGeneral, arrayDirectorsGeneral, arrayActorsGeneral, arrayCategoriesGeneral, arraySubtitlesGeneral, serieIdCont);
										break;
									}
									case 2:
									{
										//--------SERIE--SEARCH------
										SeriesOptions.searchSerie(scanner, scanner2, arraySeriesGeneral);
										break;
									}
									case 3:
									{	
										//--------MODIFY-----SERIE---------
										arraySeriesGeneral=SeriesOptions.modifySerie(scanner, scanner2, arraySeriesGeneral, arrayDirectorsGeneral, arrayActorsGeneral, arrayCategoriesGeneral, serieIdCont);
										break;
									}
									case 4:
									{
										//---DELETE---SERIE----
										arraySeriesGeneral=SeriesOptions.deleteSerie(scanner2, arraySeriesGeneral);
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
									{
										//--------MOVIE--REGISTER------
										arrayMoviesGeneral=MoviesOptions.createMovie(scanner, scanner2, arrayMoviesGeneral, arrayDirectorsGeneral, arrayActorsGeneral, arrayCategoriesGeneral, arraySubtitlesGeneral, movieIdCont);
										break;
									}
									case 2:
									{
										//--------MOVIE--SEARCH------
										MoviesOptions.searchMovie(scanner, scanner2, arrayMoviesGeneral);
										break;
									}
									case 3:
									{
										//----MODIFY---MOVIE---
										arrayMoviesGeneral=MoviesOptions.modifyMovie(scanner, scanner2, arrayMoviesGeneral, arrayDirectorsGeneral, arrayActorsGeneral, arrayCategoriesGeneral, movieIdCont);
										break;
									}
									case 4:
									{	//---DELETE---MOVIE---
										arrayMoviesGeneral=MoviesOptions.deleteMovie(scanner2, arrayMoviesGeneral);
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
							int selection2 = scanner.nextInt();
							switch(selection2) 
							{
								case 1:
								{
									//--CREATE--SUBTITLE---
									arraySubtitlesGeneral=SubtitlesOptions.createSubtitle(scanner2, arraySubtitlesGeneral);
									break;
								}
								case 2:
								{
									//--SHOW--SUBTITLES---
									SubtitlesOptions.showSubtitles(arraySubtitlesGeneral);
									break;
								}
								case 3:
								{
									//---MODIFY--SUBTITLE---
									arraySubtitlesGeneral=SubtitlesOptions.modifySubtitle(scanner2, arraySubtitlesGeneral);
									break;
								}
								case 4:
								{
									//---DELETE---SUBTITLE---
									arraySubtitlesGeneral=SubtitlesOptions.deleteSubtitle(scanner2, arraySubtitlesGeneral);
									break;
								}
									
							}
		
							break;
						}
						 
						//----------SUBTITLES-OPTIONS--------------
						
						
						default:
						{
							System.out.println("Unknow Option");
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
							SeriesStadisticsOptions.serieStadistics(scanner, scanner2, arraySeriesGeneral);
						}
						else if(stadisticsSelection==2)
						{
							//--MOVIE---STADISTICS---------------
							MoviesStadisticsOptions.movieStadistics(scanner, scanner2, arrayMoviesGeneral);
							
						}
						else if(stadisticsSelection==3)
						{
							//---SERIRES--AND--MOVIES--STATISTICS--
							SeriesMoviesStadisticsOptions.serieMovieStadistics(scanner, scanner2, arraySeriesGeneral, arrayMoviesGeneral);
						}
					break;
				}
				case 3:
				{
					//-----------VIEW SERIES OR MOVIES MENU------------
					System.out.println("Select Option:\n"
							+ "[1] View Series\n"
							+ "[2] View Movies\n"
							+ "[3] View Series and Movies\n");
					int optionSelected = scanner.nextInt();
					
					if(optionSelected==1) 
					{
						//---VIEW--SERIES--SELECTED
						ViewSeriesOptions.viewSeries(scanner2, arraySeriesGeneral);
						
					}
					else if(optionSelected==2) 
					{
						//---VIEW--MOVIES--SELECTED
						ViewMoviesOptions.viewMovies(scanner2, arrayMoviesGeneral);
					}
					else if(optionSelected==3) 
					{
						//---VIEW--SERIES-AND-MOVIES--SELECTED
						ViewSeriesMoviesOptions.viewSeriesMovies(scanner, scanner2, arrayMoviesGeneral, arraySeriesGeneral);
					}
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
