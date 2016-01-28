package junittest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args){
		
		Main main = new Main();
		
		for(int a : main.piyopiyo(Arrays.asList(1,2,4,2,3,2))){
			System.out.print(a + " ");
		}
		System.out.println();
		
	}

	public List<Integer> piyopiyo(List<Integer> array){
		List<Integer> heightArray = new ArrayList<Integer>();
		for(int a : array){
			if(!heightArray.contains(a)){
				heightArray.add(a);
			}
		}

		List<Integer> returning = heightArray;//Arrays.asList((Integer[])heightArray.toArray());//heightArray;//Arrays.asList((Integer[])heightArray.toArray());
		return returning;
	}

	public static int[] piyopiyo(int[] array){
		int[] heightArray = new int[array.length];
		int li = 0;
		boolean flag;
		for(int a : array){
			flag = true;
			for(int i=0; i<li; i++){
				if(a == heightArray[i]){
					flag = false;
					break;
				}
			}
			if(flag){
				heightArray[li] = a;
				li++;
			}
		}

		int[] returning = new int[li];
		for(int i=0; i<li; i++){
			returning[i] = heightArray[i];
		}

		return returning;
	}

}
