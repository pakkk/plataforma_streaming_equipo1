package es.iesjandula.plataforma_streaming_equipo1.directors;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;

public interface DirectorOptions 
{	
	public static void clearScreen() 
	{	
		//Method for clear the screen
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
	public static Directors[] createDirector(Scanner scanner,Scanner scanner2,Directors[] arrayDirectorsGeneral,int directorIdCont) 
	{
		//--CREATE NEW DIRECTOR------
		//--Director name
		System.out.println("Tell me the name of the director");
		String name=scanner2.nextLine();
		clearScreen();
		//Director Last name
		System.out.println("Tell me the last name of the director");
		String lastName=scanner2.nextLine();
		clearScreen();
		//Director Nationality
		System.out.println("Tell me the nationality of the director");
		String nationality=scanner2.nextLine();
		clearScreen();
		//Director Gender
		System.out.println("Select the gender of the director: \n"
				+ "[1] Man \n"
				+ "[2] Woman \n"
				+ "[3] Other \n");
		int gender = scanner.nextInt();
		clearScreen();
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
		//Director year
		System.out.println("Tell me the year of birth of the director:");
		int year=scanner.nextInt();
		clearScreen();
		
		//ADD the new director to general directors array.
		arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length+1);
		arrayDirectorsGeneral[arrayDirectorsGeneral.length-1]=new Directors(name, lastName, year, nationality, x,directorIdCont++);
		System.out.println(arrayDirectorsGeneral[arrayDirectorsGeneral.length-1]);
		
		return arrayDirectorsGeneral;
		//--CREATE NEW DIRECTOR------
	}
	
	public static void searchDirector(Scanner scanner,Scanner scanner2,Directors[] arrayDirectorsGeneral) 
	{

		//-----SEARCH-DIRECTOR-----
		clearScreen();
		System.out.println("Select the search method: \n"
				+ "[1] Name \n"
				+ "[2] Last Name \n"
				+ "[3] Year of birth \n"
				+ "[4] Nationality \n"
				+ "[5] Gender \n");
		int selection1 = scanner.nextInt();
		clearScreen();
		if (selection1==1) 
		{	//Search director by name
			System.out.println("Indicate the name \n");
			String name=scanner2.nextLine();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral) 
			{
				if (director.getName().equals(name)) 
				{
					System.out.println(director);
				}
			}
		}
		else if (selection1==2) 
		{//Search director by last name / surname
			System.out.println("Indicate the Surname \n");
			String lastName=scanner2.nextLine();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral) 
			{
				if (director.getLastName().equals(lastName)) 
				{
					System.out.println(director);
				}
			}
		}
		else if (selection1==3) 
		{
			//Search director by year of birth
			System.out.println("Indicates the year of birth \n");
			int year=scanner.nextInt();
			clearScreen();
			System.out.println("Results: \n");
			for (Directors director:arrayDirectorsGeneral) 
			{
				if (director.getYear()==year) 
				{
					System.out.println(director);
				}
			}
		}
		else if (selection1==4) 
		{
			//Search director by nationality
			System.out.println("Indicate the nationality \n");
			String nationality=scanner2.nextLine();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral)
			{
				if (director.getNationality().equals(nationality)) 
				{
					System.out.println(director);
				}
			}
		}
		else 
		{
			//Search director by gender
			System.out.println("Indicate the gender \n"
					+ "[1] Man \n"
					+ "[2] Woman \n"
					+ "[3] Other \n");
			int gender = scanner.nextInt();
			clearScreen();
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
			for (Directors director:arrayDirectorsGeneral)
			{
				if (director.getGender().equals(x)) 
				{
					System.out.println(director);
				}
			}
		}
	}
	
	public static Directors[] modifyDirectors(Scanner scanner,Scanner scanner2,Directors[] arrayDirectorsGeneral) 
	{

		//------MODIFY DIRECTOR---------
		clearScreen();
		System.out.println("Select search method to modify the director: \n"
				+ "[1] Name \n"
				+ "[2] Last Name \n"
				+ "[3] Year of birth \n"
				+ "[4] Nationality \n"
				+ "[5] Gender \n");
		int selection1 = scanner.nextInt();
		clearScreen();
		if (selection1==1) 
		{
			//Modify director by name
			System.out.println("Indicate the name \n");
			String name=scanner2.nextLine();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral) 
			{
				if (director.getName().equals(name)) 
				{
					System.out.println("Found: ");
					System.out.println(director);
					System.out.println("Select which data you want to change from the director: \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Gender \n");
					int selection2 = scanner.nextInt();
					clearScreen();
					if (selection2==1) 
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						clearScreen();
						director.setName(name1);
					}
					else if (selection2==2) 
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						clearScreen();
						director.setLastName(lastName1);
					}
					else if (selection2==3)
					{
						System.out.println("Tell me the year of birth ");
						int year=scanner.nextInt();
						clearScreen(); 
						director.setYear(year);
					}
					else if (selection2==4) 
					{
						System.out.println("Tell me the nationality ");
						String nationality=scanner2.nextLine(); 
						clearScreen();
						director.setNationality(nationality);
					}
					else 
					{
						System.out.println("Indicate the gender \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender = scanner.nextInt();
						clearScreen();
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
						director.setGender(x);
					}
				}
			}
		}
		else if (selection1==2)
		{
			//Modify director by last name
			System.out.println("Indicate the last name \n");
			String lastName=scanner2.nextLine();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral) 
			{
				if (director.getLastName().equals(lastName)) 
				{
					System.out.println("Found: ");
					System.out.println(director);
					System.out.println("Select which data you want to change from the director: \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Gender \n");
					int selection2 = scanner.nextInt();
					clearScreen();
					if (selection2==1) 
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						clearScreen();
						director.setName(name1);
					}
					else if (selection2==2)
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						clearScreen();
						director.setLastName(lastName1);
					}
					else if (selection2==3) 
					{
						System.out.println("Tell me the year of birth: ");
						int year=scanner.nextInt(); 
						clearScreen();
						director.setYear(year);
					}
					else if (selection2==4) 
					{
						System.out.println("Tell me the nationality ");
						String nationality=scanner2.nextLine(); 
						clearScreen();
						director.setNationality(nationality);
					}
					else 
					{
						System.out.println("Indicate the gender \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender = scanner.nextInt();
						clearScreen();
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
						director.setGender(x);
					}
				}
			}
		}
		else if (selection1==3) 
		{
			//Modify director by year of birth
			System.out.println("Indicate the year of birth \n");
			int nacimiento=scanner.nextInt();
			clearScreen();
			//d
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral)
			{
				if (director.getYear()==nacimiento) 
				{
					System.out.println("Found: ");
					System.out.println(director);
					System.out.println("Select which data you want to change from the director: \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Genero \n");
					int selection2 = scanner.nextInt();
					clearScreen();
					if (selection2==1)
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						clearScreen();
						director.setName(name1);
					}
					else if (selection2==2)
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						clearScreen();
						director.setLastName(lastName1);
					}
					else if (selection2==3) 
					{
						System.out.println("Tell me the year of birth: ");
						int year=scanner.nextInt();
						clearScreen(); 
						director.setYear(year);
					}
					else if (selection2==4) 
					{
						System.out.println("Tell me the nationality: ");
						String nationality=scanner2.nextLine(); 
						clearScreen();
						director.setNationality(nationality);
					}
					else
					{
						System.out.println("Indicate the gender \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender = scanner.nextInt();
						clearScreen();
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
						director.setGender(x);
					}
				}
			}
		}
		else if (selection1==4) 
		{
			//Modify director by nationality
			System.out.println("Indicate the nationality \n");
			String nacionalidad=scanner2.nextLine();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral)
			{
				if (director.getNationality().equals(nacionalidad))
				{
					System.out.println("Found: ");
					System.out.println(director);
					System.out.println("Select which data you want to change from the director: \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Gender \n");
					int selection2 = scanner.nextInt();
					clearScreen();
					if (selection2==1) 
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						clearScreen();
						director.setName(name1);
					}
					else if (selection2==2) 
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						clearScreen();
						director.setLastName(lastName1);
					}
					else if (selection2==3) 
					{
						System.out.println("Tell me the year of birth: ");
						int year=scanner.nextInt(); 
						clearScreen();
						director.setYear(year);
					}
					else if (selection2==4)
					{
						System.out.println("Tell me the nationality: ");
						String nationality=scanner2.nextLine();
						clearScreen(); 
						director.setNationality(nationality);
					}
					else 
					{
						System.out.println("Tell me the gender: \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender = scanner.nextInt();
						clearScreen();
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
						director.setGender(x);
					}
				}
			}
		}
		else
		{
			//Modify director by gender
			System.out.println("Indicate the gender \n"
					+ "[1] Man \n"
					+ "[2] Woman \n"
					+ "[3] Other \n");
			int gender = scanner.nextInt();
			clearScreen();
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
			for (Directors director:arrayDirectorsGeneral)
			{
				if (director.getGender().equals(x))
				{
					System.out.println("Found: ");
					System.out.println(director);
					System.out.println("Select which data you want to change from the director: \n"
							+ "[1] Name \n"
							+ "[2] Last Name \n"
							+ "[3] Year of birth \n"
							+ "[4] Nationality \n"
							+ "[5] Gender \n");
					int selection2 = scanner.nextInt();
					clearScreen();
					if (selection2==1) 
					{
						System.out.println("Tell me the name: ");
						String name1=scanner2.nextLine(); 
						clearScreen();
						director.setName(name1);
					}
					else if (selection2==2) 
					{
						System.out.println("Tell me the last name: ");
						String lastName1=scanner2.nextLine(); 
						clearScreen();
						director.setLastName(lastName1);
					}
					else if (selection2==3) 
					{
						System.out.println("Tell me the year of birth: ");
						int year=scanner.nextInt(); 
						clearScreen();
						director.setYear(year);
					}
					else if (selection2==4) 
					{
						System.out.println("Tell me the nationality: ");
						String nationality=scanner2.nextLine(); 
						clearScreen();
						director.setNationality(nationality);
					}
					else 
					{
						System.out.println("Indicate the gender \n"
								+ "[1] Man \n"
								+ "[2] Woman \n"
								+ "[3] Other \n");
						int gender1 = scanner.nextInt();
						clearScreen();
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
						director.setGender(x1);
					}
				}
			}
		}
		return arrayDirectorsGeneral;
	}
	
	public static Directors[] deleteDirector(Scanner scanner,Scanner scanner2,Directors[] arrayDirectorsGeneral)
	{

		//----DELTE-DIRECTOR------
		int cont=0;
		System.out.println("Select the search method to delete: \n"
				+ "[1] Name \n"
				+ "[2] Last Name \n"
				+ "[3] Year of birth \n"
				+ "[4] Nationality \n"
				+ "[5] Gender \n");
		int selection1 = scanner.nextInt();
		clearScreen();
		if (selection1==1) 
		{	
			//Delete director by name
			System.out.println("Indicate the name: \n");
			String name=scanner2.nextLine();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral) 
			{
				if (director.getName().equals(name)) 
				{
					System.out.println(director);
					System.out.println("Position "+cont);
					
					for(int i=0;i<arrayDirectorsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
						}
						
					}
					
					arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayDirectorsGeneral));
			cont=0;
		}
		else if (selection1==2)
		{
			//Delete director by last name
			System.out.println("Indicate the last name: \n");
			String lastName=scanner2.nextLine();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral) 
			{
				if (director.getLastName().equals(lastName)) 
				{
					System.out.println(director);
					System.out.println("Position "+cont);
					
					for(int i=0;i<arrayDirectorsGeneral.length;i++) 
					{
						if(cont==i)
						{
							arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
						}
						
					}
					
					arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayDirectorsGeneral));
			cont=0;
		}
		else if (selection1==3) 
		{
			//Delete director by year of birth
			System.out.println("Indicate the year of birth \n");
			int year=scanner.nextInt();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral) 
			{
				if (director.getYear()==year) 
				{
					System.out.println(director);
					System.out.println("Position "+cont);
					
					for(int i=0;i<arrayDirectorsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
						}
						
					}
					
					arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayDirectorsGeneral));
			cont=0;
		}
		else if (selection1==4) 
		{
			//Delete director by nationality
			System.out.println("Indicate the nationality: \n");
			String nationality=scanner2.nextLine();
			clearScreen();
			System.out.println("Results : \n");
			for (Directors director:arrayDirectorsGeneral)
			{
				if (director.getNationality().equals(nationality)) 
				{
					System.out.println(director);
					System.out.println("Position "+cont);
					
					for(int i=0;i<arrayDirectorsGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
						}
						
					}
					
					arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayDirectorsGeneral));
			cont=0;
		}
		else
		{	
			//Delete director by gender
			System.out.println("Indicate the gender \n"
					+ "[1] Man \n"
					+ "[2] Woman \n"
					+ "[3] Other \n");
			int gender = scanner.nextInt();
			clearScreen();
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
			for (Directors director:arrayDirectorsGeneral)
			{
				if (director.getGender().equals(x)) 
				{
					System.out.println(director);
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayDirectorsGeneral.length;i++)
					{
						if(cont==i) 
						{
							arrayDirectorsGeneral[i]=arrayDirectorsGeneral[arrayDirectorsGeneral.length-1];
						}
						
					}
					
					arrayDirectorsGeneral=Arrays.copyOf(arrayDirectorsGeneral, arrayDirectorsGeneral.length-1);
				}
				cont+=1;
			}
			System.out.println(Arrays.toString(arrayDirectorsGeneral));
			cont=0;
		}
		return arrayDirectorsGeneral;
	}
}
