package es.iesjandula.plataforma_streaming_equipo1.recomendations;
/*
 * Class recomendations
 * Stores the recomendations
 */
public class Recomendations 
{
	/** Attribute - recomendations */
	private String recomendations;
	
	/** Attribute - Type */
	
	private RecomendationsType type;
	
	
	/**
	 * Constructors of the class

	 */
	public Recomendations(String recomendations,RecomendationsType Type) 
	//Recomendation type + description constructor
	{
		this.recomendations = recomendations;
		this.type=Type;
	}
	
	public Recomendations(String recomendations)
	//Description recomendation only contructor
	{
		this.recomendations = recomendations;
		type=RecomendationsType.NEUTRAL;
		
	}
	
	/* ToString method , for print the recomendations*/
	@Override
	public String toString() 
	{
		return "RECOMENDACIONES:\n"+this.recomendations+"\n"
		+ "TIPO: "+type;
	}


	
	/* SETTERS AND GETTERS */
	/**
	 * @return the recomendations
	 */
	public String getRecomendations() {
		return this.recomendations;
	}

	/**
	 * @param recomendations the recomendations to set
	 */
	public void setRecomendations(String recomendations) {
		this.recomendations = recomendations;
	}

	/**
	 * @return the type
	 */
	public RecomendationsType getType() {
		return this.type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(RecomendationsType type) {
		this.type = type;
	}


	/* SETTERS AND GETTERS*/
	
	


	
	

	
	
	
	
}
