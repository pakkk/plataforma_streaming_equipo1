package es.iesjandula.plataforma_streaming_equipo1.directors;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;

public class Directors 
{
	//Variables
	private String name, lastName, nationality;
	
	private Genders gender;
	
    private int year;
    
    private int directorId;
    
    //Constructor
    public Directors(String name, String lastName, int year, String nationality, Genders gender ,int directorId)
    {
        this.name=name; //Name of director
        this.lastName=lastName; //Last Name of director
        this.year=year; //Year of birth of director
        this.nationality=nationality; //Nationality of director
        this.gender=gender; //Gender of director
        this.directorId=directorId;//Id of the director
    }  
    

    //toString method , for print the attributes
	@Override
	public String toString() 
	{
        return "\nDirector:\n"
        + "Name: "+name+"\n"
        + "Last Name: "+lastName+"\n"
        + "Nationality: "+nationality+"\n"
        + "Gender: "+getGender()+"\n"
        + "Year of birth: "+year+"\n"
        + "Id-director: "+this.directorId+" \n";
	}
    //Getters and setters


	/**
	 * @return the name
	 */
	public String getName() 
	{
		return this.name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() 
	{
		return this.lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}


	/**
	 * @return the nationality
	 */
	public String getNationality() 
	{
		return this.nationality;
	}


	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) 
	{
		this.nationality = nationality;
	}


	/**
	 * @return the gender
	 */
	public Genders getGender() 
	{
		return this.gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(Genders gender) 
	{
		this.gender = gender;
	}


	/**
	 * @return the year
	 */
	public int getYear() 
	{
		return this.year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(int year) 
	{
		this.year = year;
	}


	/**
	 * @return the directorId
	 */
	public int getDirectorId() 
	{
		return this.directorId;
	}


	/**
	 * @param directorId the directorId to set
	 */
	public void setDirectorId(int directorId) 
	{
		this.directorId = directorId;
	}
	
     
}
