package es.iesjandula.plataforma_streaming_equipo1.categories;
/*
 * Class Categories
 * Stores the categories
 */

public class Categorie 
{

	/** Attribute - Type */
	private CategorieTypes type;
	
	/** Attribute - name */
	private String name;
	
	/** Attribute - description */
	private String description;
	
	/** Attribute - minAge */
	private int minAge;
	
	/**
	 * Constructor of the class
	 * 
	 * @param type with the CategoriesType(CategoriesTypes)
	 */
	public Categorie(CategorieTypes type) 
	{	
		this.type=type;
		validateCategorieType(this.type);
	}
	
	/* ToString method , for print the Category (object)*/
	
	@Override
	public String toString() 
	{
		return "Nombre : "+name+"\nTipo Categoria: "+type+"\nEdad Minima: "+minAge+"\nDescripcion: "+description;
	}
	
	/* SETTERS AND GETTERS */
	
	public CategorieTypes getType() 
	{
		//Get the type
		return type;
	}

	public void setType(CategorieTypes type) 
	{
		//Set the type
		this.type = type;
	}

	public String getName() 
	{
		//Get the name
		return name;
	}

	public void setName(String name) 
	{
		//Set Name
		this.name = name;
	}

	public String getDescription() 
	{
		//Get description
		return description;
	}

	public void setDescription(String description) 
	{
		//Set description
		this.description = description;
	}

	public int getMinAge() 
	{
		//Get min age
		return minAge;
	}

	public void setMinAge(int minAge) 
	{
		//Set min age
		this.minAge = minAge;
	}
	
	/* SETTERS AND GETTERS */
	
	
	//-----VALIDATION-METHOD-----
		public void validateCategorieType(CategorieTypes type) 
		//Validate the type of categorie enum type , and set the default attributes.
		{
			/* Every description and min age on every Type */
			/* COMEDIA */
			if(type.equals(CategorieTypes.COMEDIA))
			{	//Default attributes
				minAge=7;
				name="COMEDIA";
				description="La categoria de comedia esta dedicada a mayores de 7"
						+ " , momentos de grandes risas te esperan";
			}
			/* ACCION */
			else if(type.equals(CategorieTypes.ACCION))
			{	//Default attributes
				minAge=16;
				name="ACCION";
				description="La categoria de comedia esta dedicada a mayores de 16,"
						+ " , momentos de accion intensa te esperan en esta categoria";
			}
			/* TERROR */
			else if(type.equals(CategorieTypes.TERROR))
			{	//Default attributes
				minAge=18;
				name="TERROR";	
				description="La categoria de terror esta dedicada a mayores de 18"
						+ " , momentos de terror intenso te esperan con esta categoria";
			}
			/* SUSPENSE */
			else if(type.equals(CategorieTypes.SUSPENSE))
			{	//Default attributes
				minAge=12;
				name="SUSPENSE";	
				description="La categoria de suspense esta dedicada a mayores de 12"
						+ " , momentos de tension , suspense y muchos dramas intensos te esperan";
			}
			/* INFANTIL */
			else if(type.equals(CategorieTypes.INFANTIL))
			{	//Default attributes
				minAge=0;
				name="INFANTIL";	
				description="La categoria de infantil esta dedicada a todo tipo de publico"
						+ " , momentos de aprendijaze , grandes amistades y amigos divertidos"
						+ "te esperan con esta categoria";
				
			}else 
			{	//Default attributes
				minAge=0;//Default to 0
				name="Otro";
				description="Falta Descripcion";
			}
		}
}
