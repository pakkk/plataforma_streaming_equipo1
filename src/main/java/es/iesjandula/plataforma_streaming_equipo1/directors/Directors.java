package es.iesjandula.plataforma_streaming_equipo1.directors;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;

public class Directors {
	//Variables
	protected String name, lastName, nationality;
	protected Genders sex;
    protected int year;
    
    //Constructor
    public Directors(String name, String lastName, int year, String nationality, Genders sex){
        this.name=name; //Name of director
        this.lastName=lastName; //Last Name of director
        this.year=year; //Year of birth of director
        this.nationality=nationality; //Nationality of director
        this.sex=sex; //Sex of director
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

	public void setSex(Genders sex) {
		this.sex = sex;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getlastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public Genders getSex() {
        return sex;
    }

    public int getYear() {
        return year;
    }
    
    //Information of director String 
    public String toString() {
        return "Director: " + " name: " + name + ", lastName: " + lastName + ", nationality: " + nationality + ", sex: " + sex + ", year: " + year;
    }
    
    
}
