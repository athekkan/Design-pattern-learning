import java.util.Arrays;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {

		List ints = Arrays.asList(1, 2);
		List test = ints;
		ints.add(3.14); // no compiletime error - Runtime exception -
						// java.lang.UnsupportedOperationException

	}

}

// some question ans

// StringBuffer uses Builder design patterns - Also StringBuilder

/*
 * Builder pattern aims to“ Separate the construction of a complex object from
 * its representation so that the same construction process can create different
 * representations.” It is used to construct a complex object step by step and
 * the final step will return the object. The process of constructing an object
 * should be generic so that it can be used to create different representations
 * of the same object.
 */