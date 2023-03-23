package es.iesjandula.plataforma_streaming_equipo1.actors;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;

public class Actors {
	// Variables
		protected String name, lastName, nationality;
		protected Genders gender;
	    protected int year;
		public Actors(String name, String lastName, String nationality, Genders gender, int year) {
			super();
			this.name = name;
			this.lastName = lastName;
			this.nationality = nationality;
			this.gender = gender;
			this.year = year;
		}
		
		@Override
		public String toString() {
			return "Actors [name=" + name + ", lastName=" + lastName + ", nationality=" + nationality + ", gender=" + gender
					+ ", year=" + year + "]";
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public Genders getGender() {
			return gender;
		}
		public void setGender(Genders sex) {
			this.gender = sex;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
	    
	    
	    
}
