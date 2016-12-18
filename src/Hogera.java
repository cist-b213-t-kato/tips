import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hogera {
	public static void main(String[] args) {
		
		List<String> array1 = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "c"));
		List<String> array2 = new ArrayList<>(Arrays.asList("a", "b"));
		
		array1.stream().filter(o->!array2.contains(o)).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Long> array3 = new ArrayList<>();
		array3.add(1L);
		array3.add(2L);
		array3.add(3L);
		array3.add(2L);
		
		List<Long> store = new ArrayList<>();
		List<Long> overlap = new ArrayList<>();
		
		array3.forEach(o->{
			if(store.contains(o)){
				overlap.add(o);
			}else{
				store.add(o);
			}
		});
		
		System.out.println(overlap);
		
		
	}
}
