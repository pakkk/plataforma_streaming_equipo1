package es.iesjandula.plataforma_streaming_equipo1;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.IMenus.*;
import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
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



public class main implements IGeneralsMenu,IMenuActors,IMenuDirectors,IMenuRecommendations{
	public static void clearScreen() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
	public static void main(String[] args) {
		//Main de inicio 
		
		//----------------BASE OBJECTS---Caterories Class----------------------------
		
		Categorie categoria1 = new Categorie(CategorieTypes.ACCION);
		Categorie categoria2 = new Categorie(CategorieTypes.COMEDIA);
		Categorie categoria3 = new Categorie(CategorieTypes.TERROR);
		Categorie categoria4 = new Categorie(CategorieTypes.SUSPENSE);
		Categorie[] arrayCategories1 = {categoria1};
		Categorie[] arrayCategoriesGeneral = {categoria1,categoria2,categoria3,categoria4};
		//----------------testing Caterories Class----------------------------
		
		
		
		//-----------------BASE OBJECTS-- Directors Class----------------------------
		Directors director1 = new Directors("Manuel","Perez",1980,"Spain",Genders.MAN);
		Directors director2 = new Directors("Luis","Molina",1953,"England",Genders.MAN);
		Directors director3 = new Directors("Sancho","Perez",1952,"EEUU",Genders.MAN);
		Directors director4 = new Directors("Maria","Molina",1934,"Mexico",Genders.WOMAN);
		Directors director5 = new Directors("Sara","Sanchez",1989,"Poland",Genders.WOMAN);
		Directors director6 = new Directors("Fernanda","Rosa",1999,"Ukrain",Genders.WOMAN);
		
		Directors[] arrayDirectors1 = {director1,director2};
		Directors[] arrayDirectorsGeneral = {director1,director2,director3,director4,director5,director6};
		
		//----------------BASE OBJECTS-- Directors Class----------------------------
		
		
		
		//----------------BASE OBJECTS-- Actors Class----------------------------
		Actors actor1 = new Actors("Pepe","Gonzales", "Spain",Genders.MAN,1990);
		Actors actor2 = new Actors("Arturo","Benitez", "England",Genders.MAN,1990);
		Actors actor3 = new Actors("Nelson","Martinez", "EEUU",Genders.MAN,1990);
		Actors actor4 = new Actors("Persiman","Letsen", "Polan",Genders.MAN,1990);
		Actors actor5 = new Actors("Julia","Rous", "Ukrain",Genders.MAN,1990);
		Actors actor6 = new Actors("Sofia","Hernandez", "Africa",Genders.MAN,1990);
		Actors[] arrayActors1 = {actor1};
		Actors[] arrayActorsGeneral = {actor1,actor2,actor3,actor4,actor5,actor6};
		
		//----------------BASE OBJECTS-- Actors Class----------------------------
		
		
		//-----------------BASE OBJECTS-- Subtitles Class----------------------------
		Subtitles subtitle1 = new Subtitles(AvaliableSubtitles.EN);
		Subtitles subtitle2 = new Subtitles(AvaliableSubtitles.ES);
		Subtitles subtitle3 = new Subtitles(AvaliableSubtitles.DE);
		Subtitles subtitle4 = new Subtitles(AvaliableSubtitles.RU);
		Subtitles subtitle5 = new Subtitles(AvaliableSubtitles.IT);
		Subtitles subtitle6 = new Subtitles(AvaliableSubtitles.CH);

		Subtitles[] arraySubtitles1 = {subtitle1,subtitle2};
		Subtitles[] arraySubtitlesGeneral = {subtitle1,subtitle2,subtitle3,subtitle4,subtitle5,subtitle6};
		//-----------------BASE OBJECTS-- Subtitles Class----------------------------
		
		
		
		//-----------------BASE OBJECTS-- Recomendations Class----------------------------
		Recomendations reco1 = new Recomendations("Buena peli me gusto",RecomendationsType.POSITIVE);
		Recomendations reco2 = new Recomendations("No me gusto",RecomendationsType.NEGATIVE);
		Recomendations reco3 = new Recomendations("Bueno ni mal ni bien");
		Recomendations reco4 = new Recomendations("FENOMENAL !!!!!",RecomendationsType.POSITIVE);
		Recomendations reco5 = new Recomendations("Una basura...",RecomendationsType.NEGATIVE);
		
		Recomendations[] arrayRecomendationsGeneral= {reco1,reco2,reco3,reco4,reco5};
		//-----------------BASE OBJECTS-- Recomendations Class----------------------------
		
		
		//Array with AdaptedLanguages
		String[] arrayAdaptedLanguages1= {"Spanish","English"};
		
		//----------------BASE OBJECTS--Movies Class----------------------------
		
		Movies move1 = new Movies(arrayActors1,arrayDirectors1,arrayCategories1,"Los 300","English",arrayAdaptedLanguages1,arraySubtitles1,145.0,2013);
		Movies[] arrayMoviesGenereal1= {move1};
		//----------------BASE OBJECTS--Movies Class----------------------------
		
		
		
		//----------------BASE OBJECTS--Series Class----------------------------
		Series serie1 = new Series(arrayActors1,arrayDirectors1,arrayCategories1,"Hora de aventuras","English",arrayAdaptedLanguages1,arraySubtitles1,25.0,2010,100,10);
		Series[] arraySeriesGeneral= {serie1}; 
		//----------------BASE OBJECTS--Series Class----------------------------
		
		
		//------------OTHER TESTS-------------
		/*
		//Testing Area.....
		 
		//Sacar de audiovisuals los directores de PELICULAS
		Audiovisuals[] audiovisualsArray={move1,serie1};
		for(Audiovisuals x:audiovisualsArray) {
			if(x.getType()==Type.PELICULA) {
				//System.out.println(Arrays.toString(x.getDirectors()));
			}
		}
		//Sacar de audiovisuals los directores de SERIES
		Audiovisuals[] audiovisualsArray2={move1,serie1};
		for(Audiovisuals x:audiovisualsArray) {
			if(x.getType()==Type.SERIE) {
				//System.out.println(Arrays.toString(x.getDirectors()));
			}
		}
		*/
		
		//------------OTHER TESTS-------------
		
		
		
		//-----------------------MENUS----------------------------------------
		
		//boolean for the main Loop
		boolean isRunning=true;
		
		//------MAIN--LOOP-------
		while(isRunning){
			int firstSelection;
			IGeneralsMenu.generalMenu();
			System.out.print("-> ");
			//Principal selection
			firstSelection = new Scanner(System.in).nextInt();
			
			switch(firstSelection) {
				case 1:{
					//-------------OPTIONS MENU CASE-------------
					clearScreen();
					IGeneralsMenu.optionsGeneralMenu();
					System.out.print("-> ");
					//Getting the Main menu selection
					int optionSelection = new Scanner(System.in).nextInt();
					
					switch(optionSelection) {
						case 1:
						{//----------DIRECTORS OPTIONS--------------
							clearScreen();
							IMenuDirectors.directorMenu();
							int selection = new Scanner(System.in).nextInt();
							switch(selection) {
								case 1:{
									System.out.println("Dime el nombre del director");
									String name=new Scanner(System.in).nextLine();
									clearScreen();
									System.out.println("Dime el apellido del director");
									String apellido=new Scanner(System.in).nextLine();
									clearScreen();
									System.out.println("Dime la nacionalidad del director");
									String nationality=new Scanner(System.in).nextLine();
									clearScreen();
									System.out.println("Selecciona el sexo del director: \n"
											+ "[1] Man \n"
											+ "[2] Woman \n"
											+ "[3] Other \n");
									int gender = new Scanner(System.in).nextInt();
									clearScreen();
									Genders x=Genders.OTHER;
									if (gender==1) {
										x=x.MAN;
									}else if (gender==2){
										x=x.WOMAN;
									}else {
										x=x.OTHER;
									}
									System.out.println("Dime el año de nacimiento del director");
									int year=new Scanner(System.in).nextInt();
									clearScreen();
									
									arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length+1);
									arrayDirectorsGeneral[arrayDirectorsGeneral.length-1]=new Directors(name, apellido, year, nationality, x);
									System.out.println(arrayDirectorsGeneral[arrayDirectorsGeneral.length-1]);
									break;
								}
								case 2:{
									clearScreen();
									System.out.println("Selecciona el metodo de busqueda: \n"
											+ "[1] Nombre \n"
											+ "[2] Apellido \n"
											+ "[3] Año de nacimiento \n"
											+ "[4] Nacionalidad \n"
											+ "[5] Genero \n");
									int selection1 = new Scanner(System.in).nextInt();
									clearScreen();
									if (selection1==1) {
										System.out.println("Indica el nombre \n");
										String name=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getName().equals(name)) {
												System.out.println(director);
											}
										}
									}else if (selection1==2) {
										System.out.println("Indica el Apellido \n");
										String apellido=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getLastName().equals(apellido)) {
												System.out.println(director);
											}
										}
									}else if (selection1==3) {
										System.out.println("Indica el Año de Nacimiento \n");
										int year=new Scanner(System.in).nextInt();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getYear()==year) {
												System.out.println(director);
											}
										}
									}else if (selection1==4) {
										System.out.println("Indica la Nacionalidad \n");
										String nacionalidad=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getNationality().equals(nacionalidad)) {
												System.out.println(director);
											}
										}
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getGender().equals(x)) {
												System.out.println(director);
											}
										}
									}
									break;
								}
								case 3:{
									clearScreen();
									System.out.println("Selecciona metodo de busqueda para modificar el director: \n"
											+ "[1] Nombre \n"
											+ "[2] Apellido \n"
											+ "[3] Año de nacimiento \n"
											+ "[4] Nacionalidad \n"
											+ "[5] Genero \n");
									int selection1 = new Scanner(System.in).nextInt();
									clearScreen();
									if (selection1==1) {
										System.out.println("Indica el nombre \n");
										String name=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getName().equals(name)) {
												System.out.println("Encontrado: ");
												System.out.println(director);
												System.out.println("Selecciona que dato deseas cambiar de el director: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt();
													clearScreen(); 
													director.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) {
														x=x.MAN;
													}else if (gender==2){
														x=x.WOMAN;
													}else {
														x=x.OTHER;
													}
													director.setGender(x);
												}
											}
										}
									}else if (selection1==2) {
										System.out.println("Indica el apellido \n");
										String apellido=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getLastName().equals(apellido)) {
												System.out.println("Encontrado: ");
												System.out.println(director);
												System.out.println("Selecciona que dato deseas cambiar de el director: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt(); 
													clearScreen();
													director.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) {
														x=x.MAN;
													}else if (gender==2){
														x=x.WOMAN;
													}else {
														x=x.OTHER;
													}
													director.setGender(x);
												}
											}
										}
									}else if (selection1==3) {
										System.out.println("Indica el año de nacimiento \n");
										int nacimiento=new Scanner(System.in).nextInt();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getYear()==nacimiento) {
												System.out.println("Encontrado: ");
												System.out.println(director);
												System.out.println("Selecciona que dato deseas cambiar de el director: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt();
													clearScreen(); 
													director.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) {
														x=x.MAN;
													}else if (gender==2){
														x=x.WOMAN;
													}else {
														x=x.OTHER;
													}
													director.setGender(x);
												}
											}
										}
									}else if (selection1==4) {
										System.out.println("Indica la nacionalidad \n");
										String nacionalidad=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getNationality().equals(nacionalidad)) {
												System.out.println("Encontrado: ");
												System.out.println(director);
												System.out.println("Selecciona que dato deseas cambiar de el director: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt(); 
													clearScreen();
													director.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine();
													clearScreen(); 
													director.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) {
														x=x.MAN;
													}else if (gender==2){
														x=x.WOMAN;
													}else {
														x=x.OTHER;
													}
													director.setGender(x);
												}
											}
										}
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getGender().equals(x)) {
												System.out.println("Encontrado: ");
												System.out.println(director);
												System.out.println("Selecciona que dato deseas cambiar de el director: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt(); 
													clearScreen();
													director.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine(); 
													clearScreen();
													director.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender1 = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x1=Genders.OTHER;
													if (gender1==1) {
														x1=x1.MAN;
													}else if (gender1==2){
														x1=x1.WOMAN;
													}else {
														x1=x1.OTHER;
													}
													director.setGender(x1);
												}
											}
										}
									}
									break;
								}
								case 4:{
									int cont=0;
									System.out.println("Selecciona el metodo de busqueda para borrar: \n"
											+ "[1] Nombre \n"
											+ "[2] Apellido \n"
											+ "[3] Año de nacimiento \n"
											+ "[4] Nacionalidad \n"
											+ "[5] Genero \n");
									int selection1 = new Scanner(System.in).nextInt();
									clearScreen();
									if (selection1==1) {
										System.out.println("Indica el nombre \n");
										String name=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getName().equals(name)) {
												System.out.println(director);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++) {
													if(cont==i) {
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}else {
													arrayDirectorsGeneral[i]=arrayDirectorsGeneral[i];
													}
												}
												
												arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayDirectorsGeneral));
										cont=0;
									}else if (selection1==2) {
										System.out.println("Indica el Apellido \n");
										String apellido=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getLastName().equals(apellido)) {
												System.out.println(director);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++) {
													if(cont==i) {
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}else {
													arrayDirectorsGeneral[i]=arrayDirectorsGeneral[i];
													}
												}
												
												arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayDirectorsGeneral));
										cont=0;
									}else if (selection1==3) {
										System.out.println("Indica el año de nacimiento \n");
										int year=new Scanner(System.in).nextInt();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getYear()==year) {
												System.out.println(director);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++) {
													if(cont==i) {
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}else {
													arrayDirectorsGeneral[i]=arrayDirectorsGeneral[i];
													}
												}
												
												arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayDirectorsGeneral));
										cont=0;
									}else if (selection1==4) {
										System.out.println("Indica Nacionalidad \n");
										String nacionalidad=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getNationality().equals(nacionalidad)) {
												System.out.println(director);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++) {
													if(cont==i) {
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}else {
													arrayDirectorsGeneral[i]=arrayDirectorsGeneral[i];
													}
												}
												
												arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayDirectorsGeneral));
										cont=0;
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										System.out.println("Resultados : \n");
										for (Directors director:arrayDirectorsGeneral) {
											if (director.getGender().equals(x)) {
												System.out.println(director);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayDirectorsGeneral.length;i++) {
													if(cont==i) {
														arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
													}else {
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
							int selection = new Scanner(System.in).nextInt();
							switch(selection) {
								case 1:{
									System.out.println("Dime el nombre del actor");
									String name=new Scanner(System.in).nextLine();
									clearScreen();
									System.out.println("Dime el apellido del actor");
									String apellido=new Scanner(System.in).nextLine();
									clearScreen();
									System.out.println("Dime la nacionalidad del actor");
									String nationality=new Scanner(System.in).nextLine();
									clearScreen();
									System.out.println("Selecciona el sexo del actor: \n"
											+ "[1] Man \n"
											+ "[2] Woman \n"
											+ "[3] Other \n");
									int gender = new Scanner(System.in).nextInt();
									clearScreen();
									Genders x=Genders.OTHER;
									if (gender==1) {
										x=x.MAN;
									}else if (gender==2){
										x=x.WOMAN;
									}else {
										x=x.OTHER;
									}
									System.out.println("Dime el año de nacimiento del actor");
									int year=new Scanner(System.in).nextInt();
									clearScreen();
									
									arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length+1);
									arrayActorsGeneral[arrayActorsGeneral.length-1]=new Actors(name, apellido, nationality, x, year);
									System.out.println(arrayActorsGeneral[arrayActorsGeneral.length-1]);
									break;
								}
								case 2:{
									clearScreen();
									System.out.println("Selecciona el metodo de busqueda: \n"
											+ "[1] Nombre \n"
											+ "[2] Apellido \n"
											+ "[3] Año de nacimiento \n"
											+ "[4] Nacionalidad \n"
											+ "[5] Genero \n");
									int selection1 = new Scanner(System.in).nextInt();
									clearScreen();
									if (selection1==1) {
										System.out.println("Indica el nombre \n");
										String name=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getName().equals(name)) {
												System.out.println(actor);
											}
										}
									}else if (selection1==2) {
										System.out.println("Indica el Apellido \n");
										String apellido=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getLastName().equals(apellido)) {
												System.out.println(actor);
											}
										}
									}else if (selection1==3) {
										System.out.println("Indica el Año de Nacimiento \n");
										int year=new Scanner(System.in).nextInt();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getYear()==year) {
												System.out.println(actor);
											}
										}
									}else if (selection1==4) {
										System.out.println("Indica la Nacionalidad \n");
										String nacionalidad=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getNationality().equals(nacionalidad)) {
												System.out.println(actor);
											}
										}
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getGender().equals(x)) {
												System.out.println(actor);
											}
										}
									}
									break;
								}
								case 3:{
									clearScreen();
									System.out.println("Selecciona metodo de busqueda para modificar el actor: \n"
											+ "[1] Nombre \n"
											+ "[2] Apellido \n"
											+ "[3] Año de nacimiento \n"
											+ "[4] Nacionalidad \n"
											+ "[5] Genero \n");
									int selection1 = new Scanner(System.in).nextInt();
									clearScreen();
									if (selection1==1) {
										System.out.println("Indica el nombre \n");
										String name=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getName().equals(name)) {
												System.out.println("Encontrado: ");
												System.out.println(actor);
												System.out.println("Selecciona que dato deseas cambiar del actor: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt();
													clearScreen(); 
													actor.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) {
														x=x.MAN;
													}else if (gender==2){
														x=x.WOMAN;
													}else {
														x=x.OTHER;
													}
													actor.setGender(x);
												}
											}
										}
									}else if (selection1==2) {
										System.out.println("Indica el apellido \n");
										String apellido=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getLastName().equals(apellido)) {
												System.out.println("Encontrado: ");
												System.out.println(actor);
												System.out.println("Selecciona que dato deseas cambiar de el actor: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt(); 
													clearScreen();
													actor.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) {
														x=x.MAN;
													}else if (gender==2){
														x=x.WOMAN;
													}else {
														x=x.OTHER;
													}
													actor.setGender(x);
												}
											}
										}
									}else if (selection1==3) {
										System.out.println("Indica el año de nacimiento \n");
										int nacimiento=new Scanner(System.in).nextInt();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getYear()==nacimiento) {
												System.out.println("Encontrado: ");
												System.out.println(actor);
												System.out.println("Selecciona que dato deseas cambiar de el actor: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt();
													clearScreen(); 
													actor.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) {
														x=x.MAN;
													}else if (gender==2){
														x=x.WOMAN;
													}else {
														x=x.OTHER;
													}
													actor.setGender(x);
												}
											}
										}
									}else if (selection1==4) {
										System.out.println("Indica la nacionalidad \n");
										String nacionalidad=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getNationality().equals(nacionalidad)) {
												System.out.println("Encontrado: ");
												System.out.println(actor);
												System.out.println("Selecciona que dato deseas cambiar de el actor: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt(); 
													clearScreen();
													actor.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine();
													clearScreen(); 
													actor.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x=Genders.OTHER;
													if (gender==1) {
														x=x.MAN;
													}else if (gender==2){
														x=x.WOMAN;
													}else {
														x=x.OTHER;
													}
													actor.setGender(x);
												}
											}
										}
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getGender().equals(x)) {
												System.out.println("Encontrado: ");
												System.out.println(actor);
												System.out.println("Selecciona que dato deseas cambiar de el actor: \n"
														+ "[1] Nombre \n"
														+ "[2] Apellido \n"
														+ "[3] Año de nacimiento \n"
														+ "[4] Nacionalidad \n"
														+ "[5] Genero \n");
												int selection2 = new Scanner(System.in).nextInt();
												clearScreen();
												if (selection2==1) {
													System.out.println("Dime nombre ");
													String name1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setName(name1);
												}else if (selection2==2) {
													System.out.println("Dime apellido ");
													String lastName1=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setLastName(lastName1);
												}else if (selection2==3) {
													System.out.println("Dime año de nacimiento: ");
													int year=new Scanner(System.in).nextInt(); 
													clearScreen();
													actor.setYear(year);
												}else if (selection2==4) {
													System.out.println("Dime Nacionalidad ");
													String nationality=new Scanner(System.in).nextLine(); 
													clearScreen();
													actor.setNationality(nationality);
												}else {
													System.out.println("Indica el genero \n"
															+ "[1] Man \n"
															+ "[2] Woman \n"
															+ "[3] Other \n");
													int gender1 = new Scanner(System.in).nextInt();
													clearScreen();
													Genders x1=Genders.OTHER;
													if (gender1==1) {
														x1=x1.MAN;
													}else if (gender1==2){
														x1=x1.WOMAN;
													}else {
														x1=x1.OTHER;
													}
													actor.setGender(x1);
												}
											}
										}
									}
									break;
								}
								case 4:{
									int cont=0;
									System.out.println("Selecciona el metodo de busqueda para borrar: \n"
											+ "[1] Nombre \n"
											+ "[2] Apellido \n"
											+ "[3] Año de nacimiento \n"
											+ "[4] Nacionalidad \n"
											+ "[5] Genero \n");
									int selection1 = new Scanner(System.in).nextInt();
									clearScreen();
									if (selection1==1) {
										System.out.println("Indica el nombre \n");
										String name=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getName().equals(name)) {
												System.out.println(actor);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) {
													if(cont==i) {
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}else {
													arrayActorsGeneral[i]=arrayActorsGeneral[i];
													}
												}
												
												arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayActorsGeneral));
										cont=0;
									}else if (selection1==2) {
										System.out.println("Indica el Apellido \n");
										String apellido=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getLastName().equals(apellido)) {
												System.out.println(actor);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) {
													if(cont==i) {
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}else {
													arrayActorsGeneral[i]=arrayActorsGeneral[i];
													}
												}
												
												arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayActorsGeneral));
										cont=0;
									}else if (selection1==3) {
										System.out.println("Indica el año de nacimiento \n");
										int year=new Scanner(System.in).nextInt();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getYear()==year) {
												System.out.println(actor);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) {
													if(cont==i) {
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}else {
													arrayActorsGeneral[i]=arrayActorsGeneral[i];
													}
												}
												
												arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayActorsGeneral));
										cont=0;
									}else if (selection1==4) {
										System.out.println("Indica Nacionalidad \n");
										String nacionalidad=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getNationality().equals(nacionalidad)) {
												System.out.println(actor);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) {
													if(cont==i) {
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}else {
													arrayActorsGeneral[i]=arrayActorsGeneral[i];
													}
												}
												
												arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayActorsGeneral));
										cont=0;
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										clearScreen();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										System.out.println("Resultados : \n");
										for (Actors actor:arrayActorsGeneral) {
											if (actor.getGender().equals(x)) {
												System.out.println(actor);
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayActorsGeneral.length;i++) {
													if(cont==i) {
														arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
													}else {
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
							//String recomendations,RecomendationsType Type
							
							int selection = new Scanner(System.in).nextInt();
							switch(selection) {
								case 1:{
									//-------------CREATE-RECOMENDATION-----------------
									System.out.println("Texto de la Recomandacion:");
									String texto=new Scanner(System.in).nextLine();
									clearScreen();
									System.out.println("Tipo de recomendacion:\n"
											+ "[1] Positiva\n"
											+ "[2] Negativa\n"
											+ "[3] Neutral\n");
									int recomendationType=new Scanner(System.in).nextInt();
									RecomendationsType x;
									if (recomendationType==1) {
										x=RecomendationsType.POSITIVE;
									}else if (recomendationType==2) {
										x=RecomendationsType.NEGATIVE;
									}else {
										x=RecomendationsType.NEUTRAL;
									}
									
									clearScreen();

									arrayRecomendationsGeneral=Arrays.copyOf(arrayRecomendationsGeneral, arrayRecomendationsGeneral.length+1);
									arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1]=new Recomendations(texto,x);
									System.out.println(arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1]);
									break;
									//-------------CREATE-RECOMENDATION-----------------
								}
								case 2:{
									//-------------SEARCH-RECOMENDATIONS-----------------
									clearScreen();
									System.out.println("Selecciona el metodo de busqueda: \n"
											+ "[1] Texto \n"
											+ "[2] Tipo (Positiva,Negativa,Neutral) \n");
									int selection1 = new Scanner(System.in).nextInt();
									clearScreen();
									if (selection1==1) {
										//--SARCH-BY-TEXT--
										System.out.println("Indica el texto \n");
										String texto=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Recomendations recomendation:arrayRecomendationsGeneral) {
											if (recomendation.getRecomendations().contains(texto)) {
												System.out.println(recomendation);
											}
										}
										//--SARCH-BY-TEXT--
										
									}else if (selection1==2) {
										//--SARCH-BY-TYPE--
										System.out.println("Tipo de recomendacion:\n"
												+ "[1] Positiva\n"
												+ "[2] Negativa\n"
												+ "[3] Neutral\n");
										int recomendationType=new Scanner(System.in).nextInt();
										RecomendationsType x;
										if (recomendationType==1) {
											x=RecomendationsType.POSITIVE;
										}else if (recomendationType==2) {
											x=RecomendationsType.NEGATIVE;
										}else {
											x=RecomendationsType.NEUTRAL;
										}
										
										clearScreen();
										System.out.println("Resultados : \n");
										for (Recomendations recomendation:arrayRecomendationsGeneral) {
											if (recomendation.getType().equals(x)) {
												System.out.println(recomendation);
											}
										}
									}//--SARCH-BY-TYPE--
									
									break;
									
									//-------------SEARCH-RECOMENDATIONS-----------------
								}
								case 3:{
									//-------------MODIFY-RECOMENDATION-----------------
									clearScreen();
									System.out.println("Selecciona el metodo de busqueda para modificar: \n"
											+ "[1] Texto \n"
											+ "[2] Tipo (Positiva,Negativa,Neutral) \n");
									int selection1 = new Scanner(System.in).nextInt();
									clearScreen();
									if (selection1==1) {
										//--MODIFY-BY-TEXT--
										System.out.println("Indica el texto \n");
										String texto=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Recomendations recomendation:arrayRecomendationsGeneral) {
											if (recomendation.getRecomendations().contains(texto)) {
												System.out.println(recomendation);
												System.out.println("Indique que quiere cambiar:\n"
														+ "[1] Texto\n"
														+ "[2] Tipo(Positiva,Negativa,Neutra)");
												int selection2 = new Scanner(System.in).nextInt();
												if(selection2==1) {
													System.out.println("Indique nuevo texto:\n");
													recomendation.setRecomendations(new Scanner(System.in).nextLine());
												}else {
													System.out.println("Nuevo Tipo de recomendacion:\n"
															+ "[1] Positiva\n"
															+ "[2] Negativa\n"
															+ "[3] Neutral\n");
													int recomendationType=new Scanner(System.in).nextInt();
													RecomendationsType x;
													if (recomendationType==1) {
														x=RecomendationsType.POSITIVE;
													}else if (recomendationType==2) {
														x=RecomendationsType.NEGATIVE;
													}else {
														x=RecomendationsType.NEUTRAL;
													}
													recomendation.setType(x);
												}
											}
										}
										//--MODIFY-BY-TEXT--
										
									}else if (selection1==2) {
										//--MODIFY-BY-TYPE--
										System.out.println("Indique Tipo de recomendacion:\n"
												+ "[1] Positiva\n"
												+ "[2] Negativa\n"
												+ "[3] Neutral\n");
										int recomendationType=new Scanner(System.in).nextInt();
										RecomendationsType x;
										if (recomendationType==1) {
											x=RecomendationsType.POSITIVE;
										}else if (recomendationType==2) {
											x=RecomendationsType.NEGATIVE;
										}else {
											x=RecomendationsType.NEUTRAL;
										}
										
										clearScreen();
										System.out.println("Resultados : \n");
										for (Recomendations recomendation:arrayRecomendationsGeneral) {
											if (recomendation.getType().equals(x)) {
												System.out.println(recomendation);
												System.out.println("Indique que quiere cambiar:\n"
														+ "[1] Texto\n"
														+ "[2] Tipo(Positiva,Negativa,Neutra)");
												int selection2 = new Scanner(System.in).nextInt();
												if(selection2==1) {
													System.out.println("Indique nuevo texto:\n");
													recomendation.setRecomendations(new Scanner(System.in).nextLine());
												}else {
													System.out.println("Nuevo Tipo de recomendacion:\n"
															+ "[1] Positiva\n"
															+ "[2] Negativa\n"
															+ "[3] Neutral\n");
													int recomendationType2=new Scanner(System.in).nextInt();
													RecomendationsType x2;
													if (recomendationType2==1) {
														x2=RecomendationsType.POSITIVE;
													}else if (recomendationType2==2) {
														x2=RecomendationsType.NEGATIVE;
													}else {
														x2=RecomendationsType.NEUTRAL;
													}
													recomendation.setType(x2);
												}
											}
										}
									}//--MODIFY-BY-TYPE--
									
									break;
								}
								case 4:{
									//-------------SEARCH-RECOMENDATIONS-----------------
									clearScreen();
									System.out.println("Selecciona el metodo de busqueda para borrar: \n"
											+ "[1] Texto \n"
											+ "[2] Tipo (Positiva,Negativa,Neutral) \n");
									int selection1 = new Scanner(System.in).nextInt();
									clearScreen();
									int cont=0;
									if (selection1==1) {
										//--DELETE-BY-TEXT--
										System.out.println("Indica el texto \n");
										String texto=new Scanner(System.in).nextLine();
										clearScreen();
										System.out.println("Resultados : \n");
										for (Recomendations recomendation:arrayRecomendationsGeneral) {
											if (recomendation.getRecomendations().contains(texto)) {
												System.out.println("Borrada:\n"+recomendation+"\n");
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayRecomendationsGeneral.length;i++) {
													if(cont==i) {
														arrayRecomendationsGeneral[i]=arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1];
													}else {
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
										
									}else if (selection1==2) {
										//--DELETE-BY-TYPE--
										System.out.println("Tipo de recomendacion:\n"
												+ "[1] Positiva\n"
												+ "[2] Negativa\n"
												+ "[3] Neutral\n");
										int recomendationType=new Scanner(System.in).nextInt();
										RecomendationsType x;
										if (recomendationType==1) {
											x=RecomendationsType.POSITIVE;
										}else if (recomendationType==2) {
											x=RecomendationsType.NEGATIVE;
										}else {
											x=RecomendationsType.NEUTRAL;
										}
										
										clearScreen();
										System.out.println("Resultados : \n");
										for (Recomendations recomendation:arrayRecomendationsGeneral) {
											if (recomendation.getType().equals(x)) {
												System.out.println("Borrada:\n"+recomendation+"\n");
												System.out.println("Posicion "+cont);
												
												for(int i=0;i<arrayRecomendationsGeneral.length;i++) {
													if(cont==i) {
														arrayRecomendationsGeneral[i]=arrayRecomendationsGeneral[arrayRecomendationsGeneral.length-1];
													}else {
														arrayRecomendationsGeneral[i]=arrayRecomendationsGeneral[i];
													}
												}
												
												arrayRecomendationsGeneral=Arrays.copyOf(arrayRecomendationsGeneral, arrayRecomendationsGeneral.length-1);
											}
											cont+=1;
										}
										System.out.println(Arrays.toString(arrayRecomendationsGeneral));
										cont=0;
									}//--DELETE-BY-TYPE--
									
									break;
									
									//-------------SEARCH-RECOMENDATIONS-----------------
								}
									
							}
							break;
						}//----------RECOMENDATIONS-OPTIONS--------------
						
						
						case 4:
						{//----------CATEGORIES-OPTIONS--------------
							clearScreen();
							IMenuCategories.categoriesMenu();
							break;
						}//----------CATEGORIES-OPTIONS--------------
						
						
						case 5:
						{//----------MOVIES-SERIES-OPTIONS--------------
							clearScreen();
							IGeneralsMenu.selectMovieSerie();
							int selected = new Scanner(System.in).nextInt();
							if(selected==1) {
								//---SERIES SELECTED---
								clearScreen();
								IMenuSeries.seriesMenu();
								
								
							}else {
								//---MOVIES SELECTED---
								clearScreen();
								IMenuMovies.moviesMenu();
								
								
							}
							break;
						}//----------MOVIES-SERIES-OPTIONS--------------
						
						
						default:{
							System.out.println("Opcion desconocida");
							break;
						}
					}
					break;
				}
				case 2:{
					//---------INFORMATIONS AND STADISTIC MENU-------
					
					break;
				}
				case 3:{
					//-----------VIEW SERIES OR MOVIES MENU------------
					
					break;
				}
				
				//SELECTION 4 (OR OTHERS)...
				default:{
					//----------EXIT SELECTED MENU FOR EXIT----------
					System.out.println("Saliendo del programa...");
					isRunning=false;//Stop the main loop, boolean false.
					break;
				}
				
			}
			
		}
	}

}
