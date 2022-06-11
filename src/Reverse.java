
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {

	public static void main(String[] args) {
	
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
	}

}
