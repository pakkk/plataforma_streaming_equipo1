package es.iesjandula.plataforma_streaming_equipo1.IMenus;

public interface IGeneralsMenu {
	public static void generalMenu() {
		System.out.println("\n"
				+ "Menu General de plataforma streaming:\n"
				+ "[1] Opciones\n"
				+ "[2] Estadisticas e informacion\n"
				+ "[3] Ver series o peliculas\n"
				+ "[Otro] Salir...");
		
	}
	public static void optionsGeneralMenu() {
		System.out.println("\n"
				+ "Menu de Opciones (Seleccion):\n"
				+ "[1] Opciones Directores\n"
				+ "[2] Opciones Actores\n"
				+ "[3] Opciones Recomendaciones\n"
				+ "[4] Opciones de Categorias\n"
				+ "[5] Opciones de Peliculas y Series\n"
				+ "[6] Opciones para Subtitulos");
		
		
	}
	public static void selectMovieSerie() {
		System.out.println("\n"
				+ "Selecciona Opciones de Series o Peliculas\n"
				+ "[1] Opciones Series\n"
				+ "[2] Opciones Peliculas\n");
		
	}
}
