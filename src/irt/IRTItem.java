package irt;

public class IRTItem implements IIRTItem {

	private double slope;
	private double location;
	private double asymptote;
	private AnswerType answerType;

	public IRTItem(double slope, double location, double asymptote, AnswerType answerType) {
		this.slope = slope;
		this.location = location;
		this.asymptote = asymptote;
		this.answerType = answerType;
	}

	@Override
	public double getSlope() {
		return slope;
	}

	@Override
	public double getLocation() {
		return location;
	}

	@Override
	public double getAsymptote() {
		return asymptote;
	}

	@Override
	public AnswerType getAnswerType() {
		return answerType;
	}

}
