
public class WaveApp {
	public static void main(String[] args) {

		final int groupCount = 7;

		for ( int i=0; i<76; i++ ) {
			int starNum;
			if ( (i / groupCount) % 2 == 0 ) {
				starNum = i % groupCount + 1;
			} else {
				starNum = groupCount - ( i % groupCount ) - 1 + 1;
			}
			for ( int j=0; j<starNum; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
