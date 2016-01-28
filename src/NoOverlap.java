

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoOverlap {
	public static void main(String[] args) {

		NoOverlap main = new NoOverlap();

		List<Integer> originList = new ArrayList<>(Arrays.asList(1, 2, 4, 2, 3, 2));

		//リスト内の重複を排除する
		List<Integer> transformedList = originList.stream().distinct().collect(Collectors.toList());

		for (int a : transformedList) {
			System.out.print(a + " ");
		}
		System.out.println();

	}

}
