package sort;

public class SelectionSort {
	public static void main(String[] args){
		int[] as = { 2, 5, 3, 9, 6, 7, 1, 4, 8 };

		int tmp = 0;
		for(int i=0; i<as.length-1; i++){
			int m = i;
			for(int j=i+1; j<as.length; j++){
				if(as[j]<as[m]){
					m = j;
				}
			}
			tmp = as[i];
			as[i] = as[m];
			as[m] = tmp;
		}

		for(int i : as){
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
