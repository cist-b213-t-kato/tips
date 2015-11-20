package prime_number;

import java.util.ArrayList;

public class PNApp1 {
    
    public static void main(String[] args){
        showPN(1000000);
    }

	public static void showPN(Integer max){
		ArrayList<Integer> arrays = new ArrayList<>();
		arrays.add(2);
		arrays.add(3);
		arrays.add(5);

		Integer n1 = 0;
		Integer n2 = 0;
		for(int i=1; i<max/6; i++){
			n1 = 6*i+1;
			n2 = 6*i+5;
			for(int n : arrays){
				if(n>Math.sqrt(n1))
					break;
				if((6*i+1)%n==0){
					n1 = null;
					break;
				}
				if((6*i+5)%n==0){
					n2 = null;
					break;
				}
			}
			if(n1!=null)
				arrays.add(n1);
			if(n2!=null)
				arrays.add(n2);
		}

		for(int i=0; i<arrays.size(); i++){
			System.out.print(arrays.get(i) + " ");
			if((i+1)%20==0)
				System.out.println();
		}

	}

}
