package es.iesjandula.plataforma_streaming_equipo1.actors;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;
import es.iesjandula.plataforma_streaming_equipo1.utilities.ScreenUtilities;

/**
 * 
 * @author LuisDavidCastillo
 *
 */
public interface ActorOptions 
{
	/**
	 * 
	 * @param scanner
	 * @param scanner2
	 * @param arrayActorsGeneral
	 * @param actorIdCont
	 * @return
	 */
	public static Actors[] createActor(Scanner scanner,Scanner scanner2,Actors[] arrayActorsGeneral,int actorIdCont) 
	{
		//-----CREATE-ACTOR-----
		System.out.println("Tell me the name of actors");
		String name=scanner2.next();
		ScreenUtilities.clearScreen();
		System.out.println("Tell me the last name of actors");
		String lastName=scanner2.nextLine();
		ScreenUtilities.clearScreen();
		System.out.println("Tell me the nationality of actors");
		String nationality=scanner2.nextLine();
		ScreenUtilities.clearScreen();
		System.out.println("Select the gender of actors: \n"
				+ "[1] Man \n"
				+ "[2] Woman \n"
				+ "[3] Other \n");
		int gender = scanner.nextInt();
		ScreenUtilities.clearScreen();
		Genders x=Genders.OTHER;
		if (gender==1)
		{
			x=Genders.MAN;
		}
		else if (gender==2)
		{
			x=Genders.WOMAN;
		}
		else 
		{
			x=Genders.OTHER;
		}
		System.out.println("Tell me the year of birth of actors");
		int year=scanner.nextInt();
		ScreenUtilities.clearScreen();
		
		arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length+1);
		arrayActorsGeneral[arrayActorsGeneral.length-1]=new Actors(name, lastName, nationality, x, year,actorIdCont++);
		System.out.println(arrayActorsGeneral[arrayActorsGeneral.length-1]);
		
		return arrayActorsGeneral;
	}
	
	public static void searchActor(Scanner scanner,Scanner scanner2,Actors[] arrayActorsGeneral) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Select the search method: \n"
				+ "[1] Name \n"
				+ "[2] LastName \n"
				+ "[3] Year of birth \n"
				+ "[4] Nationality \n"
				+ "[5] Gender \n");
		int selection1 = scanner.nextInt();
		ScreenUtilities.clearScreen();
		if (selection1==1) 
		{
			//Search Actor by name
			System.out.println("Indicate the name \n");
			String name=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results : \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getName().equals(name)) 
				{
					System.out.println(actor);
				}
			}
		}
		else if (selection1==2) 
		{
			//Search Actor by last name
			System.out.println("Indicate the last name: \n");
			String lastName=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results : \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getLastName().equals(lastName)) 
				{
					System.out.println(actor);
				}
			}
		}
		else if (selection1==3) 
		{
			//Search Actor by year of birth
			System.out.println("Indicate the year of birth: \n");
			int year=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Actors actor:arrayActorsGeneral)
			{
				if (actor.getYear()==year) 
				{
					System.out.println(actor);
				}
			}
		}
		else if (selection1==4) 
		{
			//Search Actor by nationality
			System.out.println("Indicate the nationality \n");
			String nationality=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results : \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getNationality().equals(nationality)) 
				{
					System.out.println(actor);
				}
			}
		}
		else 
		{
			//Search Actor by gender
			System.out.println("Indicate the gender \n"
					+ "[1] Man \n"
					+ "[2] Woman \n"
					+ "[3] Other \n");
			int gender = scanner.nextInt();
			ScreenUtilities.clearScreen();
			Genders x=Genders.OTHER;
			if (gender==1) 
			{
				x=Genders.MAN;
			}
			else if (gender==2)
			{
				x=Genders.WOMAN;
			}
			else 
			{
				x=Genders.OTHER;
			}
			System.out.println("Found : \n");
			for (Actors actor:arrayActorsGeneral)
			{
				if (actor.getGender().equals(x)) 
				{
					System.out.println(actor);
				}
			}
		}
	}
	/**
	 * 
	 * @param scanner
	 * @param scanner2
	 * @param arrayActorsGeneral
	 * @return
	 */
	public static Actors[] modifyActor(Scanner scanner,Scanner scanner2,Actors[] arrayActorsGeneral) 
	{
		//-----MODIFY----ACTOR
		ScreenUtilities.clearScreen();
		System.out.println("Select search method to modify the actor: \n"
				+ "[1] Name \n"
				+ "[2] Last Name \n"
				+ "[3] Year of birth \n"
				+ "[4] Nationality \n"
				+ "[5] Gender \n");
		int selection1 = scanner.nextInt();
		ScreenUtilities.clearScreen();
		if (selection1==1) 
		{
			//Modify Actor by name
			System.out.println("Indicate the name: \n");
			String name=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getName().equals(name))
				{
					System.out.println("Found: ");
					System.out.println(actor);
					System.out.println("Select which data you want to change from the actor: \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Gender \n");
					int selection2 = scanner.nextInt();
					ScreenUtilities.clearScreen();
					if (selection2==1)
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setName(name1);
					}
					else if (selection2==2) 
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setLastName(lastName1);
					}
					else if (selection2==3) 
					{
						System.out.println("Tell me the year of birth: ");
						int year=scanner.nextInt();
						ScreenUtilities.clearScreen(); 
						actor.setYear(year);
					}
					else if (selection2==4) 
					{
						System.out.println("Tell me the nationality: ");
						String nationality=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setNationality(nationality);
					}
					else 
					{
						System.out.println("Indicate the gender: \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender = scanner.nextInt();
						ScreenUtilities.clearScreen();
						Genders x=Genders.OTHER;
						if (gender==1)
						{
							x=Genders.MAN;
						}
						else if (gender==2)
						{
							x=Genders.WOMAN;
						}
						else
						{
							x=Genders.OTHER;
						}
						actor.setGender(x);
					}
				}
			}
		}
		else if (selection1==2) 
		{
			//Modify Actor by last name
			System.out.println("Indicate the last name: \n");
			String lastName=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results : \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getLastName().equals(lastName)) 
				{
					System.out.println("Found: ");
					System.out.println(actor);
					System.out.println("Select what data you want to change from the actor: \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Gender \n");
					int selection2 = scanner.nextInt();
					ScreenUtilities.clearScreen();
					if (selection2==1)
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setName(name1);
					}
					else if (selection2==2)
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setLastName(lastName1);
					}
					else if (selection2==3) 
					{
						System.out.println("Tell me the year of birth: ");
						int year=scanner.nextInt(); 
						ScreenUtilities.clearScreen();
						actor.setYear(year);
					}
					else if (selection2==4) 
					{
						System.out.println("Tell me the nationality ");
						String nationality=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setNationality(nationality);
					}
					else 
					{
						System.out.println("Indicate the gender \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender = scanner.nextInt();
						ScreenUtilities.clearScreen();
						Genders x=Genders.OTHER;
						if (gender==1) 
						{
							x=Genders.MAN;
						}
						else if (gender==2)
						{
							x=Genders.WOMAN;
						}
						else 
						{
							x=Genders.OTHER;
						}
						actor.setGender(x);
					}
				}
			}
		}
		else if (selection1==3) 
		{
			//Modify Actor by year of birth
			System.out.println("Tell me the year of birth \n");
			int yearBirth=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results : \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getYear()==yearBirth) 
				{
					System.out.println("Found: ");
					System.out.println(actor);
					System.out.println("Select what data you want to change from the actor: \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Gender \n");
					int selection2 = scanner.nextInt();
					ScreenUtilities.clearScreen();
					if (selection2==1) 
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setName(name1);
					}
					else if (selection2==2) 
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setLastName(lastName1);
					}
					else if (selection2==3)
					{
						System.out.println("Tell me the year of birth: ");
						int year=scanner.nextInt();
						ScreenUtilities.clearScreen(); 
						actor.setYear(year);
					}
					else if (selection2==4) 
					{
						System.out.println("Tell me the nationality: ");
						String nationality=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setNationality(nationality);
					}
					else 
					{
						System.out.println("Indicate the gender \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender = scanner.nextInt();
						ScreenUtilities.clearScreen();
						Genders x=Genders.OTHER;
						if (gender==1) 
						{
							x=Genders.MAN;
						}
						else if (gender==2)
						{
							x=Genders.WOMAN;
						}
						else 
						{
							x=Genders.OTHER;
						}
						actor.setGender(x);
					}
				}
			}
		}
		else if (selection1==4) 
		{
			//Modify Actor by nationality
			System.out.println("Indicate the nationality \n");
			String nationality=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getNationality().equals(nationality))
				{
					System.out.println("Found: ");
					System.out.println(actor);
					System.out.println("Select what data you want to change from the actor: \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Gender \n");
					int selection2 = scanner.nextInt();
					ScreenUtilities.clearScreen();
					if (selection2==1) 
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setName(name1);
					}
					else if (selection2==2) 
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setLastName(lastName1);
					}
					else if (selection2==3)
					{
						System.out.println("Tell me the year of birth: ");
						int year=scanner.nextInt(); 
						ScreenUtilities.clearScreen();
						actor.setYear(year);
					}
					else if (selection2==4) 
					{
						System.out.println("Tell me the nationality ");
						String nationality1=scanner2.nextLine();
						ScreenUtilities.clearScreen(); 
						actor.setNationality(nationality1);
					}
					else 
					{
						System.out.println("Indicate the gender \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender = scanner.nextInt();
						ScreenUtilities.clearScreen();
						Genders x=Genders.OTHER;
						if (gender==1)
						{
							x=Genders.MAN;
						}
						else if (gender==2)
						{
							x=Genders.WOMAN;
						}
						else 
						{
							x=Genders.OTHER;
						}
						actor.setGender(x);
					}
				}
			}
		}
		else 
		{
			//Modify Actor by gender
			System.out.println("Indicate the gender \n"
					+ "[1] Man \n"
					+ "[2] Woman \n"
					+ "[3] Other \n");
			int gender = scanner.nextInt();
			ScreenUtilities.clearScreen();
			Genders x=Genders.OTHER;
			if (gender==1) 
			{
				x=Genders.MAN;
			}
			else if (gender==2)
			{
				x=Genders.WOMAN;
			}
			else 
			{
				x=Genders.OTHER;
			}
			System.out.println("Results : \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getGender().equals(x)) 
				{
					System.out.println("Found: ");
					System.out.println(actor);
					System.out.println("Select what data you want to change from the actor : \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Gender \n");
					int selection2 = scanner.nextInt();
					ScreenUtilities.clearScreen();
					if (selection2==1) 
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setName(name1);
					}
					else if (selection2==2) 
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setLastName(lastName1);
					}
					else if (selection2==3) 
					{
						System.out.println("Tell me the year of birth: ");
						int year=scanner.nextInt(); 
						ScreenUtilities.clearScreen();
						actor.setYear(year);
					}
					else if (selection2==4) 
					{
						System.out.println("Tell me the year of birth ");
						String nationality=scanner2.nextLine(); 
						ScreenUtilities.clearScreen();
						actor.setNationality(nationality);
					}
					else 
					{
						System.out.println("Indicate the gender \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender1 = scanner.nextInt();
						ScreenUtilities.clearScreen();
						Genders x1=Genders.OTHER;
						if (gender1==1) 
						{
							x1=Genders.MAN;
						}
						else if (gender1==2)
						{
							x1=Genders.WOMAN;
						}
						else 
						{
							x1=Genders.OTHER;
						}
						actor.setGender(x1);
					}
				}
			}
		}
		return arrayActorsGeneral;
	}
	/**
	 * 
	 * @param scanner
	 * @param scanner2
	 * @param arrayActorsGeneral
	 * @return
	 */
	public static Actors[] deleteActor(Scanner scanner,Scanner scanner2,Actors[] arrayActorsGeneral) 
	{

		//-----DELETE---ACTOR-----
		int cont=0;
		System.out.println("Select the search method to delete: \n"
				+ "[1] Name \n"
				+ "[2] Last Name \n"
				+ "[3] Year of birth \n"
				+ "[4] Nationality \n"
				+ "[5] Genero \n");
		int selection1 = scanner.nextInt();
		ScreenUtilities.clearScreen();
		if (selection1==1)
		{
			//Delete Actor by name
			System.out.println("Indicate the name: \n");
			String name=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getName().equals(name))
				{
					System.out.println(actor);
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayActorsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
						}
						
					}
					
					arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayActorsGeneral));
			cont=0;
		}
		else if (selection1==2) 
		{
			//Delete Actor by last name
			System.out.println("Indicate the last name: \n");
			String lastName=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getLastName().equals(lastName)) 
				{
					System.out.println(actor);
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayActorsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
						}
						
					}
					arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayActorsGeneral));
			cont=0;
		}
		else if (selection1==3)
		{
			//Delete Actor by year of birth
			System.out.println("Indicate the year of birth: \n");
			int year=scanner.nextInt();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Actors actor:arrayActorsGeneral)
			{
				if (actor.getYear()==year) {
					System.out.println(actor);
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayActorsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
						}
						
					}
					
					arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayActorsGeneral));
			cont=0;
		}
		else if (selection1==4) 
		{
			//Delete Actor by Nationality
			System.out.println("Indicate the Nationality \n");
			String nationalityToDelete=scanner2.nextLine();
			ScreenUtilities.clearScreen();
			System.out.println("Results: \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getNationality().equals(nationalityToDelete)) 
				{
					System.out.println(actor);
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayActorsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
						}
						
					}
					
					arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayActorsGeneral));
			cont=0;
		}
		else 
		{
			//Delete Actor by gender
			System.out.println("Indicate the gender \n"
					+ "[1] Man \n"
					+ "[2] Woman \n"
					+ "[3] Other \n");
			int gender = scanner.nextInt();
			ScreenUtilities.clearScreen();
			Genders x=Genders.OTHER;
			if (gender==1) 
			{
				x=Genders.MAN;
			}
			else if (gender==2)
			{
				x=Genders.WOMAN;
			}
			else 
			{
				x=Genders.OTHER;
			}
			System.out.println("Results: \n");
			for (Actors actor:arrayActorsGeneral) 
			{
				if (actor.getGender().equals(x)) 
				{
					System.out.println(actor);
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayActorsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayActorsGeneral[i]=arrayActorsGeneral[arrayActorsGeneral.length-1];
						}
					}
					
					arrayActorsGeneral=Arrays.copyOf(arrayActorsGeneral, arrayActorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayActorsGeneral));
			cont=0;
		}
		//-----DELETE---ACTOR-----
		return arrayActorsGeneral;
	}
}
