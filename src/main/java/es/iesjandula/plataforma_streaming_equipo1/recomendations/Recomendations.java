package es.iesjandula.plataforma_streaming_equipo1.recomendations;
/*
 * @author Pablo
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
	public Recomendations(String recomendations,RecomendationsType type) 
	//Recommendation type + description constructor
	{
		this.recomendations = recomendations;
		this.type=type;
	}
	
	public Recomendations(String recomendations)
	//Description recommendation only constructor
	{
		this.recomendations = recomendations;
		this.type=RecomendationsType.NEUTRAL;
		
	}
	
	/* ToString method , for print the recommendations*/
	@Override
	public String toString() 
	{
		return "RECOMENDACIONES:\n"+this.recomendations+"\n"
		+ "TIPO: "+this.type;
	}


	
	/* SETTERS AND GETTERS */
	/**
	 * @return the recommendations
	 */
	public String getRecomendations() 
	{
		return this.recomendations;
	}

	/**
	 * @param recomendations the recommendations to set
	 */
	public void setRecomendations(String recomendations) 
	{
		this.recomendations = recomendations;
	}

	/**
	 * @return the type
	 */
	public RecomendationsType getType() 
	{
		return this.type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(RecomendationsType type) 
	{
		this.type = type;
	}


	/* SETTERS AND GETTERS*/	
}
