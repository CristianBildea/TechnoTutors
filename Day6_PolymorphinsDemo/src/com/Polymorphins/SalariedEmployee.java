package com.Polymorphins;

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	//Constructor-------
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary=weeklySalary;		
	}
	@Override
	public double earning() {
		return getWeeklySalary();	
	}
	@Override
	public String toString() {
		return String .format("Salaried Employee: %s%n%s: $%.2f",super.toString(), "Weekly Salary",getWeeklySalary());
	}
		
}
