package com.Polymorphins;

public class CommissionEmployee extends Employee{
	
	private double grossSales; // getter and setter method
	private double commissionRate;
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	//constructor----
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales=grossSales;
		this.commissionRate=commissionRate;
	}
@Override
public double earning() {
	return getGrossSales() *getCommissionRate();	
}
@Override
public String toString() {
	return String .format("%s%n%s: $%.2f;%s: %.2f",super.toString(), "Gross Sales",getGrossSales(),"Commission Rate",getCommissionRate());
}
}
