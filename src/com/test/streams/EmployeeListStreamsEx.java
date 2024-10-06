package com.test.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.test.beans.Employee;

public class EmployeeListStreamsEx {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList <>();
		employeeList.add(new Employee(1, "Ammu", 27));
		employeeList.add(new Employee(2, "Pavi", 63));
		employeeList.add(new Employee(3, "Giri", 59));
		employeeList.add(new Employee(4, "Josh", 25));

		//find employee count based on age condition
		System.out.println(employeeList.stream().filter(emp -> emp.getAge() > 40).count());
	
		//Convert employee list to map with key as id and value as name
		Map<Integer, String> employeeMap = employeeList.stream().filter(emp -> emp.getAge() > 40)
				.collect(Collectors.toMap(Employee::getId,Employee::getName));
		
		employeeMap.forEach((k,v) -> System.out.println(k+"-->"+v) );
		
		List<String> nameList = employeeList.stream().filter(emp -> emp.getAge() > 50)
				.map(Employee::getName).collect(Collectors.toList());		
		// get list of emp name in sorted order
		employeeList.stream().map(Employee::getName).sorted().collect(Collectors.toList())
				.forEach(System.out::println);
	}

	public static class Duplicates {

		public static void main(String[] args) {

			// find duplicate words and their count in a sentence.
			 String str = "this is my name name Amrutha Amrutha";
			 List<String> strList = Arrays.asList(str.split(" "));
			 Set<String> items = new HashSet<>();

			 //using add method of set
			 Set<String> duplicateItemSet = strList.stream().filter(s -> !items.add(s)).collect(Collectors.toSet());
			 System.out.println(duplicateItemSet);

			 //using groupingBy
			 strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			 .entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);
		}
	}
}
