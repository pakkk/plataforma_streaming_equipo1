package es.iesjandula.plataforma_streaming_equipo1.actors;

import es.iesjandula.plataforma_streaming_equipo1.genders.Genders;

public class Actors {
	//Variables
		protected String name, lastName, nationality;
		protected Genders sex;
	    protected int year;
		public Actors(String name, String lastName, String nationality, Genders sex, int year) {
			super();
			this.name = name;
			this.lastName = lastName;
			this.nationality = nationality;
			this.sex = sex;
			this.year = year;
		}
		
		@Override
		public String toString() {
			return "Actors [name=" + name + ", lastName=" + lastName + ", nationality=" + nationality + ", sex=" + sex
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
		public Genders getSex() {
			return sex;
		}
		public void setSex(Genders sex) {
			this.sex = sex;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
	    
	    
	    
}
