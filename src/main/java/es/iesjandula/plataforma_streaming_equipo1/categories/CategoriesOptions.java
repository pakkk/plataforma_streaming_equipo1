package es.iesjandula.plataforma_streaming_equipo1.categories;

import java.util.Arrays;
import java.util.Scanner;

public class CategoriesOptions 
{
	public static void clearScreen() 
	{	
		//Method for clear the screen
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}
	
	public static Categorie[] createCategory(Scanner scanner,Scanner scanner2,Categorie[] arrayCategoriesGeneral,int categorieIdCont) 
	{
		CategorieTypes x= CategorieTypes.OTHER;
		Categorie last =new Categorie(x,categorieIdCont++);
		System.out.println("Write the name of the categorie");
		String nameCategorie=scanner2.nextLine();
		last.setName(nameCategorie);
		clearScreen();
		
		System.out.println("The new categories are considered of type other!\n"
				+ "Remember that the default categories types are:\n"
				+ "COMEDY, ACTION, TERROR, SUSPENSE, CHILDISH or OTHER\n");
		last.setType(CategorieTypes.OTHER);
		System.out.println("Write a basic description for Category "+nameCategorie);
		String description=scanner2.nextLine();
		
		clearScreen();
		last.setDescription(description);
		System.out.println("Introduce minimum age");
		int minAge = scanner.nextInt();
		
		clearScreen();
		last.setMinAge(minAge);
		
		arrayCategoriesGeneral=Arrays.copyOf(arrayCategoriesGeneral, arrayCategoriesGeneral.length+1);
		arrayCategoriesGeneral[arrayCategoriesGeneral.length-1]=last;
		System.out.println(arrayCategoriesGeneral[arrayCategoriesGeneral.length-1]);
		
		return arrayCategoriesGeneral;
	}
	
	public static void searchCategory(Scanner scanner,Scanner scanner2,Categorie[] arrayCategoriesGeneral) 
	{
		clearScreen();
		System.out.println("Select the search method: \n"
				+ "[1] Name \n"
				+ "[2] Type \n"
				+ "[3] Minimum age \n");
		int selection3 = scanner.nextInt();
		clearScreen();
		if (selection3==1) 
		{
			System.out.println("Indicate the name \n");
			String name=scanner2.nextLine();
			clearScreen();
			System.out.println("Results: \n");
			for (Categorie categorie:arrayCategoriesGeneral) 
			{
				if (categorie.getName().equals(name)) 
				{
					System.out.println(categorie);
				}
			}
		}
		else if (selection3==2)
		{
			System.out.println("Indicate the type \n"
					+ "[1] ACTION\n"
					+ "[2] COMEDY\n"
					+ "[3] TERROR\n"
					+ "[4] SUSPENSE\n"
					+ "[5] CHILDISH\n"
					+ "[6] OTHER\n");
			int typeCategorie=scanner.nextInt();
			clearScreen();
			System.out.println("Results: \n");
			CategorieTypes typeOfCategory = CategorieTypes.OTHER;
			if(typeCategorie==1) 
			{
				typeOfCategory=CategorieTypes.ACTION;
			}
			else if(typeCategorie==2) 
			{
				typeOfCategory=CategorieTypes.COMEDY;
			}
			else if(typeCategorie==3) 
			{
				typeOfCategory=CategorieTypes.TERROR;
			} 
			else if(typeCategorie==4) 
			{
				typeOfCategory=CategorieTypes.SUSPENSE;
			} 
			else if(typeCategorie==5) 
			{
				typeOfCategory=CategorieTypes.CHILDISH;
			} 
			else if(typeCategorie==6) 
			{
				typeOfCategory=CategorieTypes.OTHER;
			} 
			
			for (Categorie categorie:arrayCategoriesGeneral) 
			{
				if (categorie.getType().equals(typeOfCategory)) 
				{
					System.out.println(categorie);
				}
			}
		}
		else if (selection3==3) 
		{
			System.out.println("Indicate the minimum age \n");
			int minAge=scanner.nextInt();
			clearScreen();
			System.out.println("Results: \n");
			for (Categorie categorie:arrayCategoriesGeneral) 
			{
				if (categorie.getMinAge()==(minAge)) 
				{
					System.out.println(categorie);
				}
			}
		}
	}
	
	public static Categorie[] modifyCategory(Scanner scanner,Scanner scanner2,Categorie[] arrayCategoriesGeneral) 
	{
		clearScreen();
		System.out.println("Select search method to modify the category: \n"
				+ "[1] Name \n"
				+ "[2] Min age \n"
				+ "[3] Description\n");
		int selection1 = scanner.nextInt();
		clearScreen();
		if (selection1==1)
		{
			System.out.println("Indicate the name \n");
			String name=scanner2.nextLine();
			clearScreen();
			System.out.println("Results: \n");
			for (Categorie categorie:arrayCategoriesGeneral) 
			{
				if (categorie.getName().equals(name)) 
				{
					System.out.println("Results: ");
					System.out.println(categorie);
					System.out.println("Select the data you whant to change: \n"
							+ "[1] Name \n"
							+ "[2] Minimum age \n"
							+ "[3] Description\n");
					int selection4 = scanner.nextInt();
					clearScreen();
					if (selection4==1) 
					{
						System.out.println("Write name ");
						String name1=scanner2.nextLine();
						clearScreen();
						categorie.setName(name1);
					
					}
					else if (selection4==2) 
					{
						System.out.println("Write minimum age: ");
						int year=scanner.nextInt();
						clearScreen();
						categorie.setMinAge(year);
					}
					else
					{
						System.out.println("Write description: ");
						String desc=scanner2.nextLine();
						clearScreen();
						categorie.setDescription(desc);
					}
				}
			}
		}
		else if (selection1==2) 
		{
			System.out.println("Indicate the minimum age \n");
			int ageMin=scanner.nextInt();
			clearScreen();
			System.out.println("Results: \n");
			for (Categorie categorie:arrayCategoriesGeneral)
			{
				if (categorie.getMinAge()==(ageMin)) 
				{
					System.out.println("Found: ");
					System.out.println(categorie);
					System.out.println("Select the data you whant to change: \n"
							+ "[1] Name \n"
							+ "[2] Minimum age \n"
							+ "[3] Description\n");
					int selection4 = scanner.nextInt();
					clearScreen();
					if (selection4==1) 
					{
						System.out.println("Write the name ");
						String name1=scanner2.nextLine();
						clearScreen();
						categorie.setName(name1);
					}
					else if (selection4==2) 
					{
						System.out.println("Write the minimum age: ");
						int year=scanner.nextInt();
						clearScreen();
						categorie.setMinAge(year);
					}
					else
					{
						System.out.println("Write the descripcion: ");
						String desc=scanner2.nextLine();
						clearScreen();
						categorie.setDescription(desc);
					}
					
				}
			}
		}
		else if (selection1==3)
		{
			System.out.println("Indicate the description \n");
			String desc=scanner2.nextLine();
			desc=scanner2.nextLine();
			clearScreen();
			System.out.println("Results: \n");
			for (Categorie categorie:arrayCategoriesGeneral)
			{
				if (categorie.getDescription().equals(desc)) 
				{
					System.out.println("Found: ");
					System.out.println(categorie);
					System.out.println("Select what data you whant to modify: \n"
							+ "[1] Name \n"
							+ "[2] Minimum Age \n"
							+ "[3] Description\n");
					int selection4 = scanner.nextInt();
					clearScreen();
					if (selection4==1) 
					{
						System.out.println("Write the name: ");
						String name1=scanner2.nextLine();
						clearScreen();
						categorie.setName(name1);
					}
					else if (selection4==2) 
					{
						System.out.println("Write minimum age: ");
						int year=scanner.nextInt();
						clearScreen();
						categorie.setMinAge(year);
					}
					else 
					{
						System.out.println("Write description: ");
						String descrip=scanner2.nextLine();
						clearScreen();
						categorie.setDescription(descrip);
					}
					
				}
			}
		}
		return arrayCategoriesGeneral;
	}
	
	
	
	public static Categorie[] deleteCategory(Scanner scanner,Scanner scanner2,Categorie[] arrayCategoriesGeneral) 
	{
		int cont=0;
		System.out.println("Select the search method to delete: \n"
				+ "[1] Name \n"
				+ "[2] Minimum age \n"
				+ "[3] Description\n");
		int selection1 = scanner.nextInt();
		clearScreen();
		if (selection1==1) 
		{
			System.out.println("Indicate the name \n");
			String name=scanner2.nextLine();
			clearScreen();
			System.out.println("Results: \n");
			for (Categorie categorie:arrayCategoriesGeneral) 
			{
				if (categorie.getName().equals(name)) 
				{
					System.out.println(categorie);
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayCategoriesGeneral.length;i++)
					{
						if(cont==i) 
						{
							arrayCategoriesGeneral[i]=arrayCategoriesGeneral[arrayCategoriesGeneral.length-1];
						}

					}
					
					arrayCategoriesGeneral=Arrays.copyOf(arrayCategoriesGeneral, arrayCategoriesGeneral.length-1);
				}
				cont+=1;
			}
			
			cont=0;
		}
		else if (selection1==2) 
		{
			System.out.println("Indicate the minimum age \n");
			int minAge=scanner.nextInt();
			clearScreen();
			System.out.println("Results: \n");
			for (Categorie categorie:arrayCategoriesGeneral) 
			{
				if (categorie.getMinAge()==minAge) 
				{
					System.out.println(categorie);
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayCategoriesGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayCategoriesGeneral[i]=arrayCategoriesGeneral[arrayCategoriesGeneral.length-1];
						}
						
					}
					
					arrayCategoriesGeneral=Arrays.copyOf(arrayCategoriesGeneral, arrayCategoriesGeneral.length-1);
				}
				cont+=1;
			}
		
			cont=0;
		}
		else if (selection1==3) 
		{
			System.out.println("Indicate the description \n");
			String desc=scanner2.nextLine();
			clearScreen();
			System.out.println("Results: \n");
			for (Categorie categorie:arrayCategoriesGeneral) 
			{
				if (categorie.getDescription().equals(desc)) 
				{
					System.out.println(categorie);
					System.out.println("Position: "+cont);
					
					for(int i=0;i<arrayCategoriesGeneral.length;i++) 
					{
						if(cont==i) 
						{
							arrayCategoriesGeneral[i]=arrayCategoriesGeneral[arrayCategoriesGeneral.length-1];
						}
						
					}
					
					arrayCategoriesGeneral=Arrays.copyOf(arrayCategoriesGeneral, arrayCategoriesGeneral.length-1);
				}
				cont+=1;
			}
			
			cont=0;
		}
		return arrayCategoriesGeneral;
	}
}
