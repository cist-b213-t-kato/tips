package stream;
import java.util.stream.LongStream;

public class UnlimitedStreamApp {
	public static void main(String[] args) {
		LongStream longStream = LongStream.rangeClosed(1, 99);
		longStream.parallel().map(i->i*i).forEachOrdered(System.out::println);
	}
}
