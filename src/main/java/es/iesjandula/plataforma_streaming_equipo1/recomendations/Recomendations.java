package es.iesjandula.plataforma_streaming_equipo1.recomendations;
/*
 * Class recomendations
 * Stores the recomendations
 */
public class Recomendations 
{
	/** Attribute - recomendations */
	protected String recomendations;
	
	/** Attribute - Type */
	protected RecomendationsType type;
	
	
	
	/**
	 * Constructors of the class

	 */
	public Recomendations(String recomendations,RecomendationsType Type) 
	{
		this.recomendations = recomendations;
		this.type=Type;
	}
	
	public Recomendations(String recomendations)
	{
		this.recomendations = recomendations;
		this.type=RecomendationsType.NEUTRAL;
		
	}
	
	/* ToString method , for print the recomendations*/
	
	@Override
	public String toString() 
	{
		return "RECOMENDACIONES:\n"+this.recomendations+"\n"
				+ "TIPO: "+this.type;
	}

	
	/* SETTERS AND GETTERS */
	public String getRecomendations() 
	{
		return this.recomendations;
	}

	public void setRecomendations(String recomendations) 
	{
		this.recomendations = recomendations;
	
	}
	
	public RecomendationsType getType() 
	{
		return this.type;
		
	}

	public void setType(RecomendationsType type) 
	{
		this.type = type;
	}
	
	/* SETTERS AND GETTERS*/
	
	


	
	

	
	
	
	
}
