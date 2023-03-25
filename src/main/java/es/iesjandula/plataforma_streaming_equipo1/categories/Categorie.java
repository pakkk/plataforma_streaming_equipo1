package es.iesjandula.plataforma_streaming_equipo1.categories;
/*
 * Class Categories
 * Stores the categories
 */

public class Categorie 
{

	/** Attribute - Type */
	private CategorieTypes type;
	
	/** Attribute - acategorie ID */
	private int categorieID;
	
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
	public Categorie(CategorieTypes type,int categorieID) 
	{	
		this.type=type;
		this.categorieID=categorieID;
		validateCategorieType(this.type);
	}
	
	/* ToString method , for print the Category (object)*/
	
	@Override
	public String toString() {
		return "Categorie type:" + this.type + "\n"
		+ "Category ID: " + this.categorieID + "\n"
		+ "Category name: " + this.name + "\n"
		+ "Category description: "+this.description + "\n"
		+ "Min Age: " + this.minAge + "\n";
	}
	
	
	/* SETTERS AND GETTERS */

	/**
	 * @return the type
	 */
	public CategorieTypes getType() 
	{
		return this.type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(CategorieTypes type) 
	{
		this.type = type;
	}

	/**
	 * @return the categorieID
	 */
	public int getCategorieID() 
	{
		return this.categorieID;
	}

	/**
	 * @param categorieID the categorieID to set
	 */
	public void setCategorieID(int categorieID) 
	{
		this.categorieID = categorieID;
	}

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() 
	{
		return this.description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) 
	{
		this.description = description;
	}

	/**
	 * @return the minAge
	 */
	public int getMinAge() 
	{
		return this.minAge;
	}

	/**
	 * @param minAge the minAge to set
	 */
	public void setMinAge(int minAge) 
	{
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
			{	
				//Default attributes
				this.minAge=7;
				this.name="COMEDIA";
				this.description="La categoria de comedia esta dedicada a mayores de 7"
						+ " , momentos de grandes risas te esperan";
			}
			/* ACCION */
			else if(type.equals(CategorieTypes.ACCION))
			{	
				//Default attributes
				this.minAge=16;
				this.name="ACCION";
				this.description="La categoria de comedia esta dedicada a mayores de 16,"
						+ " , momentos de accion intensa te esperan en esta categoria";
			}
			/* TERROR */
			else if(type.equals(CategorieTypes.TERROR))
			{	
				//Default attributes
				this.minAge=18;
				this.name="TERROR";	
				this.description="La categoria de terror esta dedicada a mayores de 18"
						+ " , momentos de terror intenso te esperan con esta categoria";
			}
			/* SUSPENSE */
			else if(type.equals(CategorieTypes.SUSPENSE))
			{	
				//Default attributes
				this.minAge=12;
				this.name="SUSPENSE";	
				this.description="La categoria de suspense esta dedicada a mayores de 12"
						+ " , momentos de tension , suspense y muchos dramas intensos te esperan";
			}
			/* INFANTIL */
			else if(type.equals(CategorieTypes.INFANTIL))
			{	
				//Default attributes 
				this.minAge=0;
				this.name="INFANTIL";	
				this.description="La categoria de infantil esta dedicada a todo tipo de publico"
						+ " , momentos de aprendijaze , grandes amistades y amigos divertidos"
						+ "te esperan con esta categoria";
				
			}
			else 
			{	
				//Default attributes
				this.minAge=0;//Default to 0
				this.name="Otro";
				this.description="Falta Descripcion";
			}
		}
}
