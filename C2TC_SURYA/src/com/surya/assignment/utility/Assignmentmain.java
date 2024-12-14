package com.surya.assignment.utility;

import com.surya.assignment.employee.Manager;
import com.surya.assignment.employee.Developer;

public class Assignmentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
			manager.setName("Surya");
			manager.setEmployeeId(21);
			manager.setSalary(65031);
			manager.setDepartment("HR");
			
			
		Developer developer = new Developer();
			developer.setName("Surya");
			developer.setEmployeeId(21);
			developer.setSalary(65031);
			developer.setProlang("HR");
			
			System.out.println("Manager Details:");
			EmployeeUtility.printManagerDetails(manager);
			
			System.out.println("Developer Details");
			EmployeeUtility.printDeveloperDetails(developer);;
	
	}

}
