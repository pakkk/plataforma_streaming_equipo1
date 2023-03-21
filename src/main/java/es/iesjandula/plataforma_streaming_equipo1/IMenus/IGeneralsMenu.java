package es.iesjandula.plataforma_streaming_equipo1.IMenus;

public interface IGeneralsMenu {
	public static void generalMenu() {
		System.out.println("\n"
				+ "Menu General de plataforma streaming:\n"
				+ "[1] Opciones de Peliculas\n"
				+ "[2] Opciones un Series\n");
		
	}
	public static void generalMenuSelection() {
		System.out.println("\n"
				+ "Menu de Opciones (Seleccion):\n"
				+ "[1] Opciones Directores\n"
				+ "[2] Opciones Actores\n"
				+ "[3] Opciones Recomendaciones");
		
	}
}
