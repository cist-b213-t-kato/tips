package shiren.morita;

public class Tree extends Execute{


	Gauge gauge = new Gauge();

	public Tree(int value){
		gauge.setValue(value);
	}

	public void execute() {
		int row = 10;
		int i, j, num, MaxNum;

		MaxNum = (row - 1) * 2 + 1;

		for (i = 0; i < row; i++) {
			num = i * 2 + 1;
			for (j = 0; j < (MaxNum - num) / 2; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < num; j++) {
				System.out.print("*");
			}
			for (j = 0; j < (MaxNum - num) / 2; j++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
