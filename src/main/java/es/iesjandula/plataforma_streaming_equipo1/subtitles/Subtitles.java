package es.iesjandula.plataforma_streaming_equipo1.subtitles;

public class Subtitles {
	
	//Variables
	protected AvaliableSubtitles Subtitle;
	
	//Constructor
	public Subtitles(AvaliableSubtitles subtitle) {
		Subtitle = subtitle;
	}
	

	/**
	 * @return the subtitle
	 */
	public AvaliableSubtitles getSubtitle() {
		return Subtitle;
	}


	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(AvaliableSubtitles subtitle) {
		Subtitle = subtitle;
	}


	@Override
	public String toString() {
		return "["+this.Subtitle+"]";
	}
	
	
}
