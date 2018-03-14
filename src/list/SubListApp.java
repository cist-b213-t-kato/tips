package list;

import java.util.Arrays;
import java.util.List;

/**
 *
 * {@link List#subList(int, int)} を試す
 * @author tkato213
 *
 */
public class SubListApp {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList(
				"基数", "コンピュータの扱うデータ",
				"固定小数点", "浮動小数点", "論理演算");

		List<String> subList = strList.subList(0, 2);

		strList.forEach(System.out::println);
		subList.forEach(System.out::println);


	}

}
