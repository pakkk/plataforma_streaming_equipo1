package es.iesjandula.plataforma_streaming_equipo1.IMenus;

public interface IMenuMovies 
{
	public static void moviesMenu() 
	{
		//Menu text display
		System.out.println("\n"
				+ "Menu Peliculas:\n"
				+ "[1] Dar de alta una Pelicula\n"
				+ "[2] Buscar una Pelicula\n"
				+ "[3] Modificar una Pelicula\n"
				+ "[4] Borrar una Pelicula");
	}
}
