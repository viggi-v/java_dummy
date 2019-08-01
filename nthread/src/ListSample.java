import java.util.Arrays;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(3,66,23,77,3);
		List<String> sList = Arrays.asList("Smith","Peter","Roger","Uma");
		
		print(iList);
		print(sList);
		
	}
	// <?> means unknown datatype
	// but using this comes with a limitation that we can not mutate the arguments, only access is given
	private static void print(List<?> list) {
		for(Object o : list)
			System.out.println(o);
		
	}

}
