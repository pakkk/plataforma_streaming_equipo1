package es.iesjandula.plataforma_streaming_equipo1.directors;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;

public class Directors {
	//Variables
	protected String name, lastName, nationality;
	protected Genders gender;
    protected int year;
    
    //Constructor
    public Directors(String name, String lastName, int year, String nationality, Genders gender){
        this.name=name; //Name of director
        this.lastName=lastName; //Last Name of director
        this.year=year; //Year of birth of director
        this.nationality=nationality; //Nationality of director
        this.gender=gender; //Sex of director
    }  
    //Getters and setters
    
    public String getName() {
        return name; 
    }

    public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setGender(Genders gender) {
		this.gender = gender;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public Genders getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

	@Override
	public String toString() {
        return "\nDirector:\n"
        		+ "Nombre: "+this.name+"\n"
        		+ "Apellido: "+this.lastName+"\n"
        		+ "Nacionalidad: "+this.nationality+"\n"
        		+ "Genero: "+this.getGender()+"\n"
        		+ "Año nacimiento: "+this.year+"\n";
	}
    
    //Information of director String 
    
    
    
}
