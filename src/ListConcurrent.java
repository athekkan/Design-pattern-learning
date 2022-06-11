import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListConcurrent {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("a","b"));
		
		Iterator<String> ir = list.iterator();
		while(ir.hasNext()) {
			if("a".equals(ir.next())) {
				list.remove(ir.next());
			}
		}
		System.out.println(list.toString());
		/*
		 * for (String value : list) { if(value.equals("b")) list.remove(value); }
		 */
		
		
	}

}
