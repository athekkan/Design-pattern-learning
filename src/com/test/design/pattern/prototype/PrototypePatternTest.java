package com.test.design.pattern.prototype;

public class PrototypePatternTest {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.loadData();
		
		Employee remEmp = (Employee) employee.clone();
		remEmp.getEmployeeList().remove("test");
		
		Employee newEmp = (Employee) employee.clone();
		newEmp.getEmployeeList().add("B105");
		
		System.out.println(
				employee.getEmployeeList());
		System.out.println(remEmp.getEmployeeList());
		System.out.println(newEmp.getEmployeeList());

	}

}
