package es.iesjandula.plataforma_streaming_equipo1.categories;

/**
 * 
 * @author David Martinez
 * Class Categories
 * Stores the categories
 */


public class Categorie 
{

	/** Attribute - Type */
	private CategorieTypes type;
	
	/** Attribute - categorieID */
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
	
	/**
	 * ToString method , for print the Category (object)
	 * */
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
	
	/**
	 * 
	 * @param type with the type of CategorieTypes
	 */
	public void validateCategorieType(CategorieTypes type) 
	//Validate the type of categorie enum type , and set the default attributes.
	{
		/* Every description and min age on every Type */
		
		/* COMEDY */
		if(type.equals(CategorieTypes.COMEDY))
		{	
			//Default attributes
			this.minAge=7;
			this.name="COMEDY";
			this.description="\n"
			+ "The comedy category is dedicated to people over 7"
			+ ", moments of great laughter await you";
		}
		
		/* ACTION */
		else if(type.equals(CategorieTypes.ACTION))
		{	
			//Default attributes
			this.minAge=16;
			this.name="ACTION";
			this.description="The comedy category is dedicated to people over 16"
			+ " ,moments of intense action await you in this category";
		}
		
		/* TERROR */
		else if(type.equals(CategorieTypes.TERROR))
		{	
			//Default attributes
			this.minAge=18;
			this.name="TERROR";	
			this.description="The horror category is dedicated to people over 18"
			+ ", moments of intense terror await you with this category ";
		}
		
		/* SUSPENSE */
		else if(type.equals(CategorieTypes.SUSPENSE))
		{	
			//Default attributes
			this.minAge=12;
			this.name="SUSPENSE";	
			this.description="The suspense category is dedicated to people over 12"
			+ " , moments of tension , suspense and many intense dramas await you";
		}
		
		/* CHILDISH */
		else if(type.equals(CategorieTypes.CHILDISH))
		{	
			//Default attributes 
			this.minAge=0;
			this.name="CHILDISH";	
			this.description= "The children's category is dedicated to all types of public"
			+ ", learning moments, great friendships and fun friends"
			+ "they wait for you with this category";
			
		}
		
		else 
		{	
			//Default attributes
			this.minAge=0;//Default to 0
			this.name="Other";
			this.description="Missing Description";
		}
	}
}
