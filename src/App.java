import java.util.stream.LongStream;

public class App {
	public static void main(String[] args) {
		LongStream longStream = LongStream.rangeClosed(1, 10000);
		longStream.parallel().map(i->i*i).forEachOrdered(System.out::println);
	}
}
