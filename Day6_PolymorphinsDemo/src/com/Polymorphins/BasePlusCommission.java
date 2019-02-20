package com.Polymorphins;

public class BasePlusCommission extends CommissionEmployee {
	private double baseSalary; // getter and setter

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
//constructor-----
	public BasePlusCommission(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber,grossSales,commissionRate);
		this.baseSalary=baseSalary;
	}
	@Override
	public double earning() {
		return getBaseSalary() +super.earning(); //is coming from commission employee care este pt asta superclass
	}
	@Override
	public String toString() {
		return String .format("BasePlusCommission Employee: %s%n%s: $%.2f",super.toString(), "Base Salary",getBaseSalary());
	}
}
