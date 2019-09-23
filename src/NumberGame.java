import java.util.Random;
import java.util.Scanner;

/**
 * 数当てゲーム
 * @author tkato
 *
 */
public class NumberGame {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Random rand = new Random();
		int n = rand.nextInt(100);

		while ( true ) {
			System.out.print("> ");
			String str = scan.next();
			int in = Integer.parseInt(str);
			if ( in > n ) {
				System.out.println("もっと小さい数");
			} else if ( in < n ) {
				System.out.println("もっと大きい数");
			} else {
				System.out.println("あたり！");
				break;
			}
		}

		scan.close();

	}
}
