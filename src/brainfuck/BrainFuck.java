package brainfuck;

public class BrainFuck {
	private String code;
	private char[] arr;
	private int ai;

	private int step(int ci) {
		if (ci >= code.length()) {
			return ci;
		}

		char c = code.charAt(ci);
		if (c == '+') {
			arr[ai]++;
		} else if (c == '-') {
			arr[ai]--;
		} else if (c == '>') {
			ai++;
		} else if (c == '<') {
			ai--;
		} else if (c == '[') {
			// 0であれば]まで飛ぶ
			// 0以外であれば繰り返す
			int retCi = ci;
			while (arr[ai] != 0) {
				retCi = step(ci + 1);
			}
			if (retCi == ci) {
				do {
					retCi++;
				} while (code.charAt(retCi) != ']');
			}
			return step(retCi + 1);
		} else if (c == ']') {
			return ci;
		} else if (c == '.') {
			System.out.print(arr[ai]);
		} else if (c == ',') {

		}

		return step(ci + 1);
	}

	public void compile(String code) {
		this.code = code;
		arr = new char[100];
		ai = 0;
		step(0);
	}

	public void printArr() {
		for (char c : arr) {
			System.out.print((int) c + " ");
		}
	}

	public static void main(String[] args) {
		BrainFuck iLoveYou = new BrainFuck();
		iLoveYou.compile("++++++++++[>+++>+++++++>+++++++++++<<<-]"
				+ ">>+++."
				+ "<++."
				+ ">>--."
				+ "+++."
				+ "+++++++."
				+ "<<<+++[>>>------<<<-]>>>+."
				+ "<<."
				+ ">>++++++++++++++++++++."
				+ "----------."
				+ "++++++."
				+ "<<++++++++++++++.");
		System.out.println();

		/*
		  	0 0 0 -> 0 1 0
			1 0 0 -> 0 0 0
			[]


			1 0 0 -> 1 1 0


			1 0 0 -> 0 1 0
			0 0 0 -> 0 0 0
			[>+<-]
		 */

		BrainFuck calc = new BrainFuck();
		calc.compile(""
				+ "[>+<]>."); // 現在地が0であれば右隣に1を足す 1であれば何もしない
//		calc.compile("+"
//				+ "[>+<-]>."); // 現在地が1であれば0にし右隣に1を足す  0であれば何もしない
		calc.printArr();
	}

}
