package es.iesjandula.plataforma_streaming_equipo1.audiovisuals.series;
/*
 * Class Series
 * Stores the Series
 */
import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Audiovisuals;
import es.iesjandula.plataforma_streaming_equipo1.audiovisuals.Type;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categories;
import es.iesjandula.plataforma_streaming_equipo1.recomendations.Recomendations;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;

public class Series extends Audiovisuals{
	/** Attribute - nCapitules */
	protected int nCapitules;
	
	/** Attribute - seasons */
	protected int seasons;
	
	/** Attribute - Recomentions */
	protected Recomendations recomendationsSerie[]=new Recomendations[0];
	
	/*
	 * Constructor of the class , use the superClass constructor.
	 * 
	 */
	public Series(Actors[] actores, Categories[] categ, String tittle, String originalLenguaje,
			String[] adaptedLenguajes, Subtitles[] avaliableSubtitles, Double duration, int creationYear,int nCapitules
			,int seasons) {
		super(Type.SERIE, actores, categ, tittle, originalLenguaje, adaptedLenguajes, avaliableSubtitles, duration, creationYear);
		
		this.nCapitules=nCapitules;
		this.seasons=seasons;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Serie=" + this.type +" "+Arrays.toString(this.actores)+" "
				+""+Arrays.toString(this.categ)+" "+this.tittle+" "+this.originalLenguaje +" "+Arrays.toString(this.adaptedLenguajes)+" "
						+ ""+Arrays.toString(this.avaliableSubtitles)+" "+ this.duration+" "+this.creationYear+" "+this.seasons+" "+this.nCapitules;
	}



	/* SETTERS AND GETTERS */
	public int getnCapitules() {
		return nCapitules;
	}

	public void setnCapitules(int nCapitules) {
		this.nCapitules = nCapitules;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public Recomendations[] getRecomendationsSerie() {
		return recomendationsSerie;
	}

	public void setRecomendationsSerie(Recomendations recomendationsSerie) {
		this.recomendationsSerie=Arrays.copyOf(this.recomendationsSerie,this.recomendationsSerie.length+1);
		this.recomendationsSerie[this.recomendationsSerie.length-1]=recomendationsSerie;
	}
	/* SETTERS AND GETTERS */
	


}
