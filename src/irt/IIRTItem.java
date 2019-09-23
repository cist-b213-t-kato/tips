package irt;

public interface IIRTItem {
	public double getSlope(); //識別力
	public double getLocation(); //難易度
	public double getAsymptote(); //当て推量
	public AnswerType getAnswerType(); //回答
}
