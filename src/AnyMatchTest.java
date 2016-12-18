import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnyMatchTest {
	
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 5, 7, 2, 3));
		
		boolean exists = list.stream().anyMatch(o->o.equals(8));
		
		if(exists){
			System.out.println("ありますねえ！！");
		}else{
			System.out.println("ないです");
		}
		
	}
}
