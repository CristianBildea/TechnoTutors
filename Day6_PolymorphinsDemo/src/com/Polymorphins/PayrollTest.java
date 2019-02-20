package com.Polymorphins;

import java.util.Scanner;

public class PayrollTest {

	public static void main(String[] args) { //if class is abstract dont create a object of (Employee class-abstract class)!!!!-intrebare de interviu
		//object of Salaried Employee-----
		//String firstName, String lastName, String socialSecurityNumber,double weeklySalary
		SalariedEmployee salEmp1 = new SalariedEmployee("Chistian","Ronaldo","625-456-1234",25000.00);
		System.out.println("\n*********** Salaried Employee *******\n");//this line and next two only for testing purpose not in real life
		salEmp1.setWeeklySalary(30000.00);//if is change a salary
		System.out.println(salEmp1);
		System.out.println("Total Earning: "+salEmp1.earning());
		//Which is final we can't change (private final from employee superclass)
		//object of HourlyEmployee
		//String firstName, String lastName, String socialSecurityNumber, double wage, double hours
		HourlyEmployee hrEmp1 = new HourlyEmployee("Rajesh","Poul","123-345-5678",30.00,55.00);//30.00 pt ca e salariu pe ora
		System.out.println("\n*********** Hourly Employee *******\n");
		System.out.println(hrEmp1);	
		System.out.println("Total Earning: "+hrEmp1.earning());
	
		//object of Commission Employee----
		//String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate
		CommissionEmployee comEmp1 = new CommissionEmployee("Jessi","Hans","234-567-123",5000.50,0.05);//0.05 is 5% commission
		System.out.println("\n*********** Commission Employee *******\n");
		System.out.println(comEmp1);	
		System.out.println("Total Earning: "+comEmp1.earning());
		
		//object of BasePlusCommission
		//String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary
		
		BasePlusCommission basePlusCom1 = new BasePlusCommission("Sama","Mukharjee","123-234-1234",5000.50,0.05,1000);
		System.out.println("\n*********** BasePlusCommission Employee *******\n");
		System.out.println(basePlusCom1);	
		System.out.println("Total Earning: "+basePlusCom1.earning());
		

	}

}
