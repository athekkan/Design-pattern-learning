
abstract public class Overriding {

public void test() {}

}

class Lambda extends Overriding{
	public void test() {}
	public void test(int n) {}
}