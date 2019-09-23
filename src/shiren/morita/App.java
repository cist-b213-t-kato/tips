package shiren.morita;

import java.util.ArrayList;
import java.util.Arrays;


public class App {
	public static void main(String[] args) {
		Execute[] alllist = AllList.getList(1);

		ArrayList<Execute> list = new ArrayList<>(Arrays.asList(alllist));

		list.stream().forEach(o -> o.execute());

	}
}
