package es.iesjandula.plataforma_streaming_equipo1.categories;
/*
 * Class Categories
 * Stores the categories
 */

public class Categories {
	public enum CategoriesTypes
	{
		/*Enum CategoriesTypes
		 *To have control over the possible categories and their types 
		 *(Base categories if you like make other , you can add it or use OTHER type)
		 */
		COMEDIA,ACCION,TERROR,SUSPENSE,INFANTIL,OTHER
	}
	/** Attribute - Type */
	protected CategoriesTypes type;
	
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
	public Categories(CategoriesTypes type) 
	{	
		this.type=type;
		
		/* Every description and min age on every Type */
		
		/* COMEDIA */
		if(type.equals(CategoriesTypes.COMEDIA))
		{
			this.minAge=7;
			this.name="COMEDIA";
			this.description="La categoria de comedia está dedicada a mayores de 7"
					+ " , momentos de grandes risas te esperan";
		}
		/* ACCION */
		else if(type.equals(CategoriesTypes.ACCION))
		{
			this.minAge=16;
			this.name="ACCION";
			this.description="La categoria de comedia está dedicada a mayores de 16,"
					+ " , momentos de accion intensa te esperan en esta categoria";
		}
		/* TERROR */
		else if(type.equals(CategoriesTypes.TERROR))
		{
			this.minAge=18;
			this.name="TERROR";	
			this.description="La categoria de terror está dedicada a mayores de 18"
					+ " , momentos de terror intenso te esperan con esta categoria";
		}
		/* SUSPENSE */
		else if(type.equals(CategoriesTypes.SUSPENSE))
		{
			this.minAge=12;
			this.name="SUSPENSE";	
			this.description="La categoria de suspense está dedicada a mayores de 12"
					+ " , momentos de tension , suspense y muchos dramas intensos te esperan";
		}
		/* INFANTIL */
		else if(type.equals(CategoriesTypes.INFANTIL))
		{
			this.minAge=0;
			this.name="INFANTIL";	
			this.description="La categoria de infantil está dedicada a todo tipo de publico"
					+ " , momentos de aprendijaze , grandes amistades y amigos divertidos"
					+ "te esperan con esta categoria";
		}else {
			this.minAge=0;//Default to 0
			this.name="Otro";
			this.description="Falta Descripcion";
		}
	}
	
	/* ToString method , for print the Category (object)*/
	
	@Override
	public String toString() {
		return "Nombre : "+this.name+"\nTipo Categoria: "+this.type+"\nEdad Minima: "+this.minAge+"\nDescripcion: "+this.description;
	}

	/* SETTERS AND GETTERS */
	
	public CategoriesTypes getType() {
		return type;
	}

	public void setType(CategoriesTypes type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	
	/* SETTERS AND GETTERS */
}
