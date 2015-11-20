package seach;

import static java.lang.System.out;

public class DepthFirstSearch {
	
	private static final int NUMBER_OF_POINT = 8;
	
	private static int[][] a;
	private static int[] v;

	public static void main(String[] args) {
		a = new int[][] {
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 1, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0, 1, 0},
			{0, 0, 1, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 1, 0, 1, 1},
			{0, 0, 0, 1, 0, 0, 1, 0, 1},
			{0, 0, 0, 0, 0, 0, 1, 1, 0}
		};
		v = new int[NUMBER_OF_POINT + 1];
		
		for (int i = 1; i <= NUMBER_OF_POINT; i++) {
			v[i] = 0;
		}
		visit(1);
	}
	
	public static void visit(int i) {
            out.println("呼び出し");
		v[i] = 1;
		for(int j = 1; j <= NUMBER_OF_POINT; j++) {
			if (a[i][j] == 1 && v[j] == 0) {
				System.out.println(i + "->" + j);
				visit(j);
			}
		}
	}
}