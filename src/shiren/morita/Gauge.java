package shiren.morita;//import sun.awt.SunHints;

public class Gauge {

	private int value;

	public void setValue(int value){
		if(value<0||value>999){
			throw new IllegalArgumentException();
		}
		else{
			this.value = value;
		}
	}

	public int getValue(){
		return value;
	}

}
