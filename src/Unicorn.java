import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Unicorn {

	private Unicorn() {
		
	}
	
	public static void main(String[] args) {
		Map<String, Integer> instruments = new HashMap<String, Integer>();
		instruments.put("1", 1);
		instruments.put("2", 2);
		instruments.put("3", 3);
		instruments.put("2", 4);
		System.out.println(instruments.size());
		System.out.println(instruments.get("2"));
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
	}
}
