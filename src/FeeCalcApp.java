
/**
 * 某ネカフェの料金を計算する
 * @author tkato
 *
 */
public class FeeCalcApp {
	public static void main(String[] args) {
		System.out.println(calc(500));
	}

	/**
	 * 料金を入れると時間を返す
	 * @param fee
	 * @return
	 */
	static int calc( int fee ) {
		return ( fee - 190 ) / 67 * 15 + 30;
	}

}
