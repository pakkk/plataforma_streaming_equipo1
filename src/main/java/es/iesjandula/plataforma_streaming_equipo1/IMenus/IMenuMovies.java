package es.iesjandula.plataforma_streaming_equipo1.IMenus;
/**
*
* @author ???
*/
public interface IMenuMovies 
{
	public static void moviesMenu() 
	{
		/**
		*Menu text display
		* 
		*/
		
		System.out.println("\n"
				+ "Movie Menu:\n"
				+ "[1] Add a movie\n"
				+ "[2] Search a movie\n"
				+ "[3] Modify a movie\n"
				+ "[4] Delete a movie");
	}
}
