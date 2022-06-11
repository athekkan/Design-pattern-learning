import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.test.beans.Employee;

public class MyNotes {

	public static void main(String[] args) {
		
		// Volatile keyword is used to modify the value of a variable by different threads.
		// It is also used to make classes thread safe. It means that multiple threads can use
		// a method and instance of the classes at the same time without any problem.
		// It can be used as an alternative way of achieving synchronization in Java.
		// always read the variable from the main memory. 
		// The volatile keyword cannot be used with classes or methods. it is used with variables. 
		
		
		// we cant use abastract and final together with a class
		// final classes are used to create immutable objects in java like string
		// all wrapper classes are final
		
		// Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
		// The java.lang.Class class provides many methods that can be used to get metadata,
		// examine and change the run time behavior of a class. java.lang.reflect packages provide classes for java reflection.
		// Reflections reflections = new Reflections("com.cisco.no2.app.curator"); // todo make this configurable or extensible to support plugins for curation types
        // Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(CurationEntryOption.class);
        
		List<Integer> num2 =  Arrays.asList(1,2);
		List<Integer> num1 =  Arrays.asList(3,4,5);
		List<List<Integer>> numbers =  new ArrayList<List<Integer>>();
		numbers.add(num1);
		numbers.add(num2);
		//flat map example
		numbers.stream().flatMap(list -> list.stream()).collect(Collectors.toList()).forEach(System.out::println);;
		
		//reverse an array
		List<Integer> reversedList  = new ArrayList<Integer>();
		for(int i = num1.size()-1; i >= 0 ; i --) {
			reversedList.add(num1.get(i));
		}
		System.out.println(reversedList);

		
		
		// get duplicate values in a string
		String str = "this is my name name Amrutha Amrutha";
	    List<String> strList = Arrays.asList(str.split(" "));
	    Set<String> items = new HashSet<>();
	     
	     //using add method of set
	     Set<String> duplicateItemSet = strList.stream().filter(s -> !items.add(s)).collect(Collectors.toSet());
	     System.out.println(duplicateItemSet.toString());
	     
	     //using groupingBy
	     strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	     .entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);
	     
	        List<Employee> employeeList = new ArrayList <>();
	        employeeList.add(new Employee(1, "Josh", 26));
	        employeeList.add(new Employee(2, "Ammmu", 27));
	     	//find employee count based on age condtion
			System.out.println(employeeList.stream().filter(emp -> emp.getAge() > 40).count());
			
			//Convert employee list to map with key as id and value as name
			Map<Integer, String> employeeMap = employeeList.stream().filter(emp -> emp.getAge() > 40)
					.collect(Collectors.toMap(Employee::getId,Employee::getName));
			
			employeeMap.forEach((k,v) -> System.out.println(k+"-->"+v) );

			// list of age greater than 50
			List<Long> ageList = employeeList.stream().filter(emp -> emp.getAge() > 50)
					.map(Employee::getAge).collect(Collectors.toList());		
			// get list of emp name in sorted order
			employeeList.stream().map(Employee::getName).sorted().collect(Collectors.toList())
					.forEach(System.out::println);;
		
		
		
		Optional GOT = Optional.of(2);  // of method creates an optional object from the specified param value
		System.out.println(GOT.get());
		
		String[] str1 = new String[10];
		Optional strOpt = Optional.ofNullable(str1[9]);
		
		System.out.println(strOpt.isPresent());
		System.out.println(GOT.isPresent()); 	

		// creating custom exception
		//
		//@ResponseStatus(value = HttpStatus.BAD_REQUEST)
		//public class InvalidRequest extends BaseException {
		//   public InvalidRequest(String formatMsg, Object... formatObjs) {
		//       super(formatMsg, formatObjs);
	
		//find the no.of chars in a string based on given char
		String myStr = "Hello";
		char ch = 'l';
		long count = myStr.chars()
				.filter(c -> (char) c==ch).count();
		System.out.println(count);
		
	}

}
