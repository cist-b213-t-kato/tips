package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaApp1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(65);
		list.add(53);
		list.add(81);

//		Predicate<Integer> pre1 = e -> e < 60;
//		Predicate<Integer> pre2 = e -> e < 70;
//		Predicate<Integer> pre3 = e -> e < 80;
//		Predicate<Integer> pre4 = e -> e < 90;
//		list.stream().filter(pre1).map(t -> t + "不可").forEach(System.out::println);
		
		list.stream().map(numb->{
			if(numb>=90){
				return numb + " 秀";
			}else if(numb>=80){
				return numb + " 優";
			}else if(numb>=70){
				return numb + " 良";
			}else if(numb>=60){
				return numb + " 可";
			}else if(numb<60){
				return numb + " 不可";
			}else if(numb<0 || numb>100){
				return numb + " 未定値";
			}else{
				return numb + " 未定値";
			}
		}).forEach(o->System.out.println(o));

	}

}
