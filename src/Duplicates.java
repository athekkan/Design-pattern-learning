
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		
		 String str = "this is my name name Amrutha Amrutha";
	     List<String> strList = Arrays.asList(str.split(" "));
	     Set<String> items = new HashSet<>();
	     
	     //using add method of set
	     Set<String> duplicateItemSet = strList.stream().filter(s -> !items.add(s)).collect(Collectors.toSet());
	     System.out.println(duplicateItemSet.toString());
	     
	     //using groupingBy
	     strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	     .entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);
 
	}
}
