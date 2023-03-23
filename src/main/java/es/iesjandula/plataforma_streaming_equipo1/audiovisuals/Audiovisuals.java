package es.iesjandula.plataforma_streaming_equipo1.audiovisuals;

import java.util.Arrays;

import es.iesjandula.plataforma_streaming_equipo1.actors.Actors;
import es.iesjandula.plataforma_streaming_equipo1.categories.Categorie;
import es.iesjandula.plataforma_streaming_equipo1.directors.Directors;
import es.iesjandula.plataforma_streaming_equipo1.subtitles.Subtitles;

public class Audiovisuals {

	//Variables
	protected Type type;
	protected Directors[] directors= new Directors[0];
	protected Actors[] actores= new Actors[0]; 
	protected Categorie[] categ = new Categorie[0];
	protected String title;
	protected String originalLanguage;
	protected String[] adaptedLanguages = new String[0];
	protected Subtitles[] avaliableSubtitles = new Subtitles[0];
	protected Double duration;
	protected int creationYear;
	protected int views;
	
	//Constructor
	public Audiovisuals(Type type,Directors[] directors, Actors[] actores, Categorie[] categ, String title, String originalLanguage,
			String[] adaptedLanguages, Subtitles[] avaliableSubtitles, Double duration, int creationYear) 
	{
		this.type = type;
		this.directors=directors;
		this.actores = actores;
		this.categ = categ;
		this.title = title;
		this.originalLanguage = originalLanguage;
		this.adaptedLanguages = adaptedLanguages;
		this.avaliableSubtitles = avaliableSubtitles;
		this.duration = duration;
		this.creationYear = creationYear;
		this.views=0;
	}

	//Getters and setters
	
	
	public Type getType() 
	{
		//Get the type
		return type;
	}
	public int getViews() 
	{
		//get the vies
		return views;
	}

	public void setViews(int views) 
	{
		//set the views
		this.views = views;
	}

	public void setType(Type type) 
	{
		//Set the type
		this.type = type;
	}

	
	public Directors[] getDirectors() 
	{
		//Get the directors array
		return directors;
	}

	public void setDirectors(Directors directors) 
	{
		//Set director
		this.directors=Arrays.copyOf(this.directors,this.directors.length+1);
		this.directors[this.directors.length-1]=directors;
	}

	public Actors[] getActores() 
	{
		//Get the actors Array
		return actores;
	}
	public void setActores(Actors actores) 
	{
		//Set actor
		this.actores=Arrays.copyOf(this.actores,this.actores.length+1);
		this.actores[this.actores.length-1]=actores;
	}

	public Categorie[] getCateg() 
	{
		//Get the categorie array
		return categ;
	}
	public void setCateg(Categorie categ) 
	{
		//Set the gategorie array
		this.categ=Arrays.copyOf(this.categ,this.categ.length+1);
		this.categ[this.categ.length-1]=categ;
	}

	public String gettitle() 
	{
		//Get the title
		return title;
	}
	public void settitle(String title) 
	{
		//Set the title
		this.title = title;
	}

	public String getOriginalLanguage() 
	{
		//Get the original language
		return originalLanguage;
	}
	public void setOriginalLanguage(String originalLanguage) 
	{
		//Set the original Language
		this.originalLanguage = originalLanguage;
	}

	public String[] getAdaptedLanguages() 
	{
		//Get the adapted languages
		return adaptedLanguages;
	}
	public void setAdaptedLanguages(String adaptedLanguages) 
	{
		//Set adapted language
		this.adaptedLanguages=Arrays.copyOf(this.adaptedLanguages,this.adaptedLanguages.length+1);
		this.adaptedLanguages[this.adaptedLanguages.length-1]=adaptedLanguages;
	}

	public Subtitles[] getAvaliableSubtitles() 
	{
		//Get the avaliable subtitles array
		return avaliableSubtitles;
	}
	public void setAvaliableSubtitles(Subtitles avaliableSubtitles) 
	{
		//Set avaiable subtitle
		this.avaliableSubtitles=Arrays.copyOf(this.avaliableSubtitles,this.avaliableSubtitles.length+1);
		this.avaliableSubtitles[this.avaliableSubtitles.length-1]=avaliableSubtitles;
	}

	public Double getDuration()
	{
		//Get the duration
		return duration;
	}
	public void setDuration(Double duration) 
	{
		//Set the duration
		this.duration = duration;
	}

	public int getCreationYear() 
	{
		//Get the creation year
		return creationYear;
	}
	public void setCreationYear(int creationYear) 
	{
		//Set the creation year
		this.creationYear = creationYear;
	}

	//ToString for print all attributes
	@Override
	public String toString() 
	{
		return "Audiovisuals [type=" + type + ", actores=" + Arrays.toString(actores) + ", categ="
				+ Arrays.toString(categ) + ", title=" + title + ", originalLanguage=" + originalLanguage
				+ ", adaptedLanguages=" + Arrays.toString(adaptedLanguages) + ", avaliableSubtitles="
				+ Arrays.toString(avaliableSubtitles) + ", duration=" + duration + ", creationYear=" + creationYear
				+ "]"+Arrays.toString(directors)+" views: "+views;
	}
	
	
	
}
