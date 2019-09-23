package shiren.morita;

abstract class Execute {

	protected int value;

	public void setValue(int value) {
		this.value = value;

	}

	public abstract void execute();

}
