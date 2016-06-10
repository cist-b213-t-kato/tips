
public class TryCatch {
	public static void main(String[] args){
		double ret = method();
		System.out.println(ret);
	}
	
	public static double method(){
		
		try{
			double ret = Double.parseDouble("a");
			return ret;
		}catch(NumberFormatException e){
			e.printStackTrace();
			return 0;
		}
		
	}
}
