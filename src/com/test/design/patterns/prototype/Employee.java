package com.test.design.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{

	List<String> employeeList;

	public Employee() {
		employeeList = new ArrayList<String>();
	}
	public Employee(List<String> employeeList) {
		this.employeeList = employeeList;
	}
	public List<String> getEmployeeList() {
		return employeeList;
	}
	
	/**
	 * load all employee names from DB.
	 */
	public void loadData() {
		// the db call should be only once per session to save performance
		// useful when we need to modify the data that fetched from DB
		employeeList.add("Ammu");
		employeeList.add("mahe");
		employeeList.add("Aadhu");
		employeeList.add("test");
	}
	
	@Override
	public Object clone() {
		List<String> tempEmployeeList = new ArrayList<String>();
		for(String s : this.getEmployeeList()) {
			tempEmployeeList.add(s);
		}
		return new Employee(tempEmployeeList);
	}
}
