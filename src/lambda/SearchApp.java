package lambda;

import java.util.ArrayList;
import java.util.List;

public class SearchApp {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(13);
		list.add(4);
		
		boolean b = list.stream().filter(o->o>=10).findFirst().isPresent();
		if(b){
			System.out.println("10以上ありますねえ！");
		}else{
			System.out.println("10以上ないです。");
		}
		
	}
}
