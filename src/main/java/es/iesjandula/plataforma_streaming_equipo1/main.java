package es.iesjandula.plataforma_streaming_equipo1;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.IMenus.*;
import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Audiovisuals;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Type;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.movies.Movies;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series.Series;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categories;
import es.iesjandula.plataforma_streaming_equipo1.categories.CategoriesTypes;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.AvaliableSubtitles;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;

public class main implements IGeneralsMenu,IMenuActors,IMenuDirectors,IMenuRecommendations{

	public static void main(String[] args) {
		//Main de inicio
		
		//----------------testing Caterories Class----------------------------
		
		Categories categoria1 = new Categories(CategoriesTypes.ACCION);
		Categories[] arrayCategories1 = {categoria1};
		Categories[] arrayCategoriesGeneral = {categoria1};
		//----------------testing Caterories Class----------------------------
		
		
		
		//----------------testing Directors Class----------------------------
		Directors director1 = new Directors("Manuel","Perez",1980,"Spain",Genders.MAN);
		Directors director2 = new Directors("Luis","Molina",1950,"Englans",Genders.MAN);
		Directors[] arrayDirectors1 = {director1,director2};
		Directors[] arrayDirectorsGeneral = {director1,director2};
		
		//----------------testing Directors Class----------------------------
		
		
		
		//----------------testing Actors Class----------------------------
		Actors actor1 = new Actors("Pepe","Gonzales", "Spain",Genders.MAN,1990);
		Actors[] arrayActors1 = {actor1};
		Actors[] arrayActorsGeneral = {actor1};
		
		//----------------testing Actors Class----------------------------
		
		
		//----------------testing Subtitles Class----------------------------
		Subtitles subtitle1 = new Subtitles(AvaliableSubtitles.ES);
		Subtitles subtitle2 = new Subtitles(AvaliableSubtitles.EN);
		Subtitles[] arraySubtitles1 = {subtitle1,subtitle2};
		Subtitles[] arraySubtitlesGeneral = {subtitle1,subtitle2};
		//----------------testing Subtitles Class----------------------------
		
		
		/*
		 * 	public Audiovisuals(Type type, Actors[] actores, Categories[] categ, String tittle, String originalLenguaje,
			String[] adaptedLenguajes, Subtitles[] avaliableSubtitles, Double duration, int creationYear) 
		 * 
		 */
		
		String[] arrayAdaptedLanguages1= {"Spanish"};
		
		//----------------testing Audiovisuals Class----------------------------
		
		Movies move1 = new Movies(arrayActors1,arrayDirectors1,arrayCategories1,"Los 300","English",arrayAdaptedLanguages1,arraySubtitles1,145.0,2013);
		Series serie1 = new Series(arrayActors1,arrayDirectors1,arrayCategories1,"Hora de aventuras","English",arrayAdaptedLanguages1,arraySubtitles1,25.0,2010,100,10);

		System.out.println(move1);
		System.out.println("\n\n\n"+serie1);
		//----------------testing Audiovisuals Class----------------------------
		
		
		
		//-----------------------MENUS----------------------------------------
		int selection;
		IGeneralsMenu.generalMenu();
		System.out.print("-> ");
		selection = new Scanner(System.in).nextInt();
		
		String type = selection==1 ? "Peliculas":"Series";
		System.out.println("Selecionado: "+type);
		
		IGeneralsMenu.generalMenuSelection();
		System.out.print("-> ");
		selection = new Scanner(System.in).nextInt();
		
		switch(selection) {
			case 1:
			{//DIRECTORS
				IMenuDirectors.directorMenu();
				selection = new Scanner(System.in).nextInt();
				switch(selection) {
					case 1:{
						System.out.println("Dime el nombre del director");
						String name=new Scanner(System.in).nextLine();
						System.out.println("Dime el apellido del director");
						String apellido=new Scanner(System.in).nextLine();
						System.out.println("Dime la nacionalidad del director");
						String nationality=new Scanner(System.in).nextLine();
						System.out.println("Selecciona el sexo del director: \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender = new Scanner(System.in).nextInt();
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
						
						arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length+1);
						arrayDirectorsGeneral[arrayDirectorsGeneral.length-1]=new Directors(name, apellido, year, nationality, x);
						break;
					}
					case 2:{
						System.out.println("Selecciona el metodo de busqueda: \n"
								+ "[1] Nombre \n"
								+ "[2] Apellido \n"
								+ "[3] Año de nacimiento \n"
								+ "[4] Nacionalidad \n"
								+ "[5] Genero \n");
						int selection1 = new Scanner(System.in).nextInt();
						if (selection1==1) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el nombre \n");
								String name=new Scanner(System.in).nextLine();
								System.out.println("Resultados : \n");
								if (director.getName().equals(name)) {
									System.out.println(director);
								}
							}
						}else if (selection1==2) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el Apellido \n");
								String apellido=new Scanner(System.in).nextLine();
								System.out.println("Resultados : \n");
								if (director.getlastName().equals(apellido)) {
									System.out.println(director);
								}
							}
						}else if (selection1==3) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el Año de Nacimiento \n");
								int year=new Scanner(System.in).nextInt();
								System.out.println("Resultados : \n");
								if (director.getYear()==year) {
									System.out.println(director);
								}
							}
						}else if (selection1==4) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica la Nacionalidad \n");
								String nacionalidad=new Scanner(System.in).nextLine();
								System.out.println("Resultados : \n");
								if (director.getNationality().equals(nacionalidad)) {
									System.out.println(director);
								}
							}
						}else {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el genero \n"
										+ "[1] Man \n"
										+ "[2] Woman \n"
										+ "[3] Other \n");
								int gender = new Scanner(System.in).nextInt();
								Genders x=Genders.OTHER;
								if (gender==1) {
									x=x.MAN;
								}else if (gender==2){
									x=x.WOMAN;
								}else {
									x=x.OTHER;
								}
								System.out.println("Resultados : \n");
								if (director.getlastName().equals(x)) {
									System.out.println(director);
								}
							}
						}
						break;
					}
					case 3:{
						System.out.println("Selecciona metodo de busqueda para modificar el director: \n"
								+ "[1] Nombre \n"
								+ "[2] Apellido \n"
								+ "[3] Año de nacimiento \n"
								+ "[4] Nacionalidad \n"
								+ "[5] Genero \n");
						int selection1 = new Scanner(System.in).nextInt();
						if (selection1==1) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el nombre \n");
								String name=new Scanner(System.in).nextLine();
								System.out.println("Resultados : \n");
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
									if (selection2==1) {
										System.out.println("Dime nombre ");
										String name1=new Scanner(System.in).nextLine(); 
										director.setName(name1);
									}else if (selection2==2) {
										System.out.println("Dime apellido ");
										String lastName1=new Scanner(System.in).nextLine(); 
										director.setLastName(lastName1);
									}else if (selection2==3) {
										System.out.println("Dime año de nacimiento: ");
										int year=new Scanner(System.in).nextInt(); 
										director.setYear(year);
									}else if (selection2==4) {
										System.out.println("Dime Nacionalidad ");
										String nationality=new Scanner(System.in).nextLine(); 
										director.setNationality(nationality);
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										director.setSex(x);
									}
								}
							}
						}else if (selection1==2) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el apellido \n");
								String apellido=new Scanner(System.in).nextLine();
								System.out.println("Resultados : \n");
								if (director.getlastName().equals(apellido)) {
									System.out.println("Encontrado: ");
									System.out.println(director);
									System.out.println("Selecciona que dato deseas cambiar de el director: \n"
											+ "[1] Nombre \n"
											+ "[2] Apellido \n"
											+ "[3] Año de nacimiento \n"
											+ "[4] Nacionalidad \n"
											+ "[5] Genero \n");
									int selection2 = new Scanner(System.in).nextInt();
									if (selection2==1) {
										System.out.println("Dime nombre ");
										String name1=new Scanner(System.in).nextLine(); 
										director.setName(name1);
									}else if (selection2==2) {
										System.out.println("Dime apellido ");
										String lastName1=new Scanner(System.in).nextLine(); 
										director.setLastName(lastName1);
									}else if (selection2==3) {
										System.out.println("Dime año de nacimiento: ");
										int year=new Scanner(System.in).nextInt(); 
										director.setYear(year);
									}else if (selection2==4) {
										System.out.println("Dime Nacionalidad ");
										String nationality=new Scanner(System.in).nextLine(); 
										director.setNationality(nationality);
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										director.setSex(x);
									}
								}
							}
						}else if (selection1==3) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el año de nacimiento \n");
								int nacimiento=new Scanner(System.in).nextInt();
								System.out.println("Resultados : \n");
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
									if (selection2==1) {
										System.out.println("Dime nombre ");
										String name1=new Scanner(System.in).nextLine(); 
										director.setName(name1);
									}else if (selection2==2) {
										System.out.println("Dime apellido ");
										String lastName1=new Scanner(System.in).nextLine(); 
										director.setLastName(lastName1);
									}else if (selection2==3) {
										System.out.println("Dime año de nacimiento: ");
										int year=new Scanner(System.in).nextInt(); 
										director.setYear(year);
									}else if (selection2==4) {
										System.out.println("Dime Nacionalidad ");
										String nationality=new Scanner(System.in).nextLine(); 
										director.setNationality(nationality);
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										director.setSex(x);
									}
								}
							}
						}else if (selection1==4) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica la nacionalidad \n");
								String nacionalidad=new Scanner(System.in).nextLine();
								System.out.println("Resultados : \n");
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
									if (selection2==1) {
										System.out.println("Dime nombre ");
										String name1=new Scanner(System.in).nextLine(); 
										director.setName(name1);
									}else if (selection2==2) {
										System.out.println("Dime apellido ");
										String lastName1=new Scanner(System.in).nextLine(); 
										director.setLastName(lastName1);
									}else if (selection2==3) {
										System.out.println("Dime año de nacimiento: ");
										int year=new Scanner(System.in).nextInt(); 
										director.setYear(year);
									}else if (selection2==4) {
										System.out.println("Dime Nacionalidad ");
										String nationality=new Scanner(System.in).nextLine(); 
										director.setNationality(nationality);
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender = new Scanner(System.in).nextInt();
										Genders x=Genders.OTHER;
										if (gender==1) {
											x=x.MAN;
										}else if (gender==2){
											x=x.WOMAN;
										}else {
											x=x.OTHER;
										}
										director.setSex(x);
									}
								}
							}
						}else {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el genero \n"
										+ "[1] Man \n"
										+ "[2] Woman \n"
										+ "[3] Other \n");
								int gender = new Scanner(System.in).nextInt();
								Genders x=Genders.OTHER;
								if (gender==1) {
									x=x.MAN;
								}else if (gender==2){
									x=x.WOMAN;
								}else {
									x=x.OTHER;
								}
								System.out.println("Resultados : \n");
								if (director.getSex().equals(x)) {
									System.out.println("Encontrado: ");
									System.out.println(director);
									System.out.println("Selecciona que dato deseas cambiar de el director: \n"
											+ "[1] Nombre \n"
											+ "[2] Apellido \n"
											+ "[3] Año de nacimiento \n"
											+ "[4] Nacionalidad \n"
											+ "[5] Genero \n");
									int selection2 = new Scanner(System.in).nextInt();
									if (selection2==1) {
										System.out.println("Dime nombre ");
										String name1=new Scanner(System.in).nextLine(); 
										director.setName(name1);
									}else if (selection2==2) {
										System.out.println("Dime apellido ");
										String lastName1=new Scanner(System.in).nextLine(); 
										director.setLastName(lastName1);
									}else if (selection2==3) {
										System.out.println("Dime año de nacimiento: ");
										int year=new Scanner(System.in).nextInt(); 
										director.setYear(year);
									}else if (selection2==4) {
										System.out.println("Dime Nacionalidad ");
										String nationality=new Scanner(System.in).nextLine(); 
										director.setNationality(nationality);
									}else {
										System.out.println("Indica el genero \n"
												+ "[1] Man \n"
												+ "[2] Woman \n"
												+ "[3] Other \n");
										int gender1 = new Scanner(System.in).nextInt();
										Genders x1=Genders.OTHER;
										if (gender1==1) {
											x1=x1.MAN;
										}else if (gender1==2){
											x1=x1.WOMAN;
										}else {
											x1=x1.OTHER;
										}
										director.setSex(x1);
									}
								}
							}
						}
						
					}
					case 4:{
						System.out.println("Selecciona el metodo de busqueda para borrar: \n"
								+ "[1] Nombre \n"
								+ "[2] Apellido \n"
								+ "[3] Año de nacimiento \n"
								+ "[4] Nacionalidad \n"
								+ "[5] Genero \n");
						int selection1 = new Scanner(System.in).nextInt();
						if (selection1==1) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el nombre \n");
								String name=new Scanner(System.in).nextLine();
								System.out.println("Resultados : \n");
								if (director.getName().equals(name)) {
									System.out.println(director);
								}
							}
						}else if (selection1==2) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el Apellido \n");
								String apellido=new Scanner(System.in).nextLine();
								System.out.println("Resultados : \n");
								if (director.getlastName().equals(apellido)) {
									System.out.println(director);
								}
							}
						}else if (selection1==3) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el Año de Nacimiento \n");
								int year=new Scanner(System.in).nextInt();
								System.out.println("Resultados : \n");
								if (director.getYear()==year) {
									System.out.println(director);
								}
							}
						}else if (selection1==4) {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica la Nacionalidad \n");
								String nacionalidad=new Scanner(System.in).nextLine();
								System.out.println("Resultados : \n");
								if (director.getNationality().equals(nacionalidad)) {
									System.out.println(director);
								}
							}
						}else {
							for (Directors director:arrayDirectorsGeneral) {
								System.out.println("Indica el genero \n"
										+ "[1] Man \n"
										+ "[2] Woman \n"
										+ "[3] Other \n");
								int gender = new Scanner(System.in).nextInt();
								Genders x=Genders.OTHER;
								if (gender==1) {
									x=x.MAN;
								}else if (gender==2){
									x=x.WOMAN;
								}else {
									x=x.OTHER;
								}
								System.out.println("Resultados : \n");
								if (director.getlastName().equals(x)) {
									System.out.println(director);
								}
							}
						}
					}
						
				}
				break;
			}
			case 2:
			{//ACTORS
				IMenuActors.actorMenu();
				break;
			}
			case 3:
			{//RECOMMENDATIONS
				IMenuRecommendations.recommendationMenu();
				break;
			}
		}
		
		//-----------------------MENUS----------------------------------------
	}

}
