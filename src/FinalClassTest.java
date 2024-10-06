
final class A {
}

public class FinalClassTest {

	public static void main(String[] args) {
		A a = new A();
		
		// we cant use abastract and final together with a class
		// final classes are used to create immutable objects in java like string
		// all wrapper classes are final
		// if you try to extend a final class, a compile time error will be generated saying “cannot inherit from final SuperClass”
		// If you declare a class abstract, to use it, you must extend it and if you declare a class final you cannot extend it,
		// since both contradict with each other you cannot declare a class both abstract and final ,
		// if you do so a compile time error will be generated.
	}

}
