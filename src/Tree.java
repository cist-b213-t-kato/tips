
public class Tree {
	public static void main(String[] args) {

		//模範解答？
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//キモい書き方
		for(int i=0;i<25;i++)System.out.print(i%5<=i/5?"*":(i+1)%5==0?"\n":"");

	}
}
