package nullcheck;

/**
 * フィールドのprimitiveな変数が明示的に初期化されないとき、
 * 何が格納されているのかを知りたかった
 * 結果、booleanの場合はfalseが格納されているようです
 * @author hagure
 *
 */
public class Bean {
	private boolean availability;
	
	public Bean(){
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
}
