package recursive;

public class Combination {
    
    public static void main(String[] args){
        System.out.println(calc(5, 2));
        
    }
    
    public static int calc(int n, int r){
        if(r == 0 || r == n){
            return 1;
        }
        return calc(n-1, r) + calc(n-1, r-1);
    }
    
}
