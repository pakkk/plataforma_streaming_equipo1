package es.iesjandula.plataforma_streaming_equipo1.recomendations;
/*
 * Class recomendations
 * Stores the recomendations
 */
public class Recomendations {
	/** Attribute - recomendations */
	String recomendations;
	
	/** Attribute - Type */
	RecomendationsType type;
	
	
	
	/**
	 * Constructors of the class

	 */
	public Recomendations(String recomendations,RecomendationsType Type) {
		this.recomendations = recomendations;
		this.type=Type;
	}
	
	public Recomendations(String recomendations) {
		this.recomendations = recomendations;
		this.type=RecomendationsType.NEUTRAL;
		
	}
	
	/* ToString method , for print the recomendations*/
	
	@Override
	public String toString() {
		return "RECOMENDACIONES:\n"+this.recomendations+"\n"
				+ "TIPO: "+this.type;
	}

	
	/* SETTERS AND GETTERS */
	public String getRecomendations() {
		return recomendations;
	}

	public void setRecomendations(String recomendations) {
		this.recomendations = recomendations;
	
	}
	
	public RecomendationsType getType() {
		return type;
	}

	public void setType(RecomendationsType type) {
		this.type = type;
	}
	
	/* SETTERS AND GETTERS*/
	
	


	
	

	
	
	
	
}
