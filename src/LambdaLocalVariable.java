
public class LambdaLocalVariable {
	
	static String name = null;

	public static void main(String[] args) {		
		name="Hello";
		
		IPrinter printer = ()->{
			System.out.println(name);
		};
		printer.print();

	}

}

interface IPrinter {
	void print(); // Single Abstract Method
}