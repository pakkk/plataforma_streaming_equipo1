package es.iesjandula.plataforma_streaming_equipo1.subtitles;
/**
 * @LuisDavidCastillo
 * 
 * Class for the creation and use of subtitles
 */
public class Subtitles 
{
	
	/**
	 * Variables
	 */
	private AvaliableSubtitles subtitle;
	
	/**
	 * Constructor
	 */
	public Subtitles(AvaliableSubtitles subtitle) 
	{
		this.subtitle = subtitle;
	}
	

	/**
	 * @return the subtitle
	 */
	public AvaliableSubtitles getSubtitle() 
	{
		return this.subtitle;
	}


	/**
	 * @param set the subtitle
	 */
	public void setSubtitle(AvaliableSubtitles subtitle) 
	{
		this.subtitle = subtitle;
	}

	
	/**
	 * toString method to print subtitles
	 */
	@Override
	public String toString() 
	{
		return ""+this.subtitle+"";
	}
	
	
}
