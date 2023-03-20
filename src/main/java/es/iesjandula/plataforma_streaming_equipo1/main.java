package es.iesjandula.plataforma_streaming_equipo1;

import es.iesjandula.plataforma_streaming_equipo1.categories.Categories;

public class main {

	public static void main(String[] args) {
		//Main de inicio
		//System.out.println("Hola mundo");
		
		
		//testing Caterories Class
		Categories categoria2 = new Categories(Categories.CategoriesTypes.ACCION);
		Categories categoria1 = new Categories(Categories.CategoriesTypes.OTHER);
		
		categoria1.setName("Fantasia");
		categoria1.setDescription("De fantasia");
		
		System.out.println(categoria1+"\n\n"+categoria2);
		//testing Caterories Class
	}

}
