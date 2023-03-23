package es.iesjandula.plataforma_streaming_equipo1.actors;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;

public class Actors 
{
	// Variables
		private String name, lastName, nationality;
		private Genders gender;
		private int year;
		
		//Constructor with the class
		public Actors(String name, String lastName, String nationality, Genders gender, int year) 
		{
			super();
			this.name = name;
			this.lastName = lastName;
			this.nationality = nationality;
			this.gender = gender;
			this.year = year;
		}
		
		//toString Method, for print the actor.
		@Override
		public String toString() 
		{
			return "Actors [name=" + name + ", lastName=" + lastName + ", nationality=" + nationality + ", gender=" + gender
			+ ", year=" + year + "]";
		}
		
		//SETTERS-GETTERS
		public String getName() 
		{
			//Get the name
			return name;
		}
		public void setName(String name) 
		{
			//Set the name
			this.name = name;
		}
		public String getLastName() 
		{
			//Get the last name
			return lastName;
		}
		public void setLastName(String lastName) 
		{
			//Set the last name
			this.lastName = lastName;
		}
		public String getNationality() 
		{
			//Get the nationality
			return nationality;
		}
		public void setNationality(String nationality) 
		{
			//Set the nationality
			this.nationality = nationality;
		}
		public Genders getGender() 
		{
			//Get the gender
			return gender;
		}
		public void setGender(Genders gender) 
		{
			//Set the gender
			this.gender = gender;
		}
		public int getYear() 
		{
			//Get the year
			return year;
		}
		public void setYear(int year) 
		{
			//Set the year
			this.year = year;
		}
	    
		//SETTERS-GETTERS
	    
}
