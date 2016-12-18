package capsule;

public class Tank {
	private int gasoline;
	
	public void setGasoline(int gasoline) {
		if(gasoline > 10){
			this.gasoline = 10;
		} else if(gasoline < 0){
			this.gasoline = 0;
		} else {
			this.gasoline = gasoline;
		}
	}
	
	public int getGasoline() {
		return gasoline;
	}
	
}
