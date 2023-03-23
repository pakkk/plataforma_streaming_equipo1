package es.iesjandula.plataforma_streaming_equipo1.directors;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;

public class Directors {
	//Variables
	private String name, lastName, nationality;
	private Genders gender;
    private int year;
    
    //Constructor
    public Directors(String name, String lastName, int year, String nationality, Genders gender)
    {
        this.name=name; //Name of director
        this.lastName=lastName; //Last Name of director
        this.year=year; //Year of birth of director
        this.nationality=nationality; //Nationality of director
        this.gender=gender; //Sex of director
    }  
    //Getters and setters
    
    public String getName() 
    //get the name
    {
        return name; 
    }

    public void setName(String name) 
    //Set the name
    {
		this.name = name;
	}

	public void setLastName(String lastName) 
	//Set the last name
	{
		this.lastName = lastName;
	}

	public void setNationality(String nationality) 
	//Set the nationality
	{
		this.nationality = nationality;
	}

	public void setGender(Genders gender)
	//Set the gender
	{
		this.gender = gender;
	}

	public void setYear(int year) 
	//Set the year
	{
		this.year = year;
	}

	public String getlastName() 
	//Get the last name
	{
        return lastName;
    }

    public String getNationality() 
    //Get the nationality
    {
        return nationality;
    }

    public Genders getGender() 
    //Get the gender
    {
        return gender;
    }

    public int getYear() 
    // Get the year
    {
        return year;
    }

    //toString method , for print the attributes
	@Override
	public String toString() 
	{
        return "\nDirector:\n"
        + "Nombre: "+name+"\n"
        + "Apellido: "+lastName+"\n"
        + "Nacionalidad: "+nationality+"\n"
        + "Genero: "+getGender()+"\n"
        + "Año nacimiento: "+year+"\n";
	}
     
}
