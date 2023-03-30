package es.iesjandula.plataforma_streaming_equipo1.adaptedlanguages;

public class AdaptedLanguages 
{
	
	//Variables
	/** Attribute - adaptedLang */
	private AvaliableAdaptedLanguages adaptedLang;
	
	/**
	 * 
	 * @param adaptedLang the adapted type
	 */
	public AdaptedLanguages(AvaliableAdaptedLanguages adaptedLang) 
	{
		this.adaptedLang = adaptedLang;
	}
	
	
	/**
	 * @return the adaptedLang
	 */
	public AvaliableAdaptedLanguages getAdaptedLang() 
	{
		return this.adaptedLang;
	}


	/**
	 * @param adaptedLang the adaptedLang to set
	 */
	public void setAdaptedLang(AvaliableAdaptedLanguages adaptedLang) 
	{
		this.adaptedLang = adaptedLang;
	}


	//toString method to print subtitles
	@Override
	public String toString() 
	{
		return ""+this.adaptedLang+"";
	}
	
	
}
