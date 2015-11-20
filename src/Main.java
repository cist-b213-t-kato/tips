


public class Main {
	public static void main(String[] args){

		for(int a : piyopiyo(new int[]{1,2,2,3,2})){
			System.out.println(a);
		}

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
