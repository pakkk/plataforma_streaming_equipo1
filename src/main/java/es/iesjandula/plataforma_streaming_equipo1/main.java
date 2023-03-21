package es.iesjandula.plataforma_streaming_equipo1;

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
