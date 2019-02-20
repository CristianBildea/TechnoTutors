package com.Polymorphins;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
 //CONSTRUCTOR
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
	super(firstName, lastName, socialSecurityNumber);
	this.wage=wage;
	this.hours=hours;
}

@Override
public double earning() {
	if(getHours()<=40) { //If no overtime
		return getWage() * getHours();
	}
	else { // If overtime -----
		return 40 * getWage() + (getHours()-40) *getWage()*1.5;
	}				
	}
@Override
public String toString() {
	return String .format("Hourly Employee: %s%n%s: $%.2f;%s: %.2f",super.toString(), "Hourly Wage",getWage(),"Hours Worked",getHours());
	
}

	
}
