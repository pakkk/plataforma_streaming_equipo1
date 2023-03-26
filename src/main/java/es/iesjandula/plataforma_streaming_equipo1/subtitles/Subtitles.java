package es.iesjandula.plataforma_streaming_equipo1.subtitles;

public class Subtitles 
{
	
	//Variables
	private AvaliableSubtitles subtitle;
	
	//Constructors
	public Subtitles(AvaliableSubtitles subtitle) 
	{
		this.subtitle = subtitle;
	}
	

	/**
	 * @return the subtitle
	 */
	public AvaliableSubtitles getSubtitle() 
	{
		return subtitle;
	}


	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(AvaliableSubtitles subtitle) 
	{
		this.subtitle = subtitle;
	}

	
	//toString method to print subtitles
	@Override
	public String toString() 
	{
		return ""+this.subtitle+"";
	}
	
	
}
