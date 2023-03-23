package es.iesjandula.plataforma_streaming_equipo1.categories;
/*
 * Class Categories
 * Stores the categories
 */

public class Categorie {

	/** Attribute - Type */
	protected CategorieTypes type;
	
	/** Attribute - name */
	protected String name;
	
	/** Attribute - description */
	protected String description;
	
	/** Attribute - minAge */
	protected int minAge;
	
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
	public String toString() {
		return "Nombre : "+this.name+"\nTipo Categoria: "+this.type+"\nEdad Minima: "+this.minAge+"\nDescripcion: "+this.description;
	}
	
	/* SETTERS AND GETTERS */
	
	public CategorieTypes getType() {
		//Setter
		return type;
	}

	public void setType(CategorieTypes type) {
		//Setter
		this.type = type;
	}

	public String getName() {
		//Getter
		return name;
	}

	public void setName(String name) {
		//Setter
		this.name = name;
	}

	public String getDescription() {
		//Getter
		return description;
	}

	public void setDescription(String description) {
		//Setter
		this.description = description;
	}

	public int getMinAge() {
		//Getter
		return minAge;
	}

	public void setMinAge(int minAge) {
		//Setter
		this.minAge = minAge;
	}
	
	/* SETTERS AND GETTERS */
	
	
	//-----VALIDATION-METHODS-----
		public void validateCategorieType(CategorieTypes type) 
		//Validate the type of categorie enum type , and set the default attributes.
		{
			/* Every description and min age on every Type */
			/* COMEDIA */
			if(type.equals(CategorieTypes.COMEDIA))
			{	//Default attributes
				this.minAge=7;
				this.name="COMEDIA";
				this.description="La categoria de comedia esta dedicada a mayores de 7"
						+ " , momentos de grandes risas te esperan";
			}
			/* ACCION */
			else if(type.equals(CategorieTypes.ACCION))
			{	//Default attributes
				this.minAge=16;
				this.name="ACCION";
				this.description="La categoria de comedia esta dedicada a mayores de 16,"
						+ " , momentos de accion intensa te esperan en esta categoria";
			}
			/* TERROR */
			else if(type.equals(CategorieTypes.TERROR))
			{	//Default attributes
				this.minAge=18;
				this.name="TERROR";	
				this.description="La categoria de terror esta dedicada a mayores de 18"
						+ " , momentos de terror intenso te esperan con esta categoria";
			}
			/* SUSPENSE */
			else if(type.equals(CategorieTypes.SUSPENSE))
			{	//Default attributes
				this.minAge=12;
				this.name="SUSPENSE";	
				this.description="La categoria de suspense esta dedicada a mayores de 12"
						+ " , momentos de tension , suspense y muchos dramas intensos te esperan";
			}
			/* INFANTIL */
			else if(type.equals(CategorieTypes.INFANTIL))
			{	//Default attributes
				this.minAge=0;
				this.name="INFANTIL";	
				this.description="La categoria de infantil esta dedicada a todo tipo de publico"
						+ " , momentos de aprendijaze , grandes amistades y amigos divertidos"
						+ "te esperan con esta categoria";
				
			}else {	//Default attributes
				this.minAge=0;//Default to 0
				this.name="Otro";
				this.description="Falta Descripcion";
			}
		}
}
