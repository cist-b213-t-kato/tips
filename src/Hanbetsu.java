import java.util.ArrayList;
import java.util.List;


public class Hanbetsu {
	public static void main(String[] args){

		List list = new ArrayList();

		list.add(1);
		list.add(0.9);
		list.add("str");

		for(int i=0; i<list.size(); i++){
			if(list.get(i) instanceof Integer){
				System.out.println("Integerです " + list.get(i));
			}else if(list.get(i) instanceof Double){
				System.out.println("Doubleです " + list.get(i));
			}else if(list.get(i) instanceof String){
				System.out.println("Stringです " + list.get(i));
			}
		}

	}
}
