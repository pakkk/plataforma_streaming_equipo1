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
		return "RECOMENDACIONES:\n"+recomendations+"\n"
		+ "TIPO: "+type;
	}

	
	/* SETTERS AND GETTERS */
	public String getRecomendations() 
	//Get the recomendation
	{
		return recomendations;
	}

	public void setRecomendations(String recomendations) 
	//Set the recomendation
	{
		this.recomendations = recomendations;
	
	}
	
	public RecomendationsType getType() 
	//Get recomendation type
	{
		return type;
		
	}

	public void setType(RecomendationsType type) 
	//Set recomendation type
	{
		this.type = type;
	}
	
	/* SETTERS AND GETTERS*/
	
	


	
	

	
	
	
	
}
