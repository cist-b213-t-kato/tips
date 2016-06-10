package trycatch;

public class Main {
	public static void main(String[] args) {
		System.out.println(method());
	}
	
	public static String method(){
		try{
			return "try";
		}catch(RuntimeException e){
			return "catch";
		}
	}
}
