package es.iesjandula.plataforma_streaming_equipo1.IMenus;
/**
*
* @author ???
*/
public interface IGeneralsMenu 
{
	public static void generalMenu() 
	{
		/**
		*this menu is the general
		* 
		*/
		System.out.println("\n"
				+ "General menu for the streaming platform:\n"
				+ "[1] Options\n"
				+ "[2] Statistics and information\n"
				+ "[3] View Movies and series\n"
				+ "[Other] Exit...");
		
	}
	public static void optionsGeneralMenu() 
	{
		/**
		*This menu is used to scroll through the different menus
		* 
		*/
		System.out.println("\n"
				+ "Options menu (Selection):\n"
				+ "[1] Director Options\n"
				+ "[2] Actor Options\n"
				+ "[3] Recomendation Options\n"
				+ "[4] Categorie Options\n"
				+ "[5] Options of movies and series\n"
				+ "[6] Options for subtitles");
		
		
	}
	public static void selectMovieSerie() 
	{
		/**
		*This menu is used to choose between a series or a movie
		* 
		*/
		System.out.println("\n"
				+ "Select options of movies or series\n"
				+ "[1] Serie options\n"
				+ "[2] Movie options\n");
		
	}
}
