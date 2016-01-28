package artificialintelligence;

public class Janken {
	public static void main(String[] args){
		Janken janken = new Janken();

		double[] a = new double[]{
			0.0, 0.45
		};

		janken.hand(a);
	}

	String[][] defHand = new String[2][2];

	public Janken(){
		defHand[0][1] = "グー";
		defHand[1][0] = "チョキ";
		defHand[1][1] = "パー";
	}

	public void hand(double[] a){

		int v1 = (int)(a[0]+0.5);
		int v2 = (int)(a[1]+0.5);
		System.out.println(defHand[v1][v2]);
	}

}
