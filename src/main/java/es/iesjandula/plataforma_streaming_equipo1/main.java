package es.iesjandula.plataforma_streaming_equipo1;

import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.IMenus.*;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categories;
import es.iesjandula.plataforma_streaming_equipo1.categories.CategoriesTypes;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;

public class main implements IGeneralsMenu,IMenuActors,IMenuDirectors,IMenuRecommendations{

	public static void main(String[] args) {
		//Main de inicio
		
		//----------------testing Caterories Class----------------------------
		
		Categories categoria2 = new Categories(CategoriesTypes.ACCION);
		Categories categoria1 = new Categories(CategoriesTypes.OTHER);
		
		categoria1.setName("Fantasia");
		categoria1.setDescription("De fantasia");
		
		System.out.println(categoria1+"\n\n"+categoria2);
		//----------------testing Caterories Class----------------------------
		
		//----------------testing Directors Class----------------------------
		Directors director1 = new Directors("Manuel","Perez",1980,"Spain",Genders.MAN);
		System.out.println(director1);
		
		//----------------testing Directors Class----------------------------
		
		
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
