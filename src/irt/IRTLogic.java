package irt;

import java.util.List;

public class IRTLogic {
	public double estimate(List<IIRTItem> itemList) {
		/* 能力を求める複雑な計算 */
		double val = 0;
		for ( IIRTItem item : itemList ) {
			switch (item.getAnswerType()) {
			case CORRECT:
				val += item.getSlope() * item.getLocation();
			case INCORRECT:
				val += 1 - item.getSlope() * item.getLocation();
			default:
				continue;
			}
		}
		return val;
	}
}
