package irt;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		IRTLogic service = new IRTLogic();

		List<IIRTItem> itemList = new ArrayList<>();

		itemList.add(new IRTItem(0.37, -3, 0, AnswerType.CORRECT));
		itemList.add(new IRTItem(0.43, +3, 0, AnswerType.INCORRECT));
		itemList.add(new IRTItem(0.39, -1, 0, AnswerType.CORRECT));

		double result = service.estimate(itemList);

		System.out.println(result);

	}

}
