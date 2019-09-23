
/**
 * 某ネカフェの料金を計算する
 * @author tkato
 *
 */
public class FeeCalcApp {
	public static void main(String[] args) {
		System.out.printf("%d円:%d分\n", 500, calcTime(500));
		System.out.printf("%d分:%d円\n", 60, calcFee(60));
	}

	/**
	 * 料金を入れると時間を返す
	 * @param fee
	 * @return
	 */
	static int calcTime( int fee ) {
		return ( fee - 190 ) / 67 * 15 + 30;
	}

	/**
	 * 分を入れると料金を返す
	 * @param min
	 * @return
	 */
	static int calcFee( int min ) {
		// 最初30分190円 以降15分ごとに67円
		return 190 + 67 * ( min - 30 ) / 15;
	}

}
