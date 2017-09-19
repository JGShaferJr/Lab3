/**
 * CS 2003 - Lab 3
 * Code to determine and display the age of an individual
 * 
 *
 * @author Jerry Shafer
 * @since 09/12/2017
 * @version 2.0
 */

package demo;

public class Person {
	static int currentYear = 2017;
	private String name;
	private int birthDate;
	private int age;
	
	//constructor
	public Person(String name, int birthDate){
		this.name = name;
		this.birthDate = birthDate;
	}

	
	public void reset_birthday(int year){
		birthDate = year;
	}
	
	public void display_name(){
		System.out.println("This is " + name);
	}
	
	public void display_birthday(){
		System.out.printf("I was born in %d. ",birthDate);
	}
	
	public void display_age(){
		age = currentYear - birthDate;
		System.out.printf("I am %d years old ",age);
	}
	public void medicare_eligibility() {
		if (age >= 65){
			System.out.println("\nI'm a senior citizen\n");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!\n");
		}
	}
	public void display_info() { // method to call age, birthday, age, and medicare methods
		display_name();
		display_birthday();
		display_age();
		medicare_eligibility();
	}
	
	public static void main(String[] args) {
		Person John = new Person("John",1957);

		John.display_info(); // calls one method to display all of the person's info
	}
}