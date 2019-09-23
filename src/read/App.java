package read;

import java.util.Scanner;

/**
 * https://docs.oracle.com/javase/jp/8/docs/api/java/util/Scanner.html
 * @author tkato
 */
public class App {
    public static void main(String... args) {
        Scanner scan = new Scanner("I am John. Please call me Aki.");

        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());

    }
}
