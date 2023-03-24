package es.iesjandula.plataforma_streaming_equipo1.IMenus;

public interface IMenuDirectors 
{
	public static void directorMenu() 
	{
		//Menu text display
		System.out.println("\n"
				+ "Directors Menu:\n"
				+ "[1] Add a director\n"
				+ "[2] Search a director\n"
				+ "[3] Modify a director\n"
				+ "[4] Delete a director");
		
	}
}
