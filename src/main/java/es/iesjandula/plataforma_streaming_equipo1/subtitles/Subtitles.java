package es.iesjandula.plataforma_streaming_equipo1.subtitles;

public class Subtitles {
	
	//Variables
	protected AvaliableSubtitles Subtitle;
	
	//Constructor
	public Subtitles(AvaliableSubtitles subtitle) {
		Subtitle = subtitle;
	}

	@Override
	public String toString() {
		return "["+this.Subtitle+"]";
	}
	
	
}
