package es.iesjandula.plataforma_streaming_equipo1.directors;

public class Directors {
	//Variables
	protected String name, lastName, nationality, sex;
    protected int year;
    
    //Constructor
    public void setDirector(String name, String lastName, int year, String nationality, String sex){
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

    public String getlastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getSex() {
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
