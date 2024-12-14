package com.surya.assignment.utility;

import com.surya.assignment.employee.Employee;
import com.surya.assignment.employee.Manager;
import com.surya.assignment.employee.Developer;

public class EmployeeUtility {
	
	public static void printEmployeeDetails(Employee employee) {
		System.out.println("Name:" + employee.getName());
		System.out.println("ID:" + employee.getEmployeeid());
		System.out.println("Salary:" + employee.getSalary());
	}
	
	public static void printManagerDetails(Manager manager) {
		printEmployeeDetails(manager);
		System.out.println("Department:" + manager.getDepartment());
	}
	
	public static void printDeveloperDetails(Developer developer) {
		printEmployeeDetails(developer);
		System.out.println("Prog Lang:" + developer.getProlang());
	}
	
	
}
