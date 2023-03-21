package es.iesjandula.plataforma_streaming_equipo1.directors;

public class Directors {
	protected String name, lastName, nationality, sex;
    protected int year;

    public void setDirector(String name, String lastName, int year, String nationality, String sex){
        this.name=name;
        this.lastName=lastName;
        this.year=year;
        this.nationality=nationality;
        this.sex=sex;
    }  

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
    
    public String toString() {
        return "Director: " + " name: " + name + ", lastName: " + lastName + ", nationality: " + nationality + ", sex: " + sex + ", year: " + year;
    }
    
    
}
