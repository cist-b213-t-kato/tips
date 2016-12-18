import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrTest {
	public static void main(String[] args){
		List<String> list = new ArrayList<>(Arrays.asList(
				"/情報/",
				"/情報/情報C/",
				"/情報/情報リテラシ/フィッシング詐欺/",
				"/数学/二次関数/",
				"/数学/",
				"/数学/二次関数/hogeraccho/"));
		
		List<String> newList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++){
			String itr = list.get(i);
			boolean flag = false;
			for(int j=0; j<list.size(); j++){
				String itr2 = list.get(j);
				if(itr2==null){
					continue;
				}
				if(itr2.matches(itr+".*")){
					flag = true;
					list.set(j, "");
				}
				if(itr.matches(itr2+".*")){
					flag = false;
					break;
				}
			}
			
			if(flag){
				newList.add(itr);
			}
			
		}
		
		newList.forEach(o->System.out.println(o));
		
		
		
	}
}
