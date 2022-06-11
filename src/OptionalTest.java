import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		Optional GOT = Optional.of(2);  // of method creates an optional object from the specified param value
		System.out.println(GOT.get());
		
		String[] str = new String[10];
		Optional strOpt = Optional.ofNullable(str[9]);
		
		System.out.println(strOpt.isPresent());
		System.out.println(GOT.isPresent()); 	
		

	}

}
