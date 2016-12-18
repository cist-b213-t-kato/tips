
public class foo {
	public static void main(String[] args) {
		func(5);
		
		
	}
	
	public static void func(int n){
		System.out.print(n+" ");
		if(n==1){
			System.out.println("End");
			return;
		}else{
			System.out.println("continue");
			func(n-1);
		}
		
	}
	
}
