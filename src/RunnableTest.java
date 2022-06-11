
public class RunnableTest {

	public static void main(String[] args) {
		
		String name = "India";
		Runnable r1 = ()->  {
			for(int i=0;i<5;i++)
				System.out.println(i);
		};
		
		final String name1 = name.toUpperCase();
		//name1 = name.toUpperCase();		//compile time error
		Runnable r2 = ()-> {
			for(int i=5;i<10;i++)
				System.out.println(name1);
		};
		
		r1.run();
		r2.run();

	}

}
