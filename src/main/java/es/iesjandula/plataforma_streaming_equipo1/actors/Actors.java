package es.iesjandula.plataforma_streaming_equipo1.actors;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;
// Class actors, store the actors
public class Actors 
{
	// Variables
		private String name, lastName, nationality;
		private Genders gender;
		private int year;
		private int actorId;
		
		//Constructor with the class
		public Actors(String name, String lastName, String nationality, Genders gender, int year,int actorId) 
		{
			super();
			this.name = name;
			this.lastName = lastName;
			this.nationality = nationality;
			this.gender = gender;
			this.year = year;
			this.actorId=actorId;
		}
		
		//toString Method, for print the actor.
		@Override
		public String toString() 
		{
			return "Actor \n"
			+ "Name: " + this.name + "\n"
			+ "LastName: " + this.lastName + "\n"
			+ "Nationality: " + this.nationality + "\n"
			+ "Gender: " + this.gender+"\n"
			+ "Year Born=" + this.year + "\n"
			+ "Actor ID :"+this.actorId+"\n";
		}
		
		//SETTERS-GETTERS
		/**
		 * @return the name
		 */
		public String getName() {
			return this.name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return this.lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the nationality
		 */
		public String getNationality() {
			return this.nationality;
		}

		/**
		 * @param nationality the nationality to set
		 */
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		/**
		 * @return the gender
		 */
		public Genders getGender() {
			return this.gender;
		}

		/**
		 * @param gender the gender to set
		 */
		public void setGender(Genders gender) {
			this.gender = gender;
		}

		/**
		 * @return the year
		 */
		public int getYear() {
			return this.year;
		}

		/**
		 * @param year the year to set
		 */
		public void setYear(int year) {
			this.year = year;
		}

		/**
		 * @return the actorId
		 */
		public int getActorId() {
			return this.actorId;
		}

		/**
		 * @param actorId the actorId to set
		 */
		public void setActorId(int actorId) {
			this.actorId = actorId;
		}
		
		//SETTERS-GETTERS
		
}
