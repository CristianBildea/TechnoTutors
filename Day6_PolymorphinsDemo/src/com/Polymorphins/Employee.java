package com.Polymorphins;

public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	//CONSTRUCTORS---------
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName =lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		
		
	}
	@Override
	public String toString() {                                      
		return String.format("%s %s%nSocial Security Number: %s",getFirstName(),getLastName(),getSocialSecurityNumber());
		
	}
	//This is the abstract method that must be overridden by concrete subclass
	public abstract double earning();  //No Implementation
	

}
